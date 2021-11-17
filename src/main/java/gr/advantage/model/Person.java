package gr.advantage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Person   {

    protected String firstName;
    protected String lastName;
    protected String address;
    protected Date dateOfBirth;
    protected boolean isMarried;
    protected BigDecimal account;
}
