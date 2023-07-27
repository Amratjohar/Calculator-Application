package org.nlt.views;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Calc extends javax.swing.JFrame 
{
     private String operator;
     private String firstNo;
        
    public Calc() 
    {
        initComponents();
        operator = "";
        firstNo = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        numberTextfield = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        oneButton = new javax.swing.JButton();
        secondButton = new javax.swing.JButton();
        thirdButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        sevenButton = new javax.swing.JButton();
        eigthButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        zeroButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        doubleZeroButton = new javax.swing.JButton();
        modButton = new javax.swing.JButton();
        allclearButton = new javax.swing.JButton();
        sqrtButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        plusMinusButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        leftShiftButon = new javax.swing.JButton();
        clsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(7, 1, 0, 10));

        jPanel2.setLayout(new java.awt.GridLayout(1, 1));

        numberTextfield.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel2.add(numberTextfield);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        oneButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        jPanel3.add(oneButton);

        secondButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        secondButton.setText("2");
        secondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondButtonActionPerformed(evt);
            }
        });
        jPanel3.add(secondButton);

        thirdButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        thirdButton.setText("3");
        thirdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdButtonActionPerformed(evt);
            }
        });
        jPanel3.add(thirdButton);

        plusButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });
        jPanel3.add(plusButton);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        fourButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });
        jPanel4.add(fourButton);

        fiveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });
        jPanel4.add(fiveButton);

        sixButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });
        jPanel4.add(sixButton);

        minusButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });
        jPanel4.add(minusButton);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        sevenButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });
        jPanel5.add(sevenButton);

        eigthButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eigthButton.setText("8");
        eigthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eigthButtonActionPerformed(evt);
            }
        });
        jPanel5.add(eigthButton);

        nineButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });
        jPanel5.add(nineButton);

        multiplyButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        multiplyButton.setText("*");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });
        jPanel5.add(multiplyButton);

        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        zeroButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });
        jPanel6.add(zeroButton);

        equalsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });
        jPanel6.add(equalsButton);

        dotButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dotButton.setText(".");
        dotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotButtonActionPerformed(evt);
            }
        });
        jPanel6.add(dotButton);

        divideButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });
        jPanel6.add(divideButton);

        jPanel1.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 5, 10, 0));

        doubleZeroButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doubleZeroButton.setText("00");
        doubleZeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleZeroButtonActionPerformed(evt);
            }
        });
        jPanel7.add(doubleZeroButton);

        modButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modButton.setText("%");
        modButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modButtonActionPerformed(evt);
            }
        });
        jPanel7.add(modButton);

        allclearButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allclearButton.setText("AC");
        allclearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allclearButtonActionPerformed(evt);
            }
        });
        jPanel7.add(allclearButton);

        sqrtButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sqrtButton.setText("SQRT");
        sqrtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtButtonActionPerformed(evt);
            }
        });
        jPanel7.add(sqrtButton);

        jPanel1.add(jPanel7);

        jPanel8.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        plusMinusButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        plusMinusButton.setText("+/-");
        plusMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusMinusButtonActionPerformed(evt);
            }
        });
        jPanel8.add(plusMinusButton);

        squareButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        squareButton.setText("SQR");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });
        jPanel8.add(squareButton);

        leftShiftButon.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        leftShiftButon.setText("<<");
        leftShiftButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftShiftButonActionPerformed(evt);
            }
        });
        jPanel8.add(leftShiftButon);

        clsButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        clsButton.setText("CLS");
        jPanel8.add(clsButton);

        jPanel1.add(jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(592, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
       getNumber(evt);
    }//GEN-LAST:event_oneButtonActionPerformed

    private void dotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotButtonActionPerformed
        if (!numberTextfield.getText().contains("."))//for repeated dot
        {
            if (numberTextfield.getText().isEmpty())//when empty & dot
            {
                numberTextfield.setText("0.");
            }
            else //when not empty & dot for ex 10
            {
                numberTextfield.setText(numberTextfield.getText()+".");
            }
        }
    }//GEN-LAST:event_dotButtonActionPerformed

    private void secondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_secondButtonActionPerformed

    private void thirdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_thirdButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void eigthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eigthButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_eigthButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_nineButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void doubleZeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleZeroButtonActionPerformed
       getNumber(evt);
    }//GEN-LAST:event_doubleZeroButtonActionPerformed

    private void allclearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allclearButtonActionPerformed
        reset();
    }//GEN-LAST:event_allclearButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        operator = "*";
        firstNo = numberTextfield.getText();
        numberTextfield.setText("");
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void sqrtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtButtonActionPerformed
        try
        {
            int no = Integer.parseInt(numberTextfield.getText());
            numberTextfield.setText(Math.sqrt(no)+"");
        }
        catch (NumberFormatException ex) 
        {
             float no = Float.parseFloat(numberTextfield.getText());
             numberTextfield.setText(Math.sqrt(no)+"");
        }
    }//GEN-LAST:event_sqrtButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        operator = "/";
        firstNo = numberTextfield.getText();
        numberTextfield.setText("");
    }//GEN-LAST:event_divideButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        operator = "/";
        firstNo = numberTextfield.getText();
        numberTextfield.setText("");
    }//GEN-LAST:event_minusButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        operator = "+";
        firstNo = numberTextfield.getText();
        numberTextfield.setText("");
    }//GEN-LAST:event_plusButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        if (!operator.isEmpty())    //if we have in operator +/*-%
        {
            try
            {
                if (operator.equals("+")) 
                {
                    String secondNo = numberTextfield.getText();
                    numberTextfield.setText((Integer.parseInt(firstNo) + Integer.parseInt(secondNo)) + "");
                } 
                else if (operator.equals("-"))
                {
                    String secondNo = numberTextfield.getText();
                    numberTextfield.setText((Integer.parseInt(firstNo) - Integer.parseInt(secondNo)) + "");
                } 
                else if (operator.equals("*")) 
                {
                    String secondNo = numberTextfield.getText();
                    numberTextfield.setText((Integer.parseInt(firstNo) * Integer.parseInt(secondNo)) + "");
                }
                else if (operator.equals("/")) 
                {
                    throw new NumberFormatException();
                }
                else if (operator.equals("%")) 
                {
                    String secondNo = numberTextfield.getText();
                    numberTextfield.setText(((Float.parseFloat(firstNo) * Float.parseFloat(secondNo))/100) + "");
                }
            }
            catch (NumberFormatException ex) 
            {
                if (operator.equals("+")) 
                {
                    String secondNo = numberTextfield.getText();
                    numberTextfield.setText((Float.parseFloat(firstNo) + Float.parseFloat(secondNo)) + "");
                } 
                else if (operator.equals("-"))
                {
                    String secondNo = numberTextfield.getText();
                    numberTextfield.setText((Float.parseFloat(firstNo) - Float.parseFloat(secondNo)) + "");
                }
                else if (operator.equals("*"))
                {
                    String secondNo = numberTextfield.getText();
                    numberTextfield.setText((Float.parseFloat(firstNo) * Float.parseFloat(secondNo)) + "");
                } 
                else if (operator.equals("/"))
                {
                    String secondNo = numberTextfield.getText();
                    numberTextfield.setText((Float.parseFloat(firstNo) / Float.parseFloat(secondNo)) + "");
                }
                else if (operator.equals("%")) 
                {
                    String secondNo = numberTextfield.getText();
                    numberTextfield.setText(((Float.parseFloat(firstNo) * Float.parseFloat(secondNo))/100) + "");
                }
            }//catch close
            
            operator="";
        }//if close
    }//GEN-LAST:event_equalsButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
         try 
         {
            int no = Integer.parseInt(numberTextfield.getText());
            numberTextfield.setText((no * no) + "");
         } 
         catch (NumberFormatException ex) 
         {
            float no = Float.parseFloat(numberTextfield.getText());
            numberTextfield.setText((no * no) + "");
        }
    }//GEN-LAST:event_squareButtonActionPerformed

    private void plusMinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusMinusButtonActionPerformed
        try 
        {
            int no = Integer.parseInt(numberTextfield.getText());
            numberTextfield.setText((no*-1.0f)+"");
        }
        catch (NumberFormatException ex)
        {
            float no = Float.parseFloat(numberTextfield.getText());
            numberTextfield.setText((no*-1.0f)+"");
        }
    }//GEN-LAST:event_plusMinusButtonActionPerformed

    private void leftShiftButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftShiftButonActionPerformed
         if(!numberTextfield.getText().isEmpty())
        {
            numberTextfield.setText(numberTextfield.getText().substring(0,numberTextfield.getText().length()-1));
        }
    }//GEN-LAST:event_leftShiftButonActionPerformed

    private void modButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modButtonActionPerformed
         operator="%";
        firstNo = numberTextfield.getText();
        numberTextfield.setText("");
    }//GEN-LAST:event_modButtonActionPerformed
    
    private void getNumber(ActionEvent evt)
    {
        JButton btn=(JButton) evt.getSource();
        String str=btn.getActionCommand();
        
        if(numberTextfield.getText().isEmpty() && str.contains("0"))
        {
            
        }
        else
        {
            numberTextfield.setText(numberTextfield.getText()+str);
        }
    }

    private void reset()
    {
        operator="";
        numberTextfield.setText("");
        firstNo="";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allclearButton;
    private javax.swing.JButton clsButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton doubleZeroButton;
    private javax.swing.JButton eigthButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton leftShiftButon;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton modButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JTextField numberTextfield;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton plusMinusButton;
    private javax.swing.JButton secondButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton sqrtButton;
    private javax.swing.JButton squareButton;
    private javax.swing.JButton thirdButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}