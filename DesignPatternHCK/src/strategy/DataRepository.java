/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author hanschristian
 */
public class DataRepository {

    private static DataInterface instance;

    public static DataInterface getInstance() {
        if (instance == null) {
            instance = new DatabaseController();
            /**
             * If aplikasi nya dibuild versi local return DummyController()
             * Else if aplikasi build versi play store return DatabaseController()
             */
        }
        return instance;
    }
}
