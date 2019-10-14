package processes;

public class ComputerLaptopManufacturing extends GeneralManufacturingProcess {

    public ComputerLaptopManufacturing(String processName) {
        super(processName);
    }

    @Override
    protected void assemblyDevice() {
        System.out.println("Assembling Laptop...");
    }

    @Override
    protected void testingDevice() {
        System.out.println("Testing Laptop...");
    }

    @Override
    protected void packagingDevice() {
        System.out.println("Packaging Laptop...");
    }

    @Override
    protected void storageDevice() {
        System.out.println("Storing Laptop...");
    }
}
