/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.lang.reflect.Array;
import java.util.List;

/**
 *
 * @author hanschristian
 */
public class MainStrategy {

    public static void main(String[] args) {
        // Non-Strategy
       DatabaseController dbController = new DatabaseController();
       DummyController dummyController = new DummyController();
       List<String> listNames = dummyController.getNames();

        // Non-Strategy With Singleton
        // List<String> listNames = DatabaseController.getInstance().getNames();
        // List<String> listNames = DummyController.getInstance().getNames();

        // Strategy
        List<String> listName = DataRepository.getInstance().getNames();
    }
}
