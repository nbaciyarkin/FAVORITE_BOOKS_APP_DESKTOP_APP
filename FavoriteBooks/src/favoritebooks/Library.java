/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritebooks;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author yarkingazibaba
 */
public class Library {
    
    FileHandler fileHandler;
    
    private ArrayList<Book> libraryBookList = new ArrayList();
    
    public Library(ArrayList<Book> bookListInLibrary){
        this.libraryBookList = bookListInLibrary;
       
    }

    Library() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Book> getBookListInLibrary() {
        return libraryBookList;
    }

    public void setBookListInLibrary(ArrayList<Book> bookListInLibrary) {
        this.libraryBookList = bookListInLibrary;
    }
      
    public ArrayList<Book> listTheBooksAccordingToAuthorNameAndSurname(String nameAndSurname, ArrayList<Book> bookListInLibrary){
        
        ArrayList<Book> authorNameAndSurnameBookList = new ArrayList();
        
        for(int i=0; i<bookListInLibrary.size(); i++){
            if(nameAndSurname.equals(bookListInLibrary.get(i).authorNameAndSurname)){    
                authorNameAndSurnameBookList.add(bookListInLibrary.get(i));    
            }
        }
        return authorNameAndSurnameBookList;
    }
         
    public ArrayList<Book> ListTheBooksTittleAccordingToCategory(String category,ArrayList<Book> bookListInLibrary){
        ArrayList<Book> categoryBookList = new ArrayList();
        
        for(int i=0; i<bookListInLibrary.size(); i++){
            if(category.equals(bookListInLibrary.get(i).category)){    
                categoryBookList.add(bookListInLibrary.get(i));    
            }
        }       
        return categoryBookList;
    }
    
    public ArrayList<Book> ListTheBooksGivenCategoryAndSortAccordingRating(String category,ArrayList<Book> bookListInLibrary){
        ArrayList<Book> categorySortedByRatingBookList = new ArrayList();
        
          for(int i=0; i<bookListInLibrary.size(); i++){
            if(category.equals(bookListInLibrary.get(i).category)){    
                categorySortedByRatingBookList.add(bookListInLibrary.get(i));    
            }
        }
          
          int size = categorySortedByRatingBookList.size();
          
         for(int i =0; i<size-1; i++){
             for(int j=0; j<size-i-1; j++){                
                 if(categorySortedByRatingBookList.get(j).rating < categorySortedByRatingBookList.get(j+1).rating){
                     
                     Book temp = categorySortedByRatingBookList.get(j);
                     categorySortedByRatingBookList.set(j, categorySortedByRatingBookList.get(j+1));                    
                     categorySortedByRatingBookList.set(j+1, temp);
                 }
             }
         }                 
      return categorySortedByRatingBookList;
    }
    
    public boolean isTheBookInListAccordingId(String id,ArrayList<Book> bookListInLibrary){
        
        int bookIdNumeric = Integer.parseInt(id);
        
        for(int i = 0; i< bookListInLibrary.size(); i++){
            if(bookListInLibrary.get(i).bookId == bookIdNumeric){
                return true;
            }
        }         
        return false;
    }
     
    
    public Book findBookById(String id,ArrayList<Book> bookListInLibrary){
       
        int bookIdNumeric = Integer.parseInt(id);
        Book book = null;
        for(int i = 0; i<bookListInLibrary.size(); i++){
            
            if(bookListInLibrary.get(i).bookId == bookIdNumeric){
                 book = bookListInLibrary.get(i);
            }
        }
        return book;           
    }
    
    public ArrayList<Book> findByTitle(String title,ArrayList<Book> bookListInLibrary){
        ArrayList<Book> givenTitleOrGivenKeywordList = new ArrayList();
        
        for(int i=0; i<bookListInLibrary.size(); i++){
            if(bookListInLibrary.get(i).title.contains(title)){
                givenTitleOrGivenKeywordList.add(bookListInLibrary.get(i));
            }
        }
        return givenTitleOrGivenKeywordList;
    }
    
    public ArrayList<Book> listTheBooksAccordingToYear(String Year,ArrayList<Book> bookListInLibrary){
         ArrayList<Book> bookListAccordingYear = new ArrayList();
        int yearNumeric = Integer.parseInt(Year);
        
        for(int i=0; i<bookListInLibrary.size(); i++){
            if(bookListInLibrary.get(i).year == yearNumeric){
                bookListAccordingYear.add(bookListInLibrary.get(i));
            }  
        }
        return bookListAccordingYear;
    }
    

    public int numberOfFinishedBooks(ArrayList<Book> bookListInLibrary){       
        return bookListInLibrary.size();      
    }  
    
    public void addBookToLibrary(Book book){
        this.libraryBookList.add(book);
    }

    @Override
    public String toString() {
        return "Library{" + "libraryBookList=" + libraryBookList + '}';
    }
    
    
    
}
    