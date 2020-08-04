import model.ProgramData;
import org.junit.Test;
import programs.Counting;
import provider.DataFactory;

public class Execute {

    ProgramData programData;

    @Test
    public void countRunMode() {
        programData = DataFactory.getProgramData();

        Counting counting = new Counting();
        counting.countDivisors(programData);
        System.out.println("In RUN mode there are " + counting.countDivisors(programData).get(0) + " PLC\'s");
    }
}
