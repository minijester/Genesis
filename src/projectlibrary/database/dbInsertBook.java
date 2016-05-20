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
public class dbInsertBook extends ConnectDB {
    
    public dbInsertBook(){
        super();
    }
    
    public void Insert(String isbn, String title, String author, String price){
        String sql = "INSERT INTO LibraryBook (ISBN,Title,Authors,Prices,Status,BurrowBy,BurrowDate) VALUES("
               + isbn +",'"
               + title +"','"
               + author +"',"
               + price +",'"
               + "available" +"','"
               + "no" +"','"
               + "no" +"'"
               +")";
        db.executeQuery(sql);
    }
}
