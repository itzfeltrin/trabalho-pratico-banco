/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.model;

/**
 *
 * @author itzfeltrin
 */
public class Candidato {    
    public String nome;
    public String CPF;
    
    public Candidato(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }
}
