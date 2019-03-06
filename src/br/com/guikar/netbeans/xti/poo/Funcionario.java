/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.poo;

/**
 *
 * @author Guilherme
 */
public class Funcionario {
    private String nome;
    private boolean ativo;
    private String senha;
    private double salario;
    
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public void setSalario(double s){
        this.salario=s;
    }
    public void setAtivo(boolean a){
        this.ativo=a;
    }
    public void setSenha(String s){
        this.senha=s;
    }
    public boolean isSenha(){
        return true;
    }
    public boolean isAtivoCorreta(String Senha){
        return true;
    }
}
