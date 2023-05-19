/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class rectangle {
    int width, height, area, perimeter;
    
    public static void main(String[] args){
        rectangle Rectangle = new rectangle();
        Rectangle.calculate_area(8, 10);
        Rectangle.calculate_perimeter(8, 10);
        Rectangle.tampil();
    }
    void calculate_area(int w, int h){
        width = w;
        height = h;
        area = width*height;
    }
    void calculate_perimeter(int w, int h){
        width = w;
        height = h;
        perimeter = (2*width)+(2*height);
    }
    void tampil(){
        System.out.println("Panjang : "+width);
        System.out.println("Lebar : "+height);
        System.out.println("Luasnya adalah "+area);
        System.out.println("Kelilingnya adalah "+perimeter);
    }
}
