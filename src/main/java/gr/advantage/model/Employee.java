package gr.advantage.model;
import lombok.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person{

    private Date hiringDate;
    private String department;

    @Override
    public void register(){
        hiringDate = new Date();
    }

    @Override
    public String getStatus() {
        if (hiringDate == null){
            return NOT_HIRED;
        }
        return HIRED + hiringDate;
    }
}
