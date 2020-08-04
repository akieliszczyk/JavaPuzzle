package programs;

import model.ProgramData;

import java.util.ArrayList;
import java.util.List;

public class Counting {

    public List countDivisors(ProgramData programData) {

        Integer run = 0;
        Integer program = 0;
        List list = new ArrayList();

        for ( int plc = 1; plc<= programData.getPlc(); plc++ ) {
            int divisorsQuantity = 0;
            for(int employee = 1; employee<= programData.getEmployee(); employee++){

                if((plc%employee) == 0) {
                    divisorsQuantity++;
                }
            }

            if ((divisorsQuantity%2)==0) {
                program++;
            }

            else
                run++;
        }

        list.add(run);
        list.add(program);
        list.add(run+program);
        return list;
    }

}
