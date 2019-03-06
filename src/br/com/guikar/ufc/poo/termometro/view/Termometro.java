/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.ufc.poo.termometro.view;

import br.com.guikar.ufc.poo.termometro.controller.TermometroController;
import br.com.guikar.ufc.poo.termometro.model.Cidade;
import br.com.guikar.ufc.poo.termometro.model.Observer;
import java.text.DecimalFormat;

/**
 *
 * @author Guilherme
 */
public class Termometro extends javax.swing.JFrame implements Observer{
    private Cidade model;
    private TermometroController controller;
    
    public Termometro(Cidade model) {
        initComponents();
        if(model!=null)
            this.model=model;
        model.addObserver(this);
        controller=new TermometroController(this, model);
    }

    public void setLblCidade(String lblCidade) {
        this.lblCidade.setText(lblCidade);
    }

    public void setLblTemp(String lblTemp) {
        DecimalFormat df = new DecimalFormat("0.##");
        this.lblTemp.setText(df.format(Double.parseDouble(lblTemp)));
    }

    public void setLblTipo(String lblTipo) {
        this.lblTipo.setText(lblTipo);
    }

    public void setLblUf(String lblUf) {
        this.lblUf.setText(lblUf);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCidade = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        lblTemp = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Termometro");
        setMinimumSize(new java.awt.Dimension(200, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCidade.setText("Cidade");
        getContentPane().add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("-");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblUf.setText("UF");
        getContentPane().add(lblUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        lblTemp.setText("0");
        getContentPane().add(lblTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        lblTipo.setText("ºC");
        getContentPane().add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUf;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update() {
        setLblCidade(model.getNome());
        setLblTemp(String.valueOf(model.getTemperatura()));
        setLblTipo(model.getTipoTemperatura());
        setLblUf(model.getUf());
    }
}