import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 * 
 * @authors Alex Bastin, Artem Khachaturov, Tafe Ajidagba
 * Started: December 4, 2019
 * Finished: December 14, 2019
 *
 */


public class NewReadingFile {

	public static void main(String[] args) {
		
		//readFiles takes a string and returns an array of intergers.
		//readFiles is a static method since it is not called with an instance. 
		double[] oldData = readFiles("randomDataExtract1.txt");
		System.out.println("Unsorted array is: " + Arrays.toString(oldData)); //static method
		
		// Creates new double array
		double[] sortedData = new double[oldData.length];
		
		//Copies each double value from oldData to new double array sortedData
		for (int i = 0; i < oldData.length; i++) {
			sortedData[i] = oldData[i];
		}		

		//Sorts the unsorted double array sortedData chronologically
		Arrays.sort(sortedData);
		System.out.println("Sorted array is: " + Arrays.toString(sortedData));

		//Prints out all values
		System.out.println("Minimum: " + findMin(sortedData));
		System.out.println("Minimum: " + findMax(sortedData));
		System.out.println("Mean: " + findMean(sortedData));
		System.out.println("Median: " + findMedian(sortedData));
		findMode(sortedData); // This is a void method because it only returns something if a condition is true
		System.out.println("Range: " + findRange(sortedData));
		System.out.println("Q3: "+ findQ3(sortedData));
		System.out.println("Q1: " + findQ1(sortedData));
		System.out.println("IQR: " + findIQR(sortedData));
	}

	public static double findMin (double[] sortedData) {
		double min = sortedData[0]; // finds the first value which is min because array is sorted
		return min;
	}
	
	public static double findMax (double[] sortedData) {
		double max = sortedData[sortedData.length - 1]; //finds the last value which is the max because array is sorted
		return max;
	}
	
	public static double findMean (double[] sortedData) {
		double mean = (DoubleStream.of(sortedData).sum()) / (sortedData.length); //"Doublestream... --> finds the sum
		return mean;
	}
	
	public static double findMedian (double[] sortedData) {
		double median = 0;

		//Finds the median for data sets with an odd length
		if (sortedData.length % 2 == 0) {
			median = (sortedData[(int) ((sortedData.length * 0.5) - 1)] + sortedData[(int) (sortedData.length * 0.5)])/2;
		}
		
		//Finds the median for data sets with an odd length
		if (sortedData.length % 2 == 1) {
			median = sortedData[(int) (sortedData.length * 0.5)];
		}
	return median;
	}
	
	public static void findMode (double[] sortedData) {
		int index = 0;
	    int soFar = 1; 
	    int count = 1;
	    double mode = 0;
	    boolean realMode = true;
		
		//Finds the mode
		for (int k = 1; k < sortedData.length; k++){
			if (sortedData[k - 1] == sortedData[k]){
				count++;
			}
			if (count > soFar) { 
				soFar = count ; 
				index = k; 
			} else {
				count = 1; 
			}
		}
		
		//Sets mode to the index in data (most repeated number)
		mode = sortedData[index];
		
		//Tests to see if the mode is real
		if (soFar == 1) {
			realMode = false;
			mode = 0;
		}
		System.out.print("The mode in this data set is " + realMode);
		
		if (realMode == true) { //only prints if there's a real mode
			System.out.print(". It is: " + mode);
		}
		System.out.println("");
	}
	
	public static double findRange (double[] sortedData) {
		double range = findMax(sortedData) - findMin(sortedData); //referencing the methods findMax and findMin to find range
		return range;
	}
	
	public static double findQ3 (double[] sortedData) { 
		double q3 = 0;
		
		if ((sortedData.length - 1)/2 % 2  == 0) { //check to see if the halves on each side of the median are EVEN
			q3 = (sortedData[(int) (sortedData.length * 0.75)] + sortedData[(int) (sortedData.length * 0.75) + 1]) / 2;
		}
		
		else if (((sortedData.length - 1)/2) % 2 == 1) { //check to see if the halves on each side of the median are ODD
			q3 = sortedData[(int) (sortedData.length * 0.75)];
		}
				
	return q3;
	
	}
	
	public static double findQ1 (double[] sortedData) {
		double q1 = 0;
		
		if ((sortedData.length - 1)/2 % 2  == 0) { //check to see if the halves on each side of the median are EVEN
			q1 = (sortedData[(int) ((sortedData.length * 0.25) - 1)] + sortedData[(int) (sortedData.length * 0.25)]) / 2;
		}
		
		else if (((sortedData.length - 1)/2) % 2 == 1) { //check to see if the halves on each side of the median are ODD
			q1 = sortedData[(int) ((sortedData.length * 0.25))];
		}	
		
	return q1;
	}
	
	public static double findIQR (double[] sortedData) {
		double iqr = findQ3(sortedData) - findQ1(sortedData); //referencing the methods findQ3 and findQ1 to find range
		return iqr;
	}

	public static double[] readFiles(String file) {
		/*
		 * A try catch structure is a way to avoid a run time error. 
		 * There are a set of default responses if you have a runTime Error
		 * A try catch is needed in specific cases when methods "throw" an error.
		 * You can check if a method "throws" an exception by checking the documentation
		 */
		try {
			
			File f = new File(file); //Constructs a File Object 
			Scanner s = new Scanner(f); //Constructs a Scanner object using the file object. This "throws" the error
			
			int ctr = 0;
			
			while (s.hasNext()) { 
				ctr++;
				s.nextDouble();
			}	
			
			double[] arr = new double[ctr];
			
			Scanner s1 = new Scanner(f);
			
			for (int i = 0; i < arr.length; i++)
				arr[i] = s1.nextDouble();
				
			return arr;
		}
		
		catch(Exception e) {  // if the try doesn't work
			System.out.println("NO FILE");
			return null;
		}
		
		
	}
}
