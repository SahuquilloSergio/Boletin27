/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin27;

/**
 *
 * @author serxa
 */
public class Ventana extends javax.swing.JFrame {

    double num1,num2,resultado;
    String operacion;
    boolean nueva=true;
    public Ventana() {
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

        jPanel1 = new javax.swing.JPanel();
        Pantalla = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Boton0 = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        BotonComa = new javax.swing.JButton();
        BotonSuma = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        BotonResta = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        BotonMulti = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        BotonDivi = new javax.swing.JButton();
        BotonC = new javax.swing.JButton();
        BotonOff = new javax.swing.JButton();
        testigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaActionPerformed(evt);
            }
        });
        jPanel1.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 50));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton0.setText("0");
        Boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, 50));

        BotonIgual.setText("=");
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });
        jPanel2.add(BotonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 50, 50));

        BotonComa.setText(".");
        BotonComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComaActionPerformed(evt);
            }
        });
        jPanel2.add(BotonComa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 50, 50));

        BotonSuma.setText("+");
        BotonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumaActionPerformed(evt);
            }
        });
        jPanel2.add(BotonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 51, 51));

        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 50, 50));

        Boton2.setText("2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 50, 50));

        Boton3.setText("3");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 50, 50));

        BotonResta.setText("-");
        BotonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRestaActionPerformed(evt);
            }
        });
        jPanel2.add(BotonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 50, 50));

        Boton4.setText("4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 50));

        Boton5.setText("5");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, 50));

        Boton6.setText("6");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 50, 50));

        BotonMulti.setText("*");
        BotonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMultiActionPerformed(evt);
            }
        });
        jPanel2.add(BotonMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 50, 50));

        Boton7.setText("7");
        Boton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, 50));

        Boton8.setText("8");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 50, 50));

        Boton9.setText("9");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 50, 50));

        BotonDivi.setText("/");
        BotonDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDiviActionPerformed(evt);
            }
        });
        jPanel2.add(BotonDivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 50, 50));

        BotonC.setText("C");
        BotonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCActionPerformed(evt);
            }
        });
        jPanel2.add(BotonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 49, -1));

        BotonOff.setText("Off");
        jPanel2.add(BotonOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, 310));

        testigo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(testigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PantallaActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
                if(Pantalla.getText()==null){
            Pantalla.setText(Boton8.getText());
        }else{
            Pantalla.setText(Pantalla.getText()+Boton8.getText());
        }
    }//GEN-LAST:event_Boton8ActionPerformed

    private void BotonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRestaActionPerformed
        try{
        if(num1!=0)
            num1=num1-Double.parseDouble(Pantalla.getText());
        else
            num1=Double.parseDouble(Pantalla.getText());
            operacion="resta";
            Pantalla.setText("");
            testigo.setText(String.valueOf(num1+"-"));
        }catch(NumberFormatException err){
        
        }        
    }//GEN-LAST:event_BotonRestaActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
            if(Pantalla.getText()==null){
            Pantalla.setText(Boton3.getText());
        }else{
            Pantalla.setText(Pantalla.getText()+Boton3.getText());
        }
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
                if(Pantalla.getText()==null){
            Pantalla.setText(Boton9.getText());
        }else{
            Pantalla.setText(Pantalla.getText()+Boton9.getText());
        }
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
                if(Pantalla.getText()==null){
            Pantalla.setText(Boton7.getText());
        }else{
            Pantalla.setText(Pantalla.getText()+Boton7.getText());
        }
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0ActionPerformed
        if(Pantalla.getText()==null){
            Pantalla.setText(Boton0.getText());
        }else{
            Pantalla.setText(Pantalla.getText()+Boton0.getText());
        }
    }//GEN-LAST:event_Boton0ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
                if(Pantalla.getText()==null && nueva==true){
            Pantalla.setText(Boton1.getText());
        }else{
            Pantalla.setText(Pantalla.getText()+Boton1.getText());
        }   
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
                if(Pantalla.getText()==null && nueva==true){
            Pantalla.setText(Boton2.getText());
        }else{
            Pantalla.setText(Pantalla.getText()+Boton2.getText());
        }
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
                if(Pantalla.getText()==null){
            Pantalla.setText(Boton4.getText());
        }else{
            Pantalla.setText(Pantalla.getText()+Boton4.getText());
        }
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
                if(Pantalla.getText()==null){
            Pantalla.setText(Boton5.getText());
        }else{
            Pantalla.setText(Pantalla.getText()+Boton5.getText());
        }
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
                if(Pantalla.getText()==null){
            Pantalla.setText(Boton6.getText());
        }else{
            Pantalla.setText(Pantalla.getText()+Boton6.getText());
        }
    }//GEN-LAST:event_Boton6ActionPerformed

    private void BotonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumaActionPerformed
       try{
        if(num1!=0)
            
            num1=num1+Double.parseDouble(Pantalla.getText());
            
        else
            num1=Double.parseDouble(Pantalla.getText());
            operacion="suma";
            Pantalla.setText("");
            testigo.setText(String.valueOf(num1+"+"));
        }catch(NumberFormatException err){
        
        }        
    }//GEN-LAST:event_BotonSumaActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
//        Pantalla.setText(String.valueOf(0));
//        Pantalla.setText(String.valueOf(resultado));
try{
                num2=Double.parseDouble(Pantalla.getText());
                }catch(NumberFormatException err){}
        switch (operacion) {
            case "suma":
                {
                    double res=num1+num2;
                    testigo.setText(String.valueOf(res));
                    num1=num2=0;
                    operacion="";
                    Pantalla.setText(null);
                    break;
                }
            case "resta":
                {
                    double res=num1-num2;
                    testigo.setText(String.valueOf(res));
                    num1=num2=0;
                    operacion="";
                    Pantalla.setText(null);
                    break;
                }
            case "multiplicacion":
                {
                    double res=num1*num2;
                    testigo.setText(String.valueOf(res));
                    num1=num2=0;
                    operacion="";
                    Pantalla.setText(null);
                    break;
                }
            case "division":
                {
                    double res=num1/num2;
                    testigo.setText(String.valueOf(res));
                    num1=num2=0;
                    operacion="";
                    Pantalla.setText(null);
                    break;
                }
            default:
                break;
        }
                nueva=true;
            
    }//GEN-LAST:event_BotonIgualActionPerformed

    private void BotonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMultiActionPerformed
        try{
        if(num1!=0)
            num1=num1*Double.parseDouble(Pantalla.getText());
        else
            num1=Double.parseDouble(Pantalla.getText());
            operacion="multiplicacion";
            Pantalla.setText("");
            testigo.setText(String.valueOf(num1+"*"));
        }catch(NumberFormatException err){
        
        }        
    }//GEN-LAST:event_BotonMultiActionPerformed

    private void BotonDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDiviActionPerformed
        try{
        if(num1!=0)
            num1=num1/Double.parseDouble(Pantalla.getText());
        else
            num1=Double.parseDouble(Pantalla.getText());
            operacion="division";
            Pantalla.setText("");
            testigo.setText(String.valueOf(num1+"-"));
        }catch(NumberFormatException err){
        
        }        
    }//GEN-LAST:event_BotonDiviActionPerformed

    private void BotonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComaActionPerformed
      Pantalla.setText(Pantalla.getText()+BotonComa.getText());  
    }//GEN-LAST:event_BotonComaActionPerformed

    private void BotonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton0;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonC;
    private javax.swing.JButton BotonComa;
    private javax.swing.JButton BotonDivi;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonMulti;
    private javax.swing.JButton BotonOff;
    private javax.swing.JButton BotonResta;
    private javax.swing.JButton BotonSuma;
    private javax.swing.JTextField Pantalla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel testigo;
    // End of variables declaration//GEN-END:variables
}
