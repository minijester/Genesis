/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.GUI;

import edu.sit.cs.db.CSDbDelegate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import projectlibrary.database.dbBurrow;

/**
 *
 * @author Sae
 */
public class Burrow extends SuperMenu {

    dbBurrow burr = new dbBurrow();

    
    public Burrow(String id,String status) {
        this.status = status;
        this.id = id;
        initComponents();
        this.setLocationRelativeTo(null);
	this.setResizable(false);
    }
    
    @Override
    public void createMenu(String status, String id) {
        if(status.equals("Member")){
            MainMenu member = new MainMenu(id,status);
            member.setVisible(true);
        }
        else{
            MainMenuAdmin mainad = new MainMenuAdmin(id,status);
            mainad.setVisible(true);
        }
    }
    
    public void burrowBook(){
        
        dbBurrow.dbConnect();
        DateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String datebu = formater.format(datepick.getDate());
        
        if(!usertxt.getText().isEmpty() && !booknametxt.getText().isEmpty() && !isbntxt.getText().isEmpty() && !booknametxt.getText().isEmpty()
                && datepick.getDate().toString() != null){
            //CSDbDelegate db = new CSDbDelegate("128.199.117.93", "3306", "genius", "user", "iloveoosd");
            //db.connect();
            // check id
            ArrayList<HashMap> list = burr.checkID(usertxt.getText());
            System.out.println(list);
            /**String sql = "SELECT * FROM LibrayAccount WHERE userID = '"+ usertxt.getText()+ "'";
            System.out.println(sql);
            ArrayList<HashMap> list = db.queryRows(sql);
            System.out.println(list);
            boolean delSuccess = db.executeQuery(sql);
            System.out.println(delSuccess);*/
            
            if(list.isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "Sorry, don't have this ID in system");
                }
            else{
                for(HashMap l : list){
                    System.out.println(l);
                    System.out.println(l.get("bookinloan"));
                    if(l.get("bookinloan").equals(" No")){
                        
                        // check bookname
                        ArrayList<HashMap> list2 = burr.checkBookName(booknametxt.getText());
                        /**String bb = "SELECT * FROM LibraryBook WHERE Title = '"+ booknametxt.getText()+ "'";
                        System.out.println(bb);
                        ArrayList<HashMap> list2 = db.queryRows(bb);
                        System.out.println(list2);
                        boolean delSuccess2 = db.executeQuery(bb);
                        System.out.println(delSuccess2);*/
                        if(list.isEmpty()){ // don't found book name
                            JOptionPane.showMessageDialog(rootPane, "Sorry, don't have this book in system");
                        }
                        else{
                            for(HashMap l2 : list2){
                                if(l2.get("ISBN").equals(isbntxt.getText())){
                                    //check isbn
                                    ArrayList<HashMap>list3 = burr.checkBookISBN(isbntxt.getText());
                                    /**String isb = "SELECT * FROM LibraryBook WHERE ISBN = '"+ isbntxt.getText()+ "'";
                                    System.out.println(isb);
                                    ArrayList<HashMap> list3 = db.queryRows(isb);
                                    System.out.println(list3);
                                    boolean delSuccess3 = db.executeQuery(isb);
                                    System.out.println(delSuccess3);*/
                                    if(list.isEmpty()){//don't found this isbn
                                        JOptionPane.showMessageDialog(rootPane, "Sorry, don't have this book in system");
                                        break;
                                    }  
                                    else{
                                        for(HashMap l3 : list3){
                                            //check status book
                                            if(l3.get("Status").equals("available")){
                                                burr.UpdateBook(isbntxt.getText(), usertxt.getText(), datebu, booknametxt.getText());
                                                
                                                /** update status book
                                                String update = "UPDATE LibraryBook SET Status = '"+ "Loaned" +"'WHERE ISBN = '"+isbntxt.getText() +"'";
                                                System.out.println(update);
                                                boolean delSuccess4 = db.executeQuery(update);
                                                System.out.println(delSuccess4);
                                                //update burrow date
                                                String updateday = "UPDATE LibraryBook SET BurrowDate = '"+x+"'WHERE ISBN = '"+isbntxt.getText() +"'";
                                                System.out.println(updateday);
                                                Boolean delSucces5 = db.executeQuery(updateday);
                                                System.out.println(delSucces5);
                                                //update burrow by
                                                String updateby = "UPDATE LibraryBook SET BurrowBy = '"+usertxt.getText()+"' WHERE ISBN = '"+isbntxt.getText() +"'";
                                                System.out.println(updateby);
                                                Boolean delSucces6 = db.executeQuery(updateby);
                                                System.out.println(delSucces6);
                                                //update book in loan (user)
                                                String updateinloan = "UPDATE LibrayAccount SET BookInLoan = '"+booknametxt.getText()+"'WHERE ID = '"+ usertxt.getText() + "'";
                                                System.out.println(updateinloan);
                                                Boolean delSucces7 = db.executeQuery(updateinloan);
                                                System.out.println(delSucces7);*/
          
                                                JOptionPane.showMessageDialog(rootPane, "Burrow finished !");
                                                break;
                                            }
                                            else{
                                                    JOptionPane.showMessageDialog(rootPane, "This book already in loadned");
                                                    break;
                                                }
                                            }
                                        }
                                }
                            }
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "You have already burrow the book, please return it before burrow new book");
                    }
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Please insert all of the data in the box");
        }
        dbBurrow.disconnect();
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        burrowSystem = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        bookname = new javax.swing.JLabel();
        isbn = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        booknametxt = new javax.swing.JTextField();
        isbntxt = new javax.swing.JTextField();
        burrow = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        datepick = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Burrow System");
        setResizable(false);

        burrowSystem.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        burrowSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/Borrow.png"))); // NOI18N

        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user.setText("User :");

        bookname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookname.setText("Book name : ");

        isbn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        isbn.setText("ISBN : ");

        usertxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        booknametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        isbntxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        burrow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        burrow.setText("Burrow");
        burrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burrowActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.setText("Date : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancel)
                .addGap(50, 50, 50)
                .addComponent(burrow)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookname)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(booknametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isbn)
                            .addComponent(date))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isbntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datepick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(burrowSystem)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(burrowSystem)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookname)
                    .addComponent(booknametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbn)
                    .addComponent(isbntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(datepick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burrow)
                    .addComponent(cancel))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void burrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burrowActionPerformed
        burrowBook();
    }//GEN-LAST:event_burrowActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
        createMenu(status, id);
        // go back to admin mainmenu
    }//GEN-LAST:event_cancelActionPerformed

    private void datepickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datepickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datepickActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookname;
    private javax.swing.JTextField booknametxt;
    private javax.swing.JButton burrow;
    private javax.swing.JLabel burrowSystem;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel date;
    private org.jdesktop.swingx.JXDatePicker datepick;
    private javax.swing.JLabel isbn;
    private javax.swing.JTextField isbntxt;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
