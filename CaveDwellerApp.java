
import java.util.Scanner;

/**
 *
 * @author John Word
 */
public class CaveDwellerApp {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is your caveman's name?");
        String username = kb.nextLine();
        Cave cave = new Cave(username);
        String prompt = "";
        while(!prompt.equals("close")) {
            prompt = kb.nextLine();
            cave.processPrompt(prompt);
        }
        
    }
    
}
