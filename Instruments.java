package TesInstrumenBuP;

public class Instruments { //superclass
    
    protected String name;
    protected double price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Instruments(){
        name = "null";
        price = 0.0;
    }

    public Instruments(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void Print() {
        System.out.println();
        System.out.println("Name: " +name);
        System.out.println("Price: " +price);
    }
}
