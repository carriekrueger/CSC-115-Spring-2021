// Carrie Krueger
// 11-24-20
// All about arrays 

public class ArrayNotes {
    public static void main(String[] args) {
      
      
        /* template
        
              0   1   2   3   4   5   6
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
            -----------------------------
        */ 
        
        // ARRAY RULES: 
        
        // 1. You need to know the size of the array 
        //    when you declare it 
        // 2. Once the size of the array is set, 
        //    it can't be changed (you can not resize an array)
        // 3. Arrays can only hold one type of data 
        //    (all ints, all Strings, etc.)
        // 4. Arrays are indexed from 0 to length - 1  
        //    (ArrayIndexOutOfBoundsException)
        
        // Let's declare an array to hold daily temperatures for a week 
        
        int[] temps = new int[7]; 
        // DECLARE an array and set the length (all about the [])
        
        /* 
        
              0   1   2   3   4   5   6       positions 0 to length - 1
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |     initially filled with 0s
            -----------------------------
        */ 
        
        // loading the array with values
        
        temps[0] = 29;
        temps[1] = 31;
        temps[2] = 41;
        temps[3] = 16;
        temps[4] = 30;
        temps[5] = 30;
        temps[6] = 30;
        
        /* 
        
              0     1    2    3    4    5    6       
            ------------------------------------
            | 29 | 31 | 41 | 16 | 30 | 30 | 30 |     
            ------------------------------------
        */ 
        
        System.out.println(temps[3]);  // 16
        
        // can do anything with array elements that you can do with 
        // regular variables 
        
        double weekendAverage = (temps[0] + temps[1]) / 2.0;
        System.out.println("Weekend average temp: " + weekendAverage); // 30.0
        
        temps[3] = 26;   // no output, just changed a value
        
        /* 
        
              0     1    2    3    4    5    6       
            ------------------------------------
            | 29 | 31 | 41 | 26 | 30 | 30 | 30 |     
            ------------------------------------
        */ 
        
        System.out.println(temps[3]); // 26
        
        
        
        
        
        
        
        
    }
}


      
