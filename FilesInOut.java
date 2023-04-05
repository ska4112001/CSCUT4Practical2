package checkpoint4;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\samia\\eclipse-workspace\\Checkpoint4\\src\\checkpoint4\\input.txt");
        // Initially it will be easier to hardcode suitable file names.

        // Set up a new Scanner to read the input file.
        Scanner in = new Scanner(inputFile);
        // Processing line by line would be sensible here.
     // Initially, echo the text to System.out to check you are reading correctly.
        while(in.hasNextLine()){
        	String line = in.nextLine();
        	System.out.println(line);
        }
        
        // Then add code to modify the text to the output format.
        // Set up a new PrintWriter to write the output file.
        PrintWriter out = new PrintWriter("output.txt");
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

        System.out.println("You need to add your own code to do anything");

    } // main

} // FilesInOut
