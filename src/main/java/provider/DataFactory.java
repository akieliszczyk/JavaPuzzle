package provider;

import model.ProgramData;

public class DataFactory {
    public static ProgramData getProgramData() {
        ProgramData programData = new ProgramData();
        programData.setEmployee(1100);
        programData.setPlc(1100);
        return programData;
    }
}
