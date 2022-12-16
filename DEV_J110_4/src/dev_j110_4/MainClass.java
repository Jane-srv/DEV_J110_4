/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j110_4;

/**
 *
 * @author Jane
 */
public class MainClass {
    public static void main(String[] args) {
        ArrayInterface array1 = new BooleanArray();
        System.out.println("Boolean array:");
        System.out.println(array1);
        array1.setTrue(0);
        array1.setTrue(1);
        array1.setTrue(2);
        array1.setTrue(3);
        array1.setTrue(4);
        array1.setTrue(4);
        array1.setValue(5, true);
        array1.setValue(4, false);
        array1.setFalse(3);
        array1.setFalse(6);
        System.out.println(array1);
        array1.invert(0);
        array1.invert(6);
        System.out.println(array1);
        System.out.println(array1.getByIndex(5));
        System.out.println(array1.getByIndex(4));
        System.out.println("True amount is:" + array1.getTrueAmount());
        
        ArrayInterface array2 = new IntArray();
        System.out.println("Int array:");
        System.out.println(array2);
        array2.setTrue(5);
        array2.setTrue(6);
        array2.setTrue(7);
        array2.setTrue(8);
        array2.setTrue(9);
        array2.setTrue(15);
        array2.setFalse(6);
        System.out.println(array2);
        array2.setValue(0, true);
        array2.setValue(5, false);
        array2.invert(10);
        array2.invert(9);
        System.out.println(array2);
        System.out.println(array2.getByIndex(4));
        System.out.println(array2.getByIndex(7));
        System.out.println("True amount is:" + array2.getTrueAmount());
    }
}
