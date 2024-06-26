package homework.b2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class b2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter number of array elements:");
        int n = Integer.parseInt(sc.nextLine());
        if(n!=0){
            for (int i = 0; i < n; i++) {
                System.out.println("enter: ");
                arr.add(Integer.parseInt(sc.nextLine()));
            }
        }
        if (arr.isEmpty())throw new Exception("Hihihi");
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)>max)max=arr.get(i);
        }
        System.out.println("max: "+max);
    }
}
