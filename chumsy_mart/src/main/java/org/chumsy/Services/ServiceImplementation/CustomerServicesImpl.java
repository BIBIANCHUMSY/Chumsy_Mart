package org.chumsy.Services.ServiceImplementation;

import org.chumsy.Entities.Cashier;
import org.chumsy.Entities.Customer;
import org.chumsy.Entities.Product;
import org.chumsy.Services.CustomerServices;

public class CustomerServicesImpl implements CustomerServices {

    CashierServicesImpl cashierServices = new CashierServicesImpl();
    @Override
    public String buyProduct(Cashier cashier, Product product, Customer customer) {
        if (customer.getWallet() >= product.getPrice()) {
           System.out.println(customer.getName() + "buy " + product.getProductName() + " at the rate of " + product.getPrice());
            double newBalance = customer.getWallet() - product.getPrice();
            System.out.println("The new balance is :" + newBalance);

            return cashierServices.sellProduct( cashier,product,customer);
        }

        return "Insufficient balance from " + customer.getName() + "wallet";
   }
}
