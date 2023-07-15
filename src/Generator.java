import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Jamal Kamareddine
 * 
 * This program generates random names
 */
public class Generator {
    private Random rand = new Random();
    private Scanner scanner = new Scanner(System.in);

    /**
     * Drives the generator to continuously allow the user to keep generating names until they exit
     */
    public void runGenerator() {
        String input;

        do {
            System.out.println("Press ENTER to generate 10 names or press Q to quit.");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("q")) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(generateName());
                }
            }
        } while (!input.equalsIgnoreCase("q"));
    }

    /**
     * Generates a random name by combining word parts together
     * 
     * @return The generated name
     */
    public String generateName() {
        ArrayList<String> nameStrings = new ArrayList<String>();
        String prefix = Prefix.getPrefix();
        String middlePart1 = "";
        String middlePart2 = "";
        String middlePart3 = "";
        String suffix = "";
        String name = "";

        nameStrings.add(prefix);
        
        if (rand.nextFloat() < 0.5) {
            do {
                middlePart1 = MiddlePart.getMiddlePart();
            } while (compareNameParts(prefix, middlePart1));

            nameStrings.add(middlePart1);
        }

        if (rand.nextFloat() < 0.5) {
            do {
                middlePart2 = MiddlePart.getMiddlePart();
            } while (compareNameParts(prefix, middlePart1, middlePart2));

            nameStrings.add(middlePart2);
        }
        
        do {
            suffix = Suffix.getSuffix();
        } while (compareNameParts(prefix, middlePart1, middlePart2, suffix));

        nameStrings.add(suffix);
        
        if (nameStrings.size() == 4 && rand.nextFloat() < 0.1) {
            int index = rand.nextInt(3) + 1;
            
            do {
                middlePart3 = MiddlePart.getMiddlePart2();
            } while (middlePart3.equalsIgnoreCase(nameStrings.get(index)) || middlePart3.equalsIgnoreCase(nameStrings.get(index - 1)));

            nameStrings.add(index, middlePart3);
        }
        
        for (int i = 0; i < nameStrings.size(); i++) {
            name += nameStrings.get(i);
        }

        return name;
    }

    /**
     * Checks if two consecutive string parts are the same
     * 
     * @param strings Each string part of the name
     * 
     * @return Whether the strings are equal or not
     */
    private boolean compareNameParts(String... strings) {
        String[] nameParts = strings;
        String lastString = nameParts[nameParts.length - 1];
        String previousString;

        for (int i = nameParts.length - 2; i >= 0; i--) {
            if (nameParts[i] != "") {
                previousString = nameParts[i];

                return lastString.equalsIgnoreCase(previousString);
            }
        }

        return false;
    }
}
