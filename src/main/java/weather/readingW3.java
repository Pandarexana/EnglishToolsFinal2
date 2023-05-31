package weather;

import java.awt.Image;
import java.awt.Toolkit;
import seasons.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class readingW3 extends javax.swing.JFrame {

    Icon check;
    Icon error;
    
    
    public readingW3() {
        initComponents();
        this.setExtendedState(listening.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
         txtCloudy2.setEditable(false);
         txtCold1.setEditable(false);
         txtCloudy4.setEditable(false);
         txtCloudy6.setEditable(false);
         txtFoggy2.setEditable(false);
         txtFoggy3.setEditable(false);
         
        trueCloudy.setVisible(false);
        trueFoggy.setVisible(false);  
        trueHot.setVisible(false);
        trueCold.setVisible(false);
      
        check = new ImageIcon("C://programa//imagenes//Check.png");
        error = new ImageIcon("C://programa//imagenes//Error.png");
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
        txtCloudy2 = new javax.swing.JTextField();
        txtCloudy1 = new javax.swing.JTextField();
        txtCloudy3 = new javax.swing.JTextField();
        txtCloudy4 = new javax.swing.JTextField();
        txtCloudy5 = new javax.swing.JTextField();
        txtCloudy6 = new javax.swing.JTextField();
        txtCold2 = new javax.swing.JTextField();
        txtCold3 = new javax.swing.JTextField();
        txtCold1 = new javax.swing.JTextField();
        txtFoggy4 = new javax.swing.JTextField();
        txtFoggy3 = new javax.swing.JTextField();
        txtFoggy2 = new javax.swing.JTextField();
        txtFoggy1 = new javax.swing.JTextField();
        txtHot1 = new javax.swing.JTextField();
        txtHot2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        trueCloudy = new javax.swing.JLabel();
        trueCold = new javax.swing.JLabel();
        trueFoggy = new javax.swing.JLabel();
        trueHot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather - Reading 3");
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(1554, 820));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Complete the crossword puzzle");

        btnFinishQ.setBackground(new java.awt.Color(255, 102, 102));
        btnFinishQ.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnFinishQ.setText("Next");
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

        txtCloudy2.setBackground(new java.awt.Color(253, 253, 105));
        txtCloudy2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCloudy2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloudy2.setText("L");
        txtCloudy2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtCloudy1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCloudy1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloudy1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCloudy3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCloudy3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloudy3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCloudy4.setBackground(new java.awt.Color(253, 253, 105));
        txtCloudy4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCloudy4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloudy4.setText("U");
        txtCloudy4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCloudy5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCloudy5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloudy5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCloudy6.setBackground(new java.awt.Color(253, 253, 105));
        txtCloudy6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCloudy6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloudy6.setText("Y");
        txtCloudy6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCold2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCold2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCold2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCold3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCold3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCold3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCold3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCold3ActionPerformed(evt);
            }
        });

        txtCold1.setBackground(new java.awt.Color(253, 253, 105));
        txtCold1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCold1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCold1.setText("C");
        txtCold1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCold1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCold1ActionPerformed(evt);
            }
        });

        txtFoggy4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFoggy4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFoggy4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFoggy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoggy4ActionPerformed(evt);
            }
        });

        txtFoggy3.setBackground(new java.awt.Color(253, 253, 105));
        txtFoggy3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFoggy3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFoggy3.setText("G");
        txtFoggy3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFoggy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoggy3ActionPerformed(evt);
            }
        });

        txtFoggy2.setBackground(new java.awt.Color(253, 253, 105));
        txtFoggy2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFoggy2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFoggy2.setText("O");
        txtFoggy2.setToolTipText("");
        txtFoggy2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFoggy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoggy2ActionPerformed(evt);
            }
        });

        txtFoggy1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFoggy1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFoggy1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFoggy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoggy1ActionPerformed(evt);
            }
        });

        txtHot1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtHot1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHot1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtHot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHot1ActionPerformed(evt);
            }
        });

        txtHot2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtHot2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHot2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtHot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHot2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes mas pequenas/cold.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/hot.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes mas pequenas/cloudy.png"))); // NOI18N
        jLabel3.setText("jLabel1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes mas pequenas/foggy.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");

        trueCloudy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueCloudy.setText("jLabel3");
        trueCloudy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueCloudy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueCloudy.setPreferredSize(new java.awt.Dimension(50, 50));

        trueCold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueCold.setText("jLabel3");
        trueCold.setMaximumSize(new java.awt.Dimension(50, 50));
        trueCold.setMinimumSize(new java.awt.Dimension(50, 50));
        trueCold.setPreferredSize(new java.awt.Dimension(50, 50));

        trueFoggy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueFoggy.setText("jLabel3");
        trueFoggy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueFoggy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueFoggy.setPreferredSize(new java.awt.Dimension(50, 50));

        trueHot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueHot.setText("jLabel3");
        trueHot.setMaximumSize(new java.awt.Dimension(50, 50));
        trueHot.setMinimumSize(new java.awt.Dimension(50, 50));
        trueHot.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(trueCloudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(trueFoggy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(trueCold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)
                                        .addComponent(txtHot1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtCold3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCold2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCold1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCloudy1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCloudy2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtCloudy3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCloudy4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                                .addComponent(txtCloudy5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFoggy2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFoggy1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFoggy3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFoggy4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCloudy6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHot2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)))
                        .addComponent(trueHot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(190, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trueFoggy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFoggy1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFoggy2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHot1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHot2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trueCold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFoggy3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCold1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(trueHot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoggy4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCold2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCloudy2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCloudy1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCloudy3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCloudy4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCloudy5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCloudy6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trueCloudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCold3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasQActionPerformed
        listeningW  q = new listeningW();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasQActionPerformed

    private void btnFinishQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishQActionPerformed
        String cl1 = txtCloudy1.getText().toString();
        String cl3 = txtCloudy3.getText().toString();
        String cl5 = txtCloudy5.getText().toString();
        
        String cd2 = txtCold2.getText().toString();
        String cd3= txtCold3.getText().toString();
        
        String f1= txtFoggy1.getText().toString();
        String f2= txtFoggy4.getText().toString();
        
        String h1= txtHot1.getText().toString();
        String h2 = txtHot2.getText().toString();
        
        if(cl1.equalsIgnoreCase("C") && cl3.equalsIgnoreCase("O") && cl5.equalsIgnoreCase("D")){
            trueCloudy.setVisible(true);
            txtCloudy1.setEditable(false);
            txtCloudy3.setEditable(false);
            txtCloudy5.setEditable(false);            
        }
        if (cd2.equalsIgnoreCase("O")&& cd3.equalsIgnoreCase("D")){
            trueCold.setVisible(true);
            txtCold2.setEditable(false);
            txtCold3.setEditable(false);
        }
        if(f1.equalsIgnoreCase("F")&& f2.equalsIgnoreCase("G")){
            trueFoggy.setVisible(true);
            txtFoggy1.setEditable(false);
            txtFoggy4.setEditable(false);
        }
        if(h1.equalsIgnoreCase("H")&& h2.equalsIgnoreCase("T")){
            trueHot.setVisible(true);
            txtHot1.setEditable(false);
            txtHot2.setEditable(false);
        
        }
        
        if(cl1.equalsIgnoreCase("C") && cl3.equalsIgnoreCase("O") && cl5.equalsIgnoreCase("D")&& cd2.equalsIgnoreCase("O")&& cd3.equalsIgnoreCase("D") 
                && f1.equalsIgnoreCase("F")&& f2.equalsIgnoreCase("G")&& h1.equalsIgnoreCase("H")&& h2.equalsIgnoreCase("T")){
            
            explodecorrecto();
            JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION); 
            readingW31 re = new readingW31();
            re.setVisible(true);
            this.dispose();
        }
        else {
            explodeincorrecto();
            JOptionPane.showMessageDialog(null, error, "", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnFinishQActionPerformed

    private void txtCold3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCold3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCold3ActionPerformed

    private void txtCold1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCold1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCold1ActionPerformed

    private void txtFoggy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoggy4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoggy4ActionPerformed

    private void txtFoggy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoggy3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoggy3ActionPerformed

    private void txtFoggy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoggy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoggy2ActionPerformed

    private void txtFoggy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoggy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoggy1ActionPerformed

    private void txtHot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHot1ActionPerformed

    private void txtHot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHot2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHot2ActionPerformed

   
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
   
     
   
    
   
   
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new readingW3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasQ;
    private javax.swing.JButton btnFinishQ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel trueCloudy;
    private javax.swing.JLabel trueCold;
    private javax.swing.JLabel trueFoggy;
    private javax.swing.JLabel trueHot;
    private javax.swing.JTextField txtCloudy1;
    private javax.swing.JTextField txtCloudy2;
    private javax.swing.JTextField txtCloudy3;
    private javax.swing.JTextField txtCloudy4;
    private javax.swing.JTextField txtCloudy5;
    private javax.swing.JTextField txtCloudy6;
    private javax.swing.JTextField txtCold1;
    private javax.swing.JTextField txtCold2;
    private javax.swing.JTextField txtCold3;
    private javax.swing.JTextField txtFoggy1;
    private javax.swing.JTextField txtFoggy2;
    private javax.swing.JTextField txtFoggy3;
    private javax.swing.JTextField txtFoggy4;
    private javax.swing.JTextField txtHot1;
    private javax.swing.JTextField txtHot2;
    // End of variables declaration//GEN-END:variables
}
