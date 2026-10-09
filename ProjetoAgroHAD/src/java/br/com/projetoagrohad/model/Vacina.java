/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoagrohad.model;

/**
 *
 * @author JoseHenriqueRavani
 */
public class Vacina {
    
    private int idVacina;
    private String nomeVacina;
    private String doseRecomendada;

    public Vacina() {
    }

    public Vacina(int idVacina) {
        this.idVacina = idVacina;
    }

    public Vacina(int idVacina, String nomeVacina, String doseRecomendada) {
        this.idVacina = idVacina;
        this.nomeVacina = nomeVacina;
        this.doseRecomendada = doseRecomendada;
    }

    public int getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(int idVacina) {
        this.idVacina = idVacina;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getDoseRecomendada() {
        return doseRecomendada;
    }

    public void setDoseRecomendada(String doseRecomendada) {
        this.doseRecomendada = doseRecomendada;
    }

    
    
};
