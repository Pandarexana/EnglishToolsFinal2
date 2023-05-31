package seasons;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class quiz1 extends javax.swing.JFrame {

 
    int y = 0;
    int y5 = 0;
    int y1 = 0;
    int y2 = 0;
    int y3 = 0;
    int y4 = 0;
    int p = quiz.i;
    public static int xy = 0;
    
    
    ButtonGroup winterjr;
    ButtonGroup summerjr;
    
    Icon smile;
    Icon iquiz;

    
    
    public quiz1() {
        initComponents();
        this.setExtendedState(listening.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        summerjr = new ButtonGroup();
        winterjr = new ButtonGroup();
        
        summerjr.add(jrSummer);
        summerjr.add(jrIncorrecto11);
        summerjr.add(jrIncorrecto12);
        summerjr.add(jrIncorrecto13);
        
        winterjr.add(jrWinter);
        winterjr.add(jrIncorrecto21);
        winterjr.add(jrIncorrecto22);
        winterjr.add(jrIncorrecto23);
        
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
        btnAudioSpring = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtSpring = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnAudioSummer = new javax.swing.JButton();
        txtSummer = new javax.swing.JTextField();
        btnAudioWinter = new javax.swing.JButton();
        txtWinter = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnFinishQ = new javax.swing.JButton();
        btnAtrasQ = new javax.swing.JButton();
        jrSummer = new javax.swing.JRadioButton();
        jrIncorrecto11 = new javax.swing.JRadioButton();
        jrIncorrecto12 = new javax.swing.JRadioButton();
        jrIncorrecto13 = new javax.swing.JRadioButton();
        jrIncorrecto21 = new javax.swing.JRadioButton();
        jrWinter = new javax.swing.JRadioButton();
        jrIncorrecto22 = new javax.swing.JRadioButton();
        jrIncorrecto23 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seasons - Quiz");
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(1554, 820));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("3. Check the correct name the picture.");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes pequeñas/verano.png"))); // NOI18N
        jLabel14.setText("jLabel3");

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("4. Listen and read ");

        btnAudioSpring.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        btnAudioSpring.setText("jButton1");
        btnAudioSpring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioSpringActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("A.");

        txtSpring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpringActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("B.");

        jLabel19.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("C.");

        btnAudioSummer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        btnAudioSummer.setText("jButton1");
        btnAudioSummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioSummerActionPerformed(evt);
            }
        });

        btnAudioWinter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        btnAudioWinter.setText("jButton1");
        btnAudioWinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioWinterActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes pequeñas/invierno.png"))); // NOI18N
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

        jrSummer.setBackground(new java.awt.Color(253, 253, 105));
        jrSummer.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrSummer.setText("Summer");
        jrSummer.setFocusPainted(false);

        jrIncorrecto11.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto11.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto11.setText("Fall");
        jrIncorrecto11.setFocusPainted(false);

        jrIncorrecto12.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto12.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto12.setText("Spring");
        jrIncorrecto12.setFocusPainted(false);
        jrIncorrecto12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIncorrecto12ActionPerformed(evt);
            }
        });

        jrIncorrecto13.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto13.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto13.setText("Winter");
        jrIncorrecto13.setFocusPainted(false);

        jrIncorrecto21.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto21.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto21.setText("Fall");
        jrIncorrecto21.setFocusPainted(false);

        jrWinter.setBackground(new java.awt.Color(253, 253, 105));
        jrWinter.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrWinter.setText("Winter");
        jrWinter.setFocusPainted(false);
        jrWinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrWinterActionPerformed(evt);
            }
        });

        jrIncorrecto22.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto22.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto22.setText("Summer");
        jrIncorrecto22.setFocusPainted(false);

        jrIncorrecto23.setBackground(new java.awt.Color(253, 253, 105));
        jrIncorrecto23.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jrIncorrecto23.setText("Spring");
        jrIncorrecto23.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(413, 413, 413)
                        .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAudioSpring, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpring, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(213, 213, 213)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSummer, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAudioSummer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAudioWinter, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWinter, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(151, 151, 151))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrSummer, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrIncorrecto11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrIncorrecto12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrIncorrecto13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(321, 321, 321)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrIncorrecto21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrWinter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrIncorrecto22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrIncorrecto23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jrSummer)
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
                                .addComponent(jrWinter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrIncorrecto22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrIncorrecto23))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAudioSpring, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAudioSummer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAudioWinter, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSpring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWinter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
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

    private void btnAudioWinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioWinterActionPerformed
        explodeWinter();
    }//GEN-LAST:event_btnAudioWinterActionPerformed

    private void btnAudioSummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioSummerActionPerformed
       explodeSummer();
    }//GEN-LAST:event_btnAudioSummerActionPerformed

    private void btnAudioSpringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioSpringActionPerformed
        explodeSpring();
    }//GEN-LAST:event_btnAudioSpringActionPerformed

    private void btnFinishQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishQActionPerformed
       quiz q = new quiz();
        
        q.ComboSpring();
        q.ComboSummer();
        q.completeFall();
        q.completeWinter();
        checkWinter();
        checkSummer();
        respuestaChck();
        respuestaChckSummer();
        respuestaChckWinter();
        y=y1+y2+y3+y4+y5;
        xy = p+y;
        
        ingresoSeasons fg = new ingresoSeasons();
        fg.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_btnFinishQActionPerformed

    private void btnAtrasQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasQActionPerformed
        quiz q = new quiz();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasQActionPerformed

    private void txtSpringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpringActionPerformed

    private void jrIncorrecto12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncorrecto12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrIncorrecto12ActionPerformed

    private void jrWinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrWinterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrWinterActionPerformed

   
    public void setnumero(int xy){
    this.xy= xy;
    }
    
    
    
    
     public void checkSummer(){
        if(jrSummer.isSelected()){
         y5++;
         if (y5 > 1){
             y5--;
         }else if (y5 <= 0){
            
            
         }
    }
    }
    public void checkWinter(){
        if(jrWinter.isSelected()){
         y1++; 
         if (y1 > 1){
             y1--;
         }else if (y1 <= 0){
             
         }
    }}
   
    
   public void respuestaChck (){
       String ch = txtSpring.getText();
       if(ch.equalsIgnoreCase("Spring")){
           y2++;   
           if (y2 > 1){
             y2--;
         }else if (y2 <= 0){
            
            
         }
       }
   }
       
    public void respuestaChckSummer (){
       String ch = txtSummer.getText();
       if(ch.equalsIgnoreCase("Summer")){
           y3++;  
           if (y3 > 1){
             y3--;
         }else if (y3 <= 0){
            
            
         }
       }}
    
       
    public void respuestaChckWinter (){
       String ch = txtWinter.getText();
       if(ch.equalsIgnoreCase("Winter")){
           y4++;  
           if (y4 > 1){
             y4--;
         }else if (y4 <= 0){
            
            
         }
       }
   }
   
   public void explodeSpring() {
   File sound = new File("C://programa//audio//Spring.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 } 
   public void explodeSummer() {
   File sound = new File("C://programa//audio//Summer.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }
  public void explodeWinter() {
   File sound = new File("C://programa//audio//Winter.wav");
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
                new quiz1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasQ;
    private javax.swing.JButton btnAudioSpring;
    private javax.swing.JButton btnAudioSummer;
    private javax.swing.JButton btnAudioWinter;
    private javax.swing.JButton btnFinishQ;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrIncorrecto11;
    private javax.swing.JRadioButton jrIncorrecto12;
    private javax.swing.JRadioButton jrIncorrecto13;
    private javax.swing.JRadioButton jrIncorrecto21;
    private javax.swing.JRadioButton jrIncorrecto22;
    private javax.swing.JRadioButton jrIncorrecto23;
    private javax.swing.JRadioButton jrSummer;
    private javax.swing.JRadioButton jrWinter;
    private javax.swing.JTextField txtSpring;
    private javax.swing.JTextField txtSummer;
    private javax.swing.JTextField txtWinter;
    // End of variables declaration//GEN-END:variables
}
