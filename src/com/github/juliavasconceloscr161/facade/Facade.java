package com.github.juliavasconceloscr161.facade;

import com.github.juliavasconceloscr161.subsystem1.crm.CrmService;
import com.github.juliavasconceloscr161.subsystem2.cep.CepApi;

public class Facade {
    public void migrateClient(String name, String cep){
        String city = CepApi.getInstance().findCity(cep);
        CrmService.saveClient(name, cep, city);
    }
}
