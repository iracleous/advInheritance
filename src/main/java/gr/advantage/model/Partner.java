package gr.advantage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Partner  extends Person{

    private String speciality;
    private boolean isActive;


}
