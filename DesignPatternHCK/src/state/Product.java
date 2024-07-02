/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author hanschristian
 */
public class Product {
    public enum ProductStatus {
        PAID, SHIPMENT, RECEIVED, CANCELLED;
    }
    
    String name;
    int harga;
//    String penerima = "";
//    String kurir = "";
    ProductStatus status = ProductStatus.PAID;
    ProductInterface state = new PaidState();
    
    public void updateState() {
        state.update(this);
    }

    public void setState(ProductInterface state) {
        this.state = state;
    }

    public void kirim() {
        // send data to courier
    }

    public void receivedByCustomer() {
        // send money to seller
    }
    
    public void complaint() {
        if(status == ProductStatus.RECEIVED) {
            // if barang received -> user submit complaint
        } else {
            System.out.println("Product not yet received");
        }
    }

    public void cancel() {
        // if barang belum dikirim -> user can cancel
    }
}
