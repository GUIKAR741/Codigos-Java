package br.com.guikar.eclusa.view;

import br.com.guikar.eclusa.controller.EclusaController;
import br.com.guikar.eclusa.model.Eclusa;
import br.com.guikar.eclusa.model.Embarcacao;
import br.com.guikar.eclusa.model.Observer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EclusaView extends javax.swing.JFrame implements Observer {

    private Eclusa model;
    private EclusaController controller;
    private DefaultListModel listaRio = new DefaultListModel();
    private DefaultListModel listaMar = new DefaultListModel();

    public EclusaView(Eclusa model) {
        initComponents();
        if (model != null) {
            this.model = model;
        }
        controller = new EclusaController(this, this.model);
        model.addObserver(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBarcos = new JPanel();
        pnlBarRio = new JPanel();
        pnlBarMar = new JPanel();
        pnlEclusa = new JPanel();
        pnlRio = new JPanel();
        pnlMar = new JPanel();
        lblMar = new javax.swing.JLabel();
        lblRio = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listMar = new JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listRio = new JList<>();
        btnIniciar = new JButton();
        btnModEclusa = new JButton();
        btnGerenCaixa = new JButton();
        btnRemEmbMarRio = new JButton();
        btnRemEmbRioMar = new JButton();
        btnEditEmbMarRio = new JButton();
        btnEditEmbRioMar = new JButton();
        btnAddEmb = new JButton();
        lblEclusa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(690, 670));
        setResizable(false);
        setSize(new java.awt.Dimension(690, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarcos.setBackground(new java.awt.Color(60, 64, 64));
        pnlBarcos.setOpaque(false);
        pnlBarcos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlBarcos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 0, 1070, 250));

        pnlBarRio.setBackground(new java.awt.Color(153, 153, 153));
        pnlBarRio.setName("pnlBarRio"); // NOI18N
        pnlBarRio.setPreferredSize(new java.awt.Dimension(10, 20));

        javax.swing.GroupLayout pnlBarRioLayout = new javax.swing.GroupLayout(pnlBarRio);
        pnlBarRio.setLayout(pnlBarRioLayout);
        pnlBarRioLayout.setHorizontalGroup(
            pnlBarRioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnlBarRioLayout.setVerticalGroup(
            pnlBarRioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBarRio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 20, 80));

        pnlBarMar.setBackground(new java.awt.Color(153, 153, 153));
        pnlBarMar.setName("PnlRio"); // NOI18N
        pnlBarMar.setPreferredSize(new java.awt.Dimension(10, 20));

        javax.swing.GroupLayout pnlBarMarLayout = new javax.swing.GroupLayout(pnlBarMar);
        pnlBarMar.setLayout(pnlBarMarLayout);
        pnlBarMarLayout.setHorizontalGroup(
            pnlBarMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnlBarMarLayout.setVerticalGroup(
            pnlBarMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBarMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 20, 160));

        pnlEclusa.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout pnlEclusaLayout = new javax.swing.GroupLayout(pnlEclusa);
        pnlEclusa.setLayout(pnlEclusaLayout);
        pnlEclusaLayout.setHorizontalGroup(
            pnlEclusaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        pnlEclusaLayout.setVerticalGroup(
            pnlEclusaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(pnlEclusa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, 80));

        pnlRio.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout pnlRioLayout = new javax.swing.GroupLayout(pnlRio);
        pnlRio.setLayout(pnlRioLayout);
        pnlRioLayout.setHorizontalGroup(
            pnlRioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        pnlRioLayout.setVerticalGroup(
            pnlRioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(pnlRio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, -1));

        pnlMar.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout pnlMarLayout = new javax.swing.GroupLayout(pnlMar);
        pnlMar.setLayout(pnlMarLayout);
        pnlMarLayout.setHorizontalGroup(
            pnlMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        pnlMarLayout.setVerticalGroup(
            pnlMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        getContentPane().add(pnlMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 260, 160));

        lblMar.setText("Fila Mar-Rio");
        getContentPane().add(lblMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        lblRio.setText("Fila Rio-Mar");
        getContentPane().add(lblRio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        listMar.setModel(listaMar);
        jScrollPane2.setViewportView(listMar);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 330, 150));

        listRio.setModel(listaRio);
        jScrollPane1.setViewportView(listRio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 330, 150));

        btnIniciar.setText("<html><p style=\"text-align:center;\">Iniciar Filas</p></html>");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 110, 80));

        btnModEclusa.setText("<html><p style=\"text-align:center;\">Modificar Eclusa</p></html>");
        btnModEclusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModEclusaActionPerformed(evt);
            }
        });
        getContentPane().add(btnModEclusa, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 110, 80));

        btnGerenCaixa.setText("<html><p style=\"text-align:center;\">Gerenciar Caixa</p></html>");
        btnGerenCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenCaixaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerenCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 110, 80));

        btnRemEmbMarRio.setText("<html><p style=\"text-align:center;\">Remover Embarcação Fila Mar-Rio</p></html>");
        btnRemEmbMarRio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemEmbMarRioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemEmbMarRio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 110, 80));

        btnRemEmbRioMar.setText("<html><p style=\"text-align:center;\">Remover Embarcação Fila Rio-Mar</p></html>");
        btnRemEmbRioMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemEmbRioMarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemEmbRioMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 110, 80));

        btnEditEmbMarRio.setText("<html><p style=\"text-align:center;\">Editar Embarcação Fila Mar-Rio</p></html>");
        btnEditEmbMarRio.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnEditEmbMarRio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEmbMarRioActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditEmbMarRio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 110, 80));

        btnEditEmbRioMar.setText("<html><p style=\"text-align:center;\">Editar Embarcação Fila Rio-Mar</p></html>");
        btnEditEmbRioMar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnEditEmbRioMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEmbRioMarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditEmbRioMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 110, 80));

        btnAddEmb.setText("<html><p style=\"text-align:center;\">Adicionar Embarcação</p></html>");
        btnAddEmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmbActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddEmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 110, 80));

        lblEclusa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEclusa.setText("Eclusa");
        getContentPane().add(lblEclusa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAddEmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmbActionPerformed
        controller.acao(evt);
    }//GEN-LAST:event_btnAddEmbActionPerformed

    private void btnEditEmbRioMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEmbRioMarActionPerformed
        controller.acao(evt);
    }//GEN-LAST:event_btnEditEmbRioMarActionPerformed

    private void btnRemEmbRioMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemEmbRioMarActionPerformed
        controller.acao(evt);
    }//GEN-LAST:event_btnRemEmbRioMarActionPerformed

    private void btnGerenCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenCaixaActionPerformed
        controller.acao(evt);
    }//GEN-LAST:event_btnGerenCaixaActionPerformed

    private void btnModEclusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModEclusaActionPerformed
        controller.acao(evt);
    }//GEN-LAST:event_btnModEclusaActionPerformed

    private void btnEditEmbMarRioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEmbMarRioActionPerformed
        controller.acao(evt);
    }//GEN-LAST:event_btnEditEmbMarRioActionPerformed

    private void btnRemEmbMarRioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemEmbMarRioActionPerformed
        controller.acao(evt);
    }//GEN-LAST:event_btnRemEmbMarRioActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        controller.acao(evt);
    }//GEN-LAST:event_btnIniciarActionPerformed

    public void mensagem(String titulo, String mensagem, int tipo) {
        JOptionPane.showMessageDialog(this, mensagem, titulo, tipo);
    }

    public DefaultListModel getListaRio() {
        return listaRio;
    }

    public JList getListRio() {
        return listRio;
    }

    public DefaultListModel getListaMar() {
        return listaMar;
    }

    public JList getListMar() {
        return listMar;
    }

    public JPanel getPnlBarMar() {
        return pnlBarMar;
    }

    public JPanel getPnlBarRio() {
        return pnlBarRio;
    }

    public JPanel getPnlBarcos() {
        return pnlBarcos;
    }

    public JPanel getPnlEclusa() {
        return pnlEclusa;
    }

    public void btnEditEmbMarRioEnable(boolean enable) {
        this.btnEditEmbMarRio.setEnabled(enable);
    }

    public void btnEditEmbRioMarEnable(boolean enable) {
        this.btnEditEmbRioMar.setEnabled(enable);
    }

    public void btnAddEmbEnable(boolean enable) {
        this.btnAddEmb.setEnabled(enable);
    }

    public void btnModEclusaEnable(boolean enable) {
        this.btnModEclusa.setEnabled(enable);
    }

    public void btnRemEmbMarRioEnable(boolean enable) {
        this.btnRemEmbMarRio.setEnabled(enable);
    }

    public void btnRemEmbRioMarEnable(boolean enable) {
        this.btnRemEmbRioMar.setEnabled(enable);
    }
    public void btnIniciarEnable(boolean enable) {
        this.btnIniciar.setEnabled(enable);
    }

    public void update() {
        listaRio.removeAllElements();
        listaMar.removeAllElements();
        Embarcacao embarcacao;
        for (int i = 0; i < model.getFilaRioMar().size(); i++) {
            embarcacao = model.getFilaRioMar().get(i);
            listaRio.addElement(embarcacao);
        }
        for (int i = 0; i < model.getFilaMarRio().size(); i++) {
            embarcacao = model.getFilaMarRio().get(i);
            listaMar.addElement(embarcacao);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAddEmb;
    private JButton btnEditEmbMarRio;
    private JButton btnEditEmbRioMar;
    private JButton btnGerenCaixa;
    private JButton btnIniciar;
    private JButton btnModEclusa;
    private JButton btnRemEmbMarRio;
    private JButton btnRemEmbRioMar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEclusa;
    private javax.swing.JLabel lblMar;
    private javax.swing.JLabel lblRio;
    private JList<String> listMar;
    private JList<String> listRio;
    private JPanel pnlBarMar;
    private JPanel pnlBarRio;
    private JPanel pnlBarcos;
    private JPanel pnlEclusa;
    private JPanel pnlMar;
    private JPanel pnlRio;
    // End of variables declaration//GEN-END:variables
}
