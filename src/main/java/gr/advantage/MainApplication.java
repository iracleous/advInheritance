package gr.advantage;

import gr.advantage.model.Employee;
import gr.advantage.model.Partner;
import gr.advantage.model.Person;
import gr.advantage.service.EmployeeServiceImpl;
import gr.advantage.service.PersonFunctions;
import gr.advantage.ui.Ui;

import java.math.BigDecimal;
import java.util.Date;

public class MainApplication {

    public static void main(String[] args) throws Exception {
       Ui ui =  new Ui();
       ui.ui();

    }
}
