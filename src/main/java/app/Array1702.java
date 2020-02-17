package app;

import java.util.Arrays;

public class Array1702 {
    public static void main(String[] args) {

            int[] array1 = new int[10];
            int[] arrayPos = new int[10];
            int indexPos = 0;
            int indexPosShifted= 0;

            for (int i = 0; i <array1.length ; i++) {
                int num = (int) (Math.random()*((10-(-10)))+1)-10;
                array1[i] = num;

            }

        for (int i = 0; i < array1.length ; i++) {
            if (array1[i]>0) {
                arrayPos[indexPos] = array1[i];
                indexPos++;
            }
        }

        int[] arrayPosClear = Arrays.copyOf(arrayPos, indexPos);
        int[] arrayPosShifted = Arrays.copyOf(arrayPos, indexPos);

        for (int i = 0; i <arrayPosClear.length ; i++) {
            if(i-1>=0)
                arrayPosShifted[indexPosShifted] = arrayPosClear[i-1];
            indexPosShifted++;

            arrayPosShifted[0] = arrayPosClear[indexPos-1];
        }

        int[] arrayShifted = new int[10];
        int newIndex = 0;

        for (int i = 0; i <array1.length ; i++) {
            if (array1[i]>0){
                arrayShifted[i] = arrayPosShifted[newIndex];
                newIndex++;
            }
            else{
                arrayShifted[i] = array1[i];
            }
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(arrayPosClear));
        System.out.println(Arrays.toString(arrayPosShifted));
        System.out.println(Arrays.toString(arrayShifted));

    }

}

