package br.com.guikar.netbeans.ufc.poo.mvc;

import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new TelaPrincipalConfiguracao(new Placar()).setVisible(true);
        });
    }
}
