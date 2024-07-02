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
class TrafficLight {
    private TrafficLightStateInterface state;

    public TrafficLight() {
        state = new RedLightState(); // Initial state
    }

    public void setState(TrafficLightStateInterface state) {
        this.state = state;
    }

    public void changeLight() {
        state.changeLight(this);
    }
}
