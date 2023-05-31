package PartPlants;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class readingPP extends javax.swing.JFrame {

    Icon check;
    Icon error;
    Icon smile;  
    
    

    
        
    public readingPP() {
        initComponents();
        this.setExtendedState(readingPP.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        trueFlower.setVisible(false);
        falseFlower.setVisible(false);
        TrueRoot.setVisible(false);
        falseRoot.setVisible(false);
        trueFruit.setVisible(false);
        falseFruit.setVisible(false);
        trueLeaf.setVisible(false);
        falseLeaf.setVisible(false);
        trueStem.setVisible(false);
        falseStem.setVisible(false);
        
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
        jLabel4 = new javax.swing.JLabel();
        cbLeaf = new javax.swing.JComboBox<>();
        cbFruit = new javax.swing.JComboBox<>();
        cbFlower = new javax.swing.JComboBox<>();
        cbStem = new javax.swing.JComboBox<>();
        trueLeaf = new javax.swing.JLabel();
        falseLeaf = new javax.swing.JLabel();
        trueFruit = new javax.swing.JLabel();
        falseFruit = new javax.swing.JLabel();
        trueFlower = new javax.swing.JLabel();
        falseFlower = new javax.swing.JLabel();
        falseStem = new javax.swing.JLabel();
        trueStem = new javax.swing.JLabel();
        falseRoot = new javax.swing.JLabel();
        TrueRoot = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        cbRoot = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parts of the plants - Reading");
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
        jLabel2.setText("Select the correct option");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parts of plants/planta1.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        cbLeaf.setBackground(new java.awt.Color(153, 255, 153));
        cbLeaf.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        cbLeaf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flower", "Leaf", "Fruit", "Stem", "Root" }));

        cbFruit.setBackground(new java.awt.Color(153, 255, 153));
        cbFruit.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        cbFruit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leaf", "Fruit", "Stem", "Root", "Flower" }));

        cbFlower.setBackground(new java.awt.Color(153, 255, 153));
        cbFlower.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        cbFlower.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leaf", "Fruit", "Stem", "Root", "Flower" }));

        cbStem.setBackground(new java.awt.Color(153, 255, 153));
        cbStem.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        cbStem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Root", "Flower", "Leaf", "Fruit", "Stem", " " }));

        trueLeaf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueLeaf.setText("jLabel3");
        trueLeaf.setMaximumSize(new java.awt.Dimension(50, 50));
        trueLeaf.setMinimumSize(new java.awt.Dimension(50, 50));
        trueLeaf.setPreferredSize(new java.awt.Dimension(50, 50));

        trueFruit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueFruit.setText("jLabel3");
        trueFruit.setMaximumSize(new java.awt.Dimension(50, 50));
        trueFruit.setMinimumSize(new java.awt.Dimension(50, 50));
        trueFruit.setPreferredSize(new java.awt.Dimension(50, 50));

        falseFruit.setToolTipText("");

        trueFlower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueFlower.setText("jLabel3");
        trueFlower.setMaximumSize(new java.awt.Dimension(50, 50));
        trueFlower.setMinimumSize(new java.awt.Dimension(50, 50));
        trueFlower.setPreferredSize(new java.awt.Dimension(50, 50));

        falseFlower.setMaximumSize(new java.awt.Dimension(7, 16));

        trueStem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueStem.setText("jLabel3");
        trueStem.setMaximumSize(new java.awt.Dimension(50, 50));
        trueStem.setMinimumSize(new java.awt.Dimension(50, 50));
        trueStem.setPreferredSize(new java.awt.Dimension(50, 50));

        TrueRoot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        TrueRoot.setText("jLabel3");
        TrueRoot.setMaximumSize(new java.awt.Dimension(50, 50));
        TrueRoot.setMinimumSize(new java.awt.Dimension(50, 50));
        TrueRoot.setPreferredSize(new java.awt.Dimension(50, 50));

        btnCheck.setBackground(new java.awt.Color(255, 102, 102));
        btnCheck.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnCheck.setText("Check");
        btnCheck.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        cbRoot.setBackground(new java.awt.Color(153, 255, 153));
        cbRoot.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        cbRoot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flower", "Root", "Stem", "Leaf", "Fruit", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(falseFruit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trueFruit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFruit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(falseLeaf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trueLeaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbLeaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trueFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(falseFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbStem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trueStem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(falseStem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TrueRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(falseRoot)))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(474, 474, 474)
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbLeaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trueLeaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(falseLeaf))
                                .addGap(111, 111, 111)
                                .addComponent(falseFruit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbFruit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trueFruit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trueFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(149, 149, 149)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbStem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(trueStem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(falseStem))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(falseRoot)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TrueRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(falseFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        listeningPP ventanaListening = new listeningPP();
        ventanaListening.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        String l1 = cbFlower.getSelectedItem().toString();
        String l2 = cbFruit.getSelectedItem().toString();
        String l3 = cbLeaf.getSelectedItem().toString();
        String l4 = cbRoot.getSelectedItem().toString();
        String l5 = cbStem.getSelectedItem().toString();
        
        //Condicionales para mostrar los check o cross
        if(l1.equals("Flower")){
            trueFlower.setVisible(true);
            falseFlower.setVisible(false);
            cbFlower.setEnabled(false);
            
        }else if(l1.equals("Fruit")|| l1.equals("Leaf") ||l1.equals("Root")||l1.equals("Stem") ){
            falseFlower.setVisible(true);
            trueFlower.setVisible(false);
        }
        if(l2.equals("Fruit")){
            trueFruit.setVisible(true);
            falseFruit.setVisible(false);
            cbFruit.setEnabled(false);
            
        }else if(l2.equals("Flowert")|| l2.equals("Leaf") ||l2.equals("Root")||l2.equals("Stem") ){
            falseFruit.setVisible(true);
            trueFruit.setVisible(false);
        }
        if(l3.equals("Leaf")){
            trueLeaf.setVisible(true);
            falseLeaf.setVisible(false);
            cbLeaf.setEnabled(false);
            
        }else if(l3.equals("Fruit")|| l3.equals("Flower") ||l3.equals("Root")||l3.equals("Stem") ){
            falseLeaf.setVisible(true);
            trueLeaf.setVisible(false);
        }
        if(l4.equals("Root")){
            TrueRoot.setVisible(true);
            falseRoot.setVisible(false);
            cbRoot.setEnabled(false);
            
        }else if(l4.equals("Fruit")|| l4.equals("Leaf") ||l4.equals("Flower")||l4.equals("Stem") ){
            falseRoot.setVisible(true);
            TrueRoot.setVisible(false);
        }
        if(l5.equals("Stem")){
            trueStem.setVisible(true);
            falseStem.setVisible(false);
            cbStem.setEnabled(false);
            
        }else if(l5.equals("Fruit")|| l5.equals("Leaf") ||l5.equals("Root")||l5.equals("Flower") ){
            falseStem.setVisible(true);
            trueStem.setVisible(false);
        }
        
        if ( l1.equals("Flower") && l2.equals("Fruit") && l3.equals("Leaf") && l4.equals("Root") && l5.equals("Stem")){
           
           explodecorrecto();
           JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
           
           explodefin();
           JOptionPane.showMessageDialog(null, "Reading completed!", "", HEIGHT, smile);;
           listeningPP ventanaListening = new listeningPP();
           ventanaListening.setVisible(true);
           
           this.dispose();
        }
    }//GEN-LAST:event_btnCheckActionPerformed

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
                new readingPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TrueRoot;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCheck;
    private javax.swing.JComboBox<String> cbFlower;
    private javax.swing.JComboBox<String> cbFruit;
    private javax.swing.JComboBox<String> cbLeaf;
    private javax.swing.JComboBox<String> cbRoot;
    private javax.swing.JComboBox<String> cbStem;
    private javax.swing.JLabel falseFlower;
    private javax.swing.JLabel falseFruit;
    private javax.swing.JLabel falseLeaf;
    private javax.swing.JLabel falseRoot;
    private javax.swing.JLabel falseStem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel trueFlower;
    private javax.swing.JLabel trueFruit;
    private javax.swing.JLabel trueLeaf;
    private javax.swing.JLabel trueStem;
    // End of variables declaration//GEN-END:variables
}
