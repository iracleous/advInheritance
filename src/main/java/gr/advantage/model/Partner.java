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

    @Override
    public void register(){
        isActive = true;
    }

    @Override
    public String getStatus() {
        if (!isActive) {
            return NOT_HIRED;
        }
        return HIRED;
    }
}
