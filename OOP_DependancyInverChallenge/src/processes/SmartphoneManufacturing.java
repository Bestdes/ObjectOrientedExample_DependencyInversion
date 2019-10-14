package processes;

public class SmartphoneManufacturing extends GeneralManufacturingProcess {


    public SmartphoneManufacturing(String processName) {
        super(processName);
    }

    @Override
    protected void assemblyDevice() {
        System.out.println("Assembling smartphone...");
    }

    @Override
    protected void testingDevice() {
        System.out.println("Testing smartphone...");
    }

    @Override
    protected void packagingDevice() {
        System.out.println("Packaging smartphone...");
    }

    @Override
    protected void storageDevice() {
        System.out.println("Storing smartphone...");
    }
}
