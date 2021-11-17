package gr.advantage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    protected static final String NOT_HIRED = "not hired";
    protected static final String HIRED = "hired on ";

    private String firstName;
    private String lastName;
    private String address;
    private Date dateOfBirth;
    private boolean isMarried;
    private BigDecimal account;

    public void register(){
    }

    public String getStatus(){
        return "simple Person";
    }

}
