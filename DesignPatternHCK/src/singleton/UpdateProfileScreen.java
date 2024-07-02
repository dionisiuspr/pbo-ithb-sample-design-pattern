/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author hanschristian
 */
public class UpdateProfileScreen {
    
    public UpdateProfileScreen() {
       // Fetch data from EditText
       // Call controller to update profile data
       // Update Singleton data
        User updatedUser = new User();
        SingletonManager.getInstance().setUser(updatedUser);
    }
}
