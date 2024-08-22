
package btvn;

import java.util.Scanner;


public class Btvn {

 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int c =keyboard.nextInt();
        System.out.print("Nhap b: ");
        int d = keyboard.nextInt();
        int tong = c+d;
        int hieu = c-d;
        int tich = c*d;
        int thuong = (d!=0) ? (c/d) : 0;
        int du = (d!=0) ? (c%d) : 0;
        System.out.println("Tong : "+tong);
        System.out.println("Hieu : "+hieu);
        System.out.println("Tich : "+tich);
        if (d==0)
        {
            System.out.println("Khong chia duoc ");
        }
        else
        {
            System.out.println("Thuong : "+thuong);
            System.out.println("Phan du : "+du);
        }
    }
    
}