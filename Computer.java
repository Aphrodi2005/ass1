// Abstract class representing a computer.
public abstract class Computer {

    // Abstract methods to get RAM, HDD, and CPU information.
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    // Override the toString() method to provide a formatted string representation of the computer's specs.
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}