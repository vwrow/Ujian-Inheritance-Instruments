package TesInstrumenBuP;

public class stringInstruments extends Instruments{
    
    protected int numStrings;

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public stringInstruments() {
        super();
        numStrings = 0;
    }

    public stringInstruments(String name, double price, int numStrings) {
        super(name,price);
        this.numStrings = numStrings;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Number of Strings: " +numStrings);
    }
}
