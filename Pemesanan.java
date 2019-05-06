/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUBES;


import static TUBES.konek.konekDB;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Pemesanan extends javax.swing.JFrame {
    
    
    
     private void kosong(){
        txtKodePesanan.setEditable(true);
        txtNoTenant.setText(null);
        txtjmlpesanan.setText(null);
        jComboBoxmakanan.setSelectedItem(null);
        txtharga.setText(null);
        txttotalharga.setText(null);
        txttotalpembayaran.setText(null);
     }
    
    private void tampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Pesanan");
        model.addColumn("No Tenant");
        model.addColumn("Menu Makanan");
        model.addColumn("Harga Makanan");
        model.addColumn("Jumlah Pesanan");
        model.addColumn("Total Harga");
        model.addColumn("Total Pembayaran");
        
        
        try{
            String sql = "select * from pemesanan";
            java.sql.Connection con = (Connection)konek.konekDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});   
            
            }
            tblpemesanan.setModel(model);
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }

    }
    
    public Pemesanan() throws SQLException {
        initComponents();
        konek DB = new konek();
        konekDB();
        tampil();
        kosong();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabelkodepesan = new javax.swing.JLabel();
        jLabeljmlpesanan = new javax.swing.JLabel();
        txtKodePesanan = new javax.swing.JTextField();
        txtNoTenant = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpemesanan = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabelnotenant = new javax.swing.JLabel();
        jLabelharga = new javax.swing.JLabel();
        jComboBoxmakanan = new javax.swing.JComboBox();
        lbltotalbayar = new javax.swing.JLabel();
        txttotalpembayaran = new javax.swing.JTextField();
        jButtonOrder = new javax.swing.JButton();
        jOptionPanebatal = new javax.swing.JOptionPane();
        jButtonbatal = new javax.swing.JButton();
        jButtonOrderbaru = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jLabelmenu1 = new javax.swing.JLabel();
        txtjmlpesanan = new javax.swing.JTextField();
        lbltotalharga = new javax.swing.JLabel();
        txttotalharga = new javax.swing.JTextField();
        jButtonkeluar = new javax.swing.JButton();
        btnhitung = new javax.swing.JButton();
        txtharga = new javax.swing.JTextField();
        btntotal = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelkodepesan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelkodepesan.setText("Kode Pesanan");

        jLabeljmlpesanan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabeljmlpesanan.setText("Jumlah Pesanan");

        txtKodePesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodePesananActionPerformed(evt);
            }
        });

        txtNoTenant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTenantActionPerformed(evt);
            }
        });

        tblpemesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(tblpemesanan);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("FORM PEMESANAN");
        jLabel5.setToolTipText("");

        jLabelnotenant.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelnotenant.setText("No Tenant");

        jLabelharga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelharga.setText("Harga Makanan");

        jComboBoxmakanan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nasi Goreng", "Nasi Sayur", "Mie Goreng", "Mie Rebus", "Ayam Geprek" }));
        jComboBoxmakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxmakananActionPerformed(evt);
            }
        });

        lbltotalbayar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbltotalbayar.setText("Total Pembayaran");

        txttotalpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalpembayaranActionPerformed(evt);
            }
        });

        jButtonOrder.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonOrder.setText("Pesan");
        jButtonOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrderActionPerformed(evt);
            }
        });

        jOptionPanebatal.setValue("Yakin Gak Mau Pesan?");
        jOptionPanebatal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonbatal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonbatal.setText("Batal");
        jButtonbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbatalActionPerformed(evt);
            }
        });

        jButtonOrderbaru.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonOrderbaru.setText("Order Baru");
        jButtonOrderbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrderbaruActionPerformed(evt);
            }
        });

        jButtonInsert.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonInsert.setText("Tambah");
        jButtonInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonInsertMouseClicked(evt);
            }
        });
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jLabelmenu1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelmenu1.setText("Menu Makanan");

        txtjmlpesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjmlpesananActionPerformed(evt);
            }
        });

        lbltotalharga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbltotalharga.setText("Total Harga");

        txttotalharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalhargaActionPerformed(evt);
            }
        });

        jButtonkeluar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonkeluar.setText("keluar");
        jButtonkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonkeluarActionPerformed(evt);
            }
        });

        btnhitung.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnhitung.setText("Hitung");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        btntotal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btntotal.setText("Total Bayar");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelkodepesan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeljmlpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtjmlpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKodePesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jComboBoxmakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelharga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtNoTenant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnhitung, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btntotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(lbltotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbltotalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txttotalpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelnotenant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonOrderbaru)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel5)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButtonOrderbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelkodepesan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKodePesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnotenant, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxmakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelharga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeljmlpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjmlpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhitung, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrderActionPerformed
        // TODO add your handling code here:
        dispose();
        DataPelanggan n = new DataPelanggan();
        n.setVisible(true); 
    }//GEN-LAST:event_jButtonOrderActionPerformed

    private void txttotalpembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalpembayaranActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txttotalpembayaranActionPerformed

    private void jComboBoxmakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxmakananActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jComboBoxmakananActionPerformed

    private void txtNoTenantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoTenantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoTenantActionPerformed

    private void txtKodePesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodePesananActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtKodePesananActionPerformed

    private void jButtonbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbatalActionPerformed
        // TODO add your handling code here:
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        if(JOptionPane.showConfirmDialog(this,"Yakin Tidak Mau Pesan?","Exit",JOptionPane.YES_NO_OPTION)==0)
        { setDefaultCloseOperation(EXIT_ON_CLOSE); }
    }//GEN-LAST:event_jButtonbatalActionPerformed

    private void jButtonOrderbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrderbaruActionPerformed
        // TODO add your handling code here:
        txtKodePesanan.setEditable(true);
        txtNoTenant.setText("");
        txtjmlpesanan.setText("");
        jComboBoxmakanan.setSelectedItem("");
        txtharga.setText("");
        txttotalharga.setText("");
        txttotalpembayaran.setText("");
        
    }//GEN-LAST:event_jButtonOrderbaruActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "insert into pemesanan values ('"+txtKodePesanan.getText()+"','"+txtNoTenant.getText()+"','"+jComboBoxmakanan.getSelectedItem()+"','"+txtharga.getText()+"','"+txtjmlpesanan.getText()+"','"+txttotalharga.getText()+"','"+txttotalpembayaran.getText()+"')";
            java.sql.Connection con = (Connection)konek.konekDB();
            java.sql.PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses insert data berhasil..");
            tampil();
            kosong();
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInsertMouseClicked
        // TODO add your handling code here:
        
        
        int baris = tblpemesanan.rowAtPoint(evt.getPoint());
        
        String kode = tblpemesanan.getValueAt(baris, 0).toString();
        txtKodePesanan.setText(kode);
        
        String tenant = tblpemesanan.getValueAt(baris, 1).toString();
        txtNoTenant.setText(tenant);
        
        String makanan = tblpemesanan.getValueAt(baris, 2).toString();
        jComboBoxmakanan.setSelectedItem(makanan);
        
        String harga = tblpemesanan.getValueAt(baris, 3).toString();
        txtharga.setText(harga);
        
        String jumlah = tblpemesanan.getValueAt(baris, 4).toString();
        txtjmlpesanan.setText(jumlah);
        
        String total = tblpemesanan.getValueAt(baris, 5).toString();
        txttotalharga.setText(total);
        
        String pembayaran = tblpemesanan.getValueAt(baris, 6).toString();
        txttotalpembayaran.setText(pembayaran);
    }//GEN-LAST:event_jButtonInsertMouseClicked

    private void txtjmlpesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjmlpesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjmlpesananActionPerformed

    private void txttotalhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalhargaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttotalhargaActionPerformed

    private void jButtonkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonkeluarActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        // TODO add your handling code here:
        int jml=Integer.parseInt(txtjmlpesanan.getText());
        int hrg=Integer.parseInt(txtharga.getText());
        int ttl=jml*hrg;
        txttotalharga.setText(""+ttl);
        
    }//GEN-LAST:event_btnhitungActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
        txtharga.setText("12000");
        //txtharga.getText();
    }//GEN-LAST:event_txthargaActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        // TODO add your handling code here:
        int jml=Integer.parseInt(txtjmlpesanan.getText());
        int hrg=Integer.parseInt(txtharga.getText());
        int ttl=jml*hrg;
        txttotalpembayaran.setText(""+ttl);
    }//GEN-LAST:event_btntotalActionPerformed

    /**a
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Pemesanan().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Pemesanan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btntotal;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonOrder;
    private javax.swing.JButton jButtonOrderbaru;
    private javax.swing.JButton jButtonbatal;
    private javax.swing.JButton jButtonkeluar;
    private javax.swing.JComboBox jComboBoxmakanan;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelharga;
    private javax.swing.JLabel jLabeljmlpesanan;
    private javax.swing.JLabel jLabelkodepesan;
    private javax.swing.JLabel jLabelmenu1;
    private javax.swing.JLabel jLabelnotenant;
    private javax.swing.JOptionPane jOptionPanebatal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltotalbayar;
    private javax.swing.JLabel lbltotalharga;
    private javax.swing.JTable tblpemesanan;
    private javax.swing.JTextField txtKodePesanan;
    private javax.swing.JTextField txtNoTenant;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjmlpesanan;
    private javax.swing.JTextField txttotalharga;
    private javax.swing.JTextField txttotalpembayaran;
    // End of variables declaration//GEN-END:variables
}
