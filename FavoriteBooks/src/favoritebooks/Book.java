/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritebooks;

/**
 *
 * @author yarkingazibaba
 */
public class Book {
   
    int bookId;
    String title;
    String category;
    String authorNameAndSurname;
    String awardWinner;
    int rating;
    int year;
    int numberOfPages;
    String shortDescription;
    
    public Book(int bookId, String title, String category, String authorNameAndSurname,String awardWinner,int rating,int year,int numberOfPages, String shortDescription){
        this.bookId = bookId;
        this.title = title;
        this.category = category;
        this.authorNameAndSurname = authorNameAndSurname;
        this.awardWinner = awardWinner;
        this.rating = rating;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.shortDescription = shortDescription;  
    }

 

    Book() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tittle) {
        this.title = tittle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthorNameAndSurname() {
        return authorNameAndSurname;
    }

    public void setAuthorNameAndSurname(String authorNameAndSurname) {
        this.authorNameAndSurname = authorNameAndSurname;
    }

    public String getAwardWinner() {
        return awardWinner;
    }

    public void setAwardWinner(String awardWinner) {
        this.awardWinner = awardWinner;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Override
    public String toString() {
        return "bookId=" + bookId + ", tittle=" + title + ", category=" + category + ", authorNameAndSurname=" + authorNameAndSurname + ", awardWinner=" + awardWinner + ", rating=" + rating + ", year=" + year + ", numberOfPages=" + numberOfPages + ", shortDescription=" + shortDescription +"";
    }
           
    
        
}
    
    
    
    
    
   