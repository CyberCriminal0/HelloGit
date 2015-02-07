
//written by Jack Eller

import java.util.Scanner;

public class hello{
public static void main(String[] args){


    System.out.println("Hello World!");
    System.out.println("Please input your name");
    
    Scanner scan = new Scanner(System.in);

    String name = scan.nextLine();

    System.out.println("Hello " + name + " this is Java");



}
}