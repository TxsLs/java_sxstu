package org.teach.study.algorithm;

import org.apache.commons.lang3.StringUtils;

/**
 * <b>学习一些简单算法。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex2000
 * @since 1.0
 */
public final class StudyAlgorithm {
	private StudyAlgorithm() {

	}

	/**
	 * <b>1-n求和。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 * @param n
	 * @return
	 */
	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	/**
	 * <b>打印杨辉三角。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 * @param row 打印行数
	 */
	public static void printYangHui(int row) {
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
			System.out.print(StringUtils.repeat(" ", row - i - 1));
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * <b>打印菱形。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 * @param row 打印行数，奇数
	 */
	public static void printDiamond1(int row) {
		if (row % 2 == 0)
			row--;
		int rowNum1 = (row + 1) / 2; //上一半行数（包括中间行）
		for (int i = 0; i < rowNum1; i++) {
			System.out.print(StringUtils.repeat(" ", rowNum1 - i - 1));
			for (int star = 0; star < (2 * i + 1); star++) {
				System.out.print("*");
			}
			System.out.println();// 换行
		}

		int rowNum2 = row - rowNum1;// 计算剩下的几行，这几行星号的数量是递减的
		for (int i = 0; i < rowNum2; i++) {
			System.out.print(StringUtils.repeat(" ", i + 1));
			for (int star = 0; star < (rowNum2 - i) * 2 - 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * <b>打印菱形。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 使用数组。
	 * @param row 打印行数，奇数
	 */
	public static void printDiamond2(int row) {
		if (row % 2 == 0)
			row--;
		int rowNum = row / 2 + 1; //上一半行数（包括中间行）
		//先将菱形的一半存放到数组里
		String[][] arr = new String[rowNum][row];
		for (int i = 0; i < rowNum; i++) {
			int j = 0, n = rowNum - i - 1;
			while (j < n) {
				arr[i][j++] = "  ";
			}
			n = 2 * i + 1;
			for (int star = 0; star < n; star++) {
				arr[i][j + star] = "* ";
			}
		}

		//输出上半部分
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < row; j++) {
				if (arr[i][j] != null)
					System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		//输出下半部分
		for (int i = rowNum - 1; i > 0; i--) {
			for (int j = 0; j < row; j++) {
				if (arr[i - 1][j] != null)
					System.out.print(arr[i - 1][j]);
			}
			System.out.println();
		}
	}

	/**
	 * <b>找素数。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 */
	public static void findPrime() {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			// 默认是素数
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					// 能整除
					flag = false;
				}
			}
			if (flag) {
				count += 1;
				System.out.print(i + ",");
			}
		}
		System.out.println("\n共计" + count + "个素数");
	}

	/**
	 * <b>冒泡排序。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 * @param arr 数组
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			// 比较相邻两个元素，较大的数往后冒泡
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j]; // 把第一个元素值保存到临时变量中
					arr[j] = arr[j + 1]; // 把第二个元素值保存到第一个元素单元中
					arr[j + 1] = temp; // 把临时变量（也就是第一个元素原值）保存到第二个元素中
				}
			}
		}
	}

	/**
	 * <b>选择排序。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 * @param arr 数组
	 */
	public static void selectSort(int[] arr) {
		int maxIndex;
		for (int i = 1; i < arr.length; i++) {
			maxIndex = 0; //最大值索引
			for (int j = 1; j <= arr.length - i; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = arr[arr.length - i];
			arr[arr.length - i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
	}

	/**
	 * <b>二分查找。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 * @param arr 数组
	 * @param n 要找的数
	 * @return 找到的索引，否则返回负数
	 */
	public static int binarySearch(int[] arr, int n) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			long midVal = arr[mid];

			if (midVal < n)
				low = mid + 1;
			else if (midVal > n)
				high = mid - 1;
			else
				return mid;
		}
		return -(low + 1);
	}

	/**
	 * <b>反转(逆序)。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 * @param arr 数组
	 */
	public static void reverse(int[] arr) {
		int temp;
		int len = arr.length;
		for (int i = 0; i < len / 2; i++) {
			temp = arr[i];
			arr[i] = arr[len - 1 - i];
			arr[len - 1 - i] = temp;
		}
	}
}
