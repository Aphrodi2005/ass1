// Class that acts as a factory for creating computers.
public class ComputerFactory {

    // Static method to create a computer using a given factory.
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}