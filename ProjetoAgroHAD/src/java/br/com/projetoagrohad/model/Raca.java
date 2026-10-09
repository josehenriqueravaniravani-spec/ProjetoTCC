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
public class Raca {
    private int idRaca;
    private String nomeRaca;

    public Raca() {
    }

    public Raca(int idRaca) {
        this.idRaca = idRaca;
    }

    public Raca(int idRaca, String nomeRaca) {
        this.idRaca = idRaca;
        this.nomeRaca = nomeRaca;
    }

    public int getIdRaca() {
        return idRaca;
    }

    public void setIdRaca(int idRaca) {
        this.idRaca = idRaca;
    }

    public String getNomeRaca() {
        return nomeRaca;
    }

    public void setNomeRaca(String nomeRaca) {
        this.nomeRaca = nomeRaca;
    }

    
    
}
