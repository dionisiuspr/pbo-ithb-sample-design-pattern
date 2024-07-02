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
class Main {
    /**
     * 
     * The Adapter Pattern allows incompatible interfaces to work together. 
     * It acts as a bridge between two incompatible interfaces by converting 
     * one interface into another that a client expects.
     */
    public static void main(String[] args) {
        Phone phone = new Phone();
        Charger microUSBCharger = new MicroUSBAdapter(phone);
        Charger usbCCharger = new USBcAdapter();
        Charger lightningCharger = new LightningAdapter();

        microUSBCharger.charge(); // Charging with Micro-USB
        usbCCharger.charge();     // Charging with USB-C
        lightningCharger.charge(); // Charging with Lightning
    }
}
