/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Dionisius
 */
class LightningAdapter implements Charger {
    public void charge() {
        System.out.println("Charging with Lightning");
    }
}