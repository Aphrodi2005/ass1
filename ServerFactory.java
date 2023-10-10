// Concrete factory class for creating server computers, implementing the ComputerAbstractFactory interface.
public class ServerFactory implements ComputerAbstractFactory {

    // Fields to store RAM, HDD, and CPU information for servers to be created.
    private String ram;
    private String hdd;
    private String cpu;

    // Constructor to initialize server's specifications.
    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    // Implementation of the createComputer() method to create a Server instance.
    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}
