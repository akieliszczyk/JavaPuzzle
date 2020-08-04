package provider;

import model.ProgramData;

public class DataFactory {
    public static ProgramData validProgramData() {
        ProgramData programData = new ProgramData();
        programData.setEmployee(1100);
        programData.setPlc(1100);
        return programData;
    }

    public static ProgramData dataForTest_1() {
        ProgramData programData = new ProgramData();
        programData.setEmployee(10);
        programData.setPlc(15);
        programData.setRunMode(8);
        programData.setProgramMode(7);
        return programData;
    }
}
