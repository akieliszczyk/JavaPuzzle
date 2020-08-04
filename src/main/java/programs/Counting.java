package programs;

import model.ProgramData;

public class Counting {

    public void countDivisors(ProgramData programData) {

        Integer run = 0;
        Integer program = 0;

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
        System.out.println("There are " + program + "PLC\'s in PROGRAM mode");
        System.out.println("There are " + run + "PLC\'s in RUN mode");

    }
}
