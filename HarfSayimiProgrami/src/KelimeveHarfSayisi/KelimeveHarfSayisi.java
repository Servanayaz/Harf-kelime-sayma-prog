//JTextArea
package KelimeveHarfSayisi;


public class KelimeveHarfSayisi extends javax.swing.JFrame {

    
    public KelimeveHarfSayisi() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        yaziAlani = new javax.swing.JTextArea();
        goster = new javax.swing.JButton();
        kelimeAlani = new javax.swing.JLabel();
        harfAlani = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kelime ve Harf Sayisi");

        yaziAlani.setColumns(20);
        yaziAlani.setRows(5);
        jScrollPane1.setViewportView(yaziAlani);

        goster.setText("Kelime ve Harf Sayısı Göster");
        goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gosterActionPerformed(evt);
            }
        });

        kelimeAlani.setText("Kelime Sayısı : ");

        harfAlani.setText("Harf Sayısı : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(kelimeAlani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(harfAlani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(goster)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(kelimeAlani)
                .addGap(15, 15, 15)
                .addComponent(harfAlani)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(goster)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterActionPerformed
        String yazi=yaziAlani.getText();
        
        int karakterSayisi = 0, kelimeSayisi=0;
        
        for (int i = 0; i < yazi.length() ; i++) {
            if (yazi.charAt(i)!=' ') {
                karakterSayisi++;
            }
        }
        
        String [] kelimeArr=yazi.split(" ");
        for (String string : kelimeArr) {
            kelimeSayisi++;
        }
        
        kelimeAlani.setText("Kelime Sayısı : "+kelimeSayisi);
        harfAlani.setText("Harf Sayısı : "+karakterSayisi);
    }//GEN-LAST:event_gosterActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelimeveHarfSayisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goster;
    private javax.swing.JLabel harfAlani;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kelimeAlani;
    private javax.swing.JTextArea yaziAlani;
    // End of variables declaration//GEN-END:variables
}
