package homework.b1;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b,c;
        do{
            System.out.println("Nhap so 1");
            String a = sc.nextLine();
            try{
                b= Integer.parseInt(a);
                break;
            }catch (NumberFormatException e){
                System.err.println("Invalid input value.");
            }
        }while(true);
        do{
            System.out.println("Nhap so 2");
            String a = sc.nextLine();
            try{
                c= Integer.parseInt(a);
                break;
            }catch (NumberFormatException e){
                System.err.println("Invalid input value.");
            }
        }while(true);
        System.out.println("Tong: " + (c+b));
    }
}
