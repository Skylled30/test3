import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int max1 = 0;
        int max2 = 0;
        while (number != 0) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2) {
                max2 = number;
            }
            number = sc.nextInt();
        }
        System.out.println(max2);
    }

}

