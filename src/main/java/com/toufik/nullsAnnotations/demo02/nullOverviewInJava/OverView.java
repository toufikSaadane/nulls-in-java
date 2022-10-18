package com.toufik.nullsAnnotations.demo02.nullOverviewInJava;

import org.junit.Test;

import static org.junit.Assert.*;

public class OverView {

    @Test
    public void referenceType(){
        Object object_one = new Object();
        Object object_two = new Object();
        Object object_three = object_two;
        Object object_four = null;
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;

        System.out.println( "o1 == o2: " + (o1 == o2) );
        System.out.println( "o2 == o3: " + (o2 == o3) );
        System.out.println( "null == null: " + (null == null) );

        System.out.println(object_one == object_two);
        assertNotEquals(object_one == object_two, true );
        assertEquals(object_three, object_two);
        assertEquals(object_four, null);
        assertNull(object_four);

    }
}
