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
public class Main {
    /**
     * 
     * The State Pattern allows an object to alter its behavior when its 
     * internal state changes. The object will appear to change its class.
     * --> RedLightState: When the light is red, the NEXT state will be green.
     * --> YellowLightState: When the light is yellow, the NEXT state will be red.
     * --> GreenLightState: When the light is green, the NEXT state will be yellow
     * This cycle ensures that the traffic light transitions in the 
     * correct sequence: Red → Green → Yellow → Red.
     * // context: The object whose behavior depends on its state
     */
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.changeLight(); // Changing light to Green.
        trafficLight.changeLight(); // Changing light to Yellow.
        trafficLight.changeLight(); // Changing light to Red.

    }
}
