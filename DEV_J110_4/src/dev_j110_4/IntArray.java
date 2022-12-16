/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j110_4;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Jane
 */
public class IntArray implements ArrayInterface{
    private int[] ints = new int[sizeArray/32];

    @Override
    public boolean getByIndex(int index) {
        int indexElement = index/32;
        int element = ints[indexElement];//Индекс элемента, где искомый бит
        int indexBit = index%32;//Индекс бита в элементе
        int mask = 1<<indexBit;//Получаем маску, так как знаем местонахождение элемента
        return(element & mask) == mask;//Результат логического выражения (и) сравниваем с маской
   
    }

    @Override
    public void setTrue(int index) {
        if(index<0 || index>=sizeArray) return;
        int indexElement = index/32;
        int indexBit = index%32;//Индекс бита в элементе
        int mask = 1<<indexBit;//Получаем маску, так как знаем местонахождение элемента
        ints[indexElement] = ints[indexElement] | mask;
    }

    @Override
    public String toString() {
        String [] lines = new String[sizeArray];
        for(int i=0; i<sizeArray; i++){
            lines[i] = Objects.toString(getByIndex(i)? 1 : 0); //Тернарный оператор
        }
        return Arrays.toString(lines);
    }

    @Override
    public void setValue(int index, boolean value) {
        if(index<0 || index>=sizeArray) return;
        int indexElement = index/32;
        int indexBit = index%32;//Индекс бита в элементе
        int mask = 1<<indexBit;//Получаем маску, так как знаем местонахождение элемента
        if (value==true){
            ints[indexElement] = ints[indexElement] | mask;
        }
        if (value==false){
            mask = ~mask;
            ints[indexElement] = ints[indexElement] & mask;
        }
    }
    
    @Override
    public void setFalse(int index) {
        if(index<0 || index>=sizeArray) return;
        int indexElement = index/32;
        int indexBit = index%32;//Индекс бита в элементе
        int mask = 1<<indexBit;//Получаем маску, так как знаем местонахождение элемента
        mask = ~mask;
        ints[indexElement] = ints[indexElement] & mask;
    }

    @Override
    public void invert(int index) {
        if(index<0 || index>=sizeArray) return;
        int indexElement = index/32;
        int indexBit = index%32;//Индекс бита в элементе
        int mask = 1<<indexBit;//Получаем маску, так как знаем местонахождение элемента
        mask = ~mask;
        ints[indexElement] = ints[indexElement] ^ mask;
    }

    
    @Override
    public int getTrueAmount() {
        int amount = 0;
        for(int index=0 ; index<sizeArray ; index++){
            int indexElement = index/32;
            int element = ints[indexElement];//Индекс элемента, где искомый бит
            int indexBit = index%32;//Индекс бита в элементе
            int mask = 1<<indexBit;//Получаем маску, так как знаем местонахождение элемента
            if ((element & mask) == mask) amount++ ;   
        }
    return amount;
    }
    
}
    
    
    

