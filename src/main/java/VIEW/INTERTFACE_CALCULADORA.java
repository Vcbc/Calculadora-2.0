package VIEW;

// IMPLEMENTAR FUNCIONALIDADES:

import VIEW.calcIMC;

//-> BOT�O PONTO. 
//-> CRIAR HIST�RICO DE CALCULOS PEGANDO OS VALORES SETADOS NA JANELA CALCULO.

public class INTERTFACE_CALCULADORA extends javax.swing.JFrame {

    double valor1, valor2, resultado, valores;
    String opera��o;

    public INTERTFACE_CALCULADORA() {
        initComponents();
        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TELA = new javax.swing.JTextField();
        BOT�O1 = new javax.swing.JButton();
        BOT�O2 = new javax.swing.JButton();
        BOT�O3 = new javax.swing.JButton();
        BOT�O4 = new javax.swing.JButton();
        BOT�O5 = new javax.swing.JButton();
        BOT�O6 = new javax.swing.JButton();
        BOT�O9 = new javax.swing.JButton();
        BOT�O7 = new javax.swing.JButton();
        BOT�O8 = new javax.swing.JButton();
        BOT�OSOMA = new javax.swing.JButton();
        BOT�OSUBTRA��O = new javax.swing.JButton();
        BOT�OMULTIPLICA��O = new javax.swing.JButton();
        BOT�ODIVIS�O = new javax.swing.JButton();
        BOT�OZERO = new javax.swing.JButton();
        BOT�OIGUAL = new javax.swing.JButton();
        BOT�OLIMPA = new javax.swing.JButton();
        BOT�OPORCENTAGEM = new javax.swing.JButton();
        CALCULO = new javax.swing.JTextField();
        jButtonIMC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.black);

        TELA.setBackground(java.awt.Color.black);
        TELA.setFont(new java.awt.Font("Source Serif Pro Black", 1, 30)); // NOI18N
        TELA.setForeground(java.awt.Color.lightGray);
        TELA.setBorder(null);

        BOT�O1.setBackground(java.awt.Color.white);
        BOT�O1.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�O1.setText("1");
        BOT�O1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOT�O1MouseClicked(evt);
            }
        });
        BOT�O1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BOT�O1KeyPressed(evt);
            }
        });

        BOT�O2.setBackground(java.awt.Color.white);
        BOT�O2.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�O2.setText("2");
        BOT�O2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�O2ActionPerformed(evt);
            }
        });

        BOT�O3.setBackground(java.awt.Color.white);
        BOT�O3.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�O3.setText("3");
        BOT�O3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�O3ActionPerformed(evt);
            }
        });

        BOT�O4.setBackground(java.awt.Color.white);
        BOT�O4.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�O4.setText("4");
        BOT�O4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�O4ActionPerformed(evt);
            }
        });

        BOT�O5.setBackground(java.awt.Color.white);
        BOT�O5.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�O5.setText("5");
        BOT�O5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�O5ActionPerformed(evt);
            }
        });

        BOT�O6.setBackground(java.awt.Color.white);
        BOT�O6.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�O6.setText("6");
        BOT�O6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�O6ActionPerformed(evt);
            }
        });

        BOT�O9.setBackground(java.awt.Color.white);
        BOT�O9.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�O9.setText("9");
        BOT�O9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�O9ActionPerformed(evt);
            }
        });

        BOT�O7.setBackground(java.awt.Color.white);
        BOT�O7.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�O7.setText("7");
        BOT�O7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�O7ActionPerformed(evt);
            }
        });

        BOT�O8.setBackground(java.awt.Color.white);
        BOT�O8.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�O8.setText("8");
        BOT�O8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�O8ActionPerformed(evt);
            }
        });

        BOT�OSOMA.setBackground(new java.awt.Color(240, 136, 1));
        BOT�OSOMA.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�OSOMA.setText("+");
        BOT�OSOMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�OSOMAActionPerformed(evt);
            }
        });

        BOT�OSUBTRA��O.setBackground(new java.awt.Color(240, 136, 1));
        BOT�OSUBTRA��O.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�OSUBTRA��O.setText("-");
        BOT�OSUBTRA��O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�OSUBTRA��OActionPerformed(evt);
            }
        });

        BOT�OMULTIPLICA��O.setBackground(new java.awt.Color(240, 136, 1));
        BOT�OMULTIPLICA��O.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�OMULTIPLICA��O.setText("X");
        BOT�OMULTIPLICA��O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�OMULTIPLICA��OActionPerformed(evt);
            }
        });

        BOT�ODIVIS�O.setBackground(new java.awt.Color(240, 136, 1));
        BOT�ODIVIS�O.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�ODIVIS�O.setText("/");
        BOT�ODIVIS�O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�ODIVIS�OActionPerformed(evt);
            }
        });

        BOT�OZERO.setBackground(java.awt.Color.white);
        BOT�OZERO.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�OZERO.setText("0");
        BOT�OZERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�OZEROActionPerformed(evt);
            }
        });

        BOT�OIGUAL.setBackground(new java.awt.Color(240, 136, 1));
        BOT�OIGUAL.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�OIGUAL.setText("=");
        BOT�OIGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�OIGUALActionPerformed(evt);
            }
        });

        BOT�OLIMPA.setBackground(new java.awt.Color(235, 65, 0));
        BOT�OLIMPA.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�OLIMPA.setText("AC");
        BOT�OLIMPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�OLIMPAActionPerformed(evt);
            }
        });

        BOT�OPORCENTAGEM.setBackground(new java.awt.Color(240, 136, 1));
        BOT�OPORCENTAGEM.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOT�OPORCENTAGEM.setText("%");
        BOT�OPORCENTAGEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT�OPORCENTAGEMActionPerformed(evt);
            }
        });

        CALCULO.setBackground(java.awt.Color.black);
        CALCULO.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        CALCULO.setForeground(java.awt.Color.lightGray);
        CALCULO.setBorder(null);

        jButtonIMC.setText(" IMC");
        jButtonIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIMCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TELA)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CALCULO, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BOT�O4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOT�O5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOT�O6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOT�OSUBTRA��O, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BOT�O1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOT�O2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOT�O3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOT�OSOMA, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BOT�O7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BOT�O8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BOT�O9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BOT�OZERO, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BOT�OLIMPA, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BOT�OPORCENTAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BOT�ODIVIS�O, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BOT�OMULTIPLICA��O, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(BOT�OIGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TELA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CALCULO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BOT�O2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BOT�O3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BOT�OSOMA, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BOT�O1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOT�O5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOT�O4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOT�O6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOT�OSUBTRA��O, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOT�O9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOT�O8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOT�O7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOT�OMULTIPLICA��O, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOT�OZERO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOT�ODIVIS�O, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOT�OPORCENTAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOT�OLIMPA, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BOT�OIGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonIMC)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    
    private void BOT�O1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOT�O1MouseClicked
        TELA.setText(TELA.getText() + "1");
    }//GEN-LAST:event_BOT�O1MouseClicked

    private void BOT�O2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�O2ActionPerformed
        TELA.setText(TELA.getText() + "2");
    }//GEN-LAST:event_BOT�O2ActionPerformed

    private void BOT�O3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�O3ActionPerformed
        TELA.setText(TELA.getText() + "3");
    }//GEN-LAST:event_BOT�O3ActionPerformed

    private void BOT�O4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�O4ActionPerformed
        TELA.setText(TELA.getText() + "4");
    }//GEN-LAST:event_BOT�O4ActionPerformed

    private void BOT�O5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�O5ActionPerformed
        TELA.setText(TELA.getText() + "5");
    }//GEN-LAST:event_BOT�O5ActionPerformed

    private void BOT�O6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�O6ActionPerformed
        TELA.setText(TELA.getText() + "6");
    }//GEN-LAST:event_BOT�O6ActionPerformed

    private void BOT�O7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�O7ActionPerformed
        TELA.setText(TELA.getText() + "7");
    }//GEN-LAST:event_BOT�O7ActionPerformed

    private void BOT�O8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�O8ActionPerformed
        TELA.setText(TELA.getText() + "8");
    }//GEN-LAST:event_BOT�O8ActionPerformed

    private void BOT�O9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�O9ActionPerformed
        TELA.setText(TELA.getText() + "9");
    }//GEN-LAST:event_BOT�O9ActionPerformed

    private void BOT�OZEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�OZEROActionPerformed
        TELA.setText(TELA.getText() + "0");
    }//GEN-LAST:event_BOT�OZEROActionPerformed

    private void BOT�OSOMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�OSOMAActionPerformed
        valor1 = Double.parseDouble(TELA.getText());
        opera��o = "soma";
        TELA.setText("  ");
    }//GEN-LAST:event_BOT�OSOMAActionPerformed

    private void BOT�OIGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�OIGUALActionPerformed
        valor2 = Double.parseDouble(TELA.getText());
        
        switch (opera��o) {

            case "soma":
                resultado = valor1 + valor2;
                TELA.setText(String.valueOf(String.format("%.0f", resultado)));
                CALCULO.setText(String.valueOf(String.format( " %.0f "
                        + " + " + " %.0f " + " = " + " %.0f ", valor1, valor2, resultado)));

                break;

            case "subtra��o":
                resultado = valor1 - valor2;
                TELA.setText(String.valueOf(String.format("%.0f", resultado)));
                CALCULO.setText(String.valueOf(String.format( " %.0f "
                        + " - " + " %.0f " + " = " + " %.0f ", valor1, valor2, resultado)));
                 break;

            case "multiplica��o":
                resultado = valor1 * valor2;
                TELA.setText(String.valueOf(String.format("%.0f", resultado)));
                CALCULO.setText(String.valueOf(String.format( " %.0f "
                        + " X " + " %.0f " + " = " + " %.0f ", valor1, valor2, resultado)));
                break;
            case "divis�o":
                resultado = valor1 / valor2;
                TELA.setText(String.valueOf(String.format("%.0f", resultado)));
                CALCULO.setText(String.valueOf(String.format( " %.0f "
                        + " / " + " %.0f " + " = " + " %.1f ", valor1, valor2, resultado)));
                break;
                
                   
    }//GEN-LAST:event_BOT�OIGUALActionPerformed
    }
    private void BOT�OSUBTRA��OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�OSUBTRA��OActionPerformed
        valor1 = Double.parseDouble(TELA.getText());
        opera��o = "subtra��o";
        TELA.setText("");

    }//GEN-LAST:event_BOT�OSUBTRA��OActionPerformed

    private void BOT�OMULTIPLICA��OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�OMULTIPLICA��OActionPerformed
        valor1 = Double.parseDouble(TELA.getText());
        opera��o = "multiplica��o";
        TELA.setText("");
    }//GEN-LAST:event_BOT�OMULTIPLICA��OActionPerformed

    private void BOT�ODIVIS�OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�ODIVIS�OActionPerformed
        valor1 = Double.parseDouble(TELA.getText());
        opera��o = "divis�o";
        TELA.setText("");
    }//GEN-LAST:event_BOT�ODIVIS�OActionPerformed

    private void BOT�OLIMPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�OLIMPAActionPerformed
        TELA.setText("  ");
        CALCULO.setText("  ");
    }//GEN-LAST:event_BOT�OLIMPAActionPerformed

    private void BOT�OPORCENTAGEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT�OPORCENTAGEMActionPerformed

        valor2 = Double.parseDouble(TELA.getText());

        if (opera��o == "soma") {
            resultado = (valor2 / 100 + 1) * valor1;
            TELA.setText(String.valueOf(String.format("%.1f", resultado)));
            CALCULO.setText(String.valueOf(String.format(
                    " %.0f " + " + " + " %.0f" + "%%" + " = " + " %.1f ", valor1, valor2, resultado)));

        }
        if (opera��o == "subtra��o") {
            resultado = valor1 - (valor2 / 100 * valor1);
            TELA.setText(String.valueOf(String.format("%.1f", resultado)));
            CALCULO.setText(String.valueOf(String.format(
                    " %.0f " + " - " + " %.0f" + "%%" + " = " + " %.1f ", valor1, valor2, resultado)));

        }


    }//GEN-LAST:event_BOT�OPORCENTAGEMActionPerformed

    private void jButtonIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIMCActionPerformed
        calcIMC imc = new calcIMC (this, rootPaneCheckingEnabled);
        imc.setVisible(true);
        
       
        
        
    }//GEN-LAST:event_jButtonIMCActionPerformed

    private void BOT�O1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BOT�O1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOT�O1KeyPressed

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
            java.util.logging.Logger.getLogger(INTERTFACE_CALCULADORA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INTERTFACE_CALCULADORA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INTERTFACE_CALCULADORA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INTERTFACE_CALCULADORA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INTERTFACE_CALCULADORA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOT�O1;
    private javax.swing.JButton BOT�O2;
    private javax.swing.JButton BOT�O3;
    private javax.swing.JButton BOT�O4;
    private javax.swing.JButton BOT�O5;
    private javax.swing.JButton BOT�O6;
    private javax.swing.JButton BOT�O7;
    private javax.swing.JButton BOT�O8;
    private javax.swing.JButton BOT�O9;
    private javax.swing.JButton BOT�ODIVIS�O;
    private javax.swing.JButton BOT�OIGUAL;
    private javax.swing.JButton BOT�OLIMPA;
    private javax.swing.JButton BOT�OMULTIPLICA��O;
    private javax.swing.JButton BOT�OPORCENTAGEM;
    private javax.swing.JButton BOT�OSOMA;
    private javax.swing.JButton BOT�OSUBTRA��O;
    private javax.swing.JButton BOT�OZERO;
    private javax.swing.JTextField CALCULO;
    private javax.swing.JTextField TELA;
    private javax.swing.JButton jButtonIMC;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   

}
