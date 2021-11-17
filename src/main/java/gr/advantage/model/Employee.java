package gr.advantage.model;
import lombok.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person {

    private Date hiringDate;
    private String department;


}
