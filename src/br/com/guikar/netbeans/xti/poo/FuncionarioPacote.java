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
public class FuncionarioPacote {
    public static void main(String[] args) {
        Funcionario f=new Funcionario();
        f.setNome("Guilherme");
        f.setAtivo(true);
        f.setSalario(1000);
        f.setSenha("123");
        System.out.println();
    }
}
