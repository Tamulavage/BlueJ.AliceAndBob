/**
 * Created by iyasuwatts on 10/17/17.
 */
// import scanner 
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = reader.next();
        
        // close reader
        reader.close();
        
        // testing only to ensure reading name - comment out after test
        //System.out.println(name);
        
        // ensure to use equals method
        if(name.equals("Alice")|| name.equals("Bob"))
        {
            System.out.println("Hello " + name + ". Would you like a coffee?");
            
        }

        
    }
}
