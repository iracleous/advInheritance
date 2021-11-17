package gr.advantage.ui;

import gr.advantage.model.Employee;
import gr.advantage.service.EmployeeServiceImpl;
import gr.advantage.service.PersonFunctions;

import java.util.Date;

public class Ui {

    public void ui() throws Exception {
        Employee employee = new Employee();

        PersonFunctions personFunctions = new EmployeeServiceImpl(employee) ;

        System.out.println(personFunctions.getStatus());

        Employee employee1 =   new Employee();

        employee1.setDepartment("HR");
        employee1.setHiringDate(new Date());

        System.out.println(employee1);
    }
}
