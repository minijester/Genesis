/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.GUI;

/**
 *
 * @author Sae
 */
public class MainMenu extends javax.swing.JFrame {

    String status;
    String id;
    public MainMenu(String id,String status) {
        initComponents();
        this.status = status;
        this.id = id;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        library = new javax.swing.JLabel();
        info = new javax.swing.JButton();
        search = new javax.swing.JButton();
        backlog = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Member");
        setResizable(false);

        library.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        library.setText("Library System");

        info.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Information icon.png"))); // NOI18N
        info.setText("Check Information");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book-icon.png"))); // NOI18N
        search.setText("Book Searching");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        backlog.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        backlog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notepad-icon.png"))); // NOI18N
        backlog.setText("Backlog");
        backlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backlogActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(info)
                .addGap(26, 26, 26)
                .addComponent(search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backlog, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logout)
                        .addGap(209, 209, 209))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(library)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(library)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(backlog, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(logout)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        dispose();
        BookSearching bs = new BookSearching(id,status);
        bs.setVisible(true);
    }//GEN-LAST:event_searchActionPerformed

    private void backlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backlogActionPerformed
        dispose();
        Backlog bl = new Backlog(id,status);
        bl.setVisible(true);
    }//GEN-LAST:event_backlogActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
         dispose();
        Information c = new Information(id,status);
        c.setVisible(true);
                            
    }//GEN-LAST:event_infoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backlog;
    private javax.swing.JButton info;
    private javax.swing.JLabel library;
    private javax.swing.JButton logout;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}