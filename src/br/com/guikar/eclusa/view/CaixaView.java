package br.com.guikar.eclusa.view;

import br.com.guikar.eclusa.controller.CaixaController;
import br.com.guikar.eclusa.model.Eclusa;
import br.com.guikar.eclusa.model.Observer;
import br.com.guikar.eclusa.model.Registro;
import javax.swing.DefaultListModel;

public class CaixaView extends javax.swing.JFrame implements Observer{

    private Eclusa model;
    private CaixaController controller;
    private DefaultListModel lista=new DefaultListModel();
    public CaixaView(Eclusa model) {
        initComponents();
        if (model != null)
            this.model = model;
        model.addObserver(this);
        controller = new CaixaController(this, model);
        update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCaixa = new javax.swing.JLabel();
        lblCifra = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        lblEmbPass = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEmb = new javax.swing.JList<>();
        lblBusca = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnProcura = new javax.swing.JButton();
        spnAno = new javax.swing.JSpinner();
        spnMes = new javax.swing.JSpinner();
        spnDia = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(310, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCaixa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaixa.setText("Caixa");
        getContentPane().add(lblCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 130, 30));

        lblCifra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCifra.setText("R$");
        getContentPane().add(lblCifra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 30, 30));

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total:");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 30));

        lblNum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNum.setText("0");
        getContentPane().add(lblNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 130, 30));

        lblEmbPass.setText("Embarcações que passaram na Eclusa:");
        getContentPane().add(lblEmbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        listEmb.setModel(lista);
        jScrollPane1.setViewportView(listEmb);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 290, 220));

        lblBusca.setText("Buscar Registro");
        getContentPane().add(lblBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, -1));

        lblDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDia.setText("Dia:");
        getContentPane().add(lblDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 30));

        lblMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMes.setText("Mês:");
        getContentPane().add(lblMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        lblAno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAno.setText("Ano:");
        getContentPane().add(lblAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        btnReset.setText("Resetar");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

        btnProcura.setText("Procurar");
        btnProcura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcuraActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 130, -1));

        spnAno.setModel(new javax.swing.SpinnerNumberModel(2018, 2000, 2018, 1));
        getContentPane().add(spnAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 190, 30));

        spnMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(spnMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, 30));

        spnDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        getContentPane().add(spnDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 190, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public DefaultListModel getLista() {
        return lista;
    }
    
    
    private void btnProcuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcuraActionPerformed
        controller.acao(evt);
    }//GEN-LAST:event_btnProcuraActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        controller.acao(evt);
    }//GEN-LAST:event_btnResetActionPerformed

    public void setLblNum(String lblNum) {
        this.lblNum.setText(lblNum.replace(".",","));
    }

    public int getSpnAno() {
        return Integer.parseInt(spnAno.getValue().toString());
    }

    public int getSpnDia() {
        return Integer.parseInt(spnDia.getValue().toString());
    }

    public int getSpnMes() {
        return Integer.parseInt(spnMes.getValue().toString());
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcura;
    private javax.swing.JButton btnReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblCaixa;
    private javax.swing.JLabel lblCifra;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblEmbPass;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JList<String> listEmb;
    private javax.swing.JSpinner spnAno;
    private javax.swing.JSpinner spnDia;
    private javax.swing.JSpinner spnMes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update() {
        controller.getCaixa().calculaTotal();
        setLblNum(Float.toString(controller.getCaixa().getTotal()));
        lista.removeAllElements();
        Registro reg;
        for (int i = 0; i < controller.getCaixa().getHistorico().size(); i++) {
            reg=controller.getCaixa().getHistorico().get(i);
            lista.addElement(reg);
        }
    }
}
