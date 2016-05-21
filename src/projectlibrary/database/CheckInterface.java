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
public interface CheckInterface {
    public ArrayList<HashMap> checkID(String user);
    public ArrayList<HashMap> checkBookISBN(String isbn);
}
