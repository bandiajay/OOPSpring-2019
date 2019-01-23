/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author ajay
 */
public class Book {
    private int bookID;
    private String bookTitle;
    private double bookPrice;
    
    /**
    public Book(){
      this.bookID = -99;
      this.bookTitle = "No yet Decdied!";
      this.bookPrice = -99.99;
    }
    * */
    public Book(int bookIDIn, String bookTitleIn, double bookPriceIn){
        this.bookID = bookIDIn;
        this.bookTitle = bookTitleIn;
        this.bookPrice = bookPriceIn;
    }
    
    public int getBookId(){
        return this.bookID;
    }
    
    public void setBookID(int bookIdIn){
        this.bookID = bookIdIn;
    }
    
    public String toString(){
        return bookID+" "+bookTitle+" $"+bookPrice;
    }
}
