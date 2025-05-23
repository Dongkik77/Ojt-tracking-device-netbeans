/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.java;

import java.awt.*;
import java.util.Random;
import java.awt.image.BufferedImage;
import src.java.Class.Checkcredentials;
import javax.swing.*;

         
public class Captcha extends javax.swing.JFrame {

    private String captchaCode;
   
    private String email;
    private String password;
    private JFrame parentFrame;
    
    public Captcha(String Email, String Password, JFrame parentFrame) {
        
        this.email = Email;
        this.password = Password;
        this.parentFrame = parentFrame;
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        generateCaptchaImage();
        }
    private void generateCaptchaImage() {
        captchaCode = generateRandomCaptcha();
        BufferedImage captchaImage = createCaptchaImage(captchaCode);
        captchaimage.setIcon(new ImageIcon(captchaImage));
    }
    private String generateRandomCaptcha(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder captcha = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            captcha.append(chars.charAt(random.nextInt(chars.length())));
        }
        return captcha.toString();
    }
    
    private BufferedImage createCaptchaImage(String captchaCode) {
        int width = 300, height = 80;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();
        
        
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
        
        
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            g.fillRect(x, y, 2, 2);
        }
        
        g.setFont(new Font("Century Gothic", Font.BOLD, 30));
        for (int i = 0; i < captchaCode.length(); i++)  {
            int x = 20 + i * 30;
            int y = 30 + random.nextInt(20);
            g.setColor(new Color (random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            g.drawString(String.valueOf(captchaCode.charAt(i)), x, y);
        }
        
        
            for (int i = 0; i < 5; i++) {
            int x1 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int x2 = random.nextInt(width);
            int y2 = random.nextInt(height);
            g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            g.drawLine (x1, y1, x2, y2);
        }
        
        g.dispose();
        return image;
        }
                
    
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        captcha1 = new javax.swing.JTextField();
        captchaimage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        submit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        submit.setText("VERIFY");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        captcha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captcha1ActionPerformed(evt);
            }
        });

        captchaimage.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));
        jPanel2.setForeground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText(" ARE YOU HUMAN?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(captcha1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(captchaimage, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(submit)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(captchaimage, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(captcha1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submit)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String userInput = captcha1.getText();
        if(userInput.equals(captchaCode)) {
           JOptionPane.showMessageDialog(this, "CAPTCHA Verified!");
            
           Checkcredentials credentials = new Checkcredentials();
           if(credentials.isCredentialCorrect(email, password)){
               JOptionPane.showMessageDialog(this, "Login Successful!");
                       new afterlogin().setVisible(true);
                       parentFrame.dispose();
                       dispose();  
           }else{
               JOptionPane.showMessageDialog(this, "Invalid credentials");
               dispose();
           }
        }else{
           JOptionPane.showMessageDialog(this, "Invalid CAPTCHA. Please try again.");
           captcha1.setText("");
           generateCaptchaImage();
           dispose();
        }
        
    }//GEN-LAST:event_submitActionPerformed

    private void captcha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captcha1ActionPerformed
        captcha1.setText("");
    }//GEN-LAST:event_captcha1ActionPerformed

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
            java.util.logging.Logger.getLogger(Captcha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Captcha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Captcha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Captcha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField captcha1;
    private javax.swing.JLabel captchaimage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
