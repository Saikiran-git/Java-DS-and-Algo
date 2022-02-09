package com.aglo.others;

import java.util.*;

public class InsertDeleteInArray {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input statement
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int a[] = new int[size];
        int i;

        // To enter the initial elements
        for (i = 0; i < size; i++) {
            System.out.println("Enter the element");
            a[i] = sc.nextInt();
        }

        // To insert a new element(we are creating a new array)
        System.out.println("Enter the index at which the element should be inserted");
        int insert_pos = sc.nextInt();
        System.out.println("Enter the element to be inserted");
        int ins = sc.nextInt();
        int size2 = size + 1;
        int b[] = new int[size2];
        for (i = 0; i < size2; i++) {
            if (i <= insert_pos) {
                b[i] = a[i];
            } else {
                b[i] = a[i - 1];
            }
        }
        b[insert_pos] = ins;
        for (i = 0; i < size2; i++) {
            System.out.println(b[i]);
        }

        // To delete an element given the index
        System.out.println("Enter the index at which element is to be deleted");
        int del_pos = sc.nextInt();
        for (i = del_pos; i < size2 - 1; i++) {
            b[i] = b[i + 1];
        }
        for (i = 0; i < size2 - 1; i++) {
            System.out.println(b[i]);
        }
        sc.close();
    }
}
