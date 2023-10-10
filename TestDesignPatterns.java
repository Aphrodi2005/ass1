// Main class for testing the abstract factory pattern.
public class TestDesignPatterns {

    public static void main(String[] args) {
        // Call the testAbstractFactory() method to demonstrate the creation of PC and Server objects using the abstract factory pattern.
        testAbstractFactory();
    }

    // Method to test the abstract factory pattern.
    private static void testAbstractFactory() {
        // Create PC and Server objects with specific configurations using the abstract factory pattern.
        Computer pc =
                ComputerFactory.getComputer(new
                        PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server =
                ComputerFactory.getComputer(new
                        ServerFactory("16 GB","1 TB","2.9 GHz"));

        // Print the configurations of the created computers.
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
