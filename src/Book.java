/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Book {
    String title, author, year;
    
    public static void main(String[] args){
        Book book = new Book();
        book.get_book_info("Laskar Pelangi", "Andrea Hirata", "2005");
    }
    void get_book_info(String judul, String penulis, String tahun ){
        title = judul;
        author = penulis;
        year = tahun;
        System.out.println("Judul : ["+title+"]"+", Penulis :["+author+"]"+", Tahun Terbit :["+year+"]");

    }
}
