package org.stu.maven.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.annotation.processing.RoundEnvironment;

import org.apache.commons.lang3.StringUtils;

public class StudyAlgorithm {
	/**
	 * <b>algorithm。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 * @param n
	 * @return
	 */
	public static List<Integer> algorithm(int n) {
		List<Integer> reIntegers = new ArrayList<>();

		for (int i = 1; i < n; i++) {
			boolean isPrime = true;
			for (int j = 2, l = (int) Math.sqrt(i); j <= l; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				//System.out.print(i+",");
				reIntegers.add(i);
			}
		}
		return reIntegers;
	}

	//杨辉三角

	/**
	 * <b>YHpirnt。</b>
	 * <p><b>详细说明：打印杨辉三角</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 输入打印行数。
	 * @param 返回int 类型
	 */
	public static void YHpirnt(int row) {

		int[][] arr = new int[row][row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
		
			}
		}

		for (int i = 0; i < row; i++) {
			System.out.print(StringUtils.repeat(" ", row - i - 1) + StringUtils.repeat(" ", 39));
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
