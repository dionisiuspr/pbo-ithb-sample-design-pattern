/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanschristian
 */
public class DatabaseController implements DataInterface {
    private static DatabaseController instance;

    // public static DatabaseController getInstance() {
    //     if(instance ==  null) {
    //         instance = new DatabaseController();
    //     }
    //     return instance;
    // }

    @Override
    public List<String> getNames() {
        System.out.println("Get Names from Database");
        List<String> listName = new ArrayList<>();
        // database connection query getListName
        return listName;
    }
}
