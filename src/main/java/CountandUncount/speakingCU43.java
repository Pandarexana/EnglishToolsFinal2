package CountandUncount;

import MiCity.*;
import seasons.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Pandarexana
 */
public class speakingCU43 extends javax.swing.JFrame implements ActionListener  {
   
    Icon speaking;
    
    public speakingCU43() {
        initComponents();
        this.setExtendedState(listening.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        lbCorrectoFalls.setVisible(false);
        
        speaking = new ImageIcon("C://programa//imagenes//speaking.png");
        
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
        jLabel4 = new javax.swing.JLabel();
        btnRepetir = new javax.swing.JButton();
        btnNextFalls = new javax.swing.JButton();
        lbCorrectoFalls = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Countable and uncountable nouns - Speaking 4");
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
        jLabel1.setText("Speaking");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel2.setText("Listening and repeat.");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clean");

        btnRepetir.setBackground(new java.awt.Color(253, 253, 105));
        btnRepetir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microphone.png"))); // NOI18N
        btnRepetir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnRepetir.setFocusPainted(false);
        btnRepetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepetirActionPerformed(evt);
            }
        });

        btnNextFalls.setBackground(new java.awt.Color(255, 102, 102));
        btnNextFalls.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnNextFalls.setText("Next");
        btnNextFalls.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnNextFalls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextFallsActionPerformed(evt);
            }
        });

        lbCorrectoFalls.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
        lbCorrectoFalls.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCorrectoFalls.setText("Correct!");

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eating Healthy/clean.jpg"))); // NOI18N
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(619, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCorrectoFalls)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnRepetir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(629, 629, 629))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(662, 662, 662)
                .addComponent(btnNextFalls, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(518, 518, 518)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)))
                .addGap(24, 24, 24)
                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRepetir)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbCorrectoFalls, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNextFalls, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        speakingCU42 ventanaListening = new speakingCU42();
        ventanaListening.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnNextFallsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextFallsActionPerformed
        explodefin();
        JOptionPane.showMessageDialog(null, "Speaking 4 completed!", "", HEIGHT, speaking);
        listeningCU  v = new listeningCU ();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNextFallsActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        
        explode();
        
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnRepetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepetirActionPerformed

    }//GEN-LAST:event_btnRepetirActionPerformed

 
    
   public void explode() {
   File sound = new File("C://programa//audio//clean.wav");
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
   
    public static void main(String args[])  {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new speakingCU43().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnNextFalls;
    private javax.swing.JButton btnRepetir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCorrectoFalls;
    // End of variables declaration//GEN-END:variables


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
