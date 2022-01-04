package LambdaExpression;

import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		double[] array= {30,60,72,38,29,77,45};
		ArrayCommand sum=Task2::sumOfArray;
		System.out.println(sum.apply(array));
		ArrayCommand average=Task2::averageOfArray;
		System.out.println(average.apply(array));
		ArrayCommand maximum=Task2::maximumOfArray;
		System.out.println(maximum.apply(array));
		ArrayCommand minimum=Task2::minimumOfArray;
		System.out.println(minimum.apply(array));
		ArrayCommand element=Task2::elementcountOfArray;
		System.out.println(element.apply(array));
	}
	
	static double sumOfArray(double[] array) {
		double result=0;
		for(double d: array) {
			result=result+d;
		}
		return result;
	}
	static double averageOfArray(double[] array) {
		double result=0;
		double average=0;
		for(double d: array) {
			result=result+d;
		}
		average=result/array.length;
		return average;
	}
	static double maximumOfArray(double[] array) {
		Arrays.sort(array);
		return array[array.length-1];
	}
	static double minimumOfArray(double[] array) {
		Arrays.sort(array);
		return array[0];
	}
	static double elementcountOfArray(double[] array) {
		double element=4;
		double count=0;
		for(double d: array) {
			if(d==element)
				count++;
		}
		return count;
	}
}