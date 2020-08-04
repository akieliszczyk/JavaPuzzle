import model.ProgramData;
import org.junit.Test;
import programs.Counting;
import provider.DataFactory;

public class Execute {

    ProgramData programData;

    @Test
    public void coundDivisors() {
        programData = DataFactory.getProgramData();

        Counting counting = new Counting();
        counting.countDivisors(programData);
    }
}
