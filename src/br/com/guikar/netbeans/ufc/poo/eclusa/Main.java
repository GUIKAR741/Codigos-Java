package br.com.guikar.netbeans.ufc.poo.eclusa;

import br.com.guikar.netbeans.ufc.poo.eclusa.model.Eclusa;
import br.com.guikar.netbeans.ufc.poo.eclusa.view.GerenciamentoEclusaView;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new GerenciamentoEclusaView(new Eclusa()).setVisible(true));/**/
    }
}
