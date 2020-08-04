import model.ProgramData;
import org.junit.Test;
import programs.Counting;
import provider.DataFactory;

public class Execute {

    private static ProgramData programData;

    public static void main(String[] args) {
        programData = DataFactory.validProgramData();

        Counting counting = new Counting();
        counting.countDivisors(programData);
        System.out.println("In RUN mode there are " + counting.countDivisors(programData).get(0) + " PLC\'s");
    }
}
