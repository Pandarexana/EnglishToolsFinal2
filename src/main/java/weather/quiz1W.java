package weather;

import java.awt.Image;
import java.awt.Toolkit;
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
public class quiz1W extends javax.swing.JFrame {

 
    int y = 0;
    int p = quizW.i;
   public static int xy=0;
    int y1 = 0;
    int y2 = 0;
    int y3 = 0;
    int y4 = 0;
    
    
    Icon smile;
    Icon iquiz;
    
    
    public quiz1W() {
        initComponents();
        this.setExtendedState(listeningW.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        txtWindy1.setEditable(false);
        txtWindy3.setEditable(false);
        txtWindy4.setEditable(false);
        txtSnowy3.setEditable(false);
        txtCloudy1.setEditable(false);
        txtCloudy3.setEditable(false);
        txtCloudy4.setEditable(false);
        txtCold2.setEditable(false);
        
        trueCloudy.setVisible(false);
        trueCold.setVisible(false);
        trueSnowy.setVisible(false);
        trueWindy.setVisible(false);
        
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
        jLabel16 = new javax.swing.JLabel();
        btnFinishQ = new javax.swing.JButton();
        btnAtrasQ = new javax.swing.JButton();
        txtWindy1 = new javax.swing.JTextField();
        txtWindy2 = new javax.swing.JTextField();
        txtWindy3 = new javax.swing.JTextField();
        txtWindy4 = new javax.swing.JTextField();
        txtWindy5 = new javax.swing.JTextField();
        txtSnowy1 = new javax.swing.JTextField();
        txtCold3 = new javax.swing.JTextField();
        txtCold2 = new javax.swing.JTextField();
        txtCold1 = new javax.swing.JTextField();
        txtSnowy4 = new javax.swing.JTextField();
        txtCloudy5 = new javax.swing.JTextField();
        txtCloudy4 = new javax.swing.JTextField();
        txtCloudy3 = new javax.swing.JTextField();
        txtSnowy2 = new javax.swing.JTextField();
        txtSnowy3 = new javax.swing.JTextField();
        txtCloudy2 = new javax.swing.JTextField();
        txtCloudy1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        trueCloudy = new javax.swing.JLabel();
        trueSnowy = new javax.swing.JLabel();
        trueWindy = new javax.swing.JLabel();
        trueCold = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather - Quiz");
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(1554, 820));

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("3. Complete the crossword puzzle");

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

        txtWindy1.setBackground(new java.awt.Color(253, 253, 105));
        txtWindy1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtWindy1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWindy1.setText("W");
        txtWindy1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtWindy2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtWindy2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWindy2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtWindy3.setBackground(new java.awt.Color(253, 253, 105));
        txtWindy3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtWindy3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWindy3.setText("N");
        txtWindy3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtWindy4.setBackground(new java.awt.Color(253, 253, 105));
        txtWindy4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtWindy4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWindy4.setText("D");
        txtWindy4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtWindy5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtWindy5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWindy5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtSnowy1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSnowy1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSnowy1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtSnowy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSnowy1ActionPerformed(evt);
            }
        });

        txtCold3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCold3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCold3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCold2.setBackground(new java.awt.Color(253, 253, 105));
        txtCold2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCold2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCold2.setText("O");
        txtCold2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCold1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCold1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCold1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtSnowy4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSnowy4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSnowy4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtSnowy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSnowy4ActionPerformed(evt);
            }
        });

        txtCloudy5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCloudy5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloudy5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCloudy4.setBackground(new java.awt.Color(253, 253, 105));
        txtCloudy4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCloudy4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloudy4.setText("U");
        txtCloudy4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCloudy3.setBackground(new java.awt.Color(253, 253, 105));
        txtCloudy3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCloudy3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloudy3.setText("O");
        txtCloudy3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtSnowy2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSnowy2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSnowy2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtSnowy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSnowy2ActionPerformed(evt);
            }
        });

        txtSnowy3.setBackground(new java.awt.Color(253, 253, 105));
        txtSnowy3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtSnowy3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSnowy3.setText("O");
        txtSnowy3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCloudy2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCloudy2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloudy2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCloudy1.setBackground(new java.awt.Color(253, 253, 105));
        txtCloudy1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtCloudy1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCloudy1.setText("C");
        txtCloudy1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes mas pequenas/cold.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes mas pequenas/cloudy.png"))); // NOI18N
        jLabel5.setText("jLabel1");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes mas pequenas/snowy.png"))); // NOI18N
        jLabel6.setText("jLabel1");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/imagenes mas pequenas/windy.png"))); // NOI18N
        jLabel7.setText("jLabel1");

        trueCloudy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueCloudy.setText("jLabel3");
        trueCloudy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueCloudy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueCloudy.setPreferredSize(new java.awt.Dimension(50, 50));

        trueSnowy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueSnowy.setText("jLabel3");
        trueSnowy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueSnowy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueSnowy.setPreferredSize(new java.awt.Dimension(50, 50));

        trueWindy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueWindy.setText("jLabel3");
        trueWindy.setMaximumSize(new java.awt.Dimension(50, 50));
        trueWindy.setMinimumSize(new java.awt.Dimension(50, 50));
        trueWindy.setPreferredSize(new java.awt.Dimension(50, 50));

        trueCold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/true.png"))); // NOI18N
        trueCold.setText("jLabel3");
        trueCold.setMaximumSize(new java.awt.Dimension(50, 50));
        trueCold.setMinimumSize(new java.awt.Dimension(50, 50));
        trueCold.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(457, 457, 457)
                                .addComponent(trueWindy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSnowy4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtWindy1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtWindy2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtWindy3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtWindy4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtSnowy3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCold3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtSnowy2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCold2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtSnowy1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCold1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(trueSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(trueCold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)))
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCloudy5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWindy5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCloudy4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCloudy3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCloudy2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCloudy1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(trueCloudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(207, 207, 207)))))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trueCloudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtCloudy1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCloudy2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(trueCold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(trueSnowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCloudy3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCold1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSnowy1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCloudy4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCold2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSnowy2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSnowy3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCloudy5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCold3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWindy1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWindy2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWindy3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWindy4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWindy5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trueWindy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSnowy4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinishQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtrasQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasQActionPerformed
        quizW q = new quizW();
        q.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasQActionPerformed

    private void btnFinishQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishQActionPerformed
        quizW q = new quizW();
        
        q.selectFoggy();
        q.selectHot();
        q.selectRainy();
        q.selectSunny();
        completedCloudy();
        completedCold();
        completedSnowy();
        completedWindy();
        y=y1+y2+y3+y4;
        xy = p+y;
        
        ingresoWeather fg = new ingresoWeather();
        fg.setVisible(true);
        
       this.dispose();
    }//GEN-LAST:event_btnFinishQActionPerformed

    private void txtSnowy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSnowy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSnowy1ActionPerformed

    private void txtSnowy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSnowy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSnowy2ActionPerformed

    private void txtSnowy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSnowy4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSnowy4ActionPerformed

   
    public void contador() {
        
       if(xy>0){
        this.xy=xy;
        }
    }
    
     public void completedWindy(){
        String qw = txtWindy2.getText().toString();
        String qw1 = txtWindy5.getText().toString();
        if(qw.equalsIgnoreCase("I") && qw1.equalsIgnoreCase("Y")){
            txtWindy2.setEditable(false);
            txtWindy5.setEditable(false);
            trueWindy.setVisible(true);
            y1++; 
         if (y1 > 1){
             y1--;
         }else if (y1 <= 0){
            
            
         }  
    }}
    public void completedSnowy(){
        String sw1= txtSnowy1.getText().toString();
        String sw2 = txtSnowy2.getText().toString();
        String sw3 = txtSnowy4.getText().toString();
        if(sw1.equalsIgnoreCase("S")&& sw2.equalsIgnoreCase("N")&& sw3.equalsIgnoreCase("Y")){
            txtSnowy1.setEditable(false);
            txtSnowy2.setEditable(false);
            txtSnowy4.setEditable(false);
            trueSnowy.setVisible(true);
            y2++; 
         if (y2 > 1){
             y2--;
         }else if (y2 <= 0){
            
            
         }     
    }}
    
    public void completedCold(){
        String cd1 = txtCold1.getText().toString();
        String cd2 = txtCold3.getText().toString();
        if(cd1.equalsIgnoreCase("C")&& cd2.equalsIgnoreCase("L")){
            txtCold1.setEditable(false);
            txtCold3.setEditable(false);
            trueCold.setVisible(true);
            y3++; 
         if (y3 > 1){
             y3--;
         }else if (y3 <= 0){
            
            
         }
    }}
    
    public void completedCloudy(){
        String cl1 = txtCloudy2.getText().toString();
        String cl2 =txtCloudy5.getText().toString();
        if(cl1.equalsIgnoreCase("L")&& cl2.equalsIgnoreCase("D")){
            txtCloudy2.setEditable(false);
            txtCloudy5.setEditable(false);
            trueCloudy.setVisible(true);
            y4++; 
         if (y4 > 1){
             y4--;
         }else if (y4 <= 0){
            
            
         }
        
        }}
   
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
                new quiz1W().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasQ;
    private javax.swing.JButton btnFinishQ;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel trueCloudy;
    private javax.swing.JLabel trueCold;
    private javax.swing.JLabel trueSnowy;
    private javax.swing.JLabel trueWindy;
    private javax.swing.JTextField txtCloudy1;
    private javax.swing.JTextField txtCloudy2;
    private javax.swing.JTextField txtCloudy3;
    private javax.swing.JTextField txtCloudy4;
    private javax.swing.JTextField txtCloudy5;
    private javax.swing.JTextField txtCold1;
    private javax.swing.JTextField txtCold2;
    private javax.swing.JTextField txtCold3;
    private javax.swing.JTextField txtSnowy1;
    private javax.swing.JTextField txtSnowy2;
    private javax.swing.JTextField txtSnowy3;
    private javax.swing.JTextField txtSnowy4;
    private javax.swing.JTextField txtWindy1;
    private javax.swing.JTextField txtWindy2;
    private javax.swing.JTextField txtWindy3;
    private javax.swing.JTextField txtWindy4;
    private javax.swing.JTextField txtWindy5;
    // End of variables declaration//GEN-END:variables
}
