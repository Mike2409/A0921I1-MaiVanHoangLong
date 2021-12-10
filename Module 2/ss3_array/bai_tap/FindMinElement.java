package ss3_array.bai_tap;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if(size > 20)
            {
                System.out.println("Size should not exceed 20");
            }
        }while(size > 20);
        array = new int[size];
        for(int i = 0; i< array.length;i++) {
            System.out.print("Enter element "+(i+1)+" : ");
            array[i]=scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int min = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j ;
            }
        }
        System.out.println("The smallest property value in the list is " + min + " ,at position " + index);

    }
}
