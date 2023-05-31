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

public class readingHA extends javax.swing.JFrame {
    
        
        ButtonGroup r11;
        ButtonGroup r12;
        ButtonGroup r13;
        
        Icon check;
        
    public readingHA() {
        initComponents();
        this.setExtendedState(readingHA.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        true1.setVisible(false);
        true2.setVisible(false);
        true3.setVisible(false);
        false1.setVisible(false);
        false2.setVisible(false);
        false3.setVisible(false);
        
        
        
        r11 = new ButtonGroup();
        r12 = new ButtonGroup();
        r13 = new ButtonGroup();
        
        r11.add(jrCorrect1);
        r11.add(jrIncorrect11);
        r11.add(jrIncorrect12);
        r12.add(jrCorrect2);
        r12.add(jrIncorrect21);
        r12.add(jrIncorrect22);
        r13.add(jrIncorrect31);
        r13.add(jrIncorrect32);
        r13.add(jrCorrect3);
        
        check = new ImageIcon("C://programa//imagenes//Check.png");
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
        jrCorrect1 = new javax.swing.JRadioButton();
        jrIncorrect11 = new javax.swing.JRadioButton();
        jrIncorrect12 = new javax.swing.JRadioButton();
        jrIncorrect21 = new javax.swing.JRadioButton();
        jrIncorrect22 = new javax.swing.JRadioButton();
        jrCorrect2 = new javax.swing.JRadioButton();
        jrIncorrect31 = new javax.swing.JRadioButton();
        jrCorrect3 = new javax.swing.JRadioButton();
        jrIncorrect32 = new javax.swing.JRadioButton();
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
        jLabel3.setText("A. How tall is the giraffe?");

        btnCheckME.setBackground(new java.awt.Color(255, 102, 102));
        btnCheckME.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnCheckME.setText("Check");
        btnCheckME.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnCheckME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckMEActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adjetives/Imagenes pequenas/happy.png"))); // NOI18N
        jLabel14.setText("jLabel3");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adjetives/Imagenes pequenas/tall.png"))); // NOI18N
        jLabel15.setText("jLabel3");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adjetives/Imagenes pequenas/small.png"))); // NOI18N
        jLabel16.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel4.setText("C. How happy are the people?");

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel11.setText("B. How small is the ant?");

        jrCorrect1.setBackground(new java.awt.Color(253, 253, 105));
        jrCorrect1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrCorrect1.setText("Tall");
        jrCorrect1.setFocusPainted(false);
        jrCorrect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCorrect1ActionPerformed(evt);
            }
        });

        jrIncorrect11.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect11.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect11.setText("Giraffe");
        jrIncorrect11.setFocusPainted(false);

        jrIncorrect12.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect12.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect12.setText("How");
        jrIncorrect12.setFocusPainted(false);

        jrIncorrect21.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect21.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect21.setText("How");
        jrIncorrect21.setFocusPainted(false);

        jrIncorrect22.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect22.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect22.setText("Ant");
        jrIncorrect22.setFocusPainted(false);

        jrCorrect2.setBackground(new java.awt.Color(253, 253, 105));
        jrCorrect2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrCorrect2.setText("Small");
        jrCorrect2.setFocusPainted(false);

        jrIncorrect31.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect31.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect31.setText("People");
        jrIncorrect31.setFocusPainted(false);

        jrCorrect3.setBackground(new java.awt.Color(253, 253, 105));
        jrCorrect3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrCorrect3.setText("Happy");
        jrCorrect3.setFocusPainted(false);

        jrIncorrect32.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrect32.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jrIncorrect32.setText("How");
        jrIncorrect32.setFocusPainted(false);

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrIncorrect12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrIncorrect11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrCorrect1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(true1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(false1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrCorrect2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jrIncorrect22, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jrIncorrect21, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(true2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(6, 6, 6)
                                        .addComponent(false2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(114, 114, 114)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrIncorrect31, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jrCorrect3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(true3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(6, 6, 6)
                                        .addComponent(false3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrIncorrect32, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(btnCheckME, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(286, 536, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrCorrect1)
                            .addComponent(jrIncorrect21)
                            .addComponent(jrIncorrect31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrIncorrect11)
                            .addComponent(jrIncorrect22)
                            .addComponent(jrCorrect3)
                            .addComponent(true2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(false2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(true3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(false3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(true1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(false1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrIncorrect12)
                    .addComponent(jrIncorrect32)
                    .addComponent(jrCorrect2))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckME, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(263, 263, 263))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckMEActionPerformed
            
        
           if(jrCorrect1.isSelected()){
               true1.setVisible(true);
               false1.setVisible(false);
               jrCorrect1.setEnabled(false);
               jrIncorrect11.setEnabled(false);
               jrIncorrect12.setEnabled(false);
           } else {
               true1.setVisible(false);
               false1.setVisible(true);
           }
           
           if(jrCorrect2.isSelected()){
               true2.setVisible(true);
               false2.setVisible(false);
               jrCorrect2.setEnabled(false);
               jrIncorrect21.setEnabled(false);
               jrIncorrect22.setEnabled(false);
           } else {
               true2.setVisible(false);
               false2.setVisible(true);
           }
           
           if(jrCorrect3.isSelected()){
               true3.setVisible(true);
               false3.setVisible(false);
               jrCorrect3.setEnabled(false);
               jrIncorrect31.setEnabled(false);
               jrIncorrect32.setEnabled(false);
           } else {
               true3.setVisible(false);
               false3.setVisible(true);
           }
           
           if(jrCorrect1.isSelected()&& jrCorrect2.isSelected() && jrCorrect3.isSelected()){
               
               true1.setVisible(true);
               true2.setVisible(true);
               true3.setVisible(true);
               
               explodecorrecto();
               JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
               readingHA1 d = new readingHA1();
               d.setVisible(true);
               this.dispose();
           
           }
    }//GEN-LAST:event_btnCheckMEActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        listeningHA ventanaListening = new listeningHA();
        ventanaListening.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void jrCorrect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCorrect1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrCorrect1ActionPerformed
    
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
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new readingHA().setVisible(true);
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
    private javax.swing.JRadioButton jrCorrect1;
    private javax.swing.JRadioButton jrCorrect2;
    private javax.swing.JRadioButton jrCorrect3;
    private javax.swing.JRadioButton jrIncorrect11;
    private javax.swing.JRadioButton jrIncorrect12;
    private javax.swing.JRadioButton jrIncorrect21;
    private javax.swing.JRadioButton jrIncorrect22;
    private javax.swing.JRadioButton jrIncorrect31;
    private javax.swing.JRadioButton jrIncorrect32;
    private javax.swing.JLabel true1;
    private javax.swing.JLabel true2;
    private javax.swing.JLabel true3;
    // End of variables declaration//GEN-END:variables
}
