/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author hanschristian
 */
public class LogInScreen {
    
    User user;
    
    public LogInScreen() {
        // input username password
        // check select to database
        user = new User();
//      user = Controller.getUserData();
        NonSingletonManager.setLoggedInUser(user);
        // new SingletonManager().setUser(user);
        SingletonManager.getInstance().setUser(user);
        SingletonManager.getInstance().getUser();
    }
}
