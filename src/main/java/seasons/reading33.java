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

public class reading33 extends javax.swing.JFrame {
    
    Icon check;
    Icon error;

    public reading33() {
        initComponents();
        this.setExtendedState(listeningW.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);

        //Ocultar los check y cross de todas la variables
        trueFall.setVisible(false);
        falseFall.setVisible(false);  
        
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
        jLabel4 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFall = new javax.swing.JTextField();
        txtFall1 = new javax.swing.JTextField();
        falseFall = new javax.swing.JLabel();
        trueFall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Seasons - Reading 3");
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
        jLabel2.setText("Complete");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otoño.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        btnCheck.setBackground(new java.awt.Color(255, 102, 102));
        btnCheck.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnCheck.setText("Check");
        btnCheck.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("F");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("L");

        txtFall.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        txtFall.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFall1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        txtFall1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        falseFall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseFall.setText("jLabel3");
        falseFall.setMaximumSize(new java.awt.Dimension(50, 50));
        falseFall.setMinimumSize(new java.awt.Dimension(50, 50));
        falseFall.setPreferredSize(new java.awt.Dimension(50, 50));

        trueFall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueFall.setText("jLabel3");
        trueFall.setMaximumSize(new java.awt.Dimension(50, 50));
        trueFall.setMinimumSize(new java.awt.Dimension(50, 50));
        trueFall.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFall, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFall1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(trueFall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(falseFall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(437, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFall, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFall1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(falseFall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trueFall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(203, Short.MAX_VALUE))
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
        reading32   x = new reading32();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        //Variables de los Combo box
        String w = txtFall.getText().toString();
        String w1 = txtFall1.getText().toString();

        //Condicionales para mostrar los check o cross
        if(w.equalsIgnoreCase("A")&& w1.equalsIgnoreCase("L")){
            trueFall.setVisible(true);
            falseFall.setVisible(false);
            explodecorrecto();
            JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
            reading34 x = new reading34();
            x.setVisible(true);
            this.dispose();          
        }else {
            falseFall.setVisible(true);
            trueFall.setVisible(false);
            explodeincorrecto();
            JOptionPane.showMessageDialog(null, error, "", JOptionPane.DEFAULT_OPTION);
            txtFall.setText("");
            txtFall1.setText("");
            falseFall.setVisible(false);       
        }   
    }//GEN-LAST:event_btnCheckActionPerformed

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
                new reading33().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCheck;
    private javax.swing.JLabel falseFall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel trueFall;
    private javax.swing.JTextField txtFall;
    private javax.swing.JTextField txtFall1;
    // End of variables declaration//GEN-END:variables
}
