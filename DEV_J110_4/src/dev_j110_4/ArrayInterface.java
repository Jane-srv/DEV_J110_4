/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dev_j110_4;

/**
 *
 * @author Jane
 */
public interface ArrayInterface {
    int sizeArray = 1024;
    boolean getByIndex(int index);
    void setTrue(int index);
    void setValue(int index, boolean value);
    void setFalse (int index);
    void invert (int index);
    int getTrueAmount();
}
