/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.atividade09aula12do11;

/**
 *2) Elabore um frame que simule o teclado de um telefone digital, de acordo com a 
Figura. A cada tecla pressionada o número é acumulado na caixa de texto. O botão 
Limpar apaga todos os números digitados.
 * @author Joao Silva, Nathan e Rafael
 */
public class FrmEx02 extends javax.swing.JFrame {

    /**
     * Creates new form FrmEx02
     */
    public FrmEx02() {
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

        btNum1 = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        lblNums = new javax.swing.JLabel();
        btNum3 = new javax.swing.JButton();
        btNum2 = new javax.swing.JButton();
        btNum4 = new javax.swing.JButton();
        btNum5 = new javax.swing.JButton();
        btNum6 = new javax.swing.JButton();
        btNum9 = new javax.swing.JButton();
        btNum7 = new javax.swing.JButton();
        btNum8 = new javax.swing.JButton();
        btNum10 = new javax.swing.JButton();
        btNum11 = new javax.swing.JButton();
        btNum12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btNum1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum1.setText("1");
        btNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum1ActionPerformed(evt);
            }
        });

        btClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btClear.setText("Limpar");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        lblNums.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNums.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btNum3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum3.setText("3");
        btNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum3ActionPerformed(evt);
            }
        });

        btNum2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum2.setText("2");
        btNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum2ActionPerformed(evt);
            }
        });

        btNum4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum4.setText("4");
        btNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum4ActionPerformed(evt);
            }
        });

        btNum5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum5.setText("5");
        btNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum5ActionPerformed(evt);
            }
        });

        btNum6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum6.setText("6");
        btNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum6ActionPerformed(evt);
            }
        });

        btNum9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum9.setText("9");
        btNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum9ActionPerformed(evt);
            }
        });

        btNum7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum7.setText("7");
        btNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum7ActionPerformed(evt);
            }
        });

        btNum8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum8.setText("8");
        btNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum8ActionPerformed(evt);
            }
        });

        btNum10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum10.setText("*");
        btNum10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum10ActionPerformed(evt);
            }
        });

        btNum11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum11.setText("0");
        btNum11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum11ActionPerformed(evt);
            }
        });

        btNum12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btNum12.setText("#");
        btNum12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNum12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNums, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNums, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        lblNums.setText("");
    }//GEN-LAST:event_btClearActionPerformed

    private void btNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum1ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '1';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum1ActionPerformed

    private void btNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum2ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '2';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum2ActionPerformed

    private void btNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum3ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '3';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum3ActionPerformed

    private void btNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum4ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '4';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum4ActionPerformed

    private void btNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum5ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '5';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum5ActionPerformed

    private void btNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum6ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '6';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum6ActionPerformed

    private void btNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum7ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '7';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum7ActionPerformed

    private void btNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum8ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '8';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum8ActionPerformed

    private void btNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum9ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '9';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum9ActionPerformed

    private void btNum10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum10ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '*';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum10ActionPerformed

    private void btNum11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum11ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '0';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum11ActionPerformed

    private void btNum12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNum12ActionPerformed
        // TODO add your handling code here:
        String nums;
        nums = lblNums.getText() + '#';
        lblNums.setText(nums);
    }//GEN-LAST:event_btNum12ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEx02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEx02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEx02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEx02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEx02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btNum1;
    private javax.swing.JButton btNum10;
    private javax.swing.JButton btNum11;
    private javax.swing.JButton btNum12;
    private javax.swing.JButton btNum2;
    private javax.swing.JButton btNum3;
    private javax.swing.JButton btNum4;
    private javax.swing.JButton btNum5;
    private javax.swing.JButton btNum6;
    private javax.swing.JButton btNum7;
    private javax.swing.JButton btNum8;
    private javax.swing.JButton btNum9;
    private javax.swing.JLabel lblNums;
    // End of variables declaration//GEN-END:variables
}