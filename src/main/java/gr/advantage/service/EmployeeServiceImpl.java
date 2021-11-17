package gr.advantage.service;

import gr.advantage.model.Employee;

import java.util.Date;

public class EmployeeServiceImpl implements PersonFunctions{

    private final Employee employee;

    public EmployeeServiceImpl(Employee employee) throws Exception {
        if (employee == null){
            throw new Exception();
        }
        this.employee = employee;
    }

    @Override
    public void register(){
        employee.setHiringDate(new Date());
    }

    @Override
    public String getStatus() {
        if (employee.getHiringDate() == null){
            return NOT_HIRED;
        }
        return HIRED + employee.getHiringDate();
    }
}
