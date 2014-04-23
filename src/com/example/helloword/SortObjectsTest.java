package com.example.helloword;

import java.util.Collections;

/**
 * Created by ronen on 4/22/14.
 */
public class SortObjectsTest extends junit.framework.TestCase {

    Color RED = new Color("RED", 0);
    Color GREEN =new Color("GREEN", 1);
    Color BLUE = new Color("BLUE", 2);

    public void testsortObjects() throws Exception {
        SortObjects helloWorld = new SortObjects();
        Bicycle[] copyFrom = {new Bicycle(RED),new Bicycle(GREEN),new Bicycle(RED)};

        Bicycle[] newArray = helloWorld.sortObjects(copyFrom);

        checkArray(new String[]{"RED","RED","GREEN"}, newArray);

    }

    public void testSortObjects2() throws Exception {
        SortObjects helloWorld = new SortObjects();
        Bicycle[] copyFrom = {new Bicycle(RED),new Bicycle(GREEN),new Bicycle(BLUE),new Bicycle(RED),new Bicycle(RED),new Bicycle(RED)};

        Bicycle[] newArray = helloWorld.sortObjects(copyFrom);

        checkArray(new String[]{"RED","RED","RED","RED","GREEN","BLUE"}, newArray);

    }

    public void testSortObjects3() throws Exception {
        SortObjects helloWorld = new SortObjects();
        Bicycle[] copyFrom = {new Bicycle(BLUE),new Bicycle(GREEN),new Bicycle(BLUE),new Bicycle(RED),new Bicycle(GREEN),new Bicycle(GREEN)};

        Bicycle[] newArray = helloWorld.sortObjects(copyFrom);

        checkArray(new String[]{"RED","GREEN","GREEN","GREEN","BLUE","BLUE"}, newArray);

    }

    // introducing a new color
    public void testSortObjects5() throws Exception {

        Color KKKK = new Color("KKKK", 3);
        SortObjects helloWorld = new SortObjects(4);
        Bicycle[] copyFrom = {new Bicycle(BLUE),new Bicycle(GREEN),new Bicycle(BLUE),new Bicycle(RED),new Bicycle(GREEN),new Bicycle(KKKK)};

        Bicycle[] newArray = helloWorld.sortObjects(copyFrom);

        checkArray(new String[]{"RED","GREEN","GREEN","BLUE","BLUE","KKKK"}, newArray);

    }

    private void checkArray(String[] colors, Bicycle[] list){

        for(int i=0;i< colors.length;i++){
            assertEquals("validate color index = " + i, colors[i], list[i].getColor().getColor()) ;

        }
    }
}
