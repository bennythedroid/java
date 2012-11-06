package edu.washington.week4;

import java.util.StringTokenizer;

public class WorkingWithStringTokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("this is a test");
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
	 System.out.println("-----------------------------------------");
	     String[] result = "this is a test".split("\\s");
	     for (int x=0; x<result.length; x++) {
	         System.out.println(result[x]);
	     }
	}
}
