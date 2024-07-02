/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Dionisius
 */
public class Main {
    /**
     * Context:
     *  In an e-commerce application, customers can choose different payment methods like Credit Card, PayPal, 
     *  or Cryptocurrency. Each payment method has its OWN processing logic. 
     *  The Strategy Pattern allows you to define a family of algorithms, encapsulate each one, and make them interchangeable. 
     *  This pattern lets the algorithm vary independently from the clients that use it
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkout(100.0);

        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(200.0);

        cart.setPaymentStrategy(new CryptoPayment("1A2b3C4d5E6f7G8h9I0j"));
        cart.checkout(300.0);
    }
}
