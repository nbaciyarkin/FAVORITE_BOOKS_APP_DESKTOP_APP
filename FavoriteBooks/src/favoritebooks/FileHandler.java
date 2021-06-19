/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritebooks;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yarkingazibaba
 */
public class FileHandler {
    
    public InputStream readFile(String filePath) throws FileNotFoundException{
        File initialFile = new File(filePath);
        InputStream targetStream = new FileInputStream(initialFile);
        return targetStream;  
    }
    
    public static ArrayList<String> readFileAsLines(InputStream inputStream) throws IOException {
        
        ArrayList<String> lineList = new ArrayList();
        InputStreamReader isr = new InputStreamReader(inputStream);

        try(BufferedReader br = new BufferedReader(isr)) {
            
            for(String line; (line = br.readLine()) != null;) {
                lineList.add(line);  
            }
            
            isr.close();
            br.close();
            inputStream.close();
            
        }
        return lineList;
    } 
    
    
    
    public ArrayList<Book> parseLinesToBooks(ArrayList<String> lineList){
        
        ArrayList<Book> bookList = new ArrayList();
        
        System.out.println("Appending Books section started..");
        
        for(String line : lineList) {
            
            String [] bookFields = line.split(",");

            int id = Integer.valueOf(bookFields[0]);
            int rating = Integer.parseInt(bookFields[5]);
            int year = Integer.parseInt(bookFields[6]);
            int numberOfPages = Integer.parseInt(bookFields[7]);
            
            Book tempBook = new Book(id,bookFields[1], bookFields[2], bookFields[3],bookFields[4],rating,year,numberOfPages, bookFields[8]);            
            bookList.add(tempBook);          
        }          
        return bookList;
    }
    
    public void appendBookToFile(Book book) throws IOException {
        FileWriter fileWriter = new FileWriter("src/favoritebooks/booklist.txt", true);
        Writer output = new BufferedWriter(fileWriter);
        
        String strRating = String.valueOf(book.rating);
        String strYear = String.valueOf(book.year);
        String strNumberOfPages = String.valueOf(book.numberOfPages);
        output.append("\n"); // goes nextLine
        output.append(book.bookId + "," + book.title + "," + book.category + "," + book.authorNameAndSurname + "," + book.awardWinner + "," + strRating + "," + strYear + "," + strNumberOfPages + "," + book.shortDescription);
        output.close(); 
        fileWriter.close();
          
    }
    
    
    public static void deleteBookFromFileAndList(String id,ArrayList<Book> bookList) throws IOException{
        FileWriter fileWriter = new FileWriter("src/favoritebooks/booklist.txt", false);
        Writer output = new BufferedWriter(fileWriter);
  
        int numericId = Integer.parseInt(id);

        int size = bookList.size();
        for(int i = 0; i < size; i++){
            
            if(numericId == bookList.get(i).bookId){
                bookList.remove(i);
                size = size - 1;
                i = i - 1;
            } else{
                String strRating = String.valueOf(bookList.get(i).rating);
                String strYear = String.valueOf(bookList.get(i).year);
                String strNumberOfPages = String.valueOf(bookList.get(i).numberOfPages);
                if(i != 0) {
                    output.append("\n"); // goes nextLine
                }
                output.append(bookList.get(i).bookId + "," + bookList.get(i).title + "," + bookList.get(i).category + "," + bookList.get(i).authorNameAndSurname + "," + bookList.get(i).awardWinner + "," + strRating + "," + strYear + "," + strNumberOfPages + "," + bookList.get(i).shortDescription);   
            }
        }
            output.close(); 
            fileWriter.close();  
    }
                      
}
