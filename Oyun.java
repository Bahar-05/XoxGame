
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Bahar
 */
public class Oyun extends javax.swing.JFrame {

    // tek boyutlu dizi tanımlayalım.
    
    String[] hucre = new String[9]; // Oyuncu ve bilgisayarın tıklama verileri.
    String[] skorlardata = new String[10];// Program kapatılmasıdığı sürece skorlar tutulsun.
    int i =0; // skorlar tutarken dizinin değeri arttırılsın.
    String ad=" ";
    int oyuncu_skor=0;
    int bilgisayar_skor=0;
    
    
    
    public Oyun() {
        initComponents();
        panel_oyunalani.setVisible(false);
        panel_durum.setVisible(false);
        panel_skorlar.setVisible(false);
        btn_sifirla.setVisible(false);            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_oyuncubilgi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtf_oyuncuad = new javax.swing.JTextField();
        btn_basla = new javax.swing.JButton();
        panel_oyunalani = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        panel_durum = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_oyuncu = new javax.swing.JLabel();
        label_bilgisayar = new javax.swing.JLabel();
        btn_yenidenoyna = new javax.swing.JButton();
        panel_skorlar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist_skor = new javax.swing.JList<>();
        btn_sifirla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_oyuncubilgi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Oyuncunun Adı: ");

        btn_basla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_basla.setForeground(new java.awt.Color(0, 204, 0));
        btn_basla.setText("BAŞLA");
        btn_basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baslaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyuncubilgiLayout = new javax.swing.GroupLayout(panel_oyuncubilgi);
        panel_oyuncubilgi.setLayout(panel_oyuncubilgiLayout);
        panel_oyuncubilgiLayout.setHorizontalGroup(
            panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncubilgiLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtf_oyuncuad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_basla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_oyuncubilgiLayout.setVerticalGroup(
            panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncubilgiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_oyuncuad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_basla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panel_oyunalani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyun Alanı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(0, 102, 255))); // NOI18N

        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyunalaniLayout = new javax.swing.GroupLayout(panel_oyunalani);
        panel_oyunalani.setLayout(panel_oyunalaniLayout);
        panel_oyunalaniLayout.setHorizontalGroup(
            panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_oyunalaniLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panel_oyunalaniLayout.setVerticalGroup(
            panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        panel_durum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Durum", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(204, 0, 204))); // NOI18N
        panel_durum.setForeground(new java.awt.Color(204, 0, 204));
        panel_durum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Oyuncu : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Bilgisayar :");

        label_oyuncu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_oyuncu.setText("0");

        label_bilgisayar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_bilgisayar.setText("0");

        btn_yenidenoyna.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_yenidenoyna.setForeground(new java.awt.Color(255, 102, 0));
        btn_yenidenoyna.setText("Yeniden Oyna");
        btn_yenidenoyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yenidenoynaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_durumLayout = new javax.swing.GroupLayout(panel_durum);
        panel_durum.setLayout(panel_durumLayout);
        panel_durumLayout.setHorizontalGroup(
            panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_durumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_oyuncu, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(label_bilgisayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_durumLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(btn_yenidenoyna, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        panel_durumLayout.setVerticalGroup(
            panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_durumLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(label_oyuncu))
                .addGap(29, 29, 29)
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(label_bilgisayar))
                .addGap(18, 18, 18)
                .addComponent(btn_yenidenoyna, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_skorlar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skorlar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(204, 204, 0))); // NOI18N

        jScrollPane1.setViewportView(jlist_skor);

        javax.swing.GroupLayout panel_skorlarLayout = new javax.swing.GroupLayout(panel_skorlar);
        panel_skorlar.setLayout(panel_skorlarLayout);
        panel_skorlarLayout.setHorizontalGroup(
            panel_skorlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_skorlarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_skorlarLayout.setVerticalGroup(
            panel_skorlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_skorlarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btn_sifirla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sifirla.setForeground(new java.awt.Color(153, 0, 51));
        btn_sifirla.setText("Oyunu Sıfırla");
        btn_sifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifirlaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_oyunalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_oyuncubilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_durum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_skorlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btn_sifirla, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_durum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sifirla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel_skorlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel_oyuncubilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(panel_oyunalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int say=0; // Kazanan yoksa kontolü. 9 tıklamadan sonra berabere kalır.
    private void btn_sifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifirlaActionPerformed
        butonsifirlama();
        degerleri_sifirla();
        skorlardata[i]= ad + "-" + oyuncu_skor;
        i++;
        ad="";
        panel_skorlar.setVisible(true);
        panel_durum.setVisible(false);
        panel_oyunalani.setVisible(false);
        panel_oyuncubilgi.setVisible(true);
        txtf_oyuncuad.setEnabled(true);
        btn_basla.setEnabled(true);
        jlist_skor.setListData(skorlardata);
        btn_sifirla.setVisible(false);
    }//GEN-LAST:event_btn_sifirlaActionPerformed

    private void btn_baslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baslaActionPerformed
       ad= txtf_oyuncuad.getText();
       panel_oyunalani.setVisible(true);
       panel_oyuncubilgi.setEnabled(false); // Oyuncu tekrar bilgilerini değiştiremesin.
       txtf_oyuncuad.setEnabled(false);
       btn_basla.setEnabled(false);
       panel_skorlar.setVisible(false);
       bilgisayar_skor=0;
       oyuncu_skor=0;
       say=0;
       
        for (int j = 0; j < 9; j++) 
            
            hucre[i]="";
            oyun_durum=true;
            
        
    }//GEN-LAST:event_btn_baslaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn1.setEnabled(false);
        hucre[0]="x"; // hücre adlı diziye kullanıcının oynadığı bilgisi verilir.
        say++;
        kontrol();
        bilgisayar_oyna();
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn2.setEnabled(false);
        hucre[1]="x"; // hücre adlı diziye kullanıcının oynadığı bilgisi verilir.
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn3.setEnabled(false);
        hucre[2]="x"; // hücre adlı diziye kullanıcının oynadığı bilgisi verilir.
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn4.setEnabled(false);
        hucre[3]="x"; // hücre adlı diziye kullanıcının oynadığı bilgisi verilir.
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn5.setEnabled(false);
        hucre[4]="x"; // hücre adlı diziye kullanıcının oynadığı bilgisi verilir.
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn6.setEnabled(false);
        hucre[5]="x"; // hücre adlı diziye kullanıcının oynadığı bilgisi verilir.
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn7.setEnabled(false);
        hucre[6]="x"; // hücre adlı diziye kullanıcının oynadığı bilgisi verilir.
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn8.setEnabled(false);
        hucre[7]="x"; // hücre adlı diziye kullanıcının oynadığı bilgisi verilir.
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn9.setEnabled(false);
        hucre[8]="x"; // hücre adlı diziye kullanıcının oynadığı bilgisi verilir.
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn_yenidenoynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yenidenoynaActionPerformed
        panel_oyunalani.setVisible(true);
        butonsifirlama();
        degerleri_sifirla();
        
                
    }//GEN-LAST:event_btn_yenidenoynaActionPerformed

    public void butonsifirlama(){
    btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalp.png")));
    btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalp.png")));
    btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalp.png")));
    btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalp.png")));
    btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalp.png")));
    btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalp.png")));
    btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalp.png")));
    btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalp.png")));
    btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalp.png")));
    
    btn1.setEnabled(true);
    btn2.setEnabled(true);
    btn3.setEnabled(true);
    btn4.setEnabled(true);
    btn5.setEnabled(true);
    btn6.setEnabled(true);
    btn7.setEnabled(true);
    btn8.setEnabled(true);
    btn9.setEnabled(true);
    }
    
    public void degerleri_sifirla(){
    
        for (int j = 0; j < 9; j++) {
            
            hucre[j]="";
            say=0;           
        }
        
        oyun_durum=true;
        
                
    
    }
    
    
    
    
    
    
    boolean oyun_durum=false; // Oyun 9 adımdan önce biterse kontrolü ,  oyuncu ve bilgisayarın kazanma durumu.
    
    /*
    
    Oyuncu ya da bilgisayarın kaznaıp kazanmadığını kontrol eden fonksiyonlar:
    0 1 2  = x konulursa oyuncu , o konulursa bilgisayar kazanacak.
    3 4 5
    6 7 8
    
    Kontroller şunlar olur:
    0 1 2 , 3 4 5 , 6 7 8, 0 3 6, 1 4 7 , 2 5 8 
    
    */
    
    public void kontrol(){
    
       Oyun f =new Oyun(); // uyarı penceresinin açılması için
        if (say<9) {
            if (hucre[0]=="x"&hucre[3]=="x"&hucre[6]=="x" ||hucre[1]=="x"&hucre[4]=="x"&hucre[7]=="x" ||hucre[2]=="x"&hucre[5]=="x"&hucre[8]=="x"||hucre[0]=="x"&hucre[1]=="x"&hucre[2]=="x" ||hucre[3]=="x"&hucre[4]=="x"&hucre[5]=="x" ||hucre[6]=="x"&hucre[7]=="x"&hucre[8]=="x" ){
                
                JOptionPane.showMessageDialog(f, "Oyuncu kazandı"); //uyarı penceresi açılır
                oyuncu_skor++; // eğer oyuncu kazandıysa skorunuartırır
                oyun_durum=false; // oyun durum false olur oyun sonlandırma işlemleri için
                label_oyuncu.setText(String.valueOf(oyuncu_skor)); // label a yeni skoru yazılır. 
            }
            else if (hucre[0]=="o"&hucre[3]=="o"&hucre[6]=="o" ||hucre[1]=="o"&hucre[4]=="o"&hucre[7]=="o" ||hucre[2]=="o"&hucre[5]=="o"&hucre[8]=="o"||hucre[0]=="o"&hucre[1]=="o"&hucre[2]=="o" ||hucre[3]=="o"&hucre[4]=="o"&hucre[5]=="o" ||hucre[6]=="o"&hucre[7]=="o"&hucre[8]=="o") {
                
                JOptionPane.showMessageDialog(f, "bilgisayar kazandı");
                bilgisayar_skor++;// eğer bilgisayar kazandıysa skorunuartırır
                oyun_durum=false; // oyun durum false olur oyun sonlandırma işlemleri için
                label_bilgisayar.setText(String.valueOf(bilgisayar_skor));   // label a yeni skoru yazılır.
            }
            else if (say==9) {  /*eğer oyuncu ve bilgisayar oynama sayısı toplamı 9 geldi ise kazanan yoktur. */
                JOptionPane.showMessageDialog(f, "kazanan yok");
                oyun_durum=false; // oyun durum false olur oyun sonlandırma işlemleri için
                
            }
            
            // oyun durum false olduğunda aşağıdaki şlemler yapılır
            /*durum paneli açılır, oyun alanı kapatılır, buton sifirla aktif hale gelir
              ki yeni bir oyuncu oynamak isterse diye*/
            
            if (oyun_durum==false) {
                
                panel_durum.setVisible(true); 
               panel_oyunalani.setVisible(false);
               btn_sifirla.setVisible(true);
            }
        }
       
    
        
        /* oyunumuz kullanıcı başlangıçlı bir oyundur.yani her zaman kullanıcı ilk baş
   layacak. */
   
   /* Kullanıcı oynadı, sıra bilgisayardadır. 
   Her defa aynı kodu tekrar etmek yerine bilgisayar oyununu bir fonksiyon yaptık
   bilgisayar_oyna fonksiyonu çağrıldığında bilgisayar boş olan bir yere o harfi koymak zorunda
   */
    
    }
    
    public void bilgisayar_oyna(){
    
        if (oyun_durum==true) {  //oyun sonlanmadı ise bu işe başla
            
            int h =-1; 
            boolean durum=false; 
            //Bilgisayar 0'dan 8'e kadar rastgele yer seçiyor.
            /* Daha önceden oynanan bir yere o ya da x konulmaması için tutulan sayıdaki 
     hucre dizisinin o indisinde bir x ya da o var mı kontrolü yapar*/
            
            // tek seferlik kontrol olduğu için do-while kullandık.
            
            do {
                
                h=(int)(Math.random()*9);
                if (hucre[h]=="x") {
                    
                    durum=false;
                }else if (hucre[h]=="o") {
                    durum=false;               
                }else{
                
                    durum=true;
                }
                
            } while (durum==false);
            
            /*Eğer o hücrede x ya da o yoksa tutulan h sayısının olduğu indekse bilgisayar
             o harfi koyar
            */
            
            hucre[h]="o"; // O harfini hücre dizisine yerleştirdi.
            say++;
            //kazanan olmamama durumuna karşın adım saydı
            /* aşağıdaki kodlar da görsel olarak o butona o resmini getirmek içindir*/
            
            if (h==0) {
                btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn1.setEnabled(false);
                
            }
            
            else if (h==1) {
                btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn2.setEnabled(false);
                
            }
            
            else if (h==2) {
                btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn3.setEnabled(false);
                
            }
            
            else if (h==3) {
                btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn4.setEnabled(false);
                
            }
            
            else if (h==4) {
                btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn5.setEnabled(false);
                
            }
            
            else if (h==5) {
                btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn6.setEnabled(false);
                
            }
            
            else if (h==6) {
                btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn7.setEnabled(false);
                
            }
            
            else if (h==7) {
                btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn8.setEnabled(false);
                
            }
            
            else if (h==8) {
                btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn9.setEnabled(false);
                
            }
            
            kontrol(); // /*Bilgisayar oynadıktan sonra kontrol işlemi çalışmalı ki kazanan bilgisayarda olabilr. */
                    
        }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oyun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_basla;
    private javax.swing.JButton btn_sifirla;
    private javax.swing.JButton btn_yenidenoyna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlist_skor;
    private javax.swing.JLabel label_bilgisayar;
    private javax.swing.JLabel label_oyuncu;
    private javax.swing.JPanel panel_durum;
    private javax.swing.JPanel panel_oyunalani;
    private javax.swing.JPanel panel_oyuncubilgi;
    private javax.swing.JPanel panel_skorlar;
    private javax.swing.JTextField txtf_oyuncuad;
    // End of variables declaration//GEN-END:variables
}
