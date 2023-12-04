package org.chumsy.Services.ServiceImplementation;

import org.chumsy.Entities.Cashier;
import org.chumsy.Entities.Customer;
import org.chumsy.Entities.Product;
import org.chumsy.Services.CashierServices;

public class CashierServicesImpl implements CashierServices {

    private String balance;


    @Override
    public String dispenseReceipt(Cashier cashier, Product product, Customer customer) {
            double productPrice = product.getPrice();
            int productQuantity = product.getQuantity();
            double totalAmount = productPrice * productQuantity;

            double customerWallet = customer.getWallet();
            double balance = customerWallet - totalAmount;

            if (balance < 0) {
                return "Sorry " + customer.getName() + " Insufficient funds. The purchase cannot be completed.";
            } else {
                // Construct the receipt only if the customer has sufficient funds.
                String receipt = "Product: " + product.getProductName() + "\n" +
                        "Name: " + customer.getName() + "\n" +
                        "Quantity: " + productQuantity + "\n" +
                        "Price per unit: " + productPrice + "\n" +
                        "Total amount: " + totalAmount + "\n" +
                        "Payment: " + customerWallet + "\n" +
                        "Balance: " + balance;
                return receipt + "\n" +
                        "Thank you " +  customer.getName() + " for your patronage!";

            }

        }


    @Override
    public String sellProduct(Cashier cashier, Product product, Customer customer) {
        return dispenseReceipt(cashier, product, customer);
    }
}
