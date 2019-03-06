package br.com.guikar.ufc.poo.termometro;

import br.com.guikar.ufc.poo.termometro.model.Cidade;
import br.com.guikar.ufc.poo.termometro.view.ConfiguraClima;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new ConfiguraClima(new Cidade()).setVisible(true));
    }
}
