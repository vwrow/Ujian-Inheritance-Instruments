package TesInstrumenBuP;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        
        String[] choice = new String[2];
        Guitar gitar = new Guitar();
        Piano piano = new Piano();
        Scanner j = new Scanner(System.in);
        double disc, fPrice=0;
;
        System.out.print("Is it a 'Guitar' or a 'Piano'? ");
        choice[0] = j.nextLine();

        if (choice[0].equalsIgnoreCase("Guitar")) {
            System.out.print("Name of product: ");
            gitar.name = j.nextLine();
            System.out.print("Price: ");
            gitar.price = j.nextDouble();
            System.out.print("\nHow many strings does it have? ");
            gitar.numStrings = j.nextInt();
            System.out.print("Is it electric (True/ False)? ");
            gitar.isElectric = j.nextBoolean();
            System.out.println();
            fPrice = gitar.price;
        } else if (choice[0].equalsIgnoreCase("Piano")) {
            System.out.print("Name of product: ");
            piano.name = j.nextLine();
            System.out.print("Price: ");
            piano.price = j.nextDouble();
            System.out.print("\nWhat piano type is it? ");
            piano.pianoType = j.next();
            System.out.println();
            fPrice = piano.price;          
        } else {
            System.out.println("Invalid Input");
        }

        System.out.print("Is This Item Listed For Discount (Yes/ No)? ");
        choice[1] = j.next();

        if (choice[1].equalsIgnoreCase("Yes")) {
            System.out.print("How Much % Is The Discount? ");
            disc = j.nextInt();
            disc = (disc/100)*fPrice;
            fPrice -= disc;
            System.out.println("\n\n== Receipt ==");
            if (choice[0].equalsIgnoreCase("Guitar")) {
                gitar.price = fPrice;
                gitar.Print();
            } else if (choice[0].equalsIgnoreCase("Piano")) {
                piano.price = fPrice;
                piano.Print();}
        } else if (choice[1].equalsIgnoreCase("No")) {
            if (choice[0].equalsIgnoreCase("Guitar")) {
                gitar.Print();
            } else if (choice[0].equalsIgnoreCase("Piano")) {
                piano.Print();}
        }
        else {System.out.println("Input Error");}

        j.close();
    }  
}