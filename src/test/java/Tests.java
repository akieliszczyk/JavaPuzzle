import model.ProgramData;
import org.junit.Assert;
import org.junit.Test;
import programs.Counting;
import provider.DataFactory;

public class Tests {
    ProgramData programData;

    @Test
    public void testVerifyModesQuantity() {
        programData = DataFactory.dataForTest_1();
        Counting counting = new Counting(programData);

        counting.countDivisors();
        Assert.assertEquals(programData.getRunMode(),counting.countDivisors().get(0));

    }

    @Test
    public void testVerifySumOfModes() {
        programData = DataFactory.dataForTest_1();
        Counting counting = new Counting(programData);

        counting.countDivisors();
        Assert.assertEquals(programData.getPlc(),counting.countDivisors().get(2));
    }


}
