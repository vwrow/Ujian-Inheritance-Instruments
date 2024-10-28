package TesInstrumenBuP;

public class Piano extends Instruments {
    
    protected String pianoType;

    public String getPianoType() {
        return this.pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }

    public Piano() {
        super();
        pianoType = "null";
    }

    public Piano(String name, double price, String pianoType) {
        super(name, price);
        this.pianoType = pianoType;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Piano Type: " +pianoType);
    }
}
