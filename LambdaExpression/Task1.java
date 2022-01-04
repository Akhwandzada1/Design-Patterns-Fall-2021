package LambdaExpression;

import java.util.Arrays;

public class Task1 {
	
	public static void main(String[] args) {
		double sum[]= {10,12,15,18,22};
		ArrayCommand sumOfArray=(double[] sumArray )->{
			double result=0;
			for(double d: sumArray) {
				result=result+d;
			}
			return result;
		};
		System.out.println("Sum of elements of Array = "+sumOfArray.apply(sum));
		double average[]= {22,8,5,9,11,20};
		ArrayCommand averageOfArray=(double [] averageArray)->{
			double result=0;
			double av=0;
			for(double d: averageArray) {
				result=result+d;
				av=result/averageArray.length;
			}
			return av;
		};
		System.out.println("Average of elements of Array = "+averageOfArray.apply(average));
		double maximum[]= {30,60,22,45,90};
		ArrayCommand maximumOfArray=(double[] maximumArray)->{
			Arrays.sort(maximumArray);
			return maximumArray[maximumArray.length-1];
		};
		System.out.println("Maximum Element of array = "+maximumOfArray.apply(maximum));
		double minimum[]= {10,16,30,40,32};
		ArrayCommand minimumOfArray=(double[] minimumArray)->{
			Arrays.sort(minimumArray);
			return minimumArray[0];
		};
		System.out.println("Minimum Element of array = "+minimumOfArray.apply(minimum));
		double count[]= {3,4,6,4,8,4};
		ArrayCommand elementsOfArray=(double[] elements)->{
			int count1=0;
			int element=4;
			for(double d: elements) {
				if(d==element) {
					count1++;
				}
			}
			return count1;
		};
		System.out.println("Count of particular element in an array = "+elementsOfArray.apply(count));
}
}