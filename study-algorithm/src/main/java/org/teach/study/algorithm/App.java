package org.teach.study.algorithm;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * logger。
	 */
	private static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {		
		try {
			//StudyIO.studyIOUtils();
			//StudyAlgorithm.printDiamond1(10);
			int[] arr=new int[] {4,7,1,9,3,6,2};
			/*
			int index=-1;
			for (int i=0;i<arr.length;i++) {
				if (arr[i]==2)
				{
					index=i;
					break;
				}
			}			
			System.out.println("find it:"+index);
			*/
			StudyAlgorithm.bubbleSort(arr);
			System.out.println(Arrays.toString(arr));
			
			//Scanner a=new Scanner("");
		}catch (Exception e) {
			logger.error(e.getMessage(),e);
		}
	}

}
