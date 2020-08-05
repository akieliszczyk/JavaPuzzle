import model.ProgramData;
import programs.Counting;
import provider.DataFactory;

public class Execute {



    public static void main(String[] args) {
        ProgramData programData;
        programData = DataFactory.validProgramData();

        Counting counting = new Counting(programData);
        counting.countDivisors();
        System.out.println("In RUN mode there are " + counting.countDivisors().get(0) + " PLC\'s");
    }
}
