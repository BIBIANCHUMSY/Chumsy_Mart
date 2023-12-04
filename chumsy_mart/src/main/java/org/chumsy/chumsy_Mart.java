package org.chumsy;

import org.chumsy.Entities.Cashier;
import org.chumsy.Entities.Customer;
import org.chumsy.Entities.Manager;
import org.chumsy.Entities.Product;
import org.chumsy.Services.ServiceImplementation.CashierServicesImpl;
import org.chumsy.Services.ServiceImplementation.ManagerServicesImpl;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class chumsy_Mart {
    public static void main(String[] args) {



        ManagerServicesImpl managerServices = new ManagerServicesImpl();
        Manager manager = new Manager("Chioma", "c001", "chioma@gmail.com", "08288222");
        Cashier cashier1 = new Cashier("Ukamaka", "C002", "ukamaka@chumsymart.org", "8197656",45);
        Cashier cashier2 = new Cashier("Maurice", "C003", "maurice@chumsymart.org", "908856", 80);

        System.out.println(managerServices.hireCashier(manager, cashier1));
        System.out.println(" ");
        System.out.println(managerServices.hireCashier(manager, cashier2));
        System.out.println(" ");


        CashierServicesImpl cashierServices = new CashierServicesImpl();
//        Product product = new Product("Iphone 11", 35000.00, 2);

        Customer customer = new Customer("Tosin", "c123", "tosin.org", "093222", 400000.98);
        Customer customer1 = new Customer("Moses", "c123", "moses.org", "093422", 40000.98);



//        System.out.println(cashierServices.dispenseReceipt(cashier2, product, customer));
//        System.out.println(" ");
//        System.out.println(cashierServices.dispenseReceipt(cashier2, product, customer1));
        System.out.println(" ");






    }
}