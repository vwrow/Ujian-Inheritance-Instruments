package TesInstrumenBuP;

public class Guitar extends stringInstruments {
    
    protected boolean isElectric;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Guitar () {
        super();
        isElectric = false;
    }

    public Guitar (String name, double price, int numStrings, boolean isElectric) {
        super(name, price, numStrings);
        this.isElectric = isElectric;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Electric Guitar: " +isElectric);
    }
}
