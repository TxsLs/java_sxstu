package org.stu.maven.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <b>jia。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author 刘
 * @since 1.0
 */
public class jia {

	/**
	 * <b>构造方法。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 */
	public static List<Integer> test(int s) {
		List<Integer> list=new ArrayList<>();
		int sum = 0;
		for (int i = 1; i <= s; i++) {
			
			sum +=  i;
			//System.out.println(sum);
			list.add(sum);
		}
		return list;
		
		
		
		
	}
	
	
	public static void arr() {
		String a[]= {"a","b","c","d","e","f"};
		String arrString=Arrays.toString(a);
		System.out.println(arrString);
		
		for (int i = 0; i < a.length/2; i++) {
            String temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
		String arrsString=Arrays.toString(a);
        System.out.print(arrsString);
		
		
	}
	
	public static int[] reverse(int[] arr1) {
		int[] arr2 =new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i]=arr1[arr1.length-i-1];
		}
		
		return arr2;
		
		
	}
	

}
