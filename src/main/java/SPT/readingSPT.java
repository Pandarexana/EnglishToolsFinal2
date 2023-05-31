package SPT;

import MiCity.*;
import java.awt.Image;
import java.awt.Toolkit;
import seasons.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class readingSPT extends javax.swing.JFrame {

    ButtonGroup cloudybt;
    ButtonGroup hotbt;
    ButtonGroup windybt;
    ButtonGroup sunnybt;
    
    Icon check;
    Icon error;
    Icon smile;
    
    public readingSPT() {
        initComponents();
        this.setExtendedState(listening.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
           cloudybt=new ButtonGroup();
           hotbt = new ButtonGroup();
           windybt = new ButtonGroup();
           sunnybt = new ButtonGroup();
        cloudybt.add(jrBYH);
        cloudybt.add(jrIncorrecto1);
        cloudybt.add(jrIncorrecto11);
        hotbt.add(jrGTS);
        hotbt.add(jrIncorrecto41);
        hotbt.add(jrIncorrecto42);
        windybt.add(jrPlay);
        windybt.add(jrIncorrecto21);
        windybt.add(jrIncorrecto22);
        sunnybt.add(jrGTB);
        sunnybt.add(jrIncorrecto31);
        sunnybt.add(jrIncorrecto32);
        
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
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnFinishQ = new javax.swing.JButton();
        btnAtrasQ = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jrIncorrecto1 = new javax.swing.JRadioButton();
        jrIncorrecto11 = new javax.swing.JRadioButton();
        jrBYH = new javax.swing.JRadioButton();
        jrIncorrecto21 = new javax.swing.JRadioButton();
        jrPlay = new javax.swing.JRadioButton();
        jrIncorrecto22 = new javax.swing.JRadioButton();
        jrIncorrecto31 = new javax.swing.JRadioButton();
        jrIncorrecto32 = new javax.swing.JRadioButton();
        jrGTB = new javax.swing.JRadioButton();
        jrIncorrecto41 = new javax.swing.JRadioButton();
        jrGTS = new javax.swing.JRadioButton();
        jrIncorrecto42 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Present Tense - Reading 1");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(1554, 820));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Select the correct sentence.");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/imagenes pequeñas/brush your hair.png"))); // NOI18N
        jLabel14.setText("jLabel3");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/imagenes pequeñas/go to bed.png"))); // NOI18N
        jLabel20.setText("jLabel3");

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

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/imagenes pequeñas/go to play.png"))); // NOI18N
        jLabel22.setText("jLabel3");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/imagenes pequeñas/go to school.png"))); // NOI18N
        jLabel23.setText("jLabel3");

        jrIncorrecto1.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto1.setText("We brushes her hair");
        jrIncorrecto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIncorrecto1ActionPerformed(evt);
            }
        });

        jrIncorrecto11.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto11.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto11.setText("He brushes her hair");
        jrIncorrecto11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIncorrecto11ActionPerformed(evt);
            }
        });

        jrBYH.setBackground(new java.awt.Color(253, 253, 105));
        jrBYH.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrBYH.setText("She brushes her hair");
        jrBYH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBYHActionPerformed(evt);
            }
        });

        jrIncorrecto21.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto21.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto21.setText("I go to play");

        jrPlay.setBackground(new java.awt.Color(253, 253, 105));
        jrPlay.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrPlay.setText("They go to play");
        jrPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrPlayActionPerformed(evt);
            }
        });

        jrIncorrecto22.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto22.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto22.setText("He goes to play");
        jrIncorrecto22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIncorrecto22ActionPerformed(evt);
            }
        });

        jrIncorrecto31.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto31.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto31.setText("They goes to bed");

        jrIncorrecto32.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto32.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto32.setText("She goes to bed");

        jrGTB.setBackground(new java.awt.Color(253, 253, 105));
        jrGTB.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrGTB.setText("He goes to bed");
        jrGTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrGTBActionPerformed(evt);
            }
        });

        jrIncorrecto41.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto41.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto41.setText("I go to school");

        jrGTS.setBackground(new java.awt.Color(253, 253, 105));
        jrGTS.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrGTS.setText("We go to school");
        jrGTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrGTSActionPerformed(evt);
            }
        });

        jrIncorrecto42.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto42.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto42.setText("It goes to school");
        jrIncorrecto42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIncorrecto42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jrIncorrecto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrIncorrecto11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrBYH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrIncorrecto21, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrIncorrecto22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(214, 214, 214)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrGTB)
                                            .addComponent(jrIncorrecto32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrIncorrecto31, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))))
                                .addGap(226, 226, 226)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrGTS)
                                    .addComponent(jrIncorrecto41, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrIncorrecto42)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrIncorrecto1)
                    .addComponent(jrIncorrecto21)
                    .addComponent(jrIncorrecto31)
                    .addComponent(jrIncorrecto41))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrIncorrecto11)
                    .addComponent(jrPlay)
                    .addComponent(jrIncorrecto32)
                    .addComponent(jrGTS))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrBYH)
                    .addComponent(jrIncorrecto22)
                    .addComponent(jrGTB)
                    .addComponent(jrIncorrecto42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasQActionPerformed
        listeningSPT  q = new listeningSPT();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasQActionPerformed

    private void btnFinishQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishQActionPerformed
     
        if (jrBYH.isSelected()){
        jrBYH.setEnabled(false);
        jrIncorrecto1.setEnabled(false);
        jrIncorrecto11.setEnabled(false);
        
        }
        
        if (jrPlay.isSelected()){
            jrPlay.setEnabled(false);
            jrIncorrecto21.setEnabled(false);
            jrIncorrecto22.setEnabled(false);
        }
        if (jrGTB.isSelected()){
            jrGTB.setEnabled(false);
            jrIncorrecto31.setEnabled(false);
            jrIncorrecto32.setEnabled(false);
        }
        
        if(jrGTS.isSelected()){
            jrGTS.setEnabled(false);
            jrIncorrecto41.setEnabled(false);
            jrIncorrecto42.setEnabled(false);
        }
        
        if (jrBYH.isSelected()&& jrPlay.isSelected() && jrGTB.isSelected() && jrGTS.isSelected()){
            explodecorrecto();
            JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
            readingSPT12 k = new readingSPT12();
            k.setVisible(true);
            this.dispose();
        } else {
            explodeincorrecto();
            JOptionPane.showMessageDialog(null, error, "", JOptionPane.DEFAULT_OPTION);
        }
        

    }//GEN-LAST:event_btnFinishQActionPerformed

    private void jrPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrPlayActionPerformed

    private void jrIncorrecto42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrecto42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrecto42ActionPerformed

    private void jrIncorrecto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrecto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrecto1ActionPerformed

    private void jrGTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrGTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrGTBActionPerformed

    private void jrBYHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBYHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrBYHActionPerformed

    private void jrIncorrecto11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrecto11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrecto11ActionPerformed

    private void jrIncorrecto22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrecto22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrecto22ActionPerformed

    private void jrGTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrGTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrGTSActionPerformed

   
    
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
                new readingSPT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasQ;
    private javax.swing.JButton btnFinishQ;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrBYH;
    private javax.swing.JRadioButton jrGTB;
    private javax.swing.JRadioButton jrGTS;
    private javax.swing.JRadioButton jrIncorrecto1;
    private javax.swing.JRadioButton jrIncorrecto11;
    private javax.swing.JRadioButton jrIncorrecto21;
    private javax.swing.JRadioButton jrIncorrecto22;
    private javax.swing.JRadioButton jrIncorrecto31;
    private javax.swing.JRadioButton jrIncorrecto32;
    private javax.swing.JRadioButton jrIncorrecto41;
    private javax.swing.JRadioButton jrIncorrecto42;
    private javax.swing.JRadioButton jrPlay;
    // End of variables declaration//GEN-END:variables
}
