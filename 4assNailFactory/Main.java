import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NailFactory factory = new NailFactory();

        // Prompt the user to choose a nail design
        System.out.println("Choose a nail design (FrenchManicure, GelNails, AcrylicNails):");
        Scanner scanner = new Scanner(System.in);
        String chosenDesign = scanner.nextLine();

        // Create the nail design based on user input
        NailDesign selectedDesign = factory.createNailDesign(chosenDesign);
        selectedDesign.createDesign();
    }
}