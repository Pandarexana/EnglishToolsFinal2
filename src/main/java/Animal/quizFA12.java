package Animal;

import seasons.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class quizFA12 extends javax.swing.JFrame {

 
    public static int y = 0;
    int y5 = 0;
    int y1 = 0;
    int y2 = 0;
    int y3 = 0;
    int y4 = 0;
    
   
    
    ButtonGroup Beejr;
    ButtonGroup Oxjr;
    
    Icon smile;
    Icon iquiz;

    
    
    public quizFA12() {
        initComponents();
        this.setExtendedState(listening.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        Beejr = new ButtonGroup();
        Oxjr = new ButtonGroup();
        
        Beejr.add(jrBee);
        Beejr.add(jrIncorrecto11);
        Beejr.add(jrIncorrecto12);
        Beejr.add(jrIncorrecto13);
        
        Oxjr.add(jrOx);
        Oxjr.add(jrIncorrecto21);
        Oxjr.add(jrIncorrecto22);
        Oxjr.add(jrIncorrecto23);
        
        smile = new ImageIcon("C://programa//imagenes//Smile.png");
        iquiz = new ImageIcon("C://programa//imagenes//quiz.png");
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
        jLabel16 = new javax.swing.JLabel();
        btnAudioCow = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtCow = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnAudioGoat = new javax.swing.JButton();
        txtGoat = new javax.swing.JTextField();
        btnAudioRooster = new javax.swing.JButton();
        txtRooster = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnFinishQ = new javax.swing.JButton();
        btnAtrasQ = new javax.swing.JButton();
        jrBee = new javax.swing.JRadioButton();
        jrIncorrecto11 = new javax.swing.JRadioButton();
        jrIncorrecto12 = new javax.swing.JRadioButton();
        jrIncorrecto13 = new javax.swing.JRadioButton();
        jrIncorrecto21 = new javax.swing.JRadioButton();
        jrOx = new javax.swing.JRadioButton();
        jrIncorrecto22 = new javax.swing.JRadioButton();
        jrIncorrecto23 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animals- Quiz");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(1554, 820));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("3. Check the correct name the picture.");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farm animals/imagenes pequeñas/bee.jpg"))); // NOI18N
        jLabel14.setText("jLabel3");

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("4. Listen and read ");

        btnAudioCow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        btnAudioCow.setText("jButton1");
        btnAudioCow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioCowActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("A.");

        txtCow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCowActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("B.");

        jLabel19.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("C.");

        btnAudioGoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        btnAudioGoat.setText("jButton1");
        btnAudioGoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioGoatActionPerformed(evt);
            }
        });

        btnAudioRooster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        btnAudioRooster.setText("jButton1");
        btnAudioRooster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioRoosterActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farm animals/imagenes pequeñas/ox.jpg"))); // NOI18N
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

        jrBee.setBackground(new java.awt.Color(253, 253, 105));
        jrBee.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrBee.setText("Bee");
        jrBee.setFocusPainted(false);

        jrIncorrecto11.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto11.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto11.setText("Calf");
        jrIncorrecto11.setFocusPainted(false);

        jrIncorrecto12.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto12.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto12.setText("Rooster");
        jrIncorrecto12.setFocusPainted(false);
        jrIncorrecto12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIncorrecto12ActionPerformed(evt);
            }
        });

        jrIncorrecto13.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto13.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto13.setText("kitten");
        jrIncorrecto13.setFocusPainted(false);

        jrIncorrecto21.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto21.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto21.setText("Hen");
        jrIncorrecto21.setFocusPainted(false);

        jrOx.setBackground(new java.awt.Color(253, 253, 105));
        jrOx.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrOx.setText("Ox");
        jrOx.setFocusPainted(false);
        jrOx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrOxActionPerformed(evt);
            }
        });

        jrIncorrecto22.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto22.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto22.setText("Puppy");
        jrIncorrecto22.setFocusPainted(false);

        jrIncorrecto23.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto23.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto23.setText("Goose");
        jrIncorrecto23.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAudioCow, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCow, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(213, 213, 213)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGoat, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAudioGoat, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAudioRooster, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRooster, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(151, 151, 151))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrBee, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrIncorrecto11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrIncorrecto12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrIncorrecto13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(321, 321, 321)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrIncorrecto21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrOx, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrIncorrecto22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrIncorrecto23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jrBee)
                        .addGap(11, 11, 11)
                        .addComponent(jrIncorrecto11)
                        .addGap(11, 11, 11)
                        .addComponent(jrIncorrecto12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrIncorrecto13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jrIncorrecto21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrOx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrIncorrecto22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrIncorrecto23))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAudioCow, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAudioGoat, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAudioRooster, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRooster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAudioRoosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioRoosterActionPerformed
        explodeRooster();
    }//GEN-LAST:event_btnAudioRoosterActionPerformed

    private void btnAudioGoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioGoatActionPerformed
       explodeGoat();
    }//GEN-LAST:event_btnAudioGoatActionPerformed

    private void btnAudioCowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioCowActionPerformed
        explodeCow();
    }//GEN-LAST:event_btnAudioCowActionPerformed

    private void btnFinishQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishQActionPerformed

        checkBee();
        checkOx();
        respuestaChckCow();
        respuestaChckGoat();
        respuestaChckRooster();    
        y=y1+y2+y3+y4+y5;
        
        quizFA13 k = new quizFA13();
        k.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnFinishQActionPerformed

    private void btnAtrasQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasQActionPerformed
        quizFA1 q = new quizFA1();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasQActionPerformed

    private void txtCowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCowActionPerformed

    private void jrIncorrecto12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrecto12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrecto12ActionPerformed

    private void jrOxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrOxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrOxActionPerformed

   
    
     public void checkBee(){
        if(jrBee.isSelected()){
         y5++;
         if (y5 > 1){
             y5--;
         }else if (y5 <= 0){
            
            
         }
    }
    }
    public void checkOx(){
        if(jrOx.isSelected()){
         y1++; 
         if (y1 > 1){
             y1--;
         }else if (y1 <= 0){
             
         }
    }}
   
    
   public void respuestaChckCow (){
       String ch = txtCow.getText();
       if(ch.equalsIgnoreCase("Cow")){
           y2++;   
           if (y2 > 1){
             y2--;
         }else if (y2 <= 0){
            
            
         }
       }
   }
       
    public void respuestaChckGoat (){
       String ch = txtGoat.getText();
       if(ch.equalsIgnoreCase("Goat")){
           y3++;  
           if (y3 > 1){
             y3--;
         }else if (y3 <= 0){
            
            
         }
       }}
    
       
    public void respuestaChckRooster (){
       String ch = txtRooster.getText();
       if(ch.equalsIgnoreCase("Rooster")){
           y4++;  
           if (y4 > 1){
             y4--;
         }else if (y4 <= 0){
            
            
         }
       }
   }
   
   public void explodeCow() {
   File sound = new File("C://programa//audio//cow.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 } 
   public void explodeGoat() {
   File sound = new File("C://programa//audio//goat.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }
  public void explodeRooster() {
   File sound = new File("C://programa//audio//rooster.wav");
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
                new quizFA12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasQ;
    private javax.swing.JButton btnAudioCow;
    private javax.swing.JButton btnAudioGoat;
    private javax.swing.JButton btnAudioRooster;
    private javax.swing.JButton btnFinishQ;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrBee;
    private javax.swing.JRadioButton jrIncorrecto11;
    private javax.swing.JRadioButton jrIncorrecto12;
    private javax.swing.JRadioButton jrIncorrecto13;
    private javax.swing.JRadioButton jrIncorrecto21;
    private javax.swing.JRadioButton jrIncorrecto22;
    private javax.swing.JRadioButton jrIncorrecto23;
    private javax.swing.JRadioButton jrOx;
    private javax.swing.JTextField txtCow;
    private javax.swing.JTextField txtGoat;
    private javax.swing.JTextField txtRooster;
    // End of variables declaration//GEN-END:variables
}
