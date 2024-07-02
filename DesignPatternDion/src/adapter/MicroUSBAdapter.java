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
class MicroUSBAdapter implements Charger {
    private Phone phone;

    public MicroUSBAdapter(Phone phone) {
        this.phone = phone;
    }

    public void charge() {
        phone.chargeWithMicroUSB();
    }
}