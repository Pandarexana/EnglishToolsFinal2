package pantallas;

import java.awt.Image;
import java.awt.Toolkit;

        
public class topics extends javax.swing.JFrame {

   
    public topics() {
        initComponents();
        this.setExtendedState(topics.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        
    }
    
    @Override
    
    public Image getIconImage(){
    
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("logo3.png"));
        return retValue ;
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnUnit1 = new javax.swing.JButton();
        btnUnit2 = new javax.swing.JButton();
        btnUnit3 = new javax.swing.JButton();
        btnUnit4 = new javax.swing.JButton();
        btnUnit5 = new javax.swing.JButton();
        btnUnit6 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnVoice = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Topics");
        setIconImage(getIconImage());

        jPanel2.setBackground(new java.awt.Color(253, 253, 105));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Topics");

        btnUnit1.setBackground(new java.awt.Color(51, 153, 255));
        btnUnit1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btnUnit1.setText("Unit 1");
        btnUnit1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        btnUnit1.setFocusPainted(false);
        btnUnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnit1ActionPerformed(evt);
            }
        });

        btnUnit2.setBackground(new java.awt.Color(51, 153, 255));
        btnUnit2.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btnUnit2.setText("Unit 2");
        btnUnit2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, new java.awt.Color(0, 0, 0)));
        btnUnit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnit2ActionPerformed(evt);
            }
        });

        btnUnit3.setBackground(new java.awt.Color(51, 153, 255));
        btnUnit3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btnUnit3.setText("Unit 3");
        btnUnit3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        btnUnit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnit3ActionPerformed(evt);
            }
        });

        btnUnit4.setBackground(new java.awt.Color(51, 153, 255));
        btnUnit4.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btnUnit4.setText("Unit 4");
        btnUnit4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        btnUnit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnit4ActionPerformed(evt);
            }
        });

        btnUnit5.setBackground(new java.awt.Color(51, 153, 255));
        btnUnit5.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btnUnit5.setText("Unit 5");
        btnUnit5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        btnUnit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnit5ActionPerformed(evt);
            }
        });

        btnUnit6.setBackground(new java.awt.Color(51, 153, 255));
        btnUnit6.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btnUnit6.setText("Unit 6");
        btnUnit6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        btnUnit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnit6ActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 102, 102));
        btnExit.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btnExit.setText("Back");
        btnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnVoice.setBackground(new java.awt.Color(153, 255, 153));
        btnVoice.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btnVoice.setText("Voice");
        btnVoice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        btnVoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUnit4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoice, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUnit2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUnit5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(251, 251, 251)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUnit3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUnit6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(599, 599, 599))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(607, 607, 607))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnit2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnit3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnit4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnit5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnit6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(btnVoice, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnit6ActionPerformed
        topic6 x = new topic6();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUnit6ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        ventanaPrincipal x = new ventanaPrincipal();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnUnit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnit5ActionPerformed
        topic5 x = new topic5();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUnit5ActionPerformed

    private void btnUnit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnit4ActionPerformed
        topic4 x = new topic4();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUnit4ActionPerformed

    private void btnUnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnit1ActionPerformed
        topic1 x = new topic1();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUnit1ActionPerformed

    private void btnUnit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnit2ActionPerformed
        topic2 x = new topic2();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUnit2ActionPerformed

    private void btnUnit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnit3ActionPerformed
        topic3 x = new topic3();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUnit3ActionPerformed

    private void btnVoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoiceActionPerformed
        loquendo lq = new loquendo();
        lq.setVisible(true);
    }//GEN-LAST:event_btnVoiceActionPerformed

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new topics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUnit1;
    private javax.swing.JButton btnUnit2;
    private javax.swing.JButton btnUnit3;
    private javax.swing.JButton btnUnit4;
    private javax.swing.JButton btnUnit5;
    private javax.swing.JButton btnUnit6;
    private javax.swing.JButton btnVoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
