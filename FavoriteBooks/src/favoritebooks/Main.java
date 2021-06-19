/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritebooks;

import static favoritebooks.FileHandler.readFileAsLines;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 *
 * @author yarkingazibaba
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileHandler fileHandler = new FileHandler();
        InputStream fileStream = fileHandler.readFile("src/favoritebooks/booklist.txt");
        ArrayList<String> fileAsLines = readFileAsLines(fileStream);
        ArrayList<Book> books = fileHandler.parseLinesToBooks(fileAsLines); 
        
        Library library = new Library(books);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage(library).setVisible(true);
            }
        });
    }
    
}
