package com.randy;

import edu.washington.java.course.TestEncapsulation;


public class Testmain extends TestEncapsulation {

    public static void main(String args[]) {
        TestEncapsulation te = new TestEncapsulation();
        te.publicMethod();
        te.protectedInt += 1;
//        te.packageString = "test";
        // te.privateDouble = 10;
    }

}
