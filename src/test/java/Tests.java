import model.ProgramData;
import org.junit.Assert;
import org.junit.Test;
import programs.Counting;
import provider.DataFactory;

public class Tests {
    ProgramData programData;
    Counting counting = new Counting();

    @Test
    public void testVerifyModesQuantity() {
        programData = DataFactory.dataForTest_1();

        counting.countDivisors(programData);
        Assert.assertEquals(programData.getRunMode(),counting.countDivisors(programData).get(0));

    }

    @Test
    public void testVerifySumOfModes() {
        programData = DataFactory.dataForTest_1();

        counting.countDivisors(programData);
        Assert.assertEquals(programData.getPlc(),counting.countDivisors(programData).get(2));
    }


}
