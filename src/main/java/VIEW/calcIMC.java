package VIEW;

import javax.swing.JOptionPane;
import CONTROLLER.pessoaController;
import MODEL.pessoa;

public class calcIMC extends javax.swing.JDialog {
    
    pessoaController controller;

    double peso, altura, imc;
    String genero;

    public calcIMC(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        controller = new pessoaController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldPESO = new javax.swing.JTextField();
        jTextFieldALTURA = new javax.swing.JTextField();
        jTextFieldIMC = new javax.swing.JTextField();
        jButtoncalc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Homem = new javax.swing.JButton();
        Mulher = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldnome = new javax.swing.JTextField();
        jTextFieldidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldGenero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(java.awt.Color.white);

        jTextFieldPESO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldPESO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPESOActionPerformed(evt);
            }
        });

        jTextFieldALTURA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldALTURA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldALTURAActionPerformed(evt);
            }
        });

        jTextFieldIMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIMCActionPerformed(evt);
            }
        });

        jButtoncalc.setBackground(java.awt.Color.white);
        jButtoncalc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtoncalc.setText("Calcular");
        jButtoncalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncalcActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 255, 193));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CALCULADORA IMC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Homem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homem-de-negocios p.png"))); // NOI18N
        Homem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomemActionPerformed(evt);
            }
        });

        Mulher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mulhercorreto.png"))); // NOI18N
        Mulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MulherActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEXO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Peso");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Altura");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("IMC");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Nome");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Idade");

        jTextFieldGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIMC)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtoncalc))
                            .addComponent(jTextFieldnome)
                            .addComponent(jTextFieldPESO)
                            .addComponent(jTextFieldALTURA)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Homem, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mulher, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Mulher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Homem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPESO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldALTURA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtoncalc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldALTURAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldALTURAActionPerformed
    }//GEN-LAST:event_jTextFieldALTURAActionPerformed

    private void jTextFieldPESOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPESOActionPerformed
    }//GEN-LAST:event_jTextFieldPESOActionPerformed

    private void jTextFieldIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIMCActionPerformed
    }//GEN-LAST:event_jTextFieldIMCActionPerformed

    private void jButtoncalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncalcActionPerformed
        altura = Double.parseDouble(jTextFieldALTURA.getText());
        peso = Double.parseDouble(jTextFieldPESO.getText());
        imc = peso / (altura * altura);
        jTextFieldIMC.setText(String.valueOf(String.format("%.1f", imc)));

        switch (genero) {
            case "homem":
                if (imc < 20) {
                    JOptionPane.showMessageDialog(rootPane, " Seu IMC está muito baixo, procure um nutricionista! ");
                }
                if (imc >= 20 && imc <= 24.9) {
                    JOptionPane.showMessageDialog(rootPane, " Seu IMC está normal, parabéns!! ");

                }
                if (imc >= 25 && imc <= 29.9) {
                    JOptionPane.showMessageDialog(rootPane, " Você está com obesidade leve, cuide com a alimentação ;) ");

                }
                if (imc >= 30 && imc <= 39.9) {
                    JOptionPane.showMessageDialog(rootPane, " Você está com obesidade moderada, cuide com a alimentação e procure um médico! ");
                }
                if (imc >= 40) {
                    JOptionPane.showMessageDialog(rootPane, " Você está com obesidade mórbida, procure um médico!! ");
                }

                break;

            case "mulher":
                if (imc < 19) {
                    JOptionPane.showMessageDialog(rootPane, " Seu IMC está muito baixo, procure um médico ");

                }
                if (imc >= 19 && imc <= 23.9) {
                    JOptionPane.showMessageDialog(rootPane, " Seu IMC está normal ");
                }
                if (imc >= 24 && imc <= 28.9) {
                    JOptionPane.showMessageDialog(rootPane, " Você está com obesidade leve, cuide com a alimentação ;) ");

                }
                if (imc >= 29 && imc <= 38.9) {
                    JOptionPane.showMessageDialog(rootPane, " Você está com obesidade moderada, cuide com a alimentação e procure um médico! ");
                }
                if (imc >= 39) {
                    JOptionPane.showMessageDialog(rootPane, " Você está com obesidade mórbida, procure um médico!! ");
                }

                break;

        }
        
        
        
        try{
            
        
        pessoa Pessoas = new pessoa();
        
        Pessoas.setNome(jTextFieldnome.getText());
        Pessoas.setIdade(Integer.parseInt(jTextFieldidade.getText()));
        Pessoas.setPeso(Double.parseDouble(jTextFieldPESO.getText()));
        Pessoas.setAltura(Double.parseDouble(jTextFieldALTURA.getText()));
        Pessoas.setSexo(jTextFieldGenero.getText());
        
        controller.Salvar(Pessoas);
        JOptionPane.showMessageDialog(rootPane, "dados salvos com sucesso");
        
        this.dispose();
        
        }catch (Exception e) {
           JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }//GEN-LAST:event_jButtoncalcActionPerformed

    private void HomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomemActionPerformed
        genero = "homem";
        jTextFieldGenero.setText(genero);
    }//GEN-LAST:event_HomemActionPerformed

    private void MulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MulherActionPerformed
        genero = "mulher";
        jTextFieldGenero.setText(genero);
    }//GEN-LAST:event_MulherActionPerformed

    private void jTextFieldGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGeneroActionPerformed

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
            java.util.logging.Logger.getLogger(calcIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                calcIMC dialog = new calcIMC(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homem;
    private javax.swing.JButton Mulher;
    private javax.swing.JButton jButtoncalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldALTURA;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldIMC;
    private javax.swing.JTextField jTextFieldPESO;
    private javax.swing.JTextField jTextFieldidade;
    private javax.swing.JTextField jTextFieldnome;
    // End of variables declaration//GEN-END:variables
}
