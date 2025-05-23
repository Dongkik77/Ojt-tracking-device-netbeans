package src.java;


import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.PreparedStatement;
import src.java.Class.DatabaseProvider;
import java.sql.ResultSet;
import java.sql.Statement;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Windows
 */
public class afterlogin extends javax.swing.JFrame {
    
    
    File imageFile = null;  // Global variable
    BufferedImage bufferedImage = null;  // Global variable
    File docFile = null;

    
    public afterlogin() {
        initComponents();
        
        
        this.pack();
        
       setImage();
       status();
    }
    

    public void setImage() {
    int width = 1000;
    int height = 600;

  
    ImageIcon icon1 = new ImageIcon(getClass().getResource("/photo/bg5.png"));
    Image img1 = icon1.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
    jLabel8.setIcon(new ImageIcon(img1));

    ImageIcon icon2 = new ImageIcon(getClass().getResource("/photo/bg5.png"));
    Image img2 = icon2.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
    jLabel6.setIcon(new ImageIcon(img2));

    ImageIcon icon3 = new ImageIcon(getClass().getResource("/photo/bg5.png"));
    Image img3 = icon3.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
    jLabel7.setIcon(new ImageIcon(img3));
}
    private void status() {
    
        try {
            // Connect to MySQL
            Connection conn = DatabaseProvider.getConnection();
            Statement stmt = conn.createStatement();

            // Execute Query
            String query = "SELECT status FROM general ";
            ResultSet rs = stmt.executeQuery(query);

            // Display Data
            while (rs.next()) {
                status.setText(rs.getString("status"));
            }

            // Close Connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tframe = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabelDoc = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        attachPicture = new javax.swing.JButton();
        attachDocument = new javax.swing.JButton();
        pic = new javax.swing.JLabel();
        doc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dhvsu-logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DON HONORIO VENTURA STATE UNIVERSITY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 39, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ON THE JOB TRAINING STUDENT TRACKER");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 76, -1, -1));

        Logout.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Logout.setText("LOG OUT");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 69, -1, -1));

        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("PENDING");
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 120, 60, 27));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 150));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DASHBOARD");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPLOAD DOCUMENTS");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("COMPANIES");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("PROGRAM OJT TIMEFRAME");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 550));

        jTabbedPane1.setRequestFocusEnabled(false);

        jLabel6.setPreferredSize(new java.awt.Dimension(964, 549));
        jTabbedPane1.addTab("tab5", jLabel6);

        jLabel7.setPreferredSize(new java.awt.Dimension(964, 549));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("TIMEFRAME", jPanel7);

        jLabel8.setPreferredSize(new java.awt.Dimension(964, 549));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UPLOAD", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("COMPANY", jPanel6);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel4.setText("UPLOAD YOUR STUDENT OJT INFORMATION");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 560, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("FIRST NAME");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 119, -1));

        fname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 180, 28));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("LAST NAME");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 71, -1));

        lname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 160, 28));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("STUDENT ID");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 93, -1));

        sID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(sID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 160, 28));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("OJT TIMEFRAME");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 103, -1));

        tframe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(tframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 160, 28));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("COMPANY");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 86, -1));

        cmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(cmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 180, 28));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("PICTURE");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 103, -1));

        jLabelDoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDoc.setText("UPLOAD DOCUMENTS");
        jPanel3.add(jLabelDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 130, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SUBMIT");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 80, 30));

        attachPicture.setText("ATTACH");
        attachPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachPictureActionPerformed(evt);
            }
        });
        jPanel3.add(attachPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 90, 30));

        attachDocument.setText("ATTACH FILE");
        attachDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachDocumentActionPerformed(evt);
            }
        });
        jPanel3.add(attachDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 130, 20));

        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 150, 180));

        doc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 130, 140));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("UPLOAD", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 970, 590));

        setSize(new java.awt.Dimension(1214, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Admin", JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (response == JOptionPane. YES_OPTION){
        login log = new login();
        log.show();
        dispose();
    }else if (response == JOptionPane. NO_OPTION){
        
    }
    }//GEN-LAST:event_LogoutActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 jTabbedPane1.setSelectedIndex(1);        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 jTabbedPane1.setSelectedIndex(4);        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 jTabbedPane1.setSelectedIndex(0);       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 jTabbedPane1.setSelectedIndex(2);        
    }//GEN-LAST:event_jButton4ActionPerformed


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     try {
         try (Connection conn = DatabaseProvider.getConnection()) {
             if (conn == null) {
                 System.out.println("Database connection failed!");
                 return;
             }
             
             // Validate Inputs
             if ("".equals(lname.getText())) {
                 JOptionPane.showMessageDialog(new JFrame(), "Last Name is required", "Error", JOptionPane.ERROR_MESSAGE);
                 return;
             } else if ("".equals(fname.getText())) {
                 JOptionPane.showMessageDialog(new JFrame(), "First Name is required", "Error", JOptionPane.ERROR_MESSAGE);
                 return;
             } else if ("".equals(sID.getText())) {
                 JOptionPane.showMessageDialog(new JFrame(), "Student ID is required", "Error", JOptionPane.ERROR_MESSAGE);
                 return;
             } else if ("".equals(tframe.getText())) {
                 JOptionPane.showMessageDialog(new JFrame(), "Timeframe is required", "Error", JOptionPane.ERROR_MESSAGE);
                 return;
             } else if ("".equals(cmp.getText())) {
                 JOptionPane.showMessageDialog(new JFrame(), "Company is required", "Error", JOptionPane.ERROR_MESSAGE);
                 return;
             }
             
             // Ensure files are selected
             if (imageFile == null) {
                 JOptionPane.showMessageDialog(null, "Please select an image first!", "Error", JOptionPane.ERROR_MESSAGE);
                 return;
             } else if (docFile == null) {
                 JOptionPane.showMessageDialog(null, "Please select a document first!", "Error", JOptionPane.ERROR_MESSAGE);
                 return;
             }
             
             // Retrieve input values
             String firstname = fname.getText();
             String lastname = lname.getText();
             String studentid = sID.getText();
             String timeframe = tframe.getText();
             String company = cmp.getText();
             
             String status = "Pending";
             
             String query;
             
             query = "INSERT INTO uploadd (student_id, first_name, last_name, timeframe, company, picture, document, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
             
             PreparedStatement pstmt = conn.prepareStatement(query);
             FileInputStream fis = new FileInputStream(imageFile);
             FileInputStream fiss = new FileInputStream(docFile);
             
             // Set values correctly
             pstmt.setString(1, studentid);
             pstmt.setString(2, firstname);
             pstmt.setString(3, lastname);
             pstmt.setString(4, timeframe);
             pstmt.setString(5, company);
             pstmt.setBinaryStream(6, fis, (int) imageFile.length());
             pstmt.setBinaryStream(7, fiss, (int) docFile.length());
             pstmt.setString(8, status);
             
             pstmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Successfully registered.");
             
             // Clear fields
             fname.setText("");
             lname.setText("");
             sID.setText("");
             tframe.setText("");
             cmp.setText("");
             pic.setIcon(null);
             doc.setIcon(null);
             
             // Close file streams
             fis.close();
             fiss.close();
         }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    
}   
    }//GEN-LAST:event_jButton5ActionPerformed


    private void attachPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachPictureActionPerformed
         JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Select Image");
            chooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg"));

            int result = chooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
            imageFile = chooser.getSelectedFile();

            try {
                bufferedImage = ImageIO.read(imageFile);

                // Resize the image to fit the JLabel
                Image scaledImage = bufferedImage.getScaledInstance(
                        pic.getWidth(), 
                        pic.getHeight(), 
                        Image.SCALE_SMOOTH);

                // Convert to ImageIcon
                ImageIcon icon = new ImageIcon(scaledImage);

                // Set image icon to JLabel
                pic.setIcon(icon);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Failed to load image.");
            }
        }
    }//GEN-LAST:event_attachPictureActionPerformed

    private void attachDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachDocumentActionPerformed
       JFileChooser chooser1 = new JFileChooser();
        chooser1.setDialogTitle("Select Image");
        chooser1.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg"));

        int result = chooser1.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
             docFile = chooser1.getSelectedFile();

            try {
                BufferedImage bufferedImage1 = ImageIO.read(docFile);

                if (bufferedImage1 == null) {
                    JOptionPane.showMessageDialog(null, "Invalid image file selected.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

        // Resize the image properly using Graphics2D
        Image scaledImage = bufferedImage1.getScaledInstance(
                doc.getWidth(), 
                doc.getHeight(), 
                Image.SCALE_SMOOTH);

        BufferedImage resizedImage = new BufferedImage(doc.getWidth(), doc.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(scaledImage, 0, 0, doc.getWidth(), doc.getHeight(), null);
        g2d.dispose();

        // Convert to ImageIcon
        ImageIcon icon = new ImageIcon(resizedImage);

        // Set image icon to JLabel
        doc.setIcon(icon);

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Failed to load image.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        }
    }//GEN-LAST:event_attachDocumentActionPerformed

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
            java.util.logging.Logger.getLogger(afterlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(afterlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(afterlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(afterlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new afterlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JButton attachDocument;
    private javax.swing.JButton attachPicture;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cmp;
    private javax.swing.JLabel doc;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDoc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField sID;
    private javax.swing.JLabel status;
    private javax.swing.JTextField tframe;
    // End of variables declaration//GEN-END:variables
}
