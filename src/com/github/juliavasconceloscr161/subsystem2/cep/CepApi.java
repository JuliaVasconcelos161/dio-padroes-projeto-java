package com.github.juliavasconceloscr161.subsystem2.cep;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi(){}

    public static CepApi getInstance(){
        return instance;
    }

    public String findCity(String cep){
        return "Formiga";
    }

}
