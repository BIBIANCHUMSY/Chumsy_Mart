package org.chumsy.Services;

import org.chumsy.Entities.Cashier;
import org.chumsy.Entities.Customer;
import org.chumsy.Entities.Product;

public interface CashierServices {
    String dispenseReceipt(Cashier cashier, Product product, Customer customer);
    String sellProduct(Cashier cashier, Product product, Customer customer);
}
