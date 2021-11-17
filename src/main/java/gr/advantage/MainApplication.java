package gr.advantage;

import gr.advantage.model.Employee;
import gr.advantage.model.Partner;
import gr.advantage.model.Person;

import java.math.BigDecimal;

public class MainApplication {
    public static void main(String[] args) {
        Person employee = new Employee();
        Person partner = new Partner();

        employee.register();
        partner.register();

        ////

        Person person = partner;
        System.out.println(person.getStatus());

        //
        person = employee;
        System.out.println(person.getStatus());





    }
}
