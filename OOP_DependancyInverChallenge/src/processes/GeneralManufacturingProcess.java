package processes;

public abstract class GeneralManufacturingProcess {

    /*
    Learned: Dependency Inversion Principle
    The Dependency Inversion Principle states that higher level software entities should
    not rely or "depend" on lower level implementation and behaviours. It would be more
    appropriate that both higher level and lower level software entities rely on other fixed
    software entities namely abstractions.
     */

    /*
    This project and its classes and methods represent The Template Pattern
    However, this abstract class specifically holds the key structure to the Template Pattern.
    This is because the GeneralManufacturingProcess class is an abstract class which is the
    template for its two child classes which are SmartphoneManufacturing and
    ComputerLaptopManufacturing. Thus the Dependency Inversion principle is not violated and
    the higher level entity: GeneralManufacturingProcess does not depend on the lower level
    child classes that extend from it.
     */

    private String processName;

    public GeneralManufacturingProcess(String processName) {
        this.processName = processName;
    }

    protected abstract void assemblyDevice();
    protected abstract void testingDevice();
    protected abstract void packagingDevice();
    protected abstract void storageDevice();


    // This is the template method
    public void launchProcess() {

        if (processName != null && !processName.isEmpty()) {
            assemblyDevice();
            testingDevice();
            packagingDevice();
            storageDevice();
        }
        else {
            System.out.println("No process name was specified");
        }
    }
}
