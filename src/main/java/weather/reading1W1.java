package weather;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class reading1W1 extends javax.swing.JFrame {
    
    Icon check;
    Icon error;
    Icon smile;

    public reading1W1() {
        initComponents();
        this.setExtendedState(listeningW.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        //Ocultar los check y cross de todas la variables
        trueHot.setVisible(false);
        falseHot.setVisible(false);
        
        trueWindy.setVisible(false);
        falseWindy.setVisible(false);
        
        trueSunny.setVisible(false);
        falseSunny.setVisible(false);
        
        trueCold.setVisible(false);
        falseCold.setVisible(false);
        
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
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbHot = new javax.swing.JComboBox<>();
        cbSunny = new javax.swing.JComboBox<>();
        cbWindy = new javax.swing.JComboBox<>();
        cbCold = new javax.swing.JComboBox<>();
        trueHot = new javax.swing.JLabel();
        falseHot = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        trueSunny = new javax.swing.JLabel();
        falseSunny = new javax.swing.JLabel();
        trueWindy = new javax.swing.JLabel();
        falseCold = new javax.swing.JLabel();
        falseWindy = new javax.swing.JLabel();
        trueCold = new javax.swing.JLabel();
        btnHot = new javax.swing.JButton();
        btnSunny = new javax.swing.JButton();
        btnWindy = new javax.swing.JButton();
        btnCold = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather - Reading");
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

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reading");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setText("Listen and choose the right option.");

        cbHot.setBackground(new java.awt.Color(153, 255, 153));
        cbHot.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbHot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cloudy", "Hot", "Snowy", "Sunny" }));

        cbSunny.setBackground(new java.awt.Color(153, 255, 153));
        cbSunny.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbSunny.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cold", "Cloudy", "Foggy", "Sunny" }));
        cbSunny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSunnyActionPerformed(evt);
            }
        });

        cbWindy.setBackground(new java.awt.Color(153, 255, 153));
        cbWindy.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbWindy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hot", "Cloudy", "Snowy", "Windy" }));

        cbCold.setBackground(new java.awt.Color(153, 255, 153));
        cbCold.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbCold.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hot", "Cold", "Snowy", "Rainy" }));

        trueHot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueHot.setText("jLabel3");
        trueHot.setMaximumSize(new java.awt.Dimension(50, 50));
        trueHot.setMinimumSize(new java.awt.Dimension(50, 50));
        trueHot.setPreferredSize(new java.awt.Dimension(50, 50));

        falseHot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N

        btnCheck.setBackground(new java.awt.Color(255, 102, 102));
        btnCheck.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnCheck.setText("Check");
        btnCheck.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        trueSunny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueSunny.setText("jLabel3");
        trueSunny.setMaximumSize(new java.awt.Dimension(50, 50));
        trueSunny.setMinimumSize(new java.awt.Dimension(50, 50));
        trueSunny.setPreferredSize(new java.awt.Dimension(50, 50));

        falseSunny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N

        trueWindy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueWindy.setText("jLabel3");
        trueWindy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueWindy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueWindy.setPreferredSize(new java.awt.Dimension(50, 50));

        falseCold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N

        falseWindy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N

        trueCold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueCold.setText("jLabel3");
        trueCold.setMaximumSize(new java.awt.Dimension(50, 50));
        trueCold.setMinimumSize(new java.awt.Dimension(50, 50));
        trueCold.setPreferredSize(new java.awt.Dimension(50, 50));

        btnHot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/hot.jpg"))); // NOI18N
        btnHot.setText("jButton1");
        btnHot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHotActionPerformed(evt);
            }
        });

        btnSunny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/sunny.png"))); // NOI18N
        btnSunny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSunnyActionPerformed(evt);
            }
        });

        btnWindy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/windy.png"))); // NOI18N
        btnWindy.setText("jButton1");
        btnWindy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWindyActionPerformed(evt);
            }
        });

        btnCold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/cold.jpg"))); // NOI18N
        btnCold.setText("jButton1");
        btnCold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSunny, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnHot, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbSunny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trueSunny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbHot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trueHot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(falseHot))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseSunny)))
                                .addGap(170, 170, 170)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnWindy, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbWindy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trueWindy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseWindy))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCold, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trueCold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseCold))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)))))
                .addContainerGap(303, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(659, 659, 659)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(falseHot))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbHot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(trueHot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnHot, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnWindy, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbWindy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(trueWindy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(falseWindy)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(falseSunny, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbSunny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(trueSunny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trueCold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCold, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(falseCold))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnSunny, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        readingW1 ventanaListening = new readingW1();
        ventanaListening.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        //Variables de los Combo box
        String l1 = cbHot.getSelectedItem().toString();
        String l2 = cbWindy.getSelectedItem().toString();
        String l3 = cbSunny.getSelectedItem().toString();
        String l4 = cbCold.getSelectedItem().toString();
        
        //Condicionales para mostrar los check o cross
        if(l1.equals("Hot")){
            trueHot.setVisible(true);
            falseHot.setVisible(false);
            cbHot.setEnabled(false);
            
        }else if(l1.equals("Cloudy")|| l1.equals("Snowy") ||l1.equals("Sunny") ){
            falseHot.setVisible(true);
            trueHot.setVisible(false);
        }
        
        if(l2.equals("Windy")){
            trueWindy.setVisible(true);
            falseWindy.setVisible(false);
            cbWindy.setEnabled(false);
            
        }else if(l2.equals("Hot")|| l2.equals("Cloudy") ||l2.equals("Snowy") ){
            falseWindy.setVisible(true);
            trueWindy.setVisible(false);
        }
        
        if(l3.equals("Sunny")){
            trueSunny.setVisible(true);
            falseSunny.setVisible(false);
            cbSunny.setEnabled(false);
            
        }else if(l3.equals("Cold")|| l3.equals("Cloudy") ||l3.equals("Foggy") ){
            falseSunny.setVisible(true);
            trueSunny.setVisible(false);
        }
        
        if(l4.equals("Cold")){
            trueCold.setVisible(true);
            falseCold.setVisible(false);
            cbCold.setEnabled(false);
            
        }else if(l4.equals("Hot")|| l4.equals("Snowy") ||l4.equals("Rainy") ){
            falseCold.setVisible(true);
            trueCold.setVisible(false);
        }
        
        // condicional de que todo esta correcto y termina la actividad       
        if (l1.equals("Hot")&& l2.equals("Windy") && l3.equals("Sunny") && l4.equals("Cold") ){ 
            explodecorrecto();
            JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
            explodefin();
            JOptionPane.showMessageDialog(null, "Reading completed!", "", HEIGHT, smile);
           listeningW ventanaListening = new listeningW();
           ventanaListening.setVisible(true);
           this.dispose();
        }else {
            explodeincorrecto();
            JOptionPane.showMessageDialog(null, error, "", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnColdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColdActionPerformed
        explodeCold();
    }//GEN-LAST:event_btnColdActionPerformed

    private void cbSunnyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSunnyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSunnyActionPerformed

    private void btnWindyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWindyActionPerformed
        explodeWindy();
    }//GEN-LAST:event_btnWindyActionPerformed

    private void btnHotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHotActionPerformed
        explodeHot();
    }//GEN-LAST:event_btnHotActionPerformed

    private void btnSunnyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSunnyActionPerformed
        explodeSunny();
    }//GEN-LAST:event_btnSunnyActionPerformed

    public void explodeHot() {
   File sound = new File("C://programa//audio//Hot.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }
    public void explodeWindy() {
   File sound = new File("C://programa//audio//Windy.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }
    public void explodeSunny() {
   File sound = new File("C://programa//audio//Sunny.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }
    public void explodeCold() {
   File sound = new File("C://programa//audio//Cold.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }
   
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
                new reading1W1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnCold;
    private javax.swing.JButton btnHot;
    private javax.swing.JButton btnSunny;
    private javax.swing.JButton btnWindy;
    private javax.swing.JComboBox<String> cbCold;
    private javax.swing.JComboBox<String> cbHot;
    private javax.swing.JComboBox<String> cbSunny;
    private javax.swing.JComboBox<String> cbWindy;
    private javax.swing.JLabel falseCold;
    private javax.swing.JLabel falseHot;
    private javax.swing.JLabel falseSunny;
    private javax.swing.JLabel falseWindy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel trueCold;
    private javax.swing.JLabel trueHot;
    private javax.swing.JLabel trueSunny;
    private javax.swing.JLabel trueWindy;
    // End of variables declaration//GEN-END:variables
}
