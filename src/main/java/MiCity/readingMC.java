package MiCity;

import weather.*;
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



public class readingMC extends javax.swing.JFrame {

    ButtonGroup cloudybt;
    ButtonGroup hotbt;
    ButtonGroup windybt;
    ButtonGroup sunnybt;
    
    Icon check;
    Icon error;
    Icon smile;
    
    public readingMC() {
        initComponents();
        this.setExtendedState(listening.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
           cloudybt=new ButtonGroup();
           hotbt = new ButtonGroup();
           windybt = new ButtonGroup();
           sunnybt = new ButtonGroup();
        cloudybt.add(jrBehind);
        cloudybt.add(jrIncorrecto1);
        cloudybt.add(jrIncorrecto11);
        hotbt.add(jrInside);
        hotbt.add(jrIncorrecto41);
        hotbt.add(jrIncorrecto42);
        windybt.add(jrInFront);
        windybt.add(jrIncorrecto21);
        windybt.add(jrIncorrecto22);
        sunnybt.add(jrBetween);
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
        jrBehind = new javax.swing.JRadioButton();
        jrIncorrecto21 = new javax.swing.JRadioButton();
        jrInFront = new javax.swing.JRadioButton();
        jrIncorrecto22 = new javax.swing.JRadioButton();
        jrIncorrecto31 = new javax.swing.JRadioButton();
        jrIncorrecto32 = new javax.swing.JRadioButton();
        jrBetween = new javax.swing.JRadioButton();
        jrIncorrecto41 = new javax.swing.JRadioButton();
        jrInside = new javax.swing.JRadioButton();
        jrIncorrecto42 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prepositions of Place - Reading 1");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(1554, 820));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Select the correct option");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City/Imagenes pequenas/behind.png"))); // NOI18N
        jLabel14.setText("jLabel3");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City/Imagenes pequenas/between.png"))); // NOI18N
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

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City/Imagenes pequenas/in front.png"))); // NOI18N
        jLabel22.setText("jLabel3");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City/Imagenes pequenas/inside.png"))); // NOI18N
        jLabel23.setText("jLabel3");

        jrIncorrecto1.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto1.setText("In front");
        jrIncorrecto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIncorrecto1ActionPerformed(evt);
            }
        });

        jrIncorrecto11.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto11.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto11.setText("Inside");

        jrBehind.setBackground(new java.awt.Color(253, 253, 105));
        jrBehind.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrBehind.setText("Behind");
        jrBehind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBehindActionPerformed(evt);
            }
        });

        jrIncorrecto21.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto21.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto21.setText("Here");

        jrInFront.setBackground(new java.awt.Color(253, 253, 105));
        jrInFront.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrInFront.setText("In front");
        jrInFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrInFrontActionPerformed(evt);
            }
        });

        jrIncorrecto22.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto22.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto22.setText("Behind");

        jrIncorrecto31.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto31.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto31.setText("On");

        jrIncorrecto32.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto32.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto32.setText("Here");

        jrBetween.setBackground(new java.awt.Color(253, 253, 105));
        jrBetween.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrBetween.setText("Between");
        jrBetween.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBetweenActionPerformed(evt);
            }
        });

        jrIncorrecto41.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto41.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto41.setText("Behind");

        jrInside.setBackground(new java.awt.Color(253, 253, 105));
        jrInside.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrInside.setText("Inside");

        jrIncorrecto42.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto42.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto42.setText("In front");
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
                            .addComponent(jrIncorrecto1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrIncorrecto11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrBehind, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrIncorrecto21, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrInFront, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrIncorrecto22, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(234, 234, 234)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrIncorrecto32, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrIncorrecto31, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrBetween, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(291, 291, 291)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrInside, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrIncorrecto41, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrIncorrecto42, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(jrInFront)
                    .addComponent(jrIncorrecto32)
                    .addComponent(jrInside))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrBehind)
                    .addComponent(jrIncorrecto22)
                    .addComponent(jrBetween)
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
        listeningMC  q = new listeningMC();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasQActionPerformed

    private void btnFinishQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishQActionPerformed
     
        if (jrBehind.isSelected()){
        jrBehind.setEnabled(false);
        jrIncorrecto1.setEnabled(false);
        jrIncorrecto11.setEnabled(false);
        
        }
        
        if (jrInFront.isSelected()){
            jrInFront.setEnabled(false);
            jrIncorrecto21.setEnabled(false);
            jrIncorrecto22.setEnabled(false);
        }
        if (jrBetween.isSelected()){
            jrBetween.setEnabled(false);
            jrIncorrecto31.setEnabled(false);
            jrIncorrecto32.setEnabled(false);
        }
        
        if(jrInside.isSelected()){
            jrInside.setEnabled(false);
            jrIncorrecto41.setEnabled(false);
            jrIncorrecto42.setEnabled(false);
        }
        
        if (jrBehind.isSelected()&& jrInFront.isSelected() && jrBetween.isSelected() && jrInside.isSelected()){
            explodecorrecto();
            JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
            readingMC1 k = new readingMC1();
            k.setVisible(true);
            this.dispose();
        } else {
            explodeincorrecto();
            JOptionPane.showMessageDialog(null, error, "", JOptionPane.DEFAULT_OPTION);
        }
        

    }//GEN-LAST:event_btnFinishQActionPerformed

    private void jrInFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrInFrontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrInFrontActionPerformed

    private void jrIncorrecto42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrecto42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrecto42ActionPerformed

    private void jrIncorrecto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrecto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrecto1ActionPerformed

    private void jrBetweenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBetweenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrBetweenActionPerformed

    private void jrBehindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBehindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrBehindActionPerformed

   
    
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
                new readingMC().setVisible(true);
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
    private javax.swing.JRadioButton jrBehind;
    private javax.swing.JRadioButton jrBetween;
    private javax.swing.JRadioButton jrInFront;
    private javax.swing.JRadioButton jrIncorrecto1;
    private javax.swing.JRadioButton jrIncorrecto11;
    private javax.swing.JRadioButton jrIncorrecto21;
    private javax.swing.JRadioButton jrIncorrecto22;
    private javax.swing.JRadioButton jrIncorrecto31;
    private javax.swing.JRadioButton jrIncorrecto32;
    private javax.swing.JRadioButton jrIncorrecto41;
    private javax.swing.JRadioButton jrIncorrecto42;
    private javax.swing.JRadioButton jrInside;
    // End of variables declaration//GEN-END:variables
}
