package math;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class quizMT12 extends javax.swing.JFrame {
    
     public  static int i = 0;  
     int ci,ci1,ci2,ci3 = 0;
     public static int p = 0;
     int d = quizMT1.y;
     
    Icon smile;
    Icon iquiz;
    public quizMT12() {
        initComponents();
        this.setExtendedState(quizMT12.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        
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
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCheckME = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cbHP = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cbQT = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cbHH = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cbOC = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math - Quiz");
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
        jLabel1.setText("Quiz");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel2.setText("2. Select the correct option. ");

        btnCheckME.setBackground(new java.awt.Color(255, 102, 102));
        btnCheckME.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnCheckME.setText("Finish");
        btnCheckME.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnCheckME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckMEActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/imagenes pequeñas/half past.png"))); // NOI18N
        jLabel15.setText("jLabel3");

        cbHP.setBackground(new java.awt.Color(153, 255, 153));
        cbHP.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbHP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O Clock", "Half Past", "Quarter Past", "Quarter To" }));
        cbHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHPActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/imagenes pequeñas/quarter to.png"))); // NOI18N
        jLabel16.setText("jLabel3");

        cbQT.setBackground(new java.awt.Color(153, 255, 153));
        cbQT.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbQT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quarter Past", "O Clock", "Half Past", "Quarter To" }));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/imagenes pequeñas/hour hand.png"))); // NOI18N
        jLabel17.setText("jLabel3");

        cbHH.setBackground(new java.awt.Color(153, 255, 153));
        cbHH.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbHH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quarter Past", "Hour Hand", "Minute Hand", "O Clock" }));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple Present Tense/imagenes pequeñas/o clock.png"))); // NOI18N
        jLabel18.setText("jLabel3");

        cbOC.setBackground(new java.awt.Color(153, 255, 153));
        cbOC.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbOC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour Hand", "Quarter Past", "Minute Hand", "O Clock" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1008, 1008, 1008)
                            .addComponent(btnCheckME, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbQT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(364, 364, 364)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(482, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbQT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckME, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
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

    private void btnCheckMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckMEActionPerformed
            quizMT1 k = new quizMT1();
            k.selectD();
            k.selectDC();
            k.selectMNt();
            resultadoHH();
            resultadoHP();
            resultadoOC();
            resultadoQT();
            
            i= ci+ci1+ci2+ci3;
            p= i + d;
            
            ingresoMT we = new ingresoMT();
            we.setVisible(true);
            this.dispose();
           
    }//GEN-LAST:event_btnCheckMEActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        quizMT1 ventanaListening = new quizMT1();
        ventanaListening.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void cbHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHPActionPerformed

    
    public void resultadoHP(){
        String T = cbHP.getSelectedItem().toString();
        if(T.equalsIgnoreCase("Half Past")){
               cbHP.setEnabled(false);
               ci++;   
                if (ci > 1){
                ci--;
                }else if (ci <= 0){
             
                }
    }}
    
    
    public void resultadoQT(){
        String B = cbQT.getSelectedItem().toString();
        if(B.equalsIgnoreCase("Quarter to")){
               cbQT.setEnabled(false);
               ci1++;   
                if (ci1 > 1){
                ci1--;
                }else if (ci1 <= 0){
             
         }   
           } 
    }
    
    public void resultadoHH(){
        String O = cbHH.getSelectedItem().toString();
        if(O.equalsIgnoreCase("Hour hand")){
               cbHH.setEnabled(false);
               ci2++;   
                if (ci2 > 1){
                ci2--;
                }else if (ci2 <= 0){
           }    
    }}
    
    public void resultadoOC(){
         String H = cbOC.getSelectedItem().toString();
           if(H.equalsIgnoreCase("O Clock")){
               cbOC.setEnabled(false);
               ci3++;   
                if (ci3 > 1){
                ci3--;
                }else if (ci3 <= 0){
           } 
    }}
    
    
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
    
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quizMT12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCheckME;
    private javax.swing.JComboBox<String> cbHH;
    private javax.swing.JComboBox<String> cbHP;
    private javax.swing.JComboBox<String> cbOC;
    private javax.swing.JComboBox<String> cbQT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
