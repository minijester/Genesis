/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.database;

/**
 *
 * @author Minijester
 */
public class dbRegis extends ConnectDB {
    
    public dbRegis(){
        super();
    }
    
    public void regis(String id,String pass,String name,String surname,Object date,Object month, Object year, String hdate,
                        String village,String street,String subdistrict,String district,String province,String postcode,String phone){
        
        String sql = "INSERT INTO LibrayAccount "
                    + "(Status,ID,Pass,Name,Surname,DateOfBirth,MonthBirth,YearBirth,HouseDate,Village,Street,SubDistrict,District,Province,PostCode,PhoneNum,BookInLoan)"
                    + "VALUES ('" + "Member" + "','"
                    + id + "','"
                    + pass + "','"
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
