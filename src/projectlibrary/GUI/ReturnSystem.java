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

/**
 *
 * @author Sae
 */
public class ReturnSystem extends javax.swing.JFrame {

    CSDbDelegate db;
    String status;
    String id;
    public ReturnSystem(String id,String status) {
        super("Register System");
        this.status = status;
        this.id = id;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnsys = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        isbn = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        isbntxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        penalty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Return System");
        setResizable(false);

        returnsys.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        returnsys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/Return.png"))); // NOI18N

        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user.setText("User : ");

        isbn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        isbn.setText("ISBN : ");

        usertxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        isbntxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.setText("Date : ");

        penalty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        penalty.setText("Penalty : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(user))
                    .addComponent(isbn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isbntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(returnsys)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(penalty, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(returnsys)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbn)
                    .addComponent(isbntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(date)
                .addGap(28, 28, 28)
                .addComponent(penalty)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String x = formater.format(datepick.getDate());
        System.out.println(x);
        int day = 0;
        if(x.substring(3,5).equals("01")){
            day+=0+ Integer.parseInt(x.substring(0,2));
        }
        if(x.substring(3,5).equals("02")){
            day+=31 + Integer.parseInt(x.substring(0,2));
        }
        if(Integer.parseInt(x.substring(6))-543 % 4 ==0){
            if(x.substring(3,5).equals("03")){
                day+=31+29 + Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("04")){
                day+=31+29+31+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("05")){
                day+=31+29+31+30+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("06")){
                day+=31+29+31+30+31+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("07")){
                day+=31+29+31+30+31+30+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("08")){
                day+=31+29+31+30+31+30+31+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("09")){
                day+=31+29+31+30+31+30+31+30+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("10")){
                day+=31+29+31+30+31+30+31+31+30+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("11")){
                day+=31+29+31+30+31+30+31+31+30+31+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("12")){
                day+=31+29+31+30+31+30+31+31+30+31+30+ Integer.parseInt(x.substring(0,2));
            }
        }
        else{
            if(x.substring(3,5).equals("03")){
                day+=31+28+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("04")){
                day+=31+28+31+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("05")){
                day+=31+28+31+30+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("06")){
                day+=31+28+31+30+31+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("07")){
                day+=31+28+31+30+31+30+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("08")){
                day+=31+28+31+30+31+30+31+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("09")){
                day+=31+28+31+30+31+30+31+31+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("10")){
                day+=31+28+31+30+31+30+31+31+30+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("11")){
                day+=31+28+31+30+31+30+31+31+30+31+ Integer.parseInt(x.substring(0,2));
            }
            if(x.substring(3,5).equals("12")){
                day+=31+28+31+30+31+30+31+31+30+31+30+ Integer.parseInt(x.substring(0,2));
            }
        }
        
        
        if(!usertxt.getText().isEmpty() && !isbntxt.getText().isEmpty()){
            CSDbDelegate db = new CSDbDelegate("cs14sitkmutt.me","3306","CSC105_G1","CSC105_G1","CSC105_G1");
            db.connect();
            String sql = "SELECT * FROM LibrayAccount WHERE ID = '"+ usertxt.getText()+ "'";
            System.out.println(sql);
            ArrayList<HashMap> list = db.queryRows(sql);
            System.out.println(list);
            boolean delSuccess = db.executeQuery(sql);
            System.out.println(delSuccess);
            if(list.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Sorry, don't have this ID in system");
            }
            else{
                for(HashMap l : list){
                    if(l.get("ID").equals(usertxt.getText())){
                        String bb = "SELECT * FROM LibraryBook WHERE ISBN = '"+ isbntxt.getText()+ "'";
                        System.out.println(bb);
                        ArrayList<HashMap> list2 = db.queryRows(bb);
                        System.out.println(list2);
                        boolean delSuccess2 = db.executeQuery(bb);
                        System.out.println(delSuccess2);
                        if(list.isEmpty()){ // don't found book name
                            JOptionPane.showMessageDialog(rootPane, "Sorry, don't have this book in system");
                        }
                        else{
                            for(HashMap l2 : list2){
                                //check id burrow this book
                                if(l.get("ID").equals(l2.get("BurrowBy"))){
                                //check user status
                                    if(l2.get("Status").equals("Loaned")){
                                        // update book status
                                        String update = "UPDATE LibraryBook SET Status = '"+ "Available" +"'WHERE ISBN = '"+isbntxt.getText() +"'";
                                        System.out.println(update);
                                        boolean delSuccess4 = db.executeQuery(update);
                                        System.out.println(delSuccess4);
                                        //get burrowdate
                                        String dateburr = l2.get("BurrowDate").toString();
                                        System.out.println(dateburr);
                                        int day2 = 0;
                                        if(dateburr.substring(3,5).equals("01")){
                                            day2+=0+ Integer.parseInt(dateburr.substring(0,2));
                                        }
                                        if(dateburr.substring(3,5).equals("02")){
                                            day2+=31+Integer.parseInt(dateburr.substring(0,2));
                                        }
                                        if(Integer.parseInt(dateburr.substring(6))-543 % 4 ==0){
                                            if(dateburr.substring(3,5).equals("03")){
                                                day2+=31+29+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("04")){
                                                day2+=31+29+31+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("05")){
                                                day2+=31+29+31+30+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("06")){
                                                day2+=31+29+31+30+31+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("07")){
                                                day2+=31+29+31+30+31+30+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("08")){
                                                day2+=31+29+31+30+31+30+31+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("09")){
                                                day2+=31+29+31+30+31+30+31+30+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("10")){
                                                day2+=31+29+31+30+31+30+31+31+30+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("11")){
                                                day2+=31+29+31+30+31+30+31+31+30+31+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("12")){
                                                day2+=31+29+31+30+31+30+31+31+30+31+30+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                        }
                                        else{
                                            if(dateburr.substring(3,5).equals("03")){
                                                day2+=31+28+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("04")){
                                                day2+=31+28+31+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("05")){
                                                day2+=31+28+31+30+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("06")){
                                                day2+=31+28+31+30+31+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("07")){
                                                day2+=31+28+31+30+31+30+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("08")){
                                                day2+=31+28+31+30+31+30+31+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("09")){
                                                day2+=31+28+31+30+31+30+31+31+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("10")){
                                                day2+=31+28+31+30+31+30+31+31+30+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("11")){
                                                day2+=31+28+31+30+31+30+31+31+30+31+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                            if(dateburr.substring(3,5).equals("12")){
                                                day2+=31+28+31+30+31+30+31+31+30+31+30+Integer.parseInt(dateburr.substring(0,2));
                                            }
                                        }
                                        int returndate = day;
                                        int burrowdate = day2;
                                        int penal = returndate - burrowdate;
                                        System.out.println(returndate + ""); //137
                                        System.out.println(burrowdate + ""); //133

                                        //update book burrowdate
                                        String updateday = "UPDATE LibraryBook SET BurrowDate = '"+ "No" +"'WHERE ISBN = '"+isbntxt.getText()+"'";
                                        System.out.println(updateday);
                                        Boolean delSucces5 = db.executeQuery(updateday);
                                        System.out.println(delSucces5);
                                        //update book burrow by ...
                                        String updateby = "UPDATE LibraryBook SET BurrowBy = '"+ "No" +"'WHERE ISBN = '"+isbntxt.getText() +"'";
                                        System.out.println(updateby);
                                        Boolean delSucces6 = db.executeQuery(updateby);
                                        System.out.println(delSucces6);
                                        String updateinloan = "UPDATE LibrayAccount SET BookInLoan = '"+ " No" +"'WHERE ID = '"+usertxt.getText() +"'";
                                        System.out.println(updateinloan);
                                        Boolean delSucces7 = db.executeQuery(updateinloan);
                                        System.out.println(delSucces7);

                                        //SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
                                        //String date = formater.format(datepick.getDate());
                                        //System.out.println(date);
                                        if(penal > 4){
                                            JOptionPane.showMessageDialog(rootPane, "You return late !");
                                            penalty.setText("Penalty : " + (penal-4)*10);
                                        }
                                        String updateback = "UPDATE LibraryBacklog SET ReturnDate = '"+ x +"'WHERE ID = '"+usertxt.getText() +"'";
                                        System.out.println(updateback);
                                        Boolean delSucces8 = db.executeQuery(updateback);
                                        System.out.println(delSucces8);

                                        String updatebackisbn = "UPDATE LibraryBacklog SET ISBN = '"+isbntxt.getText()+"'WHERE ID = '"+ usertxt.getText() + "'";
                                        System.out.println(updatebackisbn);
                                        Boolean delSucces4 = db.executeQuery(updatebackisbn);
                                        System.out.println(delSucces4);

                                        String updatebackbur = "UPDATE LibraryBacklog SET BurrowDate = '"+dateburr+"'WHERE ID = '"+ usertxt.getText() + "'";
                                        System.out.println(updatebackbur);
                                        Boolean delSucces9 = db.executeQuery(updatebackbur);
                                        System.out.println(delSucces9);

                                        //String book = l2.get("BookName").toString();
                                        String updatebackre = "UPDATE LibraryBacklog SET BookName = '"+l2.get("Title")+"'WHERE ID = '"+ usertxt.getText() + "'";
                                        System.out.println(updatebackre);
                                        Boolean delSucces10 = db.executeQuery(updatebackre);
                                        System.out.println(delSucces10);
                                        JOptionPane.showMessageDialog(rootPane, "Return finished !");
                                        break;    
                                    }
                                }
                                else{
                                    JOptionPane.showConfirmDialog(rootPane, "This ID hasn't burrow any book");
                                 }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        MainMenuAdmin mainad = new MainMenuAdmin(id,status);
        mainad.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel isbn;
    private javax.swing.JTextField isbntxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel penalty;
    private javax.swing.JLabel returnsys;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
