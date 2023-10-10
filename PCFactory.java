// Concrete factory class for creating PC computers, implementing the ComputerAbstractFactory interface.
public class PCFactory implements ComputerAbstractFactory {

    // Fields to store RAM, HDD, and CPU information for PCs to be created.
    private String ram;
    private String hdd;
    private String cpu;

    // Constructor to initialize PC's specifications.
    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    // Implementation of the createComputer() method to create a PC instance.
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}
