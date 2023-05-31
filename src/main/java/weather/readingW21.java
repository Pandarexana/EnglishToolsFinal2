package weather;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import seasons.*;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class readingW21 extends javax.swing.JFrame {

    ButtonGroup cloudybt;
    ButtonGroup hotbt;
    ButtonGroup windybt;
    ButtonGroup sunnybt;
    
    Icon check;
    Icon error;
    Icon smile;
    
    public readingW21() {
        initComponents();
        this.setExtendedState(listening.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
           cloudybt=new ButtonGroup();
           hotbt = new ButtonGroup();
           windybt = new ButtonGroup();
           sunnybt = new ButtonGroup();
        cloudybt.add(jrCold);
        cloudybt.add(jrIncorrecto1);
        cloudybt.add(jrIncorrecto11);
        hotbt.add(jrIncorrecto41);
        hotbt.add(jrSnowy);
        hotbt.add(jrIncorrecto42);
        windybt.add(jrRainy);
        windybt.add(jrIncorrecto21);
        windybt.add(jrIncorrecto22);
        sunnybt.add(jrFoggy);
        sunnybt.add(jrIncorrecto31);
        sunnybt.add(jrIncorrecto32);
        
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
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnFinishQ = new javax.swing.JButton();
        btnAtrasQ = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jrIncorrecto1 = new javax.swing.JRadioButton();
        jrIncorrecto11 = new javax.swing.JRadioButton();
        jrCold = new javax.swing.JRadioButton();
        jrIncorrecto21 = new javax.swing.JRadioButton();
        jrRainy = new javax.swing.JRadioButton();
        jrIncorrecto22 = new javax.swing.JRadioButton();
        jrIncorrecto31 = new javax.swing.JRadioButton();
        jrIncorrecto32 = new javax.swing.JRadioButton();
        jrFoggy = new javax.swing.JRadioButton();
        jrSnowy = new javax.swing.JRadioButton();
        jrIncorrecto41 = new javax.swing.JRadioButton();
        jrIncorrecto42 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather - Reading 2");
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(1554, 820));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Select the correct option");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes pequenas/cold.jpg"))); // NOI18N
        jLabel14.setText("jLabel3");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes pequenas/foggy.jpg"))); // NOI18N
        jLabel20.setText("jLabel3");

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

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes pequenas/rainy.png"))); // NOI18N
        jLabel22.setText("jLabel3");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes pequenas/snowy.png"))); // NOI18N
        jLabel23.setText("jLabel3");

        jrIncorrecto1.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto1.setText("It's rainy");

        jrIncorrecto11.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto11.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto11.setText("It's hot");

        jrCold.setBackground(new java.awt.Color(253, 253, 105));
        jrCold.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrCold.setText("It's cold");

        jrIncorrecto21.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto21.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto21.setText("It's sunny");

        jrRainy.setBackground(new java.awt.Color(253, 253, 105));
        jrRainy.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrRainy.setText("It's rainy");
        jrRainy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRainyActionPerformed(evt);
            }
        });

        jrIncorrecto22.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto22.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto22.setText("It's windy");

        jrIncorrecto31.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto31.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto31.setText("It's hot");

        jrIncorrecto32.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto32.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto32.setText("It's snowy");

        jrFoggy.setBackground(new java.awt.Color(253, 253, 105));
        jrFoggy.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrFoggy.setText("It's foggy");

        jrSnowy.setBackground(new java.awt.Color(253, 253, 105));
        jrSnowy.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrSnowy.setText("It's snowy");

        jrIncorrecto41.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto41.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto41.setText("It's hot");

        jrIncorrecto42.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto42.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto42.setText("It's sunny");
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
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrIncorrecto1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrCold, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrIncorrecto11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrRainy, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrIncorrecto21, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrIncorrecto22, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(234, 234, 234)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrIncorrecto32, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrIncorrecto31, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrFoggy, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(291, 291, 291)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrIncorrecto41, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrIncorrecto42, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel9)
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrIncorrecto1)
                    .addComponent(jrIncorrecto31)
                    .addComponent(jrSnowy)
                    .addComponent(jrRainy))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrIncorrecto32)
                    .addComponent(jrIncorrecto41)
                    .addComponent(jrCold)
                    .addComponent(jrIncorrecto21))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrIncorrecto22)
                    .addComponent(jrFoggy)
                    .addComponent(jrIncorrecto42)
                    .addComponent(jrIncorrecto11))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasQActionPerformed
        readingW2 q  = new readingW2();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasQActionPerformed

    private void btnFinishQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishQActionPerformed
     
        if (jrCold.isSelected()){
        jrCold.setEnabled(false);
        jrIncorrecto1.setEnabled(false);
        jrIncorrecto11.setEnabled(false);
        
        }
        
        if (jrRainy.isSelected()){
            jrRainy.setEnabled(false);
            jrIncorrecto21.setEnabled(false);
            jrIncorrecto22.setEnabled(false);
        }
        if (jrFoggy.isSelected()){
            jrFoggy.setEnabled(false);
            jrIncorrecto31.setEnabled(false);
            jrIncorrecto32.setEnabled(false);
        }
        
        if(jrSnowy.isSelected()){
            jrSnowy.setEnabled(false);
            jrIncorrecto41.setEnabled(false);
            jrIncorrecto42.setEnabled(false);
        }
        
        if (jrCold.isSelected() && jrRainy.isSelected() && jrFoggy.isSelected() && jrSnowy.isSelected()){
            explodecorrecto();
            JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
            explodefin();
            JOptionPane.showMessageDialog(null, "Reading 2 completed!", "", HEIGHT, smile);
            listeningW k = new listeningW();
            k.setVisible(true);
            this.dispose();
        } else {
            explodeincorrecto();
            JOptionPane.showMessageDialog(null, error, "", JOptionPane.DEFAULT_OPTION);
        }
        

    }//GEN-LAST:event_btnFinishQActionPerformed

    private void jrRainyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRainyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRainyActionPerformed

    private void jrIncorrecto42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrecto42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrecto42ActionPerformed

   
    
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
                new readingW21().setVisible(true);
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
    private javax.swing.JRadioButton jrCold;
    private javax.swing.JRadioButton jrFoggy;
    private javax.swing.JRadioButton jrIncorrecto1;
    private javax.swing.JRadioButton jrIncorrecto11;
    private javax.swing.JRadioButton jrIncorrecto21;
    private javax.swing.JRadioButton jrIncorrecto22;
    private javax.swing.JRadioButton jrIncorrecto31;
    private javax.swing.JRadioButton jrIncorrecto32;
    private javax.swing.JRadioButton jrIncorrecto41;
    private javax.swing.JRadioButton jrIncorrecto42;
    private javax.swing.JRadioButton jrRainy;
    private javax.swing.JRadioButton jrSnowy;
    // End of variables declaration//GEN-END:variables
}
