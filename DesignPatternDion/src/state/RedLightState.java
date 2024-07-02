/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Dionisius
 */
class RedLightState implements TrafficLightStateInterface {
    public void changeLight(TrafficLight context) {
        System.out.println("Changing light to Green.");
        context.setState(new GreenLightState());
    }
}
