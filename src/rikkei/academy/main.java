package rikkei.academy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        int rong = sc.nextInt();
        System.out.println("Nhập chiêu cao");
        int cao = sc.nextInt();
        Rectangle hcn = new Rectangle(rong,cao);

        System.out.println("dien tich la: \n"+ hcn.getArea());
        System.out.println("chu vi la: \n"+ hcn.getPerimeter() );
        System.out.println("hcn la: \n"+ hcn.display());
    }
}
