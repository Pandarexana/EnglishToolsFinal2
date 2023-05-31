package math;

import weather.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import seasons.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class readingMT2 extends javax.swing.JFrame {

    Icon check;
    Icon error;
    Icon smile;
    
    public readingMT2() {
        initComponents();
        this.setExtendedState(listening.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
         txtNoon3.setEditable(false);
         txtNoon4.setEditable(false);
         txtNight3.setEditable(false);
         txtNight4.setEditable(false);
         txtMidnight4.setEditable(false);
         txtMidnight5.setEditable(false);
         txtDay2.setEditable(false);
         txtMidnight6.setEditable(false);
         txtMidnight7.setEditable(false);
         
        trueNoon.setVisible(false);
        trueMindnight.setVisible(false);  
        truenight.setVisible(false);
        trueDay.setVisible(false);
      
        check = new ImageIcon("C://programa//imagenes//Check.png");
        error = new ImageIcon("C://programa//imagenes//Error.png");
        smile = new ImageIcon("C://programa//imagenes//smile.png");
    }

    @Override
    
    public Image getIconImage(){ 
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("logo3.png"));
        return retValue ;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnFinishQ = new javax.swing.JButton();
        btnAtrasQ = new javax.swing.JButton();
        txtNoon3 = new javax.swing.JTextField();
        txtNoon = new javax.swing.JTextField();
        txtNoon4 = new javax.swing.JTextField();
        txtNoon2 = new javax.swing.JTextField();
        txtNight1 = new javax.swing.JTextField();
        txtNight3 = new javax.swing.JTextField();
        txtNight4 = new javax.swing.JTextField();
        txtNight2 = new javax.swing.JTextField();
        txtMidnight5 = new javax.swing.JTextField();
        txtMidnight = new javax.swing.JTextField();
        txtMidnight4 = new javax.swing.JTextField();
        txtMidnight2 = new javax.swing.JTextField();
        txtMidnight7 = new javax.swing.JTextField();
        txtMidnight6 = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        txtDay2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        trueNoon = new javax.swing.JLabel();
        truenight = new javax.swing.JLabel();
        trueMindnight = new javax.swing.JLabel();
        trueDay = new javax.swing.JLabel();
        txtMidnight3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math - Reading 2");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(1554, 820));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Complete the crossword puzzle");

        btnFinishQ.setBackground(new java.awt.Color(255, 102, 102));
        btnFinishQ.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnFinishQ.setText("Finish");
        btnFinishQ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnFinishQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishQActionPerformed(evt);
            }
        });

        btnAtrasQ.setBackground(new java.awt.Color(255, 102, 102));
        btnAtrasQ.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnAtrasQ.setText("Back");
        btnAtrasQ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnAtrasQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasQActionPerformed(evt);
            }
        });

        txtNoon3.setBackground(new java.awt.Color(253, 253, 105));
        txtNoon3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtNoon3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoon3.setText("N");
        txtNoon3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtNoon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoon3ActionPerformed(evt);
            }
        });

        txtNoon.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtNoon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtNoon4.setBackground(new java.awt.Color(253, 253, 105));
        txtNoon4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtNoon4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoon4.setText("O");
        txtNoon4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtNoon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoon4ActionPerformed(evt);
            }
        });

        txtNoon2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtNoon2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoon2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtNight1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtNight1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNight1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtNight3.setBackground(new java.awt.Color(253, 253, 105));
        txtNight3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtNight3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNight3.setText("G");
        txtNight3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtNight4.setBackground(new java.awt.Color(253, 253, 105));
        txtNight4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtNight4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNight4.setText("H");
        txtNight4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtNight2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtNight2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNight2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtMidnight5.setBackground(new java.awt.Color(253, 253, 105));
        txtMidnight5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtMidnight5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMidnight5.setText("D");
        txtMidnight5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtMidnight.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtMidnight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMidnight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtMidnight4.setBackground(new java.awt.Color(253, 253, 105));
        txtMidnight4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtMidnight4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMidnight4.setText("M");
        txtMidnight4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtMidnight2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtMidnight2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMidnight2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtMidnight7.setBackground(new java.awt.Color(253, 253, 105));
        txtMidnight7.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtMidnight7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMidnight7.setText("T");
        txtMidnight7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtMidnight7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMidnight7ActionPerformed(evt);
            }
        });

        txtMidnight6.setBackground(new java.awt.Color(253, 253, 105));
        txtMidnight6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtMidnight6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMidnight6.setText("G");
        txtMidnight6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtDay.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtDay2.setBackground(new java.awt.Color(253, 253, 105));
        txtDay2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtDay2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDay2.setText("Y");
        txtDay2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/mini -night.png"))); // NOI18N
        jLabel4.setText("jLabel1");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/mini-midnight.png"))); // NOI18N
        jLabel5.setText("jLabel1");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/mini- day.png"))); // NOI18N
        jLabel6.setText("jLabel1");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/mini - noon.png"))); // NOI18N
        jLabel7.setText("jLabel1");

        trueNoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueNoon.setText("jLabel3");
        trueNoon.setMaximumSize(new java.awt.Dimension(50, 50));
        trueNoon.setMinimumSize(new java.awt.Dimension(50, 50));
        trueNoon.setPreferredSize(new java.awt.Dimension(50, 50));

        truenight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        truenight.setText("jLabel3");
        truenight.setMaximumSize(new java.awt.Dimension(50, 50));
        truenight.setMinimumSize(new java.awt.Dimension(50, 50));
        truenight.setPreferredSize(new java.awt.Dimension(50, 50));

        trueMindnight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueMindnight.setText("jLabel3");
        trueMindnight.setMaximumSize(new java.awt.Dimension(50, 50));
        trueMindnight.setMinimumSize(new java.awt.Dimension(50, 50));
        trueMindnight.setPreferredSize(new java.awt.Dimension(50, 50));

        trueDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueDay.setText("jLabel3");
        trueDay.setMaximumSize(new java.awt.Dimension(50, 50));
        trueDay.setMinimumSize(new java.awt.Dimension(50, 50));
        trueDay.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMidnight3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtMidnight3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMidnight3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(trueNoon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNoon3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(truenight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNight3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNight1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNight4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNight2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addComponent(txtNoon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(trueMindnight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNoon4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtMidnight4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54))
                                    .addComponent(txtNoon2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMidnight6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMidnight5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMidnight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMidnight2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtMidnight7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMidnight3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(trueDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(230, 230, 230)
                                        .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(297, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trueMindnight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtMidnight4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMidnight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMidnight5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trueDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(truenight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoon3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoon4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoon2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trueNoon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNight1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMidnight2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNight3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMidnight6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNight4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMidnight3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNight2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMidnight7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1357, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1993, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasQActionPerformed
        listeningMT q = new listeningMT();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasQActionPerformed

    private void btnFinishQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishQActionPerformed
        String sn1 = txtNoon.getText().toString();
        String sn2 = txtNoon2.getText().toString();
        
        String sw1 = txtNight1.getText().toString();
        String sw2= txtNight2.getText().toString();
        
        
        String r1= txtMidnight.getText().toString();
        String r2= txtMidnight2.getText().toString();
        String r3= txtMidnight3.getText().toString();
        
        String wd= txtDay.getText().toString();

        
        if(sn1.equalsIgnoreCase("O") && sn2.equalsIgnoreCase("N")){
            trueNoon.setVisible(true);
            txtNoon.setEditable(false);
            txtNoon2.setEditable(false);          
        }
        if (sw1.equalsIgnoreCase("I")&& sw2.equalsIgnoreCase("T")){
            truenight.setVisible(true);
            txtNight1.setEditable(false);
            txtNight2.setEditable(false);
        }
        if(r1.equalsIgnoreCase("I")&& r2.equalsIgnoreCase("I")&& r3.equalsIgnoreCase("H")){
            trueMindnight.setVisible(true);
            txtMidnight.setEditable(false);
            txtMidnight2.setEditable(false);
            txtMidnight3.setEditable(false);
        }
        if(wd.equalsIgnoreCase("A")){
            trueDay.setVisible(true);
            txtDay.setEditable(false);
            
        
        }
        
        if(sn1.equalsIgnoreCase("O") && sn2.equalsIgnoreCase("N")&& sw1.equalsIgnoreCase("I")&& sw2.equalsIgnoreCase("T") 
                && r1.equalsIgnoreCase("I")&& r2.equalsIgnoreCase("I") && r3.equalsIgnoreCase("H")&& wd.equalsIgnoreCase("A")){
            
            explodecorrecto();
            JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
            explodefin();
            JOptionPane.showMessageDialog(null, "Reading 2 completed!", "", HEIGHT, smile);
            listeningMT k = new listeningMT();
            k.setVisible(true);
            this.dispose();
        
        }
        else {
            explodeincorrecto();
            JOptionPane.showMessageDialog(null, error, "", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnFinishQActionPerformed

    private void txtMidnight7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMidnight7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMidnight7ActionPerformed

    private void txtNoon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoon4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoon4ActionPerformed

    private void txtNoon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoon3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoon3ActionPerformed

   
    
    public void explodecorrecto() {
   File sound = new File("C://programa//audio//correcto.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }
    
    public void explodeincorrecto() {
   File sound = new File("C://programa//audio//error.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }
   public void explodefin() {
   File sound = new File("C://programa//audio//final.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }  
     
   
    
   
   
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new readingMT2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasQ;
    private javax.swing.JButton btnFinishQ;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel trueDay;
    private javax.swing.JLabel trueMindnight;
    private javax.swing.JLabel trueNoon;
    private javax.swing.JLabel truenight;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtDay2;
    private javax.swing.JTextField txtMidnight;
    private javax.swing.JTextField txtMidnight2;
    private javax.swing.JTextField txtMidnight3;
    private javax.swing.JTextField txtMidnight4;
    private javax.swing.JTextField txtMidnight5;
    private javax.swing.JTextField txtMidnight6;
    private javax.swing.JTextField txtMidnight7;
    private javax.swing.JTextField txtNight1;
    private javax.swing.JTextField txtNight2;
    private javax.swing.JTextField txtNight3;
    private javax.swing.JTextField txtNight4;
    private javax.swing.JTextField txtNoon;
    private javax.swing.JTextField txtNoon2;
    private javax.swing.JTextField txtNoon3;
    private javax.swing.JTextField txtNoon4;
    // End of variables declaration//GEN-END:variables
}
