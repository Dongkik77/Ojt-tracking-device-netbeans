/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.java;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import src.java.Class.DatabaseProvider;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import java.sql.PreparedStatement;

/**
 *
 * @author Windows
 */
public class Testadmin extends javax.swing.JFrame {
    
    public class status;
    

        File imageFile = null;  // Global variable
        BufferedImage bufferedImage = null;  // Global variable
        File docFile = null;
    public Testadmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadAdminData();    
    }

    public void loadAdminData(){
        
        
      try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Database connection
    String url = "jdbc:mysql://localhost:3306/java_users_database";
    String user = "root";
    String pass = "";

    Connection connection = DriverManager.getConnection(url, user, pass);
    Statement st = connection.createStatement();

    // Initialize table model
    DefaultTableModel model = new DefaultTableModel(new String[]{"STUDENT ID", "FIRST NAME", "LAST NAME", "TIMEFRAME", "COMPANY"}, 0); // Removed extra comma
    admintable.setModel(model);
    admintable.setDefaultEditor(Object.class, null);

    String sql = "SELECT student_id, first_name, last_name, timeframe, company FROM uploadd"; // Select correct columns
    
    ResultSet rs = st.executeQuery(sql);

    while (rs.next()) {
        // Map correct column names
        String std = rs.getString("student_id");
        String finame = rs.getString("first_name");
        String laname = rs.getString("last_name");
        String tiframe = rs.getString("timeframe");
        String compa = rs.getString("company");

        // Add row to table
        model.addRow(new Object[]{std, finame, laname, tiframe, compa});
    }
    rs.close();
    st.close();
    connection.close();
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}      
    }
   
public void loadApproveData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java_users_database";
            String user = "root";
            String pass = "";

            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement st = connection.createStatement();

            String sql = "SELECT student_id, first_name, last_name, timeframe, company FROM approve";
            ResultSet rs = st.executeQuery(sql);

            DefaultTableModel model = new DefaultTableModel(
                new String[]{"STUDENT ID", "FIRST NAME", "LAST NAME", "TIMEFRAME", "COMPANY"}, 0
            );
            apprStudent.setModel(model);
            apprStudent.setDefaultEditor(Object.class, null);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("student_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("timeframe"),
                    rs.getString("company")
                });
            }

            rs.close();
            st.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dB = new javax.swing.JPanel();
        sits = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lstname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fstname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        stuID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ojtframe = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cpny = new javax.swing.JTextField();
        searchstu = new javax.swing.JTextField();
        pic = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        apprStudent = new javax.swing.JTable();
        appr = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ojt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        comp = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        admintable = new javax.swing.JTable();
        picc = new javax.swing.JLabel();
        docc = new javax.swing.JLabel();
        cmp = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/dhvsu-logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DON HONORIO VENTURA STATE UNIVERSITY");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("OJT TRACKER SOFTWARE");

        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton7.setText("LOG OUT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(666, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 120));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DASHBOARD");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SEARCH STUDENT");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("APPROVAL");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("COMPANY");
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
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(380, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 210, 590));

        dB.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout dBLayout = new javax.swing.GroupLayout(dB);
        dB.setLayout(dBLayout);
        dBLayout.setHorizontalGroup(
            dBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        dBLayout.setVerticalGroup(
            dBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("dashboarrd", dB);

        sits.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STUDENT INFORMATION");

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("FIRST NAME");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, 20));

        lstname.setEditable(false);
        lstname.setBackground(new java.awt.Color(255, 255, 255));
        lstname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lstname.setPreferredSize(new java.awt.Dimension(64, 30));
        lstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstnameActionPerformed(evt);
            }
        });
        jPanel7.add(lstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 146, 20));

        jLabel6.setText("LAST NAME");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 20));

        fstname.setEditable(false);
        fstname.setBackground(new java.awt.Color(255, 255, 255));
        fstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        fstname.setPreferredSize(new java.awt.Dimension(64, 30));
        fstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fstnameActionPerformed(evt);
            }
        });
        jPanel7.add(fstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 146, 20));

        jLabel7.setText("STUDENT ID");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, 20));

        stuID.setEditable(false);
        stuID.setBackground(new java.awt.Color(255, 255, 255));
        stuID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        stuID.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel7.add(stuID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 146, 20));

        jLabel8.setText("OJT TIMEFRAME");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, 20));

        ojtframe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        ojtframe.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel7.add(ojtframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 146, 20));

        jLabel9.setText("COMPANY");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, 20));

        cpny.setEditable(false);
        cpny.setBackground(new java.awt.Color(255, 255, 255));
        cpny.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cpny.setPreferredSize(new java.awt.Dimension(64, 30));
        cpny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpnyActionPerformed(evt);
            }
        });
        jPanel7.add(cpny, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 146, 20));

        searchstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchstuActionPerformed(evt);
            }
        });
        searchstu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchstuKeyPressed(evt);
            }
        });
        jPanel7.add(searchstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pic.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                picAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel7.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, 160));

        jButton8.setText("Go");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 50, 50, -1));

        apprStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "FIRST NAME", "LAST NAME", "TIMEFRAME", "COMPANY"
            }
        ));
        jScrollPane1.setViewportView(apprStudent);

        javax.swing.GroupLayout sitsLayout = new javax.swing.GroupLayout(sits);
        sits.setLayout(sitsLayout);
        sitsLayout.setHorizontalGroup(
            sitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sitsLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(sitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sitsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(229, 229, 229))
                    .addGroup(sitsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))))
        );
        sitsLayout.setVerticalGroup(
            sitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sitsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("search", sits);

        appr.setBackground(new java.awt.Color(153, 153, 153));
        appr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ADMIN APPROVAL");
        jLabel10.setPreferredSize(new java.awt.Dimension(287, 32));
        appr.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 226, 54));

        jPanel3.setPreferredSize(new java.awt.Dimension(240, 595));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("FIRST NAME");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        lname.setEditable(false);
        lname.setBackground(new java.awt.Color(255, 255, 255));
        lname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lname.setPreferredSize(new java.awt.Dimension(64, 25));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("LAST NAME");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        fname.setEditable(false);
        fname.setBackground(new java.awt.Color(255, 255, 255));
        fname.setPreferredSize(new java.awt.Dimension(64, 25));
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("STUDENT ID");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        sID.setEditable(false);
        sID.setBackground(new java.awt.Color(255, 255, 255));
        sID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        sID.setPreferredSize(new java.awt.Dimension(64, 25));
        sID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sIDActionPerformed(evt);
            }
        });
        jPanel3.add(sID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("OJT TIMEFRAME");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        ojt.setEditable(false);
        ojt.setBackground(new java.awt.Color(255, 255, 255));
        ojt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        ojt.setPreferredSize(new java.awt.Dimension(64, 25));
        ojt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ojtActionPerformed(evt);
            }
        });
        jPanel3.add(ojt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 140, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("COMPANY");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        comp.setEditable(false);
        comp.setBackground(new java.awt.Color(255, 255, 255));
        comp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        comp.setPreferredSize(new java.awt.Dimension(64, 25));
        jPanel3.add(comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 140, -1));

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setText("APPROVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 0, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("DECLINE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        appr.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        admintable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STUDENT ID", "FIRST NAME", "LAST NAME", "TIMEFRAME", "COMPANY", "PICTURE", "DOCUMENT"
            }
        ));
        admintable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admintableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(admintable);

        appr.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 520, 510));

        picc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        appr.add(picc, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 110, 120));

        docc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        appr.add(docc, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 240, 350));

        jTabbedPane1.addTab("approval", appr);

        cmp.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout cmpLayout = new javax.swing.GroupLayout(cmp);
        cmp.setLayout(cmpLayout);
        cmpLayout.setHorizontalGroup(
            cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        cmpLayout.setVerticalGroup(
            cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("company", cmp);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 990, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 jTabbedPane1.setSelectedIndex(0);           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 jTabbedPane1.setSelectedIndex(0);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 jTabbedPane1.setSelectedIndex(1);
 loadApproveData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstnameActionPerformed

    private void cpnyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpnyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpnyActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void sIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sIDActionPerformed

    private void ojtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ojtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ojtActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String status = "Approved";  
int selectedRow = admintable.getSelectedRow();  

if (selectedRow == -1) {  
    JOptionPane.showMessageDialog(null, "Please select a student.");  
    return;  
}

PreparedStatement psInsert = null;

try {  
    // Retrieve values from text fields  
    String studentId = sID.getText();  
    String firstName = fname.getText();  
    String lastName = lname.getText();  
    String timeframe = ojt.getText();  
    String company = comp.getText();  

    // Validate required fields  
    if (studentId.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || timeframe.isEmpty() || company.isEmpty()) {  
        JOptionPane.showMessageDialog(null, "Please ensure all fields are filled in before approving.");  
        return;  
    }  

    Connection connection = DatabaseProvider.getConnection();  

    // Retrieve binary image and document data from database  
    String selectQuery = "SELECT picture, document FROM uploadd WHERE student_id = ?";
    PreparedStatement psSelect = connection.prepareStatement(selectQuery);
    psSelect.setString(1, studentId);
    ResultSet rs = psSelect.executeQuery();

    byte[] imgBytes = null;
    byte[] docBytes = null;

    if (rs.next()) {
        imgBytes = rs.getBytes("picture");
        docBytes = rs.getBytes("document");
    }
    rs.close();
    psSelect.close();

    // Prepare input streams directly from byte arrays  
    ByteArrayInputStream fisPic = (imgBytes != null) ? new ByteArrayInputStream(imgBytes) : null;
    ByteArrayInputStream fisDoc = (docBytes != null) ? new ByteArrayInputStream(docBytes) : null;

    // Prepare the approval insertion  
    String insertQuery = "INSERT INTO approve (student_id, first_name, last_name, timeframe, company, picture, document, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    psInsert = connection.prepareStatement(insertQuery);
    String insertQuery1 = "INSERT INTO general (student_id, first_name, last_name, timeframe, company, picture, document, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    psInsert = connection.prepareStatement(insertQuery1);

    psInsert.setString(1, studentId);  
    psInsert.setString(2, firstName);  
    psInsert.setString(3, lastName);  
    psInsert.setString(4, timeframe);  
    psInsert.setString(5, company);  
    psInsert.setBinaryStream(6, fisPic, (fisPic != null) ? imgBytes.length : 0);  
    psInsert.setBinaryStream(7, fisDoc, (fisDoc != null) ? docBytes.length : 0);  
    psInsert.setString(8, status);  

    int inserted = psInsert.executeUpdate();  
    psInsert.close();  

    if (inserted > 0) {  
        // Delete the approved record from upload table  
        String deleteQuery = "DELETE FROM uploadd WHERE student_id = ?";
        PreparedStatement psDelete = connection.prepareStatement(deleteQuery);
        psDelete.setString(1, studentId);
        psDelete.executeUpdate();
        psDelete.close();

        JOptionPane.showMessageDialog(null, "Student's requirements approved!");  
        loadAdminData();
    } else {  
        JOptionPane.showMessageDialog(null, "Approval failed. Record not found or not inserted.");  
    }  

    // Clear fields after approval  
    fname.setText("");  
    lname.setText("");  
    sID.setText("");  
    ojt.setText("");  
    comp.setText("");  
    picc.setIcon(null);  
    docc.setIcon(null);  

    connection.close();
} catch (Exception e) {  
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());  
    e.printStackTrace();  
} finally {  
    try {  
        if (psInsert != null) psInsert.close();
    } catch (Exception ex) {  
        ex.printStackTrace();  
    }  
}

    }//GEN-LAST:event_jButton5ActionPerformed
public void saveUserData() {
    String firstname, lastname, timeframe, company, query;
    int studentid;

    try {
        Connection connection = DatabaseProvider.getConnection();
        Statement st = connection.createStatement();

        // Validate Inputs
        if ("".equals(lname.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "First Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if ("".equals(fname.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Last Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if ("".equals(sID.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Student ID is required", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if ("".equals(ojt.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Timeframe is required", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if ("".equals(comp.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Company is required", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve input values
        firstname = lname.getText();
        lastname = fname.getText();
        studentid = Integer.parseInt(sID.getText()); // Convert to integer
        timeframe = ojt.getText();
        company = comp.getText();

        // Correct SQL Query Formatting
        query = "INSERT INTO approve (student_id, first_name, last_name, timeframe, company, picture, document) " +
                "VALUES ('" + studentid + "', '" + firstname + "', '" + lastname + "', '" + timeframe + "', '" + company + "')";

        // Execute query
        st.executeUpdate(query);
        
        // Clear input fields
        lname.setText("");
        fname.setText("");
        sID.setText("");
        ojt.setText("");
        comp.setText("");

        JOptionPane.showMessageDialog(null, "Account Approved.");
        loadAdminData();
        connection.close();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid Student ID format.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        System.out.println("Database Error: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 String status = "Decline";  
int selectedRow = admintable.getSelectedRow();  

if (selectedRow == -1) {  
    JOptionPane.showMessageDialog(null, "Please select a student.");  
    return;  
}

PreparedStatement psInsert = null;

try {  
    // Retrieve values from text fields  
    String studentId = sID.getText();  
    String firstName = fname.getText();  
    String lastName = lname.getText();  
    String timeframe = ojt.getText();  
    String company = comp.getText();  

    // Validate required fields  
    if (studentId.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || timeframe.isEmpty() || company.isEmpty()) {  
        JOptionPane.showMessageDialog(null, "Please ensure all fields are filled in before approving.");  
        return;  
    }  

    Connection connection = DatabaseProvider.getConnection();  

    // Retrieve binary image and document data from database  
    String selectQuery = "SELECT picture, document FROM uploadd WHERE student_id = ?";
    PreparedStatement psSelect = connection.prepareStatement(selectQuery);
    psSelect.setString(1, studentId);
    ResultSet rs = psSelect.executeQuery();

    byte[] imgBytes = null;
    byte[] docBytes = null;

    if (rs.next()) {
        imgBytes = rs.getBytes("picture");
        docBytes = rs.getBytes("document");
    }
    rs.close();
    psSelect.close();

    // Prepare input streams directly from byte arrays  
    ByteArrayInputStream fisPic = (imgBytes != null) ? new ByteArrayInputStream(imgBytes) : null;
    ByteArrayInputStream fisDoc = (docBytes != null) ? new ByteArrayInputStream(docBytes) : null;

    // Prepare the approval insertion  
    String insertQuery = "INSERT INTO decline (student_id, first_name, last_name, timeframe, company, picture, document, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    psInsert = connection.prepareStatement(insertQuery);
    String insertQuery1 = "INSERT INTO general (student_id, first_name, last_name, timeframe, company, picture, document, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    psInsert = connection.prepareStatement(insertQuery1);

    psInsert.setString(1, studentId);  
    psInsert.setString(2, firstName);  
    psInsert.setString(3, lastName);  
    psInsert.setString(4, timeframe);  
    psInsert.setString(5, company);  
    psInsert.setBinaryStream(6, fisPic, (fisPic != null) ? imgBytes.length : 0);  
    psInsert.setBinaryStream(7, fisDoc, (fisDoc != null) ? docBytes.length : 0);  
    psInsert.setString(8, status);  

    int inserted = psInsert.executeUpdate();  
    psInsert.close();  

    if (inserted > 0) {  
        // Delete the approved record from upload table  
        String deleteQuery = "DELETE FROM uploadd WHERE student_id = ?";
        PreparedStatement psDelete = connection.prepareStatement(deleteQuery);
        psDelete.setString(1, studentId);
        psDelete.executeUpdate();
        psDelete.close();

        JOptionPane.showMessageDialog(null, "Student's requirements decline!");  
        loadAdminData();
    } else {  
        JOptionPane.showMessageDialog(null, "Approval failed. Record not found or not inserted.");  
    }  

    // Clear fields after approval  
    fname.setText("");  
    lname.setText("");  
    sID.setText("");  
    ojt.setText("");  
    comp.setText("");  
    picc.setIcon(null);  
    docc.setIcon(null);  

    connection.close();
} catch (Exception e) {  
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());  
    e.printStackTrace();  
} finally {  
    try {  
        if (psInsert != null) psInsert.close();
    } catch (Exception ex) {  
        ex.printStackTrace();  
    }  
}

         // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 jTabbedPane1.setSelectedIndex(2);           
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Admin", JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (response == JOptionPane. YES_OPTION){
        login log = new login();
        log.show();
        dispose();
    }else if (response == JOptionPane. NO_OPTION){
        
    }        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void admintableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admintableMouseClicked
        int rowIndex = admintable.getSelectedRow();

// Ensure a row is selected
if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please select a row first.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

String selectedId = admintable.getModel().getValueAt(rowIndex, 0).toString();
String sql = "SELECT student_id, first_name, last_name, timeframe, company, picture, document FROM uploadd WHERE student_id = ?";

try {
    Connection connection = DatabaseProvider.getConnection();
    PreparedStatement ps = connection.prepareStatement(sql);
    ps.setString(1, selectedId);
    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
        // Retrieve text fields
        String id = rs.getString("student_id");
        String lastname = rs.getString("last_name");
        String firstname = rs.getString("first_name");
        String timeframe = rs.getString("timeframe");
        String company = rs.getString("company");

        // Set values to input fields
        sID.setText(id);
        lname.setText(firstname);
        fname.setText(lastname);
        ojt.setText(timeframe);
        comp.setText(company);

        // Retrieve image BLOB data from the database
        byte[] imgBytes = rs.getBytes("picture");
        byte[] docBytes = rs.getBytes("document");

        // Convert image BLOB to display in JLabel
        if (imgBytes != null && imgBytes.length > 0) {
            ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes);
            BufferedImage img = ImageIO.read(bis);
            Image scaledImg = img.getScaledInstance(picc.getWidth(), picc.getHeight(), Image.SCALE_SMOOTH);
            picc.setIcon(new ImageIcon(scaledImg));
        } else {
            picc.setIcon(null); // Clear label if no image exists
        }

        // Convert document BLOB to display in JLabel
        if (docBytes != null && docBytes.length > 0) {
            ByteArrayInputStream bis1 = new ByteArrayInputStream(docBytes);
            BufferedImage img1 = ImageIO.read(bis1);
            Image scaledImg1 = img1.getScaledInstance(docc.getWidth(), docc.getHeight(), Image.SCALE_SMOOTH);
            docc.setIcon(new ImageIcon(scaledImg1));
        } else {
            docc.setIcon(null); // Clear label if no document exists
        }
    }

    rs.close();
    ps.close();
} catch (SQLException e) {
    System.out.println("Database Error: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
    }//GEN-LAST:event_admintableMouseClicked

    private void searchstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchstuActionPerformed
       
    }//GEN-LAST:event_searchstuActionPerformed

    private void fstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fstnameActionPerformed

    private void searchstuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchstuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchstuKeyPressed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        
        String searchText = searchstu.getText().trim();
    if (searchText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a Student ID to search.", "Input Required", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String sql = "SELECT student_id, first_name, last_name, timeframe, company, picture FROM approve WHERE student_id = ?";

    try {
        Connection connection = DatabaseProvider.getConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, searchText);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            // Set text fields
            stuID.setText(rs.getString("student_id"));
            fstname.setText(rs.getString("first_name"));
            lstname.setText(rs.getString("last_name"));
            ojtframe.setText(rs.getString("timeframe"));
            cpny.setText(rs.getString("company"));

            // Set picture
            byte[] imgBytes = rs.getBytes("picture");
            if (imgBytes != null) {
                ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes);
                Image img = ImageIO.read(bis);
                Image scaledImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
                pic.setIcon(new ImageIcon(scaledImg));
            } else {
                pic.setIcon(null);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "No student found with ID: " + searchText, "No Results", JOptionPane.INFORMATION_MESSAGE);

            // Clear fields if not found
            stuID.setText("");
            fstname.setText("");
            lstname.setText("");
            ojtframe.setText("");
            cpny.setText("");
            picc.setIcon(null);

        }

        rs.close();
        ps.close();
        connection.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void picAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_picAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_picAncestorAdded

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
            java.util.logging.Logger.getLogger(Testadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Testadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Testadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Testadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Testadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable admintable;
    private javax.swing.JPanel appr;
    private javax.swing.JTable apprStudent;
    private javax.swing.JPanel cmp;
    private javax.swing.JTextField comp;
    private javax.swing.JTextField cpny;
    private javax.swing.JPanel dB;
    private javax.swing.JLabel docc;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField lstname;
    private javax.swing.JTextField ojt;
    private javax.swing.JTextField ojtframe;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel picc;
    private javax.swing.JTextField sID;
    private javax.swing.JTextField searchstu;
    private javax.swing.JPanel sits;
    private javax.swing.JTextField stuID;
    // End of variables declaration//GEN-END:variables
}
