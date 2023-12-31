/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora1;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author guiab
 */
public class calculadora extends javax.swing.JFrame {

    private String stringNumber = "";
    private String operation = "null";
    private String memory = "null";
    private double firstNumber, result;
    private boolean active = true;
    private boolean point = true;
    /**
     * Creates new form calculadora
     */
    public calculadora() {
        initComponents();
        this.setTitle("Calculadora Lila");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelResults = new javax.swing.JLabel();
        panelPantalla = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b000 = new javax.swing.JButton();
        bComa = new javax.swing.JButton();
        bPlus = new javax.swing.JButton();
        bMinus = new javax.swing.JButton();
        bMult = new javax.swing.JButton();
        bEqual = new javax.swing.JButton();
        bDivide = new javax.swing.JButton();
        bPercent = new javax.swing.JButton();
        bExp = new javax.swing.JButton();
        bErase = new javax.swing.JButton();
        bClearE = new javax.swing.JButton();
        bMemory = new javax.swing.JButton();
        bAddMemory = new javax.swing.JButton();
        bPi = new javax.swing.JButton();
        bSqrt = new javax.swing.JButton();
        bPlusMinus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(380, 450));

        background.setBackground(new java.awt.Color(204, 204, 255));

        panelResults.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelResults.setOpaque(true);

        panelPantalla.setBackground(new java.awt.Color(241, 241, 241));
        panelPantalla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        panelPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelPantallaActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(235, 235, 235));
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(235, 235, 235));
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(235, 235, 235));
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(235, 235, 235));
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(235, 235, 235));
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(235, 235, 235));
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(235, 235, 235));
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(235, 235, 235));
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(235, 235, 235));
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(235, 235, 235));
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b000.setBackground(new java.awt.Color(235, 235, 235));
        b000.setText("000");
        b000.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b000ActionPerformed(evt);
            }
        });

        bComa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bComa.setText(".");
        bComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComaActionPerformed(evt);
            }
        });

        bPlus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bPlus.setText("+");
        bPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlusActionPerformed(evt);
            }
        });

        bMinus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bMinus.setText("-");
        bMinus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinusActionPerformed(evt);
            }
        });

        bMult.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bMult.setText("·");
        bMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultActionPerformed(evt);
            }
        });

        bEqual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bEqual.setText("=");
        bEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEqualActionPerformed(evt);
            }
        });

        bDivide.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bDivide.setText("/");
        bDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivideActionPerformed(evt);
            }
        });

        bPercent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bPercent.setText("%");
        bPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPercentActionPerformed(evt);
            }
        });

        bExp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bExp.setText("^");
        bExp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExpActionPerformed(evt);
            }
        });

        bErase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bErase.setText("←");
        bErase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEraseActionPerformed(evt);
            }
        });

        bClearE.setBackground(new java.awt.Color(255, 198, 50));
        bClearE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bClearE.setText("CE");
        bClearE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearEActionPerformed(evt);
            }
        });

        bMemory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bMemory.setText("M");
        bMemory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMemoryActionPerformed(evt);
            }
        });

        bAddMemory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bAddMemory.setText("M+");
        bAddMemory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddMemoryActionPerformed(evt);
            }
        });

        bPi.setBackground(new java.awt.Color(235, 235, 235));
        bPi.setText("π");
        bPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPiActionPerformed(evt);
            }
        });

        bSqrt.setText("√");
        bSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSqrtActionPerformed(evt);
            }
        });

        bPlusMinus.setText("+/-");
        bPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlusMinusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(bMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(bExp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(bMult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(b000, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(bDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(bComa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bPi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(bEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelPantalla)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(bPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(bPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(bAddMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bClearE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bErase, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelResults, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panelResults, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bErase)
                    .addComponent(bClearE)
                    .addComponent(bMemory)
                    .addComponent(bAddMemory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bPi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bExp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b000, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(bEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bComa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultActionPerformed
        if(active==true){
            firstNumber = Double.parseDouble(stringNumber);
            panelResults.setText(stringNumber + " ∙ ");
            stringNumber = "";
            panelPantalla.setText(stringNumber);
            operation = "multiplication";
            active = false;
            point = true;
        }
    }//GEN-LAST:event_bMultActionPerformed

    private void bMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinusActionPerformed
        if(active==true){
            firstNumber = Double.parseDouble(stringNumber);
            panelResults.setText(stringNumber + " - ");
            stringNumber = "";
            panelPantalla.setText(stringNumber);
            operation = "subtraction";
            active = false;
            point = true;
        }
    }//GEN-LAST:event_bMinusActionPerformed

    private void bPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlusActionPerformed
        if(active==true){
            firstNumber = Double.parseDouble(stringNumber);
            panelResults.setText(stringNumber + " + ");
            stringNumber = "";
            panelPantalla.setText(stringNumber);
            operation = "addition";
            active = false;
            point = true;
        }
    }//GEN-LAST:event_bPlusActionPerformed

    private void b000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b000ActionPerformed
        if(panelPantalla.getText().equals("0")){
            stringNumber = "000";
        }else{
            stringNumber += "000";
        }
        panelPantalla.setText(stringNumber);
        active=true;
    }//GEN-LAST:event_b000ActionPerformed

/**
 * Equal button config
 * @param evt 
 */
    private void bEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEqualActionPerformed
        double secondNumber;
        if(operation.equals("null")){
            panelPantalla.setText(stringNumber);
        }
        else if (operation.equals("addition")){
            secondNumber = Double.parseDouble(stringNumber);
            result = firstNumber + secondNumber;
            panelPantalla.setText(String.format("% .2f",result));
            stringNumber = String.valueOf(result);
            operation = "null";
        } else if (operation.equals("subtraction")){
            secondNumber = Double.parseDouble(stringNumber);
            result = firstNumber - secondNumber;
            panelPantalla.setText(String.format("% .2f",result));
            stringNumber = String.valueOf(result);
            operation = "null";
        } else if (operation.equals("multiplication")){
            secondNumber = Double.parseDouble(stringNumber);
            result = firstNumber * secondNumber;
            panelPantalla.setText(String.format("% .2f",result));
            stringNumber = String.valueOf(result);
            operation = "null";
        } else if (operation.equals("division")){
            secondNumber = Double.parseDouble(stringNumber);
            result = firstNumber / secondNumber;
                if(secondNumber == 0){
                    panelPantalla.setText("No se puede dividir por cero");
                } else {
                    panelPantalla.setText(String.format("% .2f",result));
                }
            stringNumber = String.valueOf(result);
            operation = "null";
        } else if (operation.equals("pow")){
            secondNumber = Double.parseDouble(stringNumber);
            result = Math.pow(firstNumber, secondNumber);
                if(secondNumber == 0){
                    if(firstNumber == 0){
                        panelResults.setText("No se puede elevar el cero a cero");
                    } else {
                        panelPantalla.setText("1");
                    }
                } else {
                    panelPantalla.setText(String.format("% .2f",result));
                }
            stringNumber = String.valueOf(result);
            operation = "null";
            
        } else if (operation.equals("percent")){
            secondNumber = Double.parseDouble(stringNumber);
            result = (firstNumber/100) * secondNumber;
            panelPantalla.setText(String.format("% .2f",result));
            stringNumber = String.valueOf(result);
            operation = "null";
        }
        panelResults.setText("");
        active = true;
    }//GEN-LAST:event_bEqualActionPerformed

/**
 * Divide button config
 * @param evt 
 */
    private void bDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivideActionPerformed
        if(active==true){
            firstNumber = Double.parseDouble(stringNumber);
            panelResults.setText(stringNumber + " / ");
            stringNumber = "";
            panelPantalla.setText(stringNumber);
            operation = "division";
            active = false;
            point = true;
        }
    }//GEN-LAST:event_bDivideActionPerformed

/**
 * Percent button config
 * @param evt 
 */
    private void bPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPercentActionPerformed
        if(active==true){
            firstNumber = Double.parseDouble(stringNumber);
            panelResults.setText(stringNumber + " % de");
            stringNumber = "";
            panelPantalla.setText(stringNumber);
            operation = "percent";
            active = false;
            point = true;
        }
    }//GEN-LAST:event_bPercentActionPerformed

/**
 * exponent button config
 * @param evt 
 */
    private void bExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExpActionPerformed
        if(active==true){
            firstNumber = Double.parseDouble(stringNumber);
            panelResults.setText(stringNumber + " ^ ");
            stringNumber = "";
            panelPantalla.setText(stringNumber);
            operation = "pow";
            active = false;
            point = true;
        }
    }//GEN-LAST:event_bExpActionPerformed

    private void panelPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelPantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelPantallaActionPerformed

/**
 * Erase button config
 * @param evt 
 */
    private void bEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEraseActionPerformed
        int large = stringNumber.length();
        if (large > 0){
            if(large == 1){
                stringNumber = "0";
            } else {
                stringNumber = stringNumber.substring(0, stringNumber.length() - 1);
            }
            panelPantalla.setText(stringNumber);
        } 
    }//GEN-LAST:event_bEraseActionPerformed

/**
 * Clear everything button config
 * @param evt 
 */
    private void bClearEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearEActionPerformed
        panelPantalla.setText("");
        panelResults.setText("borraste todo");
        stringNumber = "";
        operation = "null";
        active = true;
        point = true;
    }//GEN-LAST:event_bClearEActionPerformed

/**
 * Memory button config
 * @param evt 
 */
    private void bMemoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemoryActionPerformed
            panelPantalla.setText(memory);
            stringNumber = memory;
    }//GEN-LAST:event_bMemoryActionPerformed

    private void bAddMemoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddMemoryActionPerformed
        if (stringNumber != ""){
            memory = stringNumber;
            panelResults.setText("Guardado en M");
            stringNumber = "";
            panelPantalla.setText(stringNumber);
        } else {
            panelResults.setText("No hay valor para guardar en M");
        }
    }//GEN-LAST:event_bAddMemoryActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(panelPantalla.getText().equals("0")){
            stringNumber = "1";
        }else{
            stringNumber += "1";
        }
        panelPantalla.setText(stringNumber);
        active=true;          
    }//GEN-LAST:event_b1ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        if(panelPantalla.getText().equals("0")){
            stringNumber = "0";
        }else{
            stringNumber += "0";
        }
        panelPantalla.setText(stringNumber);
        active=true;
    }//GEN-LAST:event_b0ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(panelPantalla.getText().equals("0")){
            stringNumber = "2";
        }else{
            stringNumber += "2";
        }
        panelPantalla.setText(stringNumber);
        active=true;  
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(panelPantalla.getText().equals("0")){
            stringNumber = "3";
        }else{
            stringNumber += "3";
        }
        panelPantalla.setText(stringNumber);
        active=true;   
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(panelPantalla.getText().equals("0")){
            stringNumber = "4";
        }else{
            stringNumber += "4";
        }
        panelPantalla.setText(stringNumber);
        active=true;
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(panelPantalla.getText().equals("0")){
            stringNumber = "5";
        }else{
            stringNumber += "5";
        }
        panelPantalla.setText(stringNumber);
        active=true;
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(panelPantalla.getText().equals("0")){
            stringNumber = "6";
        }else{
            stringNumber += "6";
        }
        panelPantalla.setText(stringNumber);
        active=true;
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(panelPantalla.getText().equals("0")){
            stringNumber = "7";
        }else{
            stringNumber += "7";
        }
        panelPantalla.setText(stringNumber);
        active=true;
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(panelPantalla.getText().equals("0")){
            stringNumber = "8";
        }else{
            stringNumber += "8";
        }
        panelPantalla.setText(stringNumber);
        active=true;
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(panelPantalla.getText().equals("0")){
            stringNumber = "9";
        }else{
            stringNumber += "9";
        }
        panelPantalla.setText(stringNumber);
        active=true;
    }//GEN-LAST:event_b9ActionPerformed

    private void bSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSqrtActionPerformed
        firstNumber = Double.parseDouble(stringNumber);
        panelResults.setText("sqrt("+stringNumber+")");
        result = Math.sqrt(firstNumber);
        panelPantalla.setText(String.format("% .2f", result));
        stringNumber = String.valueOf(result); //Transformamos valor a cadena
        point = true;
    }//GEN-LAST:event_bSqrtActionPerformed

    private void bComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComaActionPerformed
        if(point == true){
            if(stringNumber.equals("")){
                stringNumber = "0.";
                point = false;
            }else{
                stringNumber += ".";
                point = false;
            }
        }
    }//GEN-LAST:event_bComaActionPerformed

    private void bPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlusMinusActionPerformed
        if(stringNumber.charAt(0) != '-'){
            stringNumber = "-" + stringNumber;
        } else {
            stringNumber = stringNumber.substring(1,stringNumber.length());
        }
        panelPantalla.setText(stringNumber);
    }//GEN-LAST:event_bPlusMinusActionPerformed

    private void bPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPiActionPerformed
        if(panelPantalla.getText().equals("")){
            stringNumber = Double.toString(Math.PI);
        }else{
            stringNumber = stringNumber;
        }
        panelPantalla.setText(stringNumber);
        active=true;   
    }//GEN-LAST:event_bPiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b000;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bAddMemory;
    private javax.swing.JButton bClearE;
    private javax.swing.JButton bComa;
    private javax.swing.JButton bDivide;
    private javax.swing.JButton bEqual;
    private javax.swing.JButton bErase;
    private javax.swing.JButton bExp;
    private javax.swing.JButton bMemory;
    private javax.swing.JButton bMinus;
    private javax.swing.JButton bMult;
    private javax.swing.JButton bPercent;
    private javax.swing.JButton bPi;
    private javax.swing.JButton bPlus;
    private javax.swing.JButton bPlusMinus;
    private javax.swing.JButton bSqrt;
    private javax.swing.JPanel background;
    private javax.swing.JTextField panelPantalla;
    private javax.swing.JLabel panelResults;
    // End of variables declaration//GEN-END:variables
}
