import java.util.Scanner; 

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv grönsak:");
        String g = scan.next();
        switch (g) {
        case "gurka": 
            System.out.println("gott!");
            break;
        case "tomat": 
            System.out.println("gott!");
            break;
        case "broccoli": 
            System.out.println("ganska gott...");
            break;
        default:
            System.out.println("mindre gott...");
            break;
        }
    }
}
