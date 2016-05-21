/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.database;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Minijester
 */
public class dbBurrow extends ConnectDB implements CheckInterface{
    
    public dbBurrow(){
        super();
    }
    
    @Override
    public ArrayList<HashMap> checkID(String user) {
        String sql = "SELECT * FROM LibrayAccount WHERE ID = '"+ user +"'";
        System.out.println(sql);
        ArrayList<HashMap> listuser = db.queryRows(sql);
        System.out.println(listuser);
        boolean delSuccess = db.executeQuery(sql);
        System.out.println(delSuccess);
        return listuser;
    }

    @Override
    public ArrayList<HashMap> checkBookISBN(String isbn) {
       String isb = "SELECT * FROM LibraryBook WHERE ISBN = '"+ isbn + "'";
       System.out.println(isb);
       ArrayList<HashMap> listISBN = db.queryRows(isb);
       System.out.println(listISBN);
       boolean delSuccess3 = db.executeQuery(isb);
       System.out.println(delSuccess3);
       return listISBN;
    }
    
    public ArrayList<HashMap> checkBookName(String bname) {
        String bb = "SELECT * FROM LibraryBook WHERE Title = '"+ bname + "'";
        System.out.println(bb);
        ArrayList<HashMap> listBookName = db.queryRows(bb);
        System.out.println(listBookName);
        boolean delSuccess2 = db.executeQuery(bb);
        System.out.println(delSuccess2);
        return listBookName;
    }
    
    public void UpdateBook(String isbn,String user,String date,String bname){
        // update status book
        String update = "UPDATE LibraryBook SET Status = '"+ "Loaned" +"'WHERE ISBN = '"+ isbn +"'";
        System.out.println(update);
        boolean delSuccess4 = db.executeQuery(update);
        System.out.println(delSuccess4);
        //update burrow date
        String updateday = "UPDATE LibraryBook SET BurrowDate = '"+date+"'WHERE ISBN = '"+ isbn +"'";
        System.out.println(updateday);
        Boolean delSucces5 = db.executeQuery(updateday);
        System.out.println(delSucces5);
        //update burrow by
        String updateby = "UPDATE LibraryBook SET BurrowBy = '"+ user+"' WHERE ISBN = '"+ isbn +"'";
        System.out.println(updateby);
        Boolean delSucces6 = db.executeQuery(updateby);
        System.out.println(delSucces6);
        //update book in loan (user)
        String updateinloan = "UPDATE LibrayAccount SET BookInLoan = '"+ bname+"'WHERE ID = '"+ user + "'";
        System.out.println(updateinloan);
        Boolean delSucces7 = db.executeQuery(updateinloan);
        System.out.println(delSucces7);
    }
}
