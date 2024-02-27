package bootstrap.example.com.appspring.controllers;

public class BookIdMismatchException extends RuntimeException{
    public BookIdMismatchException(){
        super ("Book ID mismatch");
    }

}
