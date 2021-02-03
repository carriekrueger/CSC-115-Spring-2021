// Carrie Krueger
// 9-6-20
// Ch. 2 notes - Escape Sequences

public class Ch2Escape {
    public static void main(String[] args) {
        escape(); // this method will explore 
                  // escape sequences 
    }
    
    // a method to investigate escape sequences
    public static void escape() {
        
        // special characters denoted with the \ (the escape character)
        
        // \n --> new line 
        System.out.print("Hello!  \n\n\n\n");
        System.out.println("He\nllo!");
        
        // \t --> tab 
        System.out.println("Hi\tHi");
        System.out.println("Hi\t\t\t\tHi");
        
        // \\ --> \
        System.out.println("\\");
        
        // \" --> " 
        System.out.println("She said \"Java is the best!\"");
     
        
    }
}
