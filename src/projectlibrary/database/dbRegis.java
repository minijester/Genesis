/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.database;

import java.util.ArrayList;
import java.util.HashMap;
import static projectlibrary.database.ConnectDB.db;

/**
 *
 * @author Minijester
 */
public class dbRegis extends ConnectDB  {
    
    public dbRegis(){
        super();
    }
    
    public boolean checkAlreadyHaveID(String user){
        boolean have = false;
        
        String check = "SELECT * FROM LibrayAccount where userID = '"+ user + "'";
        ArrayList<HashMap> id = db.queryRows(check);
        if(!id.isEmpty()){
            have = true;
        }
        return have;
    }
    
    public void regis(String id,String pass,String name,String surname,String email,String citizenID,
                        Object date,String month, Object year, String hdate,
                        String village,String street,String subdistrict,String district,
                        String province,String postcode,String phone){
        
        String sql = "INSERT INTO LibrayAccount "
                    + "(userID,status,pass,email,citizenID,name,surname,DateOfBirth,MonthBirth,YearBirth,address,village,street,sub_district,district,province,postCode,phoneNum,bookinloan)"
                    + "VALUES ('" + id + "','"
                    + "Member" + "','"
                    + pass + "','"
                    + email + "','"
                    + citizenID + "','"
                    + name + "','"
                    + surname + "','"
                    + date + "','"
                    + month+ "','"
                    + year + "','"
                    + hdate + "','"
                    + village + "','"
                    + street + "','"
                    + subdistrict + "','"
                    + district + "','"
                    + province + "','"
                    + postcode + "','"
                    + phone + "',' "
                    + "No" + "') ";
        System.out.println(sql);
        db.executeQuery(sql);
    }
           
        public void inputBacklog(String id){
            String back = "INSERT INTO LibraryBacklog "
                        + "(ID,ISBN,BookName,BurrowDate,ReturnDate)"
                        + "VALUES ('" + id + "','"
                        + 0 + "','"
                        + "/" + "','"
                        + "/" + "','"
                        + "/" + "') ";
            System.out.println(back);
            db.executeQuery(back);
        }
}
