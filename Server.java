// Concrete class representing a server computer, extending the Computer abstract class.
public class Server extends Computer {

    // Fields to store RAM, HDD, and CPU information.
    private String ram;
    private String hdd;
    private String cpu;

    // Constructor to initialize server's specifications.
    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    // Concrete implementations of abstract methods to get RAM, HDD, and CPU information.
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
