package VIEW;

// IMPLEMENTAR FUNCIONALIDADES:

import VIEW.calcIMC;

//-> BOTÃO PONTO. 
//-> CRIAR HISTÓRICO DE CALCULOS PEGANDO OS VALORES SETADOS NA JANELA CALCULO.

public class INTERTFACE_CALCULADORA extends javax.swing.JFrame {

    double valor1, valor2, resultado, valores;
    String operação;

    public INTERTFACE_CALCULADORA() {
        initComponents();
        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TELA = new javax.swing.JTextField();
        BOTÃO1 = new javax.swing.JButton();
        BOTÃO2 = new javax.swing.JButton();
        BOTÃO3 = new javax.swing.JButton();
        BOTÃO4 = new javax.swing.JButton();
        BOTÃO5 = new javax.swing.JButton();
        BOTÃO6 = new javax.swing.JButton();
        BOTÃO9 = new javax.swing.JButton();
        BOTÃO7 = new javax.swing.JButton();
        BOTÃO8 = new javax.swing.JButton();
        BOTÃOSOMA = new javax.swing.JButton();
        BOTÃOSUBTRAÇÃO = new javax.swing.JButton();
        BOTÃOMULTIPLICAÇÃO = new javax.swing.JButton();
        BOTÃODIVISÃO = new javax.swing.JButton();
        BOTÃOZERO = new javax.swing.JButton();
        BOTÃOIGUAL = new javax.swing.JButton();
        BOTÃOLIMPA = new javax.swing.JButton();
        BOTÃOPORCENTAGEM = new javax.swing.JButton();
        CALCULO = new javax.swing.JTextField();
        jButtonIMC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.black);

        TELA.setBackground(java.awt.Color.black);
        TELA.setFont(new java.awt.Font("Source Serif Pro Black", 1, 30)); // NOI18N
        TELA.setForeground(java.awt.Color.lightGray);
        TELA.setBorder(null);

        BOTÃO1.setBackground(java.awt.Color.white);
        BOTÃO1.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃO1.setText("1");
        BOTÃO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOTÃO1MouseClicked(evt);
            }
        });
        BOTÃO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BOTÃO1KeyPressed(evt);
            }
        });

        BOTÃO2.setBackground(java.awt.Color.white);
        BOTÃO2.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃO2.setText("2");
        BOTÃO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃO2ActionPerformed(evt);
            }
        });

        BOTÃO3.setBackground(java.awt.Color.white);
        BOTÃO3.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃO3.setText("3");
        BOTÃO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃO3ActionPerformed(evt);
            }
        });

        BOTÃO4.setBackground(java.awt.Color.white);
        BOTÃO4.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃO4.setText("4");
        BOTÃO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃO4ActionPerformed(evt);
            }
        });

        BOTÃO5.setBackground(java.awt.Color.white);
        BOTÃO5.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃO5.setText("5");
        BOTÃO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃO5ActionPerformed(evt);
            }
        });

        BOTÃO6.setBackground(java.awt.Color.white);
        BOTÃO6.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃO6.setText("6");
        BOTÃO6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃO6ActionPerformed(evt);
            }
        });

        BOTÃO9.setBackground(java.awt.Color.white);
        BOTÃO9.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃO9.setText("9");
        BOTÃO9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃO9ActionPerformed(evt);
            }
        });

        BOTÃO7.setBackground(java.awt.Color.white);
        BOTÃO7.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃO7.setText("7");
        BOTÃO7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃO7ActionPerformed(evt);
            }
        });

        BOTÃO8.setBackground(java.awt.Color.white);
        BOTÃO8.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃO8.setText("8");
        BOTÃO8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃO8ActionPerformed(evt);
            }
        });

        BOTÃOSOMA.setBackground(new java.awt.Color(240, 136, 1));
        BOTÃOSOMA.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃOSOMA.setText("+");
        BOTÃOSOMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃOSOMAActionPerformed(evt);
            }
        });

        BOTÃOSUBTRAÇÃO.setBackground(new java.awt.Color(240, 136, 1));
        BOTÃOSUBTRAÇÃO.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃOSUBTRAÇÃO.setText("-");
        BOTÃOSUBTRAÇÃO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃOSUBTRAÇÃOActionPerformed(evt);
            }
        });

        BOTÃOMULTIPLICAÇÃO.setBackground(new java.awt.Color(240, 136, 1));
        BOTÃOMULTIPLICAÇÃO.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃOMULTIPLICAÇÃO.setText("X");
        BOTÃOMULTIPLICAÇÃO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃOMULTIPLICAÇÃOActionPerformed(evt);
            }
        });

        BOTÃODIVISÃO.setBackground(new java.awt.Color(240, 136, 1));
        BOTÃODIVISÃO.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃODIVISÃO.setText("/");
        BOTÃODIVISÃO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃODIVISÃOActionPerformed(evt);
            }
        });

        BOTÃOZERO.setBackground(java.awt.Color.white);
        BOTÃOZERO.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃOZERO.setText("0");
        BOTÃOZERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃOZEROActionPerformed(evt);
            }
        });

        BOTÃOIGUAL.setBackground(new java.awt.Color(240, 136, 1));
        BOTÃOIGUAL.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃOIGUAL.setText("=");
        BOTÃOIGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃOIGUALActionPerformed(evt);
            }
        });

        BOTÃOLIMPA.setBackground(new java.awt.Color(235, 65, 0));
        BOTÃOLIMPA.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃOLIMPA.setText("AC");
        BOTÃOLIMPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃOLIMPAActionPerformed(evt);
            }
        });

        BOTÃOPORCENTAGEM.setBackground(new java.awt.Color(240, 136, 1));
        BOTÃOPORCENTAGEM.setFont(new java.awt.Font("Source Sans Pro Black", 3, 14)); // NOI18N
        BOTÃOPORCENTAGEM.setText("%");
        BOTÃOPORCENTAGEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTÃOPORCENTAGEMActionPerformed(evt);
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
                                .addComponent(BOTÃO4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOTÃO5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOTÃO6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOTÃOSUBTRAÇÃO, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BOTÃO1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOTÃO2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOTÃO3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOTÃOSOMA, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BOTÃO7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BOTÃO8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BOTÃO9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BOTÃOZERO, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BOTÃOLIMPA, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BOTÃOPORCENTAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BOTÃODIVISÃO, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BOTÃOMULTIPLICAÇÃO, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(BOTÃOIGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                        .addComponent(BOTÃO2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BOTÃO3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BOTÃOSOMA, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BOTÃO1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTÃO5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTÃO4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTÃO6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTÃOSUBTRAÇÃO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTÃO9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTÃO8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTÃO7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTÃOMULTIPLICAÇÃO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTÃOZERO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTÃODIVISÃO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTÃOPORCENTAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTÃOLIMPA, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BOTÃOIGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
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
  
    
    
    private void BOTÃO1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOTÃO1MouseClicked
        TELA.setText(TELA.getText() + "1");
    }//GEN-LAST:event_BOTÃO1MouseClicked

    private void BOTÃO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃO2ActionPerformed
        TELA.setText(TELA.getText() + "2");
    }//GEN-LAST:event_BOTÃO2ActionPerformed

    private void BOTÃO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃO3ActionPerformed
        TELA.setText(TELA.getText() + "3");
    }//GEN-LAST:event_BOTÃO3ActionPerformed

    private void BOTÃO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃO4ActionPerformed
        TELA.setText(TELA.getText() + "4");
    }//GEN-LAST:event_BOTÃO4ActionPerformed

    private void BOTÃO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃO5ActionPerformed
        TELA.setText(TELA.getText() + "5");
    }//GEN-LAST:event_BOTÃO5ActionPerformed

    private void BOTÃO6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃO6ActionPerformed
        TELA.setText(TELA.getText() + "6");
    }//GEN-LAST:event_BOTÃO6ActionPerformed

    private void BOTÃO7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃO7ActionPerformed
        TELA.setText(TELA.getText() + "7");
    }//GEN-LAST:event_BOTÃO7ActionPerformed

    private void BOTÃO8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃO8ActionPerformed
        TELA.setText(TELA.getText() + "8");
    }//GEN-LAST:event_BOTÃO8ActionPerformed

    private void BOTÃO9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃO9ActionPerformed
        TELA.setText(TELA.getText() + "9");
    }//GEN-LAST:event_BOTÃO9ActionPerformed

    private void BOTÃOZEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃOZEROActionPerformed
        TELA.setText(TELA.getText() + "0");
    }//GEN-LAST:event_BOTÃOZEROActionPerformed

    private void BOTÃOSOMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃOSOMAActionPerformed
        valor1 = Double.parseDouble(TELA.getText());
        operação = "soma";
        TELA.setText("  ");
    }//GEN-LAST:event_BOTÃOSOMAActionPerformed

    private void BOTÃOIGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃOIGUALActionPerformed
        valor2 = Double.parseDouble(TELA.getText());
        
        switch (operação) {

            case "soma":
                resultado = valor1 + valor2;
                TELA.setText(String.valueOf(String.format("%.0f", resultado)));
                CALCULO.setText(String.valueOf(String.format( " %.0f "
                        + " + " + " %.0f " + " = " + " %.0f ", valor1, valor2, resultado)));

                break;

            case "subtração":
                resultado = valor1 - valor2;
                TELA.setText(String.valueOf(String.format("%.0f", resultado)));
                CALCULO.setText(String.valueOf(String.format( " %.0f "
                        + " - " + " %.0f " + " = " + " %.0f ", valor1, valor2, resultado)));
                 break;

            case "multiplicação":
                resultado = valor1 * valor2;
                TELA.setText(String.valueOf(String.format("%.0f", resultado)));
                CALCULO.setText(String.valueOf(String.format( " %.0f "
                        + " X " + " %.0f " + " = " + " %.0f ", valor1, valor2, resultado)));
                break;
            case "divisão":
                resultado = valor1 / valor2;
                TELA.setText(String.valueOf(String.format("%.0f", resultado)));
                CALCULO.setText(String.valueOf(String.format( " %.0f "
                        + " / " + " %.0f " + " = " + " %.1f ", valor1, valor2, resultado)));
                break;
                
                   
    }//GEN-LAST:event_BOTÃOIGUALActionPerformed
    }
    private void BOTÃOSUBTRAÇÃOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃOSUBTRAÇÃOActionPerformed
        valor1 = Double.parseDouble(TELA.getText());
        operação = "subtração";
        TELA.setText("");

    }//GEN-LAST:event_BOTÃOSUBTRAÇÃOActionPerformed

    private void BOTÃOMULTIPLICAÇÃOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃOMULTIPLICAÇÃOActionPerformed
        valor1 = Double.parseDouble(TELA.getText());
        operação = "multiplicação";
        TELA.setText("");
    }//GEN-LAST:event_BOTÃOMULTIPLICAÇÃOActionPerformed

    private void BOTÃODIVISÃOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃODIVISÃOActionPerformed
        valor1 = Double.parseDouble(TELA.getText());
        operação = "divisão";
        TELA.setText("");
    }//GEN-LAST:event_BOTÃODIVISÃOActionPerformed

    private void BOTÃOLIMPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃOLIMPAActionPerformed
        TELA.setText("  ");
        CALCULO.setText("  ");
    }//GEN-LAST:event_BOTÃOLIMPAActionPerformed

    private void BOTÃOPORCENTAGEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTÃOPORCENTAGEMActionPerformed

        valor2 = Double.parseDouble(TELA.getText());

        if (operação == "soma") {
            resultado = (valor2 / 100 + 1) * valor1;
            TELA.setText(String.valueOf(String.format("%.1f", resultado)));
            CALCULO.setText(String.valueOf(String.format(
                    " %.0f " + " + " + " %.0f" + "%%" + " = " + " %.1f ", valor1, valor2, resultado)));

        }
        if (operação == "subtração") {
            resultado = valor1 - (valor2 / 100 * valor1);
            TELA.setText(String.valueOf(String.format("%.1f", resultado)));
            CALCULO.setText(String.valueOf(String.format(
                    " %.0f " + " - " + " %.0f" + "%%" + " = " + " %.1f ", valor1, valor2, resultado)));

        }


    }//GEN-LAST:event_BOTÃOPORCENTAGEMActionPerformed

    private void jButtonIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIMCActionPerformed
        calcIMC imc = new calcIMC (this, rootPaneCheckingEnabled);
        imc.setVisible(true);
        
       
        
        
    }//GEN-LAST:event_jButtonIMCActionPerformed

    private void BOTÃO1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BOTÃO1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTÃO1KeyPressed

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
    private javax.swing.JButton BOTÃO1;
    private javax.swing.JButton BOTÃO2;
    private javax.swing.JButton BOTÃO3;
    private javax.swing.JButton BOTÃO4;
    private javax.swing.JButton BOTÃO5;
    private javax.swing.JButton BOTÃO6;
    private javax.swing.JButton BOTÃO7;
    private javax.swing.JButton BOTÃO8;
    private javax.swing.JButton BOTÃO9;
    private javax.swing.JButton BOTÃODIVISÃO;
    private javax.swing.JButton BOTÃOIGUAL;
    private javax.swing.JButton BOTÃOLIMPA;
    private javax.swing.JButton BOTÃOMULTIPLICAÇÃO;
    private javax.swing.JButton BOTÃOPORCENTAGEM;
    private javax.swing.JButton BOTÃOSOMA;
    private javax.swing.JButton BOTÃOSUBTRAÇÃO;
    private javax.swing.JButton BOTÃOZERO;
    private javax.swing.JTextField CALCULO;
    private javax.swing.JTextField TELA;
    private javax.swing.JButton jButtonIMC;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   

}
