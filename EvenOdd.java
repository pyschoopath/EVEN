import java.util.*;
import java.lang.*;
import java.io.*;
class EvenOdd {

    public static void main(String[] args) 
    {

       Scanner reader = new Scanner(System.in);
        int num = reader.nextInt(); 
        if(num % 2 == 0)
            System.out.println("even");
        else
            System.out.println( "odd")
    }
        
}
