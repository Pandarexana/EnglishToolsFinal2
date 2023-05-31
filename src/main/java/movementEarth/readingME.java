package movementEarth;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import weather.*;
import javax.swing.JOptionPane;

public class readingME extends javax.swing.JFrame {
    
    Icon check;

    public readingME() {
        initComponents();
        this.setExtendedState(listeningW.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        true1.setVisible(false);
        true2.setVisible(false);
        true3.setVisible(false);
        false1.setVisible(false);
        false2.setVisible(false);
        false3.setVisible(false);
        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSentence11 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSentence12 = new javax.swing.JTextField();
        txtSentence21 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSentence22 = new javax.swing.JTextField();
        txtSentence31 = new javax.swing.JTextField();
        txtSentence32 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        true2 = new javax.swing.JLabel();
        true1 = new javax.swing.JLabel();
        true3 = new javax.swing.JLabel();
        false1 = new javax.swing.JLabel();
        false2 = new javax.swing.JLabel();
        false3 = new javax.swing.JLabel();
        btnCheckME = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movement of the earth - Reading");
        setIconImage(getIconImage());

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
        jLabel2.setText("Completed");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setText("Rotation");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Movement of the earth/rotacion.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel5.setText("Rotation causes");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel6.setText("Time it takes 1 ");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel7.setText(" on the axis in a ");

        txtSentence11.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtSentence11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSentence11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSentence11ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel8.setText("and");

        txtSentence12.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtSentence12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSentence12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSentence12ActionPerformed(evt);
            }
        });

        txtSentence21.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtSentence21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSentence21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSentence21ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel9.setText("= 24");

        txtSentence22.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtSentence22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSentence22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSentence22ActionPerformed(evt);
            }
        });

        txtSentence31.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtSentence31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSentence31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSentence31ActionPerformed(evt);
            }
        });

        txtSentence32.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtSentence32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSentence32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSentence32ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel10.setText("time");

        true2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        true2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N

        true1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        true1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N

        true3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        true3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N

        false1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        false1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N

        false2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        false2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N

        false3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        false3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N

        btnCheckME.setBackground(new java.awt.Color(255, 102, 102));
        btnCheckME.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnCheckME.setText("Check");
        btnCheckME.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnCheckME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckMEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(521, 521, 521)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSentence21, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSentence22))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSentence11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSentence12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSentence31, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSentence32, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(true3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(false3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(true2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(false2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(true1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(false1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(502, 502, 502)
                                .addComponent(btnCheckME, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(319, 319, 319)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(329, 329, 329)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(514, 514, 514)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSentence11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSentence12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(true1))
                                    .addComponent(false1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSentence21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSentence22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(true2)))
                            .addComponent(false2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSentence31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSentence32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(true3)))
                    .addComponent(false3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCheckME, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(87, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        listeningME ventanaListening = new listeningME();
        ventanaListening.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtSentence11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSentence11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSentence11ActionPerformed

    private void txtSentence12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSentence12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSentence12ActionPerformed

    private void txtSentence21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSentence21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSentence21ActionPerformed

    private void txtSentence22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSentence22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSentence22ActionPerformed

    private void txtSentence31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSentence31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSentence31ActionPerformed

    private void txtSentence32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSentence32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSentence32ActionPerformed

    private void btnCheckMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckMEActionPerformed
     String s11 = txtSentence11.getText().toString();
     String s12 = txtSentence12.getText().toString();
     String s21 = txtSentence21.getText().toString();
     String s22 = txtSentence22.getText().toString();
     String s31 = txtSentence31.getText().toString();
     String s32 = txtSentence32.getText().toString();
     
     if (s11.equalsIgnoreCase("Day")){
         txtSentence11.setEditable(false);
     }
     if (s12.equalsIgnoreCase("Night")){
         txtSentence12.setEditable(false);
     }
     if (s11.equalsIgnoreCase("Day")&& s12.equalsIgnoreCase("Night") ){
         txtSentence11.setEditable(false);
         txtSentence12.setEditable(false);
         true1.setVisible(true);
         false1.setVisible(false);
     } else {
         false1.setVisible(true);
         true1.setVisible(false);
     }
     
     
     if (s21.equalsIgnoreCase("Day")){
         txtSentence21.setEditable(false);
     }
     if (s22.equalsIgnoreCase("Hours")){
         txtSentence22.setEditable(false);
     }
     if (s21.equalsIgnoreCase("Day")&& s22.equalsIgnoreCase("Hours") ){
         txtSentence21.setEditable(false);
         txtSentence22.setEditable(false);
         true2.setVisible(true);
         false2.setVisible(false);
     } else {
         false2.setVisible(true);
         true2.setVisible(false);
     }
     
     
     if (s31.equalsIgnoreCase("Rotate")){
         txtSentence31.setEditable(false);
     }
     if (s32.equalsIgnoreCase("Short")){
         txtSentence32.setEditable(false);
     }
     if (s31.equalsIgnoreCase("Rotate")&& s32.equalsIgnoreCase("Short") ){
         txtSentence31.setEditable(false);
         txtSentence32.setEditable(false);
         true3.setVisible(true);
         false3.setVisible(false);;
     } else {
         false3.setVisible(true);
         true3.setVisible(false);
     }
     
     if(s11.equalsIgnoreCase("Day")&& s12.equalsIgnoreCase("Night")&& s21.equalsIgnoreCase("Day")&& s22.equalsIgnoreCase("Hours")
             && s31.equalsIgnoreCase("Rotate")&& s32.equalsIgnoreCase("Short")){
             true1.setVisible(true);
             true2.setVisible(true);
             true3.setVisible(true);
             
             explodecorrecto();
             JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
             readingME1 me = new readingME1();
             me.setVisible(true);
             this.dispose();
            
     }
    }//GEN-LAST:event_btnCheckMEActionPerformed
    
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
                new readingME().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel true1;
    private javax.swing.JLabel true2;
    private javax.swing.JLabel true3;
    private javax.swing.JTextField txtSentence11;
    private javax.swing.JTextField txtSentence12;
    private javax.swing.JTextField txtSentence21;
    private javax.swing.JTextField txtSentence22;
    private javax.swing.JTextField txtSentence31;
    private javax.swing.JTextField txtSentence32;
    // End of variables declaration//GEN-END:variables
}
