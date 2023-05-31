package seasons;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import weather.*;
import javax.swing.JOptionPane;

public class reading1 extends javax.swing.JFrame {
    
    Icon check;
    Icon error;

    public reading1() {
        initComponents();
        this.setExtendedState(listeningW.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
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
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Invierno = new javax.swing.JLabel();
        btnImagenPrimavera = new javax.swing.JButton();
        btnImagenOtoño = new javax.swing.JButton();
        btnImagenInvierno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seasons - Reading");
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));

        btnAtras.setBackground(new java.awt.Color(255, 102, 102));
        btnAtras.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnAtras.setText("Back");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reading");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel2.setText("Read and select the requested image");

        Invierno.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        Invierno.setText("Winter");

        btnImagenPrimavera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/primavera.png"))); // NOI18N
        btnImagenPrimavera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenPrimaveraActionPerformed(evt);
            }
        });

        btnImagenOtoño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otoño.png"))); // NOI18N
        btnImagenOtoño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenOtoñoActionPerformed(evt);
            }
        });

        btnImagenInvierno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invierno.png"))); // NOI18N
        btnImagenInvierno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenInviernoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnImagenOtoño, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnImagenPrimavera, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnImagenInvierno, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(615, 615, 615)
                        .addComponent(Invierno, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Invierno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImagenInvierno, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImagenPrimavera, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImagenOtoño, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
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
        reading x = new reading();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnImagenPrimaveraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenPrimaveraActionPerformed
        explodeincorrecto();
        
        JOptionPane.showMessageDialog(null, error, "", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_btnImagenPrimaveraActionPerformed

    private void btnImagenInviernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenInviernoActionPerformed
        explodecorrecto();
        
        JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
        reading2 x = new reading2();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImagenInviernoActionPerformed

    private void btnImagenOtoñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenOtoñoActionPerformed
        explodeincorrecto();
        
        JOptionPane.showMessageDialog(null, error, "", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_btnImagenOtoñoActionPerformed

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
                new reading1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Invierno;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnImagenInvierno;
    private javax.swing.JButton btnImagenOtoño;
    private javax.swing.JButton btnImagenPrimavera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
