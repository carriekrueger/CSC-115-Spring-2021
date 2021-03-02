// Carrie Krueger
// 9-29-20
// Efficiently using if-statements and multiple conditionals

import java.util.Scanner;

public class MoreIfs {
    public static void main(String[] args) {
        
        betterIfs();  // efficient if statements
        multiples();  // a look at multiple conditionals
    }
    
    // a method that shows the preferred way to handle 
    //code that is being reused
    public static void betterIfs() {
        
        // preferred way 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        
        if(age >= 65) {
             System.out.println("Age is just a number!");
        }
        
        System.out.println(age + " is a good age.");
        
        
        
        // less preferred way
        
        /*
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        
        if(age >= 65) {
            System.out.println("Age is just a number!");
            System.out.println(age + " is a good age.");
        }
        
        if(age < 65) {
            System.out.println(age + " is a good age.");
            
        }
        
        */
        
        
    }
    
    // this method looks at how to do multiple conditionals
    public static void multiples() {
        
        // let's compare a num to 10 in a better way
        // than we did before
        // multiple ways to handle multiple conditionals 
        
        
        // only one outcome possible
        // NESTED 
        // note the indentation-  if/else/ { --> INDENT next line
        
        int num = 10;
        
        if(num > 10) {
            System.out.println("Greater!");
        } else {
            if(num < 10) {
                System.out.println("Less!");
            } else {
                System.out.println("Equal!");
            }
        }
        
        // only one outcome possible
        // nesting neater... else ifs 
        
        if(num > 10) {
            System.out.println("Greater!");
        } else if(num < 10) {
            System.out.println("Less!");
        } else {
            System.out.println("Equal!");
        }
        
        // more than one outcome possible 
        // NOT nested
        
        num = 101;
        
        if(num > 10) {
            System.out.println("Greater!");
        } 
        if(num > 100) {
            System.out.println("Really big number!");
        }
        

        
        
        
    }
}
