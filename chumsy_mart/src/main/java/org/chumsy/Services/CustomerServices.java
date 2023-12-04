package org.chumsy.Services;

import org.chumsy.Entities.Cashier;
import org.chumsy.Entities.Customer;
import org.chumsy.Entities.Product;

public interface CustomerServices {
   String buyProduct(Cashier cashier, Product product, Customer customer);
}
