package org.chumsy.Services.ServiceImplementation;

import org.chumsy.Entities.Cashier;
import org.chumsy.Entities.Manager;
import org.chumsy.Services.ManagerServices;



public class ManagerServicesImpl implements ManagerServices {


    @Override
    public String hireCashier(Manager manager, Cashier cashier) {
        if (cashier.getInterviewScore() > 70) {
            return "The cashier " + cashier.getName() + " with the score of " + cashier.getInterviewScore() + " has been hired";
        } else {
            return cashier.getName() + " with the score of " + cashier.getInterviewScore() + "\n" +
                    "Unfortunately your interview scores is too low for our hiring team to consider your application.";
        }

    }
}
