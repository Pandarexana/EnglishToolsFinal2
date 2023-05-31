package weather;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import seasons.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class readingW31 extends javax.swing.JFrame {

    Icon check;
    Icon error;
    Icon smile;
    
    public readingW31() {
        initComponents();
        this.setExtendedState(listening.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
         txtSunny1.setEditable(false);
         txtSunny3.setEditable(false);
         txtSunny4.setEditable(false);
         txtSnowy2.setEditable(false);
         txtSnowy3.setEditable(false);
         txtRainy1.setEditable(false);
         txtRainy3.setEditable(false);
         txtWindy1.setEditable(false);
         txtWindy3.setEditable(false);
         txtWindy4.setEditable(false);
         
        trueSunny.setVisible(false);
        trueRainy.setVisible(false);  
        trueSnowy.setVisible(false);
        trueWindy.setVisible(false);
      
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
        txtSunny1 = new javax.swing.JTextField();
        txtSunny2 = new javax.swing.JTextField();
        txtSunny3 = new javax.swing.JTextField();
        txtSunny4 = new javax.swing.JTextField();
        txtSunny5 = new javax.swing.JTextField();
        txtSnowy1 = new javax.swing.JTextField();
        txtSnowy2 = new javax.swing.JTextField();
        txtSnowy3 = new javax.swing.JTextField();
        txtSnowy4 = new javax.swing.JTextField();
        txtRainy3 = new javax.swing.JTextField();
        txtRainy2 = new javax.swing.JTextField();
        txtRainy1 = new javax.swing.JTextField();
        txtRainy4 = new javax.swing.JTextField();
        txtWindy4 = new javax.swing.JTextField();
        txtWindy3 = new javax.swing.JTextField();
        txtWindy2 = new javax.swing.JTextField();
        txtWindy1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        trueSunny = new javax.swing.JLabel();
        trueSnowy = new javax.swing.JLabel();
        trueRainy = new javax.swing.JLabel();
        trueWindy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather - Reading 3");
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

        txtSunny1.setBackground(new java.awt.Color(253, 253, 105));
        txtSunny1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSunny1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSunny1.setText("S");
        txtSunny1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtSunny2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSunny2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSunny2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtSunny3.setBackground(new java.awt.Color(253, 253, 105));
        txtSunny3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSunny3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSunny3.setText("N");
        txtSunny3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtSunny3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSunny3ActionPerformed(evt);
            }
        });

        txtSunny4.setBackground(new java.awt.Color(253, 253, 105));
        txtSunny4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSunny4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSunny4.setText("N");
        txtSunny4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtSunny4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSunny4ActionPerformed(evt);
            }
        });

        txtSunny5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSunny5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSunny5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtSnowy1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSnowy1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSnowy1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtSnowy2.setBackground(new java.awt.Color(253, 253, 105));
        txtSnowy2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSnowy2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSnowy2.setText("O");
        txtSnowy2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtSnowy3.setBackground(new java.awt.Color(253, 253, 105));
        txtSnowy3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSnowy3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSnowy3.setText("W");
        txtSnowy3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtSnowy4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSnowy4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSnowy4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtRainy3.setBackground(new java.awt.Color(253, 253, 105));
        txtRainy3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtRainy3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRainy3.setText("I");
        txtRainy3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtRainy2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtRainy2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRainy2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtRainy1.setBackground(new java.awt.Color(253, 253, 105));
        txtRainy1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtRainy1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRainy1.setText("R");
        txtRainy1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtRainy4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtRainy4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRainy4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtWindy4.setBackground(new java.awt.Color(253, 253, 105));
        txtWindy4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtWindy4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWindy4.setText("D");
        txtWindy4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtWindy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWindy4ActionPerformed(evt);
            }
        });

        txtWindy3.setBackground(new java.awt.Color(253, 253, 105));
        txtWindy3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtWindy3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWindy3.setText("N");
        txtWindy3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtWindy2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtWindy2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWindy2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtWindy1.setBackground(new java.awt.Color(253, 253, 105));
        txtWindy1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtWindy1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWindy1.setText("W");
        txtWindy1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes mas pequenas/snowy.png"))); // NOI18N
        jLabel4.setText("jLabel1");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes mas pequenas/rainy.png"))); // NOI18N
        jLabel5.setText("jLabel1");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes mas pequenas/windy.png"))); // NOI18N
        jLabel6.setText("jLabel1");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes mas pequenas/sunny.png"))); // NOI18N
        jLabel7.setText("jLabel1");

        trueSunny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueSunny.setText("jLabel3");
        trueSunny.setMaximumSize(new java.awt.Dimension(50, 50));
        trueSunny.setMinimumSize(new java.awt.Dimension(50, 50));
        trueSunny.setPreferredSize(new java.awt.Dimension(50, 50));

        trueSnowy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueSnowy.setText("jLabel3");
        trueSnowy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueSnowy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueSnowy.setPreferredSize(new java.awt.Dimension(50, 50));

        trueRainy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueRainy.setText("jLabel3");
        trueRainy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueRainy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueRainy.setPreferredSize(new java.awt.Dimension(50, 50));

        trueWindy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueWindy.setText("jLabel3");
        trueWindy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueWindy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueWindy.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(trueSunny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSunny1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(trueRainy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(trueSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSnowy2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSnowy1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSnowy3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSnowy4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(151, 151, 151)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(trueWindy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtRainy1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtRainy2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtRainy3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtSunny2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtSunny3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtRainy4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtSunny4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtSunny5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtWindy4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtWindy3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtWindy2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtWindy1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(539, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(301, 301, 301))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(trueWindy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtWindy1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trueRainy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRainy1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWindy2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRainy2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWindy3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRainy3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWindy4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trueSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSunny1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSunny2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSunny3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSunny4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSunny5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trueSunny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSnowy1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRainy4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtSnowy2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtSnowy3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSnowy4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1301, Short.MAX_VALUE))
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
        readingW3 q = new readingW3();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasQActionPerformed

    private void btnFinishQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishQActionPerformed
        String sn1 = txtSunny2.getText().toString();
        String sn2 = txtSunny5.getText().toString();
        
        String sw1 = txtSnowy1.getText().toString();
        String sw2= txtSnowy4.getText().toString();
        
        String r1= txtRainy2.getText().toString();
        String r2= txtRainy4.getText().toString();
        
        String wd= txtWindy2.getText().toString();

        
        if(sn1.equalsIgnoreCase("U") && sn2.equalsIgnoreCase("Y")){
            trueSunny.setVisible(true);
            txtSunny2.setEditable(false);
            txtSunny5.setEditable(false);          
        }
        if (sw1.equalsIgnoreCase("N")&& sw2.equalsIgnoreCase("Y")){
            trueSnowy.setVisible(true);
            txtSnowy1.setEditable(false);
            txtSnowy4.setEditable(false);
        }
        if(r1.equalsIgnoreCase("A")&& r2.equalsIgnoreCase("Y")){
            trueRainy.setVisible(true);
            txtRainy2.setEditable(false);
            txtRainy4.setEditable(false);
        }
        if(wd.equalsIgnoreCase("I")){
            trueWindy.setVisible(true);
            txtWindy2.setEditable(false);
            
        
        }
        
        if(sn1.equalsIgnoreCase("U") && sn2.equalsIgnoreCase("Y")&& sw1.equalsIgnoreCase("N")&& sw2.equalsIgnoreCase("Y") 
                && r1.equalsIgnoreCase("A")&& r2.equalsIgnoreCase("Y") && wd.equalsIgnoreCase("I")){
            
            explodecorrecto();
            JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
            explodefin();
            JOptionPane.showMessageDialog(null, "Reading 3 completed!", "", HEIGHT, smile);
            listeningW k = new listeningW();
            k.setVisible(true);
            this.dispose();
        
        }
        else {
            explodeincorrecto();
            JOptionPane.showMessageDialog(null, error, "", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnFinishQActionPerformed

    private void txtWindy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWindy4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWindy4ActionPerformed

    private void txtSunny4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSunny4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSunny4ActionPerformed

    private void txtSunny3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSunny3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSunny3ActionPerformed

   
    
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
                new readingW31().setVisible(true);
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
    private javax.swing.JLabel trueRainy;
    private javax.swing.JLabel trueSnowy;
    private javax.swing.JLabel trueSunny;
    private javax.swing.JLabel trueWindy;
    private javax.swing.JTextField txtRainy1;
    private javax.swing.JTextField txtRainy2;
    private javax.swing.JTextField txtRainy3;
    private javax.swing.JTextField txtRainy4;
    private javax.swing.JTextField txtSnowy1;
    private javax.swing.JTextField txtSnowy2;
    private javax.swing.JTextField txtSnowy3;
    private javax.swing.JTextField txtSnowy4;
    private javax.swing.JTextField txtSunny1;
    private javax.swing.JTextField txtSunny2;
    private javax.swing.JTextField txtSunny3;
    private javax.swing.JTextField txtSunny4;
    private javax.swing.JTextField txtSunny5;
    private javax.swing.JTextField txtWindy1;
    private javax.swing.JTextField txtWindy2;
    private javax.swing.JTextField txtWindy3;
    private javax.swing.JTextField txtWindy4;
    // End of variables declaration//GEN-END:variables
}
