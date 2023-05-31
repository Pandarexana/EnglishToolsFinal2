package HowAdjetive;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class readingHA1 extends javax.swing.JFrame {
    
        ButtonGroup r112;
        ButtonGroup r122;
        ButtonGroup r132;
        
        Icon check;
        Icon smile;

    public readingHA1() {
        initComponents();
        this.setExtendedState(readingHA1.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        true1.setVisible(false);
        true2.setVisible(false);
        true3.setVisible(false);
        false1.setVisible(false);
        false2.setVisible(false);
        false3.setVisible(false);
        
        r112 = new ButtonGroup();
        r122 = new ButtonGroup();
        r132 = new ButtonGroup();
        
        r112.add(jrCorrect12);
        r112.add(jrIncorrect112);
        r112.add(jrIncorrect122);
        r122.add(jrCorrect22);
        r122.add(jrIncorrect212);
        r122.add(jrIncorrect222);
        r132.add(jrIncorrect312);
        r132.add(jrIncorrect322);
        r132.add(jrCorrect32);
        
        check = new ImageIcon("C://programa//imagenes//Check.png");
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
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCheckME = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jrCorrect12 = new javax.swing.JRadioButton();
        jrIncorrect112 = new javax.swing.JRadioButton();
        jrIncorrect122 = new javax.swing.JRadioButton();
        jrIncorrect212 = new javax.swing.JRadioButton();
        jrIncorrect222 = new javax.swing.JRadioButton();
        jrCorrect22 = new javax.swing.JRadioButton();
        jrIncorrect312 = new javax.swing.JRadioButton();
        jrCorrect32 = new javax.swing.JRadioButton();
        jrIncorrect322 = new javax.swing.JRadioButton();
        true1 = new javax.swing.JLabel();
        true2 = new javax.swing.JLabel();
        true3 = new javax.swing.JLabel();
        false1 = new javax.swing.JLabel();
        false2 = new javax.swing.JLabel();
        false3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("How + Adjective - Reading");
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));

        btnAtras.setBackground(new java.awt.Color(255, 102, 102));
        btnAtras.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnAtras.setText("Back");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reading");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel2.setText("Select the adjetive ");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel3.setText("A. How slow is the snail !");

        btnCheckME.setBackground(new java.awt.Color(255, 102, 102));
        btnCheckME.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        btnCheckME.setText("Check");
        btnCheckME.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnCheckME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckMEActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adjetives/Imagenes pequenas/big.png"))); // NOI18N
        jLabel14.setText("jLabel3");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adjetives/Imagenes pequenas/slow.png"))); // NOI18N
        jLabel15.setText("jLabel3");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adjetives/Imagenes pequenas/young.png"))); // NOI18N
        jLabel16.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel4.setText("C. How big is the elephant!  ");

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel11.setText("B. How young the girl is!");

        jrCorrect12.setBackground(new java.awt.Color(253, 253, 105));
        jrCorrect12.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrCorrect12.setText("Slow");
        jrCorrect12.setFocusPainted(false);

        jrIncorrect112.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect112.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect112.setText("Snail");
        jrIncorrect112.setFocusPainted(false);
        jrIncorrect112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIncorrect112ActionPerformed(evt);
            }
        });

        jrIncorrect122.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect122.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect122.setText("How");
        jrIncorrect122.setFocusPainted(false);

        jrIncorrect212.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect212.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect212.setText("How");
        jrIncorrect212.setFocusPainted(false);
        jrIncorrect212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIncorrect212ActionPerformed(evt);
            }
        });

        jrIncorrect222.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect222.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect222.setText("Girl");
        jrIncorrect222.setFocusPainted(false);

        jrCorrect22.setBackground(new java.awt.Color(253, 253, 105));
        jrCorrect22.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrCorrect22.setText("Young");
        jrCorrect22.setFocusPainted(false);

        jrIncorrect312.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect312.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect312.setText("Elephant");
        jrIncorrect312.setFocusPainted(false);
        jrIncorrect312.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIncorrect312ActionPerformed(evt);
            }
        });

        jrCorrect32.setBackground(new java.awt.Color(253, 253, 105));
        jrCorrect32.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrCorrect32.setText("Big");
        jrCorrect32.setFocusPainted(false);

        jrIncorrect322.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect322.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect322.setText("How");
        jrIncorrect322.setFocusPainted(false);

        true1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        true1.setText("jLabel3");
        true1.setMaximumSize(new java.awt.Dimension(50, 50));
        true1.setMinimumSize(new java.awt.Dimension(50, 50));
        true1.setPreferredSize(new java.awt.Dimension(50, 50));

        true2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        true2.setText("jLabel3");
        true2.setMaximumSize(new java.awt.Dimension(50, 50));
        true2.setMinimumSize(new java.awt.Dimension(50, 50));
        true2.setPreferredSize(new java.awt.Dimension(50, 50));

        true3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        true3.setText("jLabel3");
        true3.setMaximumSize(new java.awt.Dimension(50, 50));
        true3.setMinimumSize(new java.awt.Dimension(50, 50));
        true3.setPreferredSize(new java.awt.Dimension(50, 50));

        false1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        false1.setText("jLabel3");
        false1.setMaximumSize(new java.awt.Dimension(50, 50));
        false1.setMinimumSize(new java.awt.Dimension(50, 50));
        false1.setPreferredSize(new java.awt.Dimension(50, 50));

        false2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        false2.setText("jLabel3");
        false2.setMaximumSize(new java.awt.Dimension(50, 50));
        false2.setMinimumSize(new java.awt.Dimension(50, 50));
        false2.setPreferredSize(new java.awt.Dimension(50, 50));

        false3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        false3.setText("jLabel3");
        false3.setMaximumSize(new java.awt.Dimension(50, 50));
        false3.setMinimumSize(new java.awt.Dimension(50, 50));
        false3.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrIncorrect112, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrIncorrect122, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrCorrect12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(true1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(false1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(320, 320, 320)
                                        .addComponent(true2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(false2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(340, 340, 340)
                                        .addComponent(btnCheckME, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrIncorrect212, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrIncorrect222, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrCorrect22, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrIncorrect312, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jrIncorrect322, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(true3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(false3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104)))
                    .addComponent(jrCorrect32, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrIncorrect112)
                    .addComponent(jrIncorrect212)
                    .addComponent(jrIncorrect312))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrCorrect12)
                    .addComponent(jrIncorrect222)
                    .addComponent(jrIncorrect322)
                    .addComponent(true1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(false1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(true2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(false2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(false3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(true3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrIncorrect122)
                    .addComponent(jrCorrect22)
                    .addComponent(jrCorrect32))
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckME, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckMEActionPerformed
      
           if(jrCorrect12.isSelected()){
               true1.setVisible(true);
               false1.setVisible(false);
               jrCorrect12.setEnabled(false);
               jrIncorrect112.setEnabled(false);
               jrIncorrect122.setEnabled(false);
           } else {
               true1.setVisible(false);
               false1.setVisible(true);
           }
           
           if(jrCorrect22.isSelected()){
               true2.setVisible(true);
               false2.setVisible(false);
               jrCorrect22.setEnabled(false);
               jrIncorrect212.setEnabled(false);
               jrIncorrect222.setEnabled(false);
           } else {
               true2.setVisible(false);
               false2.setVisible(true);
           }
           
           if(jrCorrect32.isSelected()){
               true3.setVisible(true);
               false3.setVisible(false);
               jrCorrect32.setEnabled(false);
               jrIncorrect312.setEnabled(false);
               jrIncorrect322.setEnabled(false);
           } else {
               true3.setVisible(false);
               false3.setVisible(true);
           }
           
           if(jrCorrect12.isSelected()&& jrCorrect22.isSelected() && jrCorrect32.isSelected()){
               
               explodecorrecto();
               JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
               explodefin();
               JOptionPane.showMessageDialog(null, "Reading completed!", "", HEIGHT, smile);;
               
               listeningHA ventanaListening = new listeningHA();
               ventanaListening.setVisible(true);
               this.dispose();
               
               
           
           }
    }//GEN-LAST:event_btnCheckMEActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        readingHA x = new readingHA();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void jrIncorrect112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrect112ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrect112ActionPerformed

    private void jrIncorrect312ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrect312ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrect312ActionPerformed

    private void jrIncorrect212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrect212ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrect212ActionPerformed
    
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
                new readingHA1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCheckME;
    private javax.swing.JLabel false1;
    private javax.swing.JLabel false2;
    private javax.swing.JLabel false3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrCorrect12;
    private javax.swing.JRadioButton jrCorrect22;
    private javax.swing.JRadioButton jrCorrect32;
    private javax.swing.JRadioButton jrIncorrect112;
    private javax.swing.JRadioButton jrIncorrect122;
    private javax.swing.JRadioButton jrIncorrect212;
    private javax.swing.JRadioButton jrIncorrect222;
    private javax.swing.JRadioButton jrIncorrect312;
    private javax.swing.JRadioButton jrIncorrect322;
    private javax.swing.JLabel true1;
    private javax.swing.JLabel true2;
    private javax.swing.JLabel true3;
    // End of variables declaration//GEN-END:variables
}
