package MiCity;

import PartPlants.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class readingMC31 extends javax.swing.JFrame {
    
    Icon check;
    Icon smile;
    
        
    public readingMC31() {
        initComponents();
        this.setExtendedState(readingMC31.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        trueSchool.setVisible(false);
        falseSchool.setVisible(false);
        TrueLibrary.setVisible(false);
        falseLibrary.setVisible(false);
        falseChurch1.setVisible(false);
        trueHospital.setVisible(false);
        falseHospital.setVisible(false);
        trueBusStation.setVisible(false);
        falseBusStation.setVisible(false);
      
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
        txtSchool = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLibrary = new javax.swing.JTextField();
        txtHospital = new javax.swing.JTextField();
        falseChurch1 = new javax.swing.JLabel();
        TrueLibrary = new javax.swing.JLabel();
        trueHospital = new javax.swing.JLabel();
        falseHospital = new javax.swing.JLabel();
        trueSchool = new javax.swing.JLabel();
        falseSchool = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBusStation = new javax.swing.JTextField();
        trueBusStation = new javax.swing.JLabel();
        falseBusStation = new javax.swing.JLabel();
        falseLibrary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prepositions of Place - Reading 3");
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
        jLabel2.setText("Write the places");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City/Imagenes pequenas/school.png"))); // NOI18N
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

        txtSchool.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtSchool.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City/Imagenes pequenas/hospital.png"))); // NOI18N
        jLabel5.setText("jLabel4");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City/Imagenes pequenas/library.png"))); // NOI18N
        jLabel7.setText("jLabel4");

        txtLibrary.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtLibrary.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtHospital.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtHospital.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        falseChurch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseChurch1.setText("jLabel3");
        falseChurch1.setMaximumSize(new java.awt.Dimension(50, 50));
        falseChurch1.setMinimumSize(new java.awt.Dimension(50, 50));
        falseChurch1.setPreferredSize(new java.awt.Dimension(50, 50));

        TrueLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        TrueLibrary.setText("jLabel3");
        TrueLibrary.setMaximumSize(new java.awt.Dimension(50, 50));
        TrueLibrary.setMinimumSize(new java.awt.Dimension(50, 50));
        TrueLibrary.setPreferredSize(new java.awt.Dimension(50, 50));

        trueHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueHospital.setText("jLabel3");
        trueHospital.setMaximumSize(new java.awt.Dimension(50, 50));
        trueHospital.setMinimumSize(new java.awt.Dimension(50, 50));
        trueHospital.setPreferredSize(new java.awt.Dimension(50, 50));

        falseHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseHospital.setText("jLabel3");
        falseHospital.setMaximumSize(new java.awt.Dimension(50, 50));
        falseHospital.setMinimumSize(new java.awt.Dimension(50, 50));
        falseHospital.setPreferredSize(new java.awt.Dimension(50, 50));

        trueSchool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueSchool.setText("jLabel3");
        trueSchool.setMaximumSize(new java.awt.Dimension(50, 50));
        trueSchool.setMinimumSize(new java.awt.Dimension(50, 50));
        trueSchool.setPreferredSize(new java.awt.Dimension(50, 50));

        falseSchool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseSchool.setText("jLabel3");
        falseSchool.setMaximumSize(new java.awt.Dimension(50, 50));
        falseSchool.setMinimumSize(new java.awt.Dimension(50, 50));
        falseSchool.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City/Imagenes pequenas/bus station.png"))); // NOI18N
        jLabel6.setText("jLabel4");

        txtBusStation.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        txtBusStation.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        trueBusStation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueBusStation.setText("jLabel3");
        trueBusStation.setMaximumSize(new java.awt.Dimension(50, 50));
        trueBusStation.setMinimumSize(new java.awt.Dimension(50, 50));
        trueBusStation.setPreferredSize(new java.awt.Dimension(50, 50));

        falseBusStation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseBusStation.setText("jLabel3");
        falseBusStation.setMaximumSize(new java.awt.Dimension(50, 50));
        falseBusStation.setMinimumSize(new java.awt.Dimension(50, 50));
        falseBusStation.setPreferredSize(new java.awt.Dimension(50, 50));

        falseLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseLibrary.setText("jLabel3");
        falseLibrary.setMaximumSize(new java.awt.Dimension(50, 50));
        falseLibrary.setMinimumSize(new java.awt.Dimension(50, 50));
        falseLibrary.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(trueHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(157, 157, 157)
                                        .addComponent(txtLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(156, 156, 156)
                                        .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBusStation, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(472, 472, 472)
                                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(trueSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TrueLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)
                                        .addComponent(falseChurch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(trueBusStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(falseBusStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(trueSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(falseSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TrueLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(falseChurch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trueHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(falseHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trueBusStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(falseBusStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(falseLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        readingMC3 ventanaListening = new readingMC3();
        ventanaListening.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        String l = txtSchool.getText().toString();
        String l2 = txtHospital.getText().toString();
        String l4 = txtLibrary.getText().toString();
        String l3 = txtBusStation.getText().toString();
        
        
        
        //Condicionales para mostrar los check o cross
        if(l.equalsIgnoreCase("School")){
            trueSchool.setVisible(true);
            falseSchool.setVisible(false);
            txtSchool.setEnabled(false);
            
        }else {
            falseSchool.setVisible(true);
            trueSchool.setVisible(false);
        }
        if(l2.equalsIgnoreCase("Hospital")){
            trueHospital.setVisible(true);
            falseHospital.setVisible(false);
            txtHospital.setEnabled(false);
            
        }else {
            falseHospital.setVisible(true);
            trueHospital.setVisible(false);
        }
       
        if(l4.equalsIgnoreCase("Library")){
            TrueLibrary.setVisible(true);
            falseLibrary.setVisible(false);
            txtLibrary.setEnabled(false);
            
        }else {
            falseLibrary.setVisible(true);
            TrueLibrary.setVisible(false);
        }
        if(l3.equalsIgnoreCase("Bus Station")){
            trueBusStation.setVisible(true);
            falseBusStation.setVisible(false);
            txtBusStation.setEnabled(false);
            
        }else {
            falseBusStation.setVisible(true);
            trueBusStation.setVisible(false);
        }
        
        
        if ( l.equalsIgnoreCase("School") && l2.equalsIgnoreCase("Hospital") && l4.equalsIgnoreCase("Library")
                && l3.equalsIgnoreCase("Bus Station")){
           
          explodecorrecto();
           JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
           explodefin();
           JOptionPane.showMessageDialog(null, "Reading 3 completed!", "", HEIGHT, smile);
           listeningMC ventanaListening = new listeningMC();
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
                new readingMC31().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TrueLibrary;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCheck;
    private javax.swing.JLabel falseBusStation;
    private javax.swing.JLabel falseChurch1;
    private javax.swing.JLabel falseHospital;
    private javax.swing.JLabel falseLibrary;
    private javax.swing.JLabel falseSchool;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel trueBusStation;
    private javax.swing.JLabel trueHospital;
    private javax.swing.JLabel trueSchool;
    private javax.swing.JTextField txtBusStation;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtLibrary;
    private javax.swing.JTextField txtSchool;
    // End of variables declaration//GEN-END:variables
}
