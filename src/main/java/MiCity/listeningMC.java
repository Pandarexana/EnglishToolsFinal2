package MiCity;


import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javafx.scene.media.Media;
import pantallas.topic1;


public class listeningMC extends javax.swing.JFrame {

 
    public listeningMC() {
        initComponents();
        this.setExtendedState(listeningMC.MAXIMIZED_BOTH);
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

        jPanel1 = new javax.swing.JPanel();
        btnListening = new javax.swing.JButton();
        btnSpeaking = new javax.swing.JButton();
        btnQuiz = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnReading = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnReading1 = new javax.swing.JButton();
        btnReading2 = new javax.swing.JButton();
        btnSpeaking1 = new javax.swing.JButton();
        btnSpeaking2 = new javax.swing.JButton();
        btnRecord = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prepositions of Place");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(253, 253, 105));

        btnListening.setBackground(new java.awt.Color(51, 153, 255));
        btnListening.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btnListening.setText("Listening");
        btnListening.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnListening.setFocusPainted(false);
        btnListening.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListeningMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnListeningMouseReleased(evt);
            }
        });
        btnListening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeningActionPerformed(evt);
            }
        });

        btnSpeaking.setBackground(new java.awt.Color(51, 153, 255));
        btnSpeaking.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btnSpeaking.setText("Speaking");
        btnSpeaking.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnSpeaking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeakingActionPerformed(evt);
            }
        });

        btnQuiz.setBackground(new java.awt.Color(51, 153, 255));
        btnQuiz.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btnQuiz.setText("Quiz");
        btnQuiz.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 102, 102));
        btnAtras.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnAtras.setText("Back");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnReading.setBackground(new java.awt.Color(51, 153, 255));
        btnReading.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btnReading.setText("Reading");
        btnReading.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnReading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReadingMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReadingMouseReleased(evt);
            }
        });
        btnReading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadingActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes pantallas/listening2.png"))); // NOI18N
        jLabel2.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes pantallas/reading.png"))); // NOI18N
        jLabel3.setText("jLabel1");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes pantallas/speech-icon-gdd50ee3d1_1280 (Personalizado).png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes pantallas/quiz.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        btnReading1.setBackground(new java.awt.Color(51, 153, 255));
        btnReading1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btnReading1.setText("Reading 2");
        btnReading1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnReading1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReading1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReading1MouseReleased(evt);
            }
        });
        btnReading1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReading1ActionPerformed(evt);
            }
        });

        btnReading2.setBackground(new java.awt.Color(51, 153, 255));
        btnReading2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btnReading2.setText("Reading 3");
        btnReading2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnReading2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReading2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReading2MouseReleased(evt);
            }
        });
        btnReading2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReading2ActionPerformed(evt);
            }
        });

        btnSpeaking1.setBackground(new java.awt.Color(51, 153, 255));
        btnSpeaking1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btnSpeaking1.setText("Speaking 2");
        btnSpeaking1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnSpeaking1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaking1ActionPerformed(evt);
            }
        });

        btnSpeaking2.setBackground(new java.awt.Color(51, 153, 255));
        btnSpeaking2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btnSpeaking2.setText("Speaking 3");
        btnSpeaking2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnSpeaking2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaking2ActionPerformed(evt);
            }
        });

        btnRecord.setBackground(new java.awt.Color(153, 255, 153));
        btnRecord.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnRecord.setText("Records");
        btnRecord.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.black));
        btnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/record.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReading1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnListening, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(btnReading, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnReading2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSpeaking, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSpeaking1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSpeaking2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReading, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpeaking, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListening, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReading1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSpeaking1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReading2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSpeaking2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
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

    private void btnListeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeningActionPerformed
        File file=new File("C://programa//videos//city.mp4");
        System.out.println(file.isFile());
        Media media=new Media(file.toURI().toString());
         
        videoSeasonMC v = new videoSeasonMC(media);
        v.setVisible(true);
       
        
    }//GEN-LAST:event_btnListeningActionPerformed

    private void btnSpeakingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeakingActionPerformed
        speakingMC1 v = new speakingMC1();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSpeakingActionPerformed

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
        quizMC v = new quizMC();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuizActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        topic1 ventanaListening = new topic1();
        ventanaListening.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnListeningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListeningMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnListeningMouseClicked

    private void btnListeningMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListeningMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListeningMouseReleased

    private void btnReadingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReadingMouseClicked

    private void btnReadingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadingMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReadingMouseReleased

    private void btnReadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadingActionPerformed
        readingMC x = new readingMC();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReadingActionPerformed

    private void btnReading1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReading1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReading1MouseClicked

    private void btnReading1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReading1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReading1MouseReleased

    private void btnReading1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReading1ActionPerformed
        readingMC2 x = new readingMC2();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReading1ActionPerformed

    private void btnReading2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReading2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReading2MouseClicked

    private void btnReading2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReading2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReading2MouseReleased

    private void btnReading2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReading2ActionPerformed
        readingMC3 x = new readingMC3();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReading2ActionPerformed

    private void btnSpeaking1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaking1ActionPerformed
        speakingMC2 v = new speakingMC2();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSpeaking1ActionPerformed

    private void btnSpeaking2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaking2ActionPerformed
        speakingMC3 v = new speakingMC3();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSpeaking2ActionPerformed

    private void btnRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordActionPerformed
        puntuacionesMC punt = new puntuacionesMC();
        punt.setVisible(true);
    }//GEN-LAST:event_btnRecordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listeningMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnListening;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton btnReading;
    private javax.swing.JButton btnReading1;
    private javax.swing.JButton btnReading2;
    private javax.swing.JButton btnRecord;
    private javax.swing.JButton btnSpeaking;
    private javax.swing.JButton btnSpeaking1;
    private javax.swing.JButton btnSpeaking2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
