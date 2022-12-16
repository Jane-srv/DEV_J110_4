/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j110_4;

import static dev_j110_4.ArrayInterface.sizeArray;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Jane
 */
public class BooleanArray implements ArrayInterface{
    
    private boolean[] booleans = new boolean[sizeArray];
    
    @Override
    public boolean getByIndex(int index) {
        return booleans[index];        
    }

    @Override
    public void setTrue(int index) {
        booleans[index] = true;
    }

    @Override
    public void setValue(int index, boolean value) {
        booleans[index] = value;
    }

    @Override
    public void setFalse(int index) {
        booleans[index] = false;
    }

    @Override
    public void invert(int index) {
        if (booleans[index]==true) booleans[index] = false;
        else booleans[index] = true;
    }

    @Override
    public int getTrueAmount() {
        int amount=0;
        for (int index=0 ; index<sizeArray ; index++){
        if (booleans[index]==true) amount++;
        }
        return amount;
    }
    
    @Override
    public String toString() {
        String [] lines = new String[sizeArray];
        for(int i=0; i<sizeArray; i++){
            lines[i] = Objects.toString(getByIndex(i)? 1 : 0); //Тернарный оператор
        }
        return Arrays.toString(lines);
    }
    
    
    
}
