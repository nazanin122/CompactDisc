/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compactdisc;
import java.util.Scanner; 
import java.io.*;

/**
 *
 * @author Naz
 */
public class CompactDisc {

/**
This program creates a list of songs for a CD
by reading from a file.
*/
    
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("Classics.txt"));
        
        Song[] cd = new Song[6];
        
        String title;
        String artist;
        
        for (int i = 0; i < cd.length; i++) {
            title = input.nextLine();  // Read the song title from the file
            artist = input.nextLine(); // Read the artist name from the file
            cd[i] = new Song(title, artist); 
        }
        
        // Print the contents of the array
        System.out.println("Contents of Classics:");
        for (int i = 0; i < cd.length; i++) {
            System.out.print(cd[i]); 
        }
        
    }
}
