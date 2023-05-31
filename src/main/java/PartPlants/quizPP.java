package PartPlants;

import java.awt.Image;
import java.awt.Toolkit;
import weather.*;

public class quizPP extends javax.swing.JFrame {

 
    public  static int i = 0; 
    int ci,ci1,ci2,ci3,ci4 = 0;
   
    

    public quizPP() {
        initComponents();
        this.setExtendedState(listeningW.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        txtFlower.setEditable(false);
        txtFlower2.setEditable(false);
        txtFlower4.setEditable(false);
        txtFruit1.setEditable(false);
        txtFruit2.setEditable(false);
        txtStem.setEditable(false);
        txtStem1.setEditable(false);
        txtRoot.setEditable(false);
        txtLeaf2.setEditable(false);
        
        
        trueFruit.setVisible(false);
        trueLeaf.setVisible(false);
        trueRoot.setVisible(false);
        trueFlower.setVisible(false);
        trueStem.setVisible(false);
        
        
                
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
        jLabel16 = new javax.swing.JLabel();
        btnFinishQ = new javax.swing.JButton();
        btnAtrasQ = new javax.swing.JButton();
        txtFruit = new javax.swing.JTextField();
        txtFlower1 = new javax.swing.JTextField();
        txtFlower2 = new javax.swing.JTextField();
        txtFruit2 = new javax.swing.JTextField();
        txtFruit3 = new javax.swing.JTextField();
        txtFlower3 = new javax.swing.JTextField();
        txtFlower5 = new javax.swing.JTextField();
        txtRoot2 = new javax.swing.JTextField();
        txtFruit1 = new javax.swing.JTextField();
        txtStem = new javax.swing.JTextField();
        txtFlower4 = new javax.swing.JTextField();
        txtFlower = new javax.swing.JTextField();
        txtStem1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        trueFlower = new javax.swing.JLabel();
        txtLeaf1 = new javax.swing.JTextField();
        txtLeaf2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRoot1 = new javax.swing.JTextField();
        txtRoot = new javax.swing.JTextField();
        txtLeaf = new javax.swing.JTextField();
        trueFruit = new javax.swing.JLabel();
        trueLeaf = new javax.swing.JLabel();
        trueRoot = new javax.swing.JLabel();
        trueStem = new javax.swing.JLabel();
        txtStem2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parts of the plants - Quiz");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(1554, 820));

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("2. Complete the crossword puzzle");

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

        txtFruit.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFruit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFruit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFruitActionPerformed(evt);
            }
        });

        txtFlower1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFlower1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFlower1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtFlower2.setBackground(new java.awt.Color(253, 253, 105));
        txtFlower2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFlower2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFlower2.setText("O");
        txtFlower2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtFruit2.setBackground(new java.awt.Color(253, 253, 105));
        txtFruit2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFruit2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFruit2.setText("I");
        txtFruit2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtFruit3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFruit3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFruit3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtFlower3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFlower3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFlower3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtFlower5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFlower5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFlower5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtRoot2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtRoot2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRoot2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtFruit1.setBackground(new java.awt.Color(253, 253, 105));
        txtFruit1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFruit1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFruit1.setText("U");
        txtFruit1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtStem.setBackground(new java.awt.Color(253, 253, 105));
        txtStem.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtStem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStem.setText("S");
        txtStem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtFlower4.setBackground(new java.awt.Color(253, 253, 105));
        txtFlower4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFlower4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFlower4.setText("E");
        txtFlower4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtFlower.setBackground(new java.awt.Color(253, 253, 105));
        txtFlower.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtFlower.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFlower.setText("F");
        txtFlower.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtStem1.setBackground(new java.awt.Color(253, 253, 105));
        txtStem1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtStem1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStem1.setText("E");
        txtStem1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parts of plants/imagenes mas pequenas/fruit.png"))); // NOI18N
        jLabel4.setText("jLabel1");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parts of plants/imagenes mas pequenas/leaf.png"))); // NOI18N
        jLabel6.setText("jLabel1");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parts of plants/imagenes mas pequenas/stem.png"))); // NOI18N
        jLabel7.setText("jLabel1");

        trueFlower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueFlower.setText("jLabel3");
        trueFlower.setMaximumSize(new java.awt.Dimension(50, 50));
        trueFlower.setMinimumSize(new java.awt.Dimension(50, 50));
        trueFlower.setPreferredSize(new java.awt.Dimension(50, 50));

        txtLeaf1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtLeaf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLeaf1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtLeaf2.setBackground(new java.awt.Color(253, 253, 105));
        txtLeaf2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtLeaf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLeaf2.setText("F");
        txtLeaf2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parts of plants/imagenes mas pequenas/root.png"))); // NOI18N
        jLabel8.setText("jLabel1");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parts of plants/imagenes mas pequenas/flower.png"))); // NOI18N
        jLabel9.setText("jLabel1");

        txtRoot1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtRoot1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRoot1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtRoot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoot1ActionPerformed(evt);
            }
        });

        txtRoot.setBackground(new java.awt.Color(253, 253, 105));
        txtRoot.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtRoot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRoot.setText("R");
        txtRoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtLeaf.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtLeaf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLeaf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        trueFruit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueFruit.setText("jLabel3");
        trueFruit.setMaximumSize(new java.awt.Dimension(50, 50));
        trueFruit.setMinimumSize(new java.awt.Dimension(50, 50));
        trueFruit.setPreferredSize(new java.awt.Dimension(50, 50));

        trueLeaf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueLeaf.setText("jLabel3");
        trueLeaf.setMaximumSize(new java.awt.Dimension(50, 50));
        trueLeaf.setMinimumSize(new java.awt.Dimension(50, 50));
        trueLeaf.setPreferredSize(new java.awt.Dimension(50, 50));

        trueRoot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueRoot.setText("jLabel3");
        trueRoot.setMaximumSize(new java.awt.Dimension(50, 50));
        trueRoot.setMinimumSize(new java.awt.Dimension(50, 50));
        trueRoot.setPreferredSize(new java.awt.Dimension(50, 50));

        trueStem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueStem.setText("jLabel3");
        trueStem.setMaximumSize(new java.awt.Dimension(50, 50));
        trueStem.setMinimumSize(new java.awt.Dimension(50, 50));
        trueStem.setPreferredSize(new java.awt.Dimension(50, 50));

        txtStem2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtStem2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStem2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(trueStem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(trueFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(trueFruit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFlower, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFlower1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFlower2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRoot1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFruit1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFruit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFruit2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtStem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtFruit3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(txtRoot2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtStem1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtStem2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLeaf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLeaf2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtFlower3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtFlower4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtLeaf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtFlower5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(trueLeaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(trueRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 218, Short.MAX_VALUE)))
                .addGap(241, 241, 241)
                .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trueFruit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(txtRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(trueRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(trueLeaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRoot1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLeaf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFlower2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFlower1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFlower, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFlower3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFlower4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFlower5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trueFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFruit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRoot2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLeaf1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLeaf2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFruit1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtFruit2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFruit3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStem1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStem2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trueStem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasQActionPerformed
        quizPP1 q = new quizPP1();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasQActionPerformed

    private void btnFinishQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishQActionPerformed
       
        completedFlower();
        completedFruit();
        completedLeaf();
        completedRoot();
        completedStem();
        i=ci+ci1+ci2+ci3+ci4;
        quizPP2 k = new quizPP2();
        k.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFinishQActionPerformed

    private void txtFruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFruitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFruitActionPerformed

    private void txtRoot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoot1ActionPerformed

   
    
    
     public void completedFruit(){
        String qw = txtFruit.getText().toString();
        String qw1 = txtFruit3.getText().toString();
        if(qw.equalsIgnoreCase("R") && qw1.equalsIgnoreCase("T")){
            txtFruit.setEditable(false);
            txtFruit3.setEditable(false);
            trueFruit.setVisible(true);
            ci++;   
         if (ci > 1){
             ci--;
         }else if (ci <= 0){
             
         }   
    }}
    public void completedFlower(){
        String sw1= txtFlower1.getText().toString();
        String sw2 = txtFlower3.getText().toString();
        String sw3 = txtFlower5.getText().toString();
        if(sw1.equalsIgnoreCase("L")&& sw2.equalsIgnoreCase("W")&& sw3.equalsIgnoreCase("R")){
            txtFlower1.setEditable(false);
            txtFlower3.setEditable(false);
            txtFlower5.setEditable(false);
            trueFlower.setVisible(true);
            ci2++;   
         if (ci2 > 1){
             ci2--;
         }else if (ci2 <= 0){
             
         }     
    }}
    
    public void completedStem(){
        String cd1 = txtStem2.getText().toString();
        if(cd1.equalsIgnoreCase("M")){
            txtStem2.setEditable(false);
            trueStem.setVisible(true);
            ci3++;   
         if (ci3 > 1){
             ci3--;
         }else if (ci3 <= 0){
             
         }
    }}
    
    public void completedRoot(){
        String cl1 = txtRoot1.getText().toString();
        String cl2 =txtRoot2.getText().toString();
        if(cl1.equalsIgnoreCase("O")&& cl2.equalsIgnoreCase("T")){
            txtRoot1.setEditable(false);
            txtRoot2.setEditable(false);
            trueRoot.setVisible(true);
            ci4++;   
         if (ci4 > 1){
             ci4--;
         }else if (ci4 <= 0){
             
         }
        
        }}
    public void completedLeaf(){
        String cl1 = txtLeaf.getText().toString();
        String cl2 =txtLeaf1.getText().toString();
        if(cl1.equalsIgnoreCase("L")&& cl2.equalsIgnoreCase("A")){
            txtLeaf.setEditable(false);
            txtLeaf1.setEditable(false);
            trueLeaf.setVisible(true);
            ci1++;   
         if (ci1 > 1){
             ci1--;
         }else if (ci1 <= 0){
             
         }
        
        }}
   
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quizPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasQ;
    private javax.swing.JButton btnFinishQ;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel trueFlower;
    private javax.swing.JLabel trueFruit;
    private javax.swing.JLabel trueLeaf;
    private javax.swing.JLabel trueRoot;
    private javax.swing.JLabel trueStem;
    private javax.swing.JTextField txtFlower;
    private javax.swing.JTextField txtFlower1;
    private javax.swing.JTextField txtFlower2;
    private javax.swing.JTextField txtFlower3;
    private javax.swing.JTextField txtFlower4;
    private javax.swing.JTextField txtFlower5;
    private javax.swing.JTextField txtFruit;
    private javax.swing.JTextField txtFruit1;
    private javax.swing.JTextField txtFruit2;
    private javax.swing.JTextField txtFruit3;
    private javax.swing.JTextField txtLeaf;
    private javax.swing.JTextField txtLeaf1;
    private javax.swing.JTextField txtLeaf2;
    private javax.swing.JTextField txtRoot;
    private javax.swing.JTextField txtRoot1;
    private javax.swing.JTextField txtRoot2;
    private javax.swing.JTextField txtStem;
    private javax.swing.JTextField txtStem1;
    private javax.swing.JTextField txtStem2;
    // End of variables declaration//GEN-END:variables
}
