/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.GUI;

import javax.swing.JOptionPane;
import projectlibrary.database.dbRegis;

/**
 *
 * @author Sae
 */
public class Register extends SuperMenu {
    dbRegis regis = new dbRegis();
    
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
	this.setResizable(false);
    }
    
    public void doRegis(){
        boolean goregis = true;
        if (idtxt.getText().length() > 12 || idtxt.getText().length() < 4){
            JOptionPane.showMessageDialog(rootPane, "ID must be 4 - 12 characters");
            goregis = false;
        }
        if (passtxt.getPassword().length > 12 || passtxt.getPassword().length < 4){
            JOptionPane.showMessageDialog(rootPane, "Password must be 4 - 12 characters");
            goregis = false;
        }
        if (emailtxt.getText().isEmpty() || citizentxt.getText().isEmpty()|| nametxt.getText().isEmpty()
                || surtxt.getText().isEmpty()|| housedatetxt.getText().isEmpty()|| villagetxt.getText().isEmpty()
                || streettxt.getText().isEmpty()|| subdistricttxt.getText().isEmpty()|| districttxt.getText().isEmpty()
                || provincetxt.getText().isEmpty()|| postcodetxt.getText().isEmpty()|| phonenumtxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "All datafield must be field.");
            goregis = false;
        }

        if ( goregis == true){
            dbRegis.dbConnect();
            String str = String.valueOf(passtxt.getPassword());
            boolean check = regis.checkAlreadyHaveID(idtxt.getText());
            if(check == true){
                JOptionPane.showMessageDialog(rootPane, "Already have this ID in system");
            }
            else{
                regis.regis(idtxt.getText(), str, nametxt.getText(), surtxt.getText(),emailtxt.getText(),citizentxt.getText(),date.getSelectedItem(), month.getSelectedItem().toString(),
                        year.getSelectedItem(), housedatetxt.getText(), villagetxt.getText(), streettxt.getText(), subdistricttxt.getText(),
                        districttxt.getText(), provincetxt.getText(), postcodetxt.getText(), phonenumtxt.getText());
                regis.inputBacklog(idtxt.getText());
                /** SQL Insert
                String str = String.valueOf(passtxt.getPassword());
                String sql = "INSERT INTO LibrayAccount "
                        + "(Status,ID,Pass,Name,Surname,DateOfBirth,MonthBirth,YearBirth,HouseDate,Village,Street,SubDistrict,District,Province,PostCode,PhoneNum,BookInLoan)"
                        + "VALUES ('" + "Member" + "','"
                        + idtxt.getText() + "','"
                        + str + "','"
                        + nametxt.getText() + "','"
                        + surtxt.getText() + "','"
                        + date.getSelectedItem() + "','"
                        + month.getSelectedItem()+ "','"
                        + year.getSelectedItem() + "','"
                        + housedatetxt.getText() + "','"
                        + villagetxt.getText() + "','"
                        + streettxt.getText() + "','"
                        + subdistricttxt.getText() + "','"
                        + districttxt.getText() + "','"
                        + provincetxt.getText() + "','"
                        + postcodetxt.getText() + "','"
                        + phonenumtxt.getText() + "',' "
                        + "No" + "') ";
                System.out.println(sql);
                con.executeQuery(sql);

                String back = "INSERT INTO LibraryBacklog "
                        + "(ID,ISBN,BookName,BurrowDate,ReturnDate)"
                        + "VALUES ('" + idtxt.getText() + "','"
                        + 0 + "','"
                        + "/" + "','"
                        + "/" + "','"
                        + "/" + "') ";
                System.out.println(back);
                con.executeQuery(back);

                con.disconnect();*/
                JOptionPane.showMessageDialog(rootPane, "Register successfully");
                dbRegis.disconnect();
                dispose();
                createNewLogin();
            }
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        birth = new javax.swing.JLabel();
        housedate = new javax.swing.JLabel();
        village = new javax.swing.JLabel();
        street = new javax.swing.JLabel();
        subdistrict = new javax.swing.JLabel();
        district = new javax.swing.JLabel();
        province = new javax.swing.JLabel();
        postcode = new javax.swing.JLabel();
        phonenum = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        surtxt = new javax.swing.JTextField();
        housedatetxt = new javax.swing.JTextField();
        villagetxt = new javax.swing.JTextField();
        streettxt = new javax.swing.JTextField();
        subdistricttxt = new javax.swing.JTextField();
        districttxt = new javax.swing.JTextField();
        provincetxt = new javax.swing.JTextField();
        postcodetxt = new javax.swing.JTextField();
        phonenumtxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        date = new javax.swing.JComboBox();
        month = new javax.swing.JComboBox();
        year = new javax.swing.JComboBox();
        passtxt = new javax.swing.JPasswordField();
        email = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        citizen = new javax.swing.JLabel();
        citizentxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/Register system.png"))); // NOI18N

        id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id.setText("ID :");

        pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass.setText("Password : ");

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setText("Name :");

        surname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surname.setText("Surname :");

        birth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        birth.setText("Birthday :");

        housedate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        housedate.setText("HouseDate : ");

        village.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        village.setText("Village : ");

        street.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        street.setText("Street : ");

        subdistrict.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subdistrict.setText("Sub District : ");

        district.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        district.setText("District : ");

        province.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        province.setText("Province :");

        postcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        postcode.setText("PostCode : ");

        phonenum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phonenum.setText("PhoneNumber : ");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));

        email.setText("Email :");

        citizen.setText("CitizenID :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(postcode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(postcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subdistrict)
                            .addComponent(housedate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(subdistricttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(phonenum)
                                        .addGap(18, 18, 18)
                                        .addComponent(phonenumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton2)
                                            .addGap(75, 75, 75)
                                            .addComponent(jButton1))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(district)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(districttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(43, 43, 43)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(street)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(streettxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(province)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(provincetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(housedatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(village)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(surname)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(surtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(villagetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(birth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailtxt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(id)
                                .addGap(18, 18, 18)
                                .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass)
                            .addComponent(citizen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(citizentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id)
                    .addComponent(pass)
                    .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(citizen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(citizentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surname)
                    .addComponent(surtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birth)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(housedate)
                            .addComponent(housedatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(village)
                            .addComponent(villagetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(street)
                            .addComponent(streettxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subdistrict)
                            .addComponent(subdistricttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(district)
                            .addComponent(districttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(province)
                            .addComponent(provincetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postcode)
                            .addComponent(postcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonenum)
                            .addComponent(phonenumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        doRegis();
        
        /**boolean goregis = true;
        if (idtxt.getText().length() > 12 || idtxt.getText().length() < 4){
            JOptionPane.showMessageDialog(rootPane, "ID must be 4 - 12 characters");
            goregis = false;
        }
        if (passtxt.getPassword().length > 12 || passtxt.getPassword().length < 4){
            JOptionPane.showMessageDialog(rootPane, "Password must be 4 - 12 characters");
            goregis = false;
        }

        if ( goregis == true){
            String str = String.valueOf(passtxt.getPassword());
            regis.regis(idtxt.getText(), str, nametxt.getText(), surtxt.getText(), date.getSelectedItem(), month.getSelectedItem(),
                    year.getSelectedItem(), housedatetxt.getText(), villagetxt.getText(), streettxt.getText(), subdistricttxt.getText(),
                    districttxt.getText(), provincetxt.getText(), postcodetxt.getText(), phonenumtxt.getText());
             SQL Insert
            String str = String.valueOf(passtxt.getPassword());
            String sql = "INSERT INTO LibrayAccount "
                    + "(Status,ID,Pass,Name,Surname,DateOfBirth,MonthBirth,YearBirth,HouseDate,Village,Street,SubDistrict,District,Province,PostCode,PhoneNum,BookInLoan)"
                    + "VALUES ('" + "Member" + "','"
                    + idtxt.getText() + "','"
                    + str + "','"
                    + nametxt.getText() + "','"
                    + surtxt.getText() + "','"
                    + date.getSelectedItem() + "','"
                    + month.getSelectedItem()+ "','"
                    + year.getSelectedItem() + "','"
                    + housedatetxt.getText() + "','"
                    + villagetxt.getText() + "','"
                    + streettxt.getText() + "','"
                    + subdistricttxt.getText() + "','"
                    + districttxt.getText() + "','"
                    + provincetxt.getText() + "','"
                    + postcodetxt.getText() + "','"
                    + phonenumtxt.getText() + "',' "
                    + "No" + "') ";
            System.out.println(sql);
            con.executeQuery(sql);
            
            String back = "INSERT INTO LibraryBacklog "
                    + "(ID,ISBN,BookName,BurrowDate,ReturnDate)"
                    + "VALUES ('" + idtxt.getText() + "','"
                    + 0 + "','"
                    + "/" + "','"
                    + "/" + "','"
                    + "/" + "') ";
            System.out.println(back);
            con.executeQuery(back);
            
            con.disconnect();
            JOptionPane.showMessageDialog(rootPane, "Register successfully");
            dispose();
            createNewLogin();
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        // go back to login page
        FirstPage fp = new FirstPage();
        fp.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birth;
    private javax.swing.JLabel citizen;
    private javax.swing.JTextField citizentxt;
    private javax.swing.JComboBox date;
    private javax.swing.JLabel district;
    private javax.swing.JTextField districttxt;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel housedate;
    private javax.swing.JTextField housedatetxt;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox month;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JLabel phonenum;
    private javax.swing.JTextField phonenumtxt;
    private javax.swing.JLabel postcode;
    private javax.swing.JTextField postcodetxt;
    private javax.swing.JLabel province;
    private javax.swing.JTextField provincetxt;
    private javax.swing.JLabel street;
    private javax.swing.JTextField streettxt;
    private javax.swing.JLabel subdistrict;
    private javax.swing.JTextField subdistricttxt;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField surtxt;
    private javax.swing.JLabel village;
    private javax.swing.JTextField villagetxt;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables

    @Override
    public void createMenu(String status, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
