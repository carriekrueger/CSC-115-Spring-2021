// Carrie Krueger
// 2-16-21
// How to use a Scanner to read user input from the keyboard

import java.util.Scanner;
// To read from the keyboard, we use the premade Scanner class in Java
// Certain premade classes need to be imported to be used
// Scanner: import    Math and String: no import 

public class KeyboardInput {
    public static void main(String[] args) {
        readInput(); // read input from the keyboard
    }
    
    //a method that will read input from the keyboard
    public static void readInput() {
        
        String name;
        int age;
        
        // INSTANTIATE (create) a Scanner that reads from the keyboard
        // This makes a Scanner named 'sc'
        
        Scanner sc = new Scanner(System.in);
        // Why sc? Could have named it anything... 
        // descriptive names are helpful 
        
        // Prompt the user for information
        // use the .nextLine() method to read and store text
        
        System.out.println("What is your full name?");
        name = sc.nextLine();  // reads in the line of text and stores it
        
        // Scanners have methods to read in the next piece of data
        // until there is a space or a newline 
        // To read an int, use .nextInt() method 
        
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        
        // Echo [concatenation]
        System.out.println("Hello, " + name + ". How does it feel being " + age + "?");
        
        sc.close();  // close the Scanner (makes the compiler happy, useful later)
        

        
        
    }
}
