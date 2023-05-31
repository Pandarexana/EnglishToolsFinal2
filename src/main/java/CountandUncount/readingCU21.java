package CountandUncount;

import PartPlants.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class readingCU21 extends javax.swing.JFrame {
    
    Icon check;  
    Icon smile;
    
        
    public readingCU21() {
        initComponents();
        this.setExtendedState(readingCU21.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        truePotato.setVisible(false);
        falsePotato.setVisible(false);
        TrueTomato.setVisible(false);
        falseTomato.setVisible(false);
        trueMeat.setVisible(false);
        falseMeat.setVisible(false);
        trueBanana.setVisible(false);
        falseBanana.setVisible(false);
      
        check = new ImageIcon("C://programa//imagenes//Check.png");
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
        jLabel4 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        txtPotato = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTomato = new javax.swing.JTextField();
        txtMeat = new javax.swing.JTextField();
        falseTomato = new javax.swing.JLabel();
        TrueTomato = new javax.swing.JLabel();
        trueMeat = new javax.swing.JLabel();
        falseMeat = new javax.swing.JLabel();
        truePotato = new javax.swing.JLabel();
        falsePotato = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBanana = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        trueBanana = new javax.swing.JLabel();
        falseBanana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Countable and uncountable nouns - Reading 2");
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
        jLabel2.setText("How many are there?");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eating Healthy/imagenes pequenas/potato.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        btnCheck.setBackground(new java.awt.Color(255, 102, 102));
        btnCheck.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnCheck.setText("Finish");
        btnCheck.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        txtPotato.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtPotato.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eating Healthy/imagenes pequenas/meat.png"))); // NOI18N
        jLabel5.setText("jLabel4");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eating Healthy/imagenes pequenas/tomato.png"))); // NOI18N
        jLabel7.setText("jLabel4");

        txtTomato.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtTomato.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMeat.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtMeat.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        falseTomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseTomato.setText("jLabel3");
        falseTomato.setMaximumSize(new java.awt.Dimension(50, 50));
        falseTomato.setMinimumSize(new java.awt.Dimension(50, 50));
        falseTomato.setPreferredSize(new java.awt.Dimension(50, 50));

        TrueTomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        TrueTomato.setText("jLabel3");
        TrueTomato.setMaximumSize(new java.awt.Dimension(50, 50));
        TrueTomato.setMinimumSize(new java.awt.Dimension(50, 50));
        TrueTomato.setPreferredSize(new java.awt.Dimension(50, 50));

        trueMeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueMeat.setText("jLabel3");
        trueMeat.setMaximumSize(new java.awt.Dimension(50, 50));
        trueMeat.setMinimumSize(new java.awt.Dimension(50, 50));
        trueMeat.setPreferredSize(new java.awt.Dimension(50, 50));

        falseMeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseMeat.setText("jLabel3");
        falseMeat.setMaximumSize(new java.awt.Dimension(50, 50));
        falseMeat.setMinimumSize(new java.awt.Dimension(50, 50));
        falseMeat.setPreferredSize(new java.awt.Dimension(50, 50));

        truePotato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        truePotato.setText("jLabel3");
        truePotato.setMaximumSize(new java.awt.Dimension(50, 50));
        truePotato.setMinimumSize(new java.awt.Dimension(50, 50));
        truePotato.setPreferredSize(new java.awt.Dimension(50, 50));

        falsePotato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falsePotato.setText("jLabel3");
        falsePotato.setMaximumSize(new java.awt.Dimension(50, 50));
        falsePotato.setMinimumSize(new java.awt.Dimension(50, 50));
        falsePotato.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eating Healthy/imagenes pequenas/banana.png"))); // NOI18N
        jLabel6.setText("jLabel4");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setText("There are");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel8.setText("potatoes.");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel9.setText("There are");

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel10.setText("tomatoes.");

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel11.setText("There is");

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel12.setText("meat.");

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel13.setText("There is");

        txtBanana.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtBanana.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel14.setText("banana.");

        trueBanana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueBanana.setText("jLabel3");
        trueBanana.setMaximumSize(new java.awt.Dimension(50, 50));
        trueBanana.setMinimumSize(new java.awt.Dimension(50, 50));
        trueBanana.setPreferredSize(new java.awt.Dimension(50, 50));

        falseBanana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseBanana.setText("jLabel3");
        falseBanana.setMaximumSize(new java.awt.Dimension(50, 50));
        falseBanana.setMinimumSize(new java.awt.Dimension(50, 50));
        falseBanana.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(510, 510, 510)
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(txtTomato, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TrueTomato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(falseTomato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPotato, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(70, 70, 70)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(truePotato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(falsePotato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBanana, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trueBanana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseBanana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMeat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addGap(39, 39, 39)
                                        .addComponent(trueMeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseMeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPotato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(falsePotato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(truePotato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(trueMeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(falseMeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtMeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TrueTomato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(falseTomato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBanana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(trueBanana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(falseBanana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtTomato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        readingCU2 ventanaListening = new readingCU2();
        ventanaListening.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        String l = txtPotato.getText().toString();
        String l2 = txtMeat.getText().toString();
        String l3 = txtBanana.getText().toString();
        String l4 = txtTomato.getText().toString();
        
        
        
        //Condicionales para mostrar los check o cross
        if(l.equalsIgnoreCase("9")){
            truePotato.setVisible(true);
            falsePotato.setVisible(false);
            txtPotato.setEnabled(false);
            
        }else {
            falsePotato.setVisible(true);
            truePotato.setVisible(false);
        }
        if(l2.equalsIgnoreCase("1")){
            trueMeat.setVisible(true);
            falseMeat.setVisible(false);
            txtMeat.setEnabled(false);
            
        }else {
            falseMeat.setVisible(true);
            trueMeat.setVisible(false);
        }
       
        if(l3.equalsIgnoreCase("1")){
            trueBanana.setVisible(true);
            falseBanana.setVisible(false);
            txtBanana.setEnabled(false);
            
        }else {
            falseBanana.setVisible(true);
            trueBanana.setVisible(false);
        }
        
        if(l4.equalsIgnoreCase("3")){
            TrueTomato.setVisible(true);
            falseTomato.setVisible(false);
            txtTomato.setEnabled(false);
            
        }else {
            falseTomato.setVisible(true);
            TrueTomato.setVisible(false);
        }
        
        if ( l.equalsIgnoreCase("9") && l2.equalsIgnoreCase("1") && l3.equalsIgnoreCase("1") &&
                l4.equalsIgnoreCase("3")){
           
           explodecorrecto();
           JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
           explodefin();
           JOptionPane.showMessageDialog(null, "Reading 2 completed!", "", HEIGHT, smile);
           listeningCU ventanaListening = new listeningCU();
           ventanaListening.setVisible(true);
           this.dispose();
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
                new readingCU21().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TrueTomato;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCheck;
    private javax.swing.JLabel falseBanana;
    private javax.swing.JLabel falseMeat;
    private javax.swing.JLabel falsePotato;
    private javax.swing.JLabel falseTomato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel trueBanana;
    private javax.swing.JLabel trueMeat;
    private javax.swing.JLabel truePotato;
    private javax.swing.JTextField txtBanana;
    private javax.swing.JTextField txtMeat;
    private javax.swing.JTextField txtPotato;
    private javax.swing.JTextField txtTomato;
    // End of variables declaration//GEN-END:variables
}
