/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Timer;
import member.pembeliansaldomember;
import pulsa.pulsautama;
import rohmatcell.login;
import rohmatcell.transaksi;

/**
 *
 * @author arifika
 */
public class halamanadmin extends javax.swing.JFrame {

    /**
     * Creates new form halamanadmin
     */
    public halamanadmin(String user) {
        initComponents();
        labelUser.setText(user);
        
        
        ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
          Calendar cal = new GregorianCalendar();
        String nolJam = "";
        String nolMenit = "";
        String nolDetik = "";
        String nolTanggal = "";
        String nolBulan = "";
        String nolTahun = "";
        // Membuat Date
        Date dt = new Date();
        // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
        int nilaiJam = dt.getHours();
        int nilaiMenit = dt.getMinutes();
        int nilaiDetik = dt.getSeconds();
        int nilaiTanggal = cal.get(Calendar.DAY_OF_MONTH);
        int nilaiBulan = cal.get(Calendar.MONTH);
        
        int nilaiTahun = cal.get(Calendar.YEAR);
        // Jika nilai JAM lebih kecil dari 10 (hanya 1 digit)
        if (nilaiJam <= 9) {
          // Tambahkan "0" didepannya
          nolJam = "0";
        }
        // Jika nilai MENIT lebih kecil dari 10 (hanya 1 digit)
        if (nilaiMenit <= 9) {
          // Tambahkan "0" didepannya
          nolMenit = "0";
        }
        // Jika nilai DETIK lebih kecil dari 10 (hanya 1 digit)
        if (nilaiDetik <= 9) {
          // Tambahkan "0" didepannya
          nolDetik = "0";
        }
        if (nilaiTanggal<10){
            nolTanggal="0";
        }
        if ((nilaiBulan+1)<10){
            nolBulan="0";
        }
        if (nilaiTahun<10){
            nolTahun="0";
        }
        // Membuat String JAM, MENIT, DETIK
        String jam = nolJam + Integer.toString(nilaiJam);
        String menit = nolMenit + Integer.toString(nilaiMenit);
        String detik = nolDetik + Integer.toString(nilaiDetik);
        String tanggal = nolTanggal + Integer.toString(nilaiTanggal);
        String bulan = nolBulan + Integer.toString(nilaiBulan+1);
        String tahun = nolTahun + Integer.toString(nilaiTahun);
        // Menampilkan pada Layar
        tampiljam.setText(jam+":"+menit+":"+detik);
        tampiltanggal.setText(tahun+"-"+bulan+"-"+tanggal);
      }
    };
    // Timer
    new Timer(1000, taskPerformer).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        Transaksi = new javax.swing.JButton();
        pulsa = new javax.swing.JButton();
        kirimsaldo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        gambarbackground1 = new rohmatcell.gambarbackground();
        tampiltanggal = new javax.swing.JLabel();
        tampiljam = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(1110, 40, 130, 30);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Transaksi.setText("Transaksi");
        Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiActionPerformed(evt);
            }
        });
        Transaksi.setBounds(40, 40, 130, 30);
        jDesktopPane1.add(Transaksi, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pulsa.setText("Pulsa");
        pulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsaActionPerformed(evt);
            }
        });
        pulsa.setBounds(190, 40, 130, 30);
        jDesktopPane1.add(pulsa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        kirimsaldo.setText("Kirim Saldo");
        kirimsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kirimsaldoActionPerformed(evt);
            }
        });
        kirimsaldo.setBounds(530, 40, 140, 30);
        jDesktopPane1.add(kirimsaldo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Pendaftaran Member");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(340, 40, 170, 30);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tampiltanggal.setForeground(new java.awt.Color(255, 255, 255));
        tampiltanggal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tampiltanggal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tanggal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        tampiltanggal.setVerifyInputWhenFocusTarget(false);

        tampiljam.setForeground(new java.awt.Color(255, 255, 255));
        tampiljam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tampiljam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jam", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Exotc350 Bd BT", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login : ");

        labelUser.setFont(new java.awt.Font("Exotc350 Bd BT", 2, 18)); // NOI18N
        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout gambarbackground1Layout = new javax.swing.GroupLayout(gambarbackground1);
        gambarbackground1.setLayout(gambarbackground1Layout);
        gambarbackground1Layout.setHorizontalGroup(
            gambarbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gambarbackground1Layout.createSequentialGroup()
                .addContainerGap(781, Short.MAX_VALUE)
                .addGroup(gambarbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tampiltanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, gambarbackground1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(tampiljam, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(549, 549, 549))
            .addGroup(gambarbackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gambarbackground1Layout.setVerticalGroup(
            gambarbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambarbackground1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(gambarbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tampiltanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tampiljam, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 535, Short.MAX_VALUE)
                .addGroup(gambarbackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );

        gambarbackground1.setBounds(0, 0, 1540, 730);
        jDesktopPane1.add(gambarbackground1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1330, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login panggil = new login ();
        panggil.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiActionPerformed
        // TODO add your handling code here:
        String username = labelUser.getText().toString();
        transaksi panggil = new transaksi(username);
        jDesktopPane1.add(panggil);
        panggil.setLocation (150, 180);
        panggil.setVisible(true);
    }//GEN-LAST:event_TransaksiActionPerformed

    private void pulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsaActionPerformed
        // TODO add your handling code here:
        pulsautama panggil = new pulsautama();
        jDesktopPane1.add(panggil);
        panggil.setLocation (180, 108);
        panggil.setVisible(true);
    }//GEN-LAST:event_pulsaActionPerformed

    private void kirimsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kirimsaldoActionPerformed
        // TODO add your handling code here:
        String username = labelUser.getText().toString();
        kirimsaldo panggil = new kirimsaldo (username);
        jDesktopPane1.add(panggil);
        panggil.setLocation(160, 140);
        panggil.setVisible(true);
    }//GEN-LAST:event_kirimsaldoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        pendaftaranmember panggil = new pendaftaranmember ();
        jDesktopPane1.add(panggil);
        panggil.setLocation(180, 180);
        panggil.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Transaksi;
    private rohmatcell.gambarbackground gambarbackground1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton kirimsaldo;
    private javax.swing.JLabel labelUser;
    private javax.swing.JButton pulsa;
    private javax.swing.JLabel tampiljam;
    private javax.swing.JLabel tampiltanggal;
    // End of variables declaration//GEN-END:variables
}
