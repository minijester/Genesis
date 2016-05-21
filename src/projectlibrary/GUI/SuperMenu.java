/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.GUI;
import javax.swing.JFrame;


/**
 *
 * @author Minijester
 */
public abstract class SuperMenu extends JFrame{
    String status;
    String id;
    
    
    public void createAddbook(String status,String id){
        AddBook Add = new AddBook(id,status);
        Add.setVisible(true);
    }
    
    public void createBurrow(String status,String id){
        Burrow burrow = new Burrow(id,status);
        burrow.setVisible(true);
    }
    
    public void createBacklog(String status,String id){
        Backlog backlog = new Backlog(id,status);
        backlog.setVisible(true);
    }
    
    public void createBookSearching(String status,String id){
        BookSearching booksearch = new BookSearching(id,status);
        booksearch.setVisible(true);
    }
    
    public void createReturn(String status,String id){
        ReturnSystem re = new ReturnSystem(id,status);
        re.setVisible(true);
    }
    
    public void createInformation(String status,String id){
        Information c = new Information(id,status);
        c.setVisible(true);
    }
    
    /**public void createMenuAdmin(String status,String id){
        MainMenuAdmin mainad = new MainMenuAdmin(id,status);
        mainad.setVisible(true);
    }
    
    public void createMenuMember(String status,String id){
        MainMenu member = new MainMenu(id,status);
        member.setVisible(true);
    }*/
    
    public void createNewLogin(){
        Login log = new Login();
        log.setVisible(true);
    }
    
    public void createNewRegister(){
        Register regis = new Register();
        regis.setVisible(true);
    }
     
    public abstract void createMenu(String status,String id);
}


