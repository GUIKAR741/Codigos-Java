package br.com.guikar.calculadora;

public class Calc extends javax.swing.JFrame {

    public Calc() {
        initComponents();    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnN9 = new javax.swing.JButton();
        btnN8 = new javax.swing.JButton();
        btnN7 = new javax.swing.JButton();
        btnN6 = new javax.swing.JButton();
        btnN5 = new javax.swing.JButton();
        btnN4 = new javax.swing.JButton();
        btnN3 = new javax.swing.JButton();
        btnN2 = new javax.swing.JButton();
        btnN1 = new javax.swing.JButton();
        btnN0 = new javax.swing.JButton();
        btnVirg = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        txtVisor = new javax.swing.JTextField();
        btnCE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtHist = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnN9.setText("9");
        btnN9.setMaximumSize(new java.awt.Dimension(40, 24));
        btnN9.setMinimumSize(new java.awt.Dimension(40, 24));
        btnN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN9ActionPerformed(evt);
            }
        });

        btnN8.setText("8");
        btnN8.setMaximumSize(new java.awt.Dimension(40, 24));
        btnN8.setMinimumSize(new java.awt.Dimension(40, 24));
        btnN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN8ActionPerformed(evt);
            }
        });

        btnN7.setText("7");
        btnN7.setMaximumSize(new java.awt.Dimension(40, 24));
        btnN7.setMinimumSize(new java.awt.Dimension(40, 24));
        btnN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN7ActionPerformed(evt);
            }
        });

        btnN6.setText("6");
        btnN6.setMaximumSize(new java.awt.Dimension(40, 24));
        btnN6.setMinimumSize(new java.awt.Dimension(40, 24));
        btnN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN6ActionPerformed(evt);
            }
        });

        btnN5.setText("5");
        btnN5.setMaximumSize(new java.awt.Dimension(40, 24));
        btnN5.setMinimumSize(new java.awt.Dimension(40, 24));
        btnN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN5ActionPerformed(evt);
            }
        });

        btnN4.setText("4");
        btnN4.setMaximumSize(new java.awt.Dimension(40, 24));
        btnN4.setMinimumSize(new java.awt.Dimension(40, 24));
        btnN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN4ActionPerformed(evt);
            }
        });

        btnN3.setText("3");
        btnN3.setMaximumSize(new java.awt.Dimension(40, 24));
        btnN3.setMinimumSize(new java.awt.Dimension(40, 24));
        btnN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN3ActionPerformed(evt);
            }
        });

        btnN2.setText("2");
        btnN2.setMaximumSize(new java.awt.Dimension(40, 24));
        btnN2.setMinimumSize(new java.awt.Dimension(40, 24));
        btnN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN2ActionPerformed(evt);
            }
        });

        btnN1.setText("1");
        btnN1.setMaximumSize(new java.awt.Dimension(40, 24));
        btnN1.setMinimumSize(new java.awt.Dimension(40, 24));
        btnN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN1ActionPerformed(evt);
            }
        });

        btnN0.setText("0");
        btnN0.setMaximumSize(new java.awt.Dimension(40, 24));
        btnN0.setMinimumSize(new java.awt.Dimension(40, 24));
        btnN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN0ActionPerformed(evt);
            }
        });

        btnVirg.setText(",");
        btnVirg.setMaximumSize(new java.awt.Dimension(40, 24));
        btnVirg.setMinimumSize(new java.awt.Dimension(40, 24));
        btnVirg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.setMaximumSize(new java.awt.Dimension(40, 24));
        btnIgual.setMinimumSize(new java.awt.Dimension(40, 24));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnMais.setText("+");
        btnMais.setMaximumSize(new java.awt.Dimension(40, 24));
        btnMais.setMinimumSize(new java.awt.Dimension(40, 24));
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });

        btnMenos.setText("-");
        btnMenos.setMaximumSize(new java.awt.Dimension(40, 24));
        btnMenos.setMinimumSize(new java.awt.Dimension(40, 24));
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnMult.setText("*");
        btnMult.setMaximumSize(new java.awt.Dimension(40, 24));
        btnMult.setMinimumSize(new java.awt.Dimension(40, 24));
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.setMaximumSize(new java.awt.Dimension(40, 24));
        btnDiv.setMinimumSize(new java.awt.Dimension(40, 24));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        txtVisor.setEditable(false);
        txtVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        jLabel1.setText("Calculadora");

        txtHist.setEditable(false);

        jLabel2.setText("Historico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtHist, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnN9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnN8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnN7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnN6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnN5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnN4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnN1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVirg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnN0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHist, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(btnCE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnN9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnN6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVirg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        String visor=txtVisor.getText();
        String nMult="*";
        txtVisor.setText(visor+nMult);
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN9ActionPerformed
        String visor=txtVisor.getText();
        int n9=9;
        txtVisor.setText(visor+Integer.toString(n9));
    }//GEN-LAST:event_btnN9ActionPerformed

    private void btnN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN1ActionPerformed
        String visor=txtVisor.getText();
        int n1=1;
        txtVisor.setText(visor+Integer.toString(n1));
    }//GEN-LAST:event_btnN1ActionPerformed

    private void btnN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN8ActionPerformed
        String visor=txtVisor.getText();
        int n8=8;
        txtVisor.setText(visor+Integer.toString(n8));
    }//GEN-LAST:event_btnN8ActionPerformed

    private void btnN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN7ActionPerformed
        String visor=txtVisor.getText();
        int n7=7;
        txtVisor.setText(visor+Integer.toString(n7));
    }//GEN-LAST:event_btnN7ActionPerformed

    private void btnN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN6ActionPerformed
        String visor=txtVisor.getText();
        int n6=6;
        txtVisor.setText(visor+Integer.toString(n6));
    }//GEN-LAST:event_btnN6ActionPerformed

    private void btnN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN5ActionPerformed
        String visor=txtVisor.getText();
        int n5=5;
        txtVisor.setText(visor+Integer.toString(n5));
    }//GEN-LAST:event_btnN5ActionPerformed

    private void btnN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN4ActionPerformed
        String visor=txtVisor.getText();
        int n4=4;
        txtVisor.setText(visor+Integer.toString(n4));
    }//GEN-LAST:event_btnN4ActionPerformed

    private void btnN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN3ActionPerformed
        String visor=txtVisor.getText();
        int n3=3;
        txtVisor.setText(visor+Integer.toString(n3));
    }//GEN-LAST:event_btnN3ActionPerformed

    private void btnN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN2ActionPerformed
        String visor=txtVisor.getText();
        int n2=2;
        txtVisor.setText(visor+Integer.toString(n2));
    }//GEN-LAST:event_btnN2ActionPerformed

    private void btnVirgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgActionPerformed
        String visor=txtVisor.getText();
        String nVir=",";
        txtVisor.setText(visor+nVir);
    }//GEN-LAST:event_btnVirgActionPerformed

    private void btnN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN0ActionPerformed
        String visor=txtVisor.getText();
        int n0=0;
        txtVisor.setText(visor+Integer.toString(n0));
    }//GEN-LAST:event_btnN0ActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        String visor=txtVisor.getText();
        String visorHist=txtHist.getText();
        Calculos calculos = new Calculos();
        String resultado = calculos.calculadora(visor);
        txtVisor.setText(resultado);
        txtHist.setText(visor+"="+resultado);
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
        String visor=txtVisor.getText();
        String nMais="+";
        txtVisor.setText(visor+nMais);
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        String visor=txtVisor.getText();
        String nMen="-";
        txtVisor.setText(visor+nMen);
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        String visor=txtVisor.getText();
        String nDiv="/";
        txtVisor.setText(visor+nDiv);
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        txtVisor.setText("");
    }//GEN-LAST:event_btnCEActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnN0;
    private javax.swing.JButton btnN1;
    private javax.swing.JButton btnN2;
    private javax.swing.JButton btnN3;
    private javax.swing.JButton btnN4;
    private javax.swing.JButton btnN5;
    private javax.swing.JButton btnN6;
    private javax.swing.JButton btnN7;
    private javax.swing.JButton btnN8;
    private javax.swing.JButton btnN9;
    private javax.swing.JButton btnVirg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtHist;
    private javax.swing.JTextField txtVisor;
    // End of variables declaration//GEN-END:variables
}
