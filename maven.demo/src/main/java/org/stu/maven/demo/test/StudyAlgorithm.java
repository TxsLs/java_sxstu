package org.stu.maven.demo.test;

import java.util.ArrayList;
import java.util.List;

public class StudyAlgorithm {
	public static List<Integer> algorithm(int n) {
List< Integer>reIntegers=new ArrayList<>();

		for (int i = 1; i < n; i++) {
			boolean isPrime=true;
			for(int j=2,l=(int)Math.sqrt(i);j<=l;j++) {
			
				if(i%j==0) {
					isPrime=false;
					break;
				}
					
			}
			if(isPrime) {
				//System.out.print(i+",");
				reIntegers.add(i);
			}
		}
		return reIntegers;
	}
	 
}
