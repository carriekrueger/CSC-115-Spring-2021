// Carrie Krueger
// 2-09-21
// Notes about variables 

public class Variables {
    public static void main(String[] args){
        variables(); // a method to investigate variables
    }
    
    //in this method we will look at variables
    public static void variables() {
        
        /* A variable is a place to store a value. 
           A variable holds data.
           It's a named location in the computer's memory.
           
           There are a few different types of information we can store:
           
           integer(whole number):     int 
           decimal(3.14, -6.0):       double 
           boolean(true, false):      boolean 
           character('a', '3', '?'):  char 
           
           Other types: long, short, float, byte 
           All of these types are PRIMITIVE data types 
           
         */
         
        // When you want to use a variable: declare 
        // DECLARE a variable named 'age' that holds a whole number
        // (integer) 
        
        int age;
        
        // variables names start with a LOWERCASE and follow
        // camelCase 
        // class names start with an UPPERCASE 
        
        // When you want to give your variable a value, assign
        // using '=' 
        // ASSIGN the variable 'age' a value of '36'
        
        age = 36;
        
        // You can do both at once!
        // DECLARE a variable called 'gpa' that holds a decimal
        // and ASSIGN it at the same 
        
        double gpa = 3.14;
        
        // DISPLAY the current value of your variables:
        System.out.println("Your age is " + age + ".");
        System.out.println("Your gpa is " + gpa);
        
        // Reassign the value of 'gpa'
        gpa = 2.7;
        System.out.println("Your gpa is now " + gpa);
        
        
       
      
        
    }
}
