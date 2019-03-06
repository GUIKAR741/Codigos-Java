package br.com.guikar.eclusa;

import br.com.guikar.eclusa.model.Eclusa;
import br.com.guikar.eclusa.view.GerenciamentoEclusaView;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new GerenciamentoEclusaView(new Eclusa()).setVisible(true));
    }
}
