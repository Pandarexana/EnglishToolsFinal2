package weather;


import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class readingW1 extends javax.swing.JFrame {
    
    Icon check;
    Icon error;

    public readingW1() {
        initComponents();
        this.setExtendedState(listeningW.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        //Ocultar los check y cross de todas la variables
        trueCloudy.setVisible(false);
        falseCloudy.setVisible(false);
        
        trueSnowy.setVisible(false);
        falseSnowy.setVisible(false);
        
        trueFoggy.setVisible(false);
        falseFoggy.setVisible(false);
        
        trueRainy.setVisible(false);
        falseRainy.setVisible(false);
        
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
        cbCloudy = new javax.swing.JComboBox<>();
        cbFoggy = new javax.swing.JComboBox<>();
        cbSnowy = new javax.swing.JComboBox<>();
        cbRainy = new javax.swing.JComboBox<>();
        trueCloudy = new javax.swing.JLabel();
        falseCloudy = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        trueFoggy = new javax.swing.JLabel();
        falseFoggy = new javax.swing.JLabel();
        trueSnowy = new javax.swing.JLabel();
        falseSnowy = new javax.swing.JLabel();
        falseRainy = new javax.swing.JLabel();
        trueRainy = new javax.swing.JLabel();
        btnCloudy = new javax.swing.JButton();
        btnFoggy = new javax.swing.JButton();
        btnSnowy = new javax.swing.JButton();
        btnRainy = new javax.swing.JButton();

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

        cbCloudy.setBackground(new java.awt.Color(153, 255, 153));
        cbCloudy.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbCloudy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hot", "Cloudy", "Snowy", "Sunny" }));

        cbFoggy.setBackground(new java.awt.Color(153, 255, 153));
        cbFoggy.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbFoggy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cold", "Cloudy", "Foggy", "Sunny" }));
        cbFoggy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFoggyActionPerformed(evt);
            }
        });

        cbSnowy.setBackground(new java.awt.Color(153, 255, 153));
        cbSnowy.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbSnowy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hot", "Cloudy", "Snowy", "Sunny" }));

        cbRainy.setBackground(new java.awt.Color(153, 255, 153));
        cbRainy.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cbRainy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hot", "Cloudy", "Snowy", "Rainy" }));

        trueCloudy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueCloudy.setText("jLabel3");
        trueCloudy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueCloudy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueCloudy.setPreferredSize(new java.awt.Dimension(50, 50));

        falseCloudy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N

        btnCheck.setBackground(new java.awt.Color(255, 102, 102));
        btnCheck.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnCheck.setText("Check");
        btnCheck.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        trueFoggy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueFoggy.setText("jLabel3");
        trueFoggy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueFoggy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueFoggy.setPreferredSize(new java.awt.Dimension(50, 50));

        falseFoggy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseFoggy.setText("jLabel3");
        falseFoggy.setMaximumSize(new java.awt.Dimension(50, 50));
        falseFoggy.setMinimumSize(new java.awt.Dimension(50, 50));
        falseFoggy.setPreferredSize(new java.awt.Dimension(50, 50));

        trueSnowy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueSnowy.setText("jLabel3");
        trueSnowy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueSnowy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueSnowy.setPreferredSize(new java.awt.Dimension(50, 50));

        falseSnowy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseSnowy.setText("jLabel3");
        falseSnowy.setMaximumSize(new java.awt.Dimension(50, 50));
        falseSnowy.setMinimumSize(new java.awt.Dimension(50, 50));
        falseSnowy.setPreferredSize(new java.awt.Dimension(50, 50));

        falseRainy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/false (1).png"))); // NOI18N
        falseRainy.setText("jLabel3");
        falseRainy.setMaximumSize(new java.awt.Dimension(50, 50));
        falseRainy.setMinimumSize(new java.awt.Dimension(50, 50));
        falseRainy.setPreferredSize(new java.awt.Dimension(50, 50));

        trueRainy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueRainy.setText("jLabel3");
        trueRainy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueRainy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueRainy.setPreferredSize(new java.awt.Dimension(50, 50));

        btnCloudy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/cloudy.png"))); // NOI18N
        btnCloudy.setText("jButton1");
        btnCloudy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloudyActionPerformed(evt);
            }
        });

        btnFoggy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/foggy.jpg"))); // NOI18N
        btnFoggy.setText("jButton1");
        btnFoggy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoggyActionPerformed(evt);
            }
        });

        btnSnowy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/snowy.png"))); // NOI18N
        btnSnowy.setText("jButton1");
        btnSnowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnowyActionPerformed(evt);
            }
        });

        btnRainy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/rainy.png"))); // NOI18N
        btnRainy.setText("jButton1");
        btnRainy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRainyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCloudy, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFoggy, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbCloudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trueCloudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseCloudy))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbFoggy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trueFoggy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseFoggy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRainy, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trueSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbRainy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trueRainy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(falseRainy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(277, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(616, 616, 616)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trueSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(falseSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCloudy, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbCloudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(trueCloudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnFoggy, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbFoggy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(trueFoggy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(falseFoggy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnRainy, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbRainy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(trueRainy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(falseRainy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(falseCloudy)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
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
        listeningW ventanaListening = new listeningW();
        ventanaListening.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        //Variables de los Combo box
        String l1 = cbCloudy.getSelectedItem().toString();
        String l2 = cbSnowy.getSelectedItem().toString();
        String l3 = cbFoggy.getSelectedItem().toString();
        String l4 = cbRainy.getSelectedItem().toString();
        
        //Condicionales para mostrar los check o cross
        if(l1.equals("Cloudy")){
            trueCloudy.setVisible(true);
            falseCloudy.setVisible(false);
            cbCloudy.setEnabled(false);
            
        }else if(l1.equals("Hot")|| l1.equals("Snowy") ||l1.equals("Sunny") ){
            falseCloudy.setVisible(true);
            trueCloudy.setVisible(false);
        }
        
        if(l2.equals("Snowy")){
            trueSnowy.setVisible(true);
            falseSnowy.setVisible(false);
            cbSnowy.setEnabled(false);
            
        }else if(l2.equals("Hot")|| l2.equals("Cloudy") ||l2.equals("Sunny") ){
            falseSnowy.setVisible(true);
            trueSnowy.setVisible(false);
        }
        
        if(l3.equals("Foggy")){
            trueFoggy.setVisible(true);
            falseFoggy.setVisible(false);
            cbFoggy.setEnabled(false);
            
        }else if(l3.equals("Cold")|| l3.equals("Cloudy") ||l3.equals("Sunny") ){
            falseFoggy.setVisible(true);
            trueFoggy.setVisible(false);
        }
        
        if(l4.equals("Rainy")){
            trueRainy.setVisible(true);
            falseRainy.setVisible(false);
            cbRainy.setEnabled(false);
            
        }else if(l4.equals("Hot")|| l4.equals("Cloudy") ||l4.equals("Rainy") ){
            falseRainy.setVisible(true);
            trueRainy.setVisible(false);
        }
        
        // condicional de que todo esta correcto y termina la actividad       
        if (l1.equals("Cloudy")&& l2.equals("Snowy") && l3.equals("Foggy") && l4.equals("Rainy") ){
            explodecorrecto();
           JOptionPane.showMessageDialog(null, check, "", JOptionPane.DEFAULT_OPTION);
           
           reading1W1 w = new reading1W1();
           w.setVisible(true);
           this.dispose();
        }else {
            explodeincorrecto();
            JOptionPane.showMessageDialog(null, error, "", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnRainyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRainyActionPerformed
        explodeRainy();
    }//GEN-LAST:event_btnRainyActionPerformed

    private void cbFoggyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFoggyActionPerformed
        
    }//GEN-LAST:event_cbFoggyActionPerformed

    private void btnFoggyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoggyActionPerformed
        explodeFoggy();
    }//GEN-LAST:event_btnFoggyActionPerformed

    private void btnCloudyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloudyActionPerformed
        explodeCloudy();
    }//GEN-LAST:event_btnCloudyActionPerformed

    private void btnSnowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnowyActionPerformed
        explodeSnowy();
    }//GEN-LAST:event_btnSnowyActionPerformed

    public void explodeCloudy() {
   File sound = new File("C://programa//audio//Cloudy.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }
    public void explodeSnowy() {
   File sound = new File("C://programa//audio//Snowy.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }
    public void explodeFoggy() {
   File sound = new File("C://programa//audio//Foggy.wav");
   try {
     Clip clip = AudioSystem.getClip();
     clip.open(AudioSystem.getAudioInputStream(sound)); // open the specified clip
     clip.start(); // play it
   } catch (Exception e) {
     System.out.println(e);
   }
 }
    public void explodeRainy() {
   File sound = new File("C://programa//audio//Rainy.wav");
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
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new readingW1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnCloudy;
    private javax.swing.JButton btnFoggy;
    private javax.swing.JButton btnRainy;
    private javax.swing.JButton btnSnowy;
    private javax.swing.JComboBox<String> cbCloudy;
    private javax.swing.JComboBox<String> cbFoggy;
    private javax.swing.JComboBox<String> cbRainy;
    private javax.swing.JComboBox<String> cbSnowy;
    private javax.swing.JLabel falseCloudy;
    private javax.swing.JLabel falseFoggy;
    private javax.swing.JLabel falseRainy;
    private javax.swing.JLabel falseSnowy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel trueCloudy;
    private javax.swing.JLabel trueFoggy;
    private javax.swing.JLabel trueRainy;
    private javax.swing.JLabel trueSnowy;
    // End of variables declaration//GEN-END:variables
}
