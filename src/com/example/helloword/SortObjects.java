package com.example.helloword;


/**
 * Created by ronen on 4/19/14.
 */
public class SortObjects {

    private int numColors = 3;
    private int[] pointers;


    public SortObjects() {

        pointers = new int[numColors];
        for (int i = 0; i < numColors; i++) {
            pointers[i] = -1;
        }
    }

    public SortObjects(int varNumColors) {
        numColors = varNumColors;
        pointers = new int[numColors];
        for (int i = 0; i < numColors; i++) {
            pointers[i] = -1;
        }
    }


    public Bicycle[] sortObjects(Bicycle[] list) {

        for (int i = 0; i < list.length; i++) {
            int currentInt = list[i].getColor().getNumber();

            if (pointers[currentInt] == -1) {
                pointers[currentInt] = i;
            }
            if (pointers[currentInt] + 1 == i) {
                continue;
            }
            shiftObjects(list, currentInt, i, pointers);
        }
        return list;
    }

    private static Bicycle[] shiftObjects(Bicycle[] list, int orderNumber, int index, int[] pointers) {

        for (int i = orderNumber + 1; i < pointers.length; i++) {
            // printCurrent(pointers,list);
            if (pointers[i] >= 0 && index != pointers[i]) {
                Bicycle temp = list[pointers[i]];
                list[pointers[i]] = list[index];
                list[index] = temp;
                if (pointers[orderNumber] >= pointers[i])
                    pointers[orderNumber] = pointers[i];
                pointers[i] = pointers[i] + 1;
            }
        }

        return list;
    }


    private static void printCurrent(int[] pointers, Bicycle[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("the color 2 " + list[i].getColor().getColor());
        }
        for (int i = 0; i < pointers.length; i++) {
            System.out.println("pointers " + pointers[i]);
        }
    }
}

class Color {

    public String color = null;
    public int number = 0;

    public String[] colorlist = new String[3];

    public Color(String name, int varNumber) {
        colorlist[number] = name;
        color = name;
        number = varNumber;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

}

class Bicycle {
    Color color = null;

    public Bicycle(Color newValue) {
        color = newValue;
    }

    void setColor(Color newValue) {
        color = newValue;
    }

    Color getColor() {
        return color;
    }
}