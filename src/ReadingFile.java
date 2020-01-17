import java.io.File;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Scanner;

import java.util.stream.DoubleStream;








	public class ReadingFile {
	
	
	
		public static void main(String[] args) {
	
			
	
			//readFiles takes a string and returns an array of intergers.
	
			//readFiles is a static method since it is not called with an instance. 
	
			double[] data = readFiles("randomDataExtract1.txt");
	
			System.out.println(Arrays.toString(data)); //static method
	
		
	
			analyzeData(data);
	
		
	
		}
	
		
	
		public static void analyzeData (double[] dataT) {
	
				
	
			double[] data = new double[dataT.length];
	
		
	
			for (int i = 0; i < dataT.length; i++) {
	
				data[i] = dataT[i];
	
			}
	
			
	
			
	
			double max = 0;
	
			double min = 0; //data[0];
	
			double sum = DoubleStream.of(data).sum();
	
			double mean = 0;
	
			double mode = 0;
	
			double range = 0;
	
			double median = 0;
	
			double iqr = 0;
	
			double q3 = 0;
	
			double q1 = 0;
	
			int qLength = 0;
	
			int length = data.length;
	
			int index = 0;
	
		    int soFar = 1; 
	
		    int count = 1;
	
			boolean realMode = true;
	
			
	
			
	
			System.out.println("The following array is in the form of: max, min, mean, median, mode, range, Q3, Q1, IQR");
	
			
	
			
	
			/*
	
			 * This was the previous method we used to find the sum, max, and min
	
			 * We replaced it because we discovered you could use Arrays.sort(data) to find max and min
	
			 * and use the DoubleStream.of(data).sum() to find the sum
	
			 * 
	
			for (int i = 0; i < length; i++) {
	
			sum = sum + data[i];
	
			
	
				if (data[i] < min) {
	
					min = data[i];
	
				}
	
			
	
				if (data[i] > max) {
	
					max = data[i];
	
				}
	
				
	
			}
	
			 */
	
			//YOU HAVE TO BE VERY CARFUL SORTING THIS DATA SINCE ARRAYS ARE A REFERENCE TYPE
	
			//Sorts it in asceding order
	
			//Arrays.sort(data);	 --> NOT ALLOWED TO USE THIS ;(
	
			
	
			/*
	
			
	
				double[] temp = new double[arr.length];
	
				temp[i] = arr[i];
	
				}
	
			*/
	
			
	
			
	
			//Finds the min and max
	
			min = data[0];
	
			max = data[length - 1];
	
			
	
			//Finds the mean (average)
	
			mean = sum/length;
	
			
	
			//Finds the median for data sets with an odd length
	
			if (length % 2 == 0) {
	
				median = (data[(length/2)] + data[(length/2 - 1)])/2;
	
				qLength = (length - 2)/2;
	
			}
	
			
	
			//Finds the median for data sets with an odd length
	
			if (length % 2 == 1) {
	
				median = data[(length - 1)/2];
	
				qLength = (length - 1)/2;
	
			}
	
			
	
			//Finds the Q3 and Q1 of the data for sets that have an even quartile length
	
			if (qLength % 2 == 0) { //WORKS
	
				q1 = (data[qLength/2 - 1] + data[qLength/2])/2;
	
				q3 = (data[(length/2) + qLength/2] + data[(length/2) + qLength/2 + 1])/2;	
	
			}
	
			
	
			//Finds the Q3 and Q1 of the data for sets that have an odd quartile length
	
			if (qLength % 2 == 1) {
	
				q1 = data[(qLength - 1)/2];
	
				q3 = data[length - ((qLength + 1)/2)];	
	
			}
	
				
	
			//Finds the mode
	
			for (int k = 1; k < length; k++){
	
				if (data[k - 1] == data[k]){
	
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
	
			mode = data[index];
	
			
	
			//Tests to see if mode is real
	
			if (soFar == 1) {
	
				realMode = false;
	
				mode = 0;
	
			}
	
		
	
			range = max - min;
	
	
	
			iqr = q3 - q1;
	
	
	
			double[] total = {max, min, mean, median, mode, range, q3, q1, iqr};
	
			
	
			System.out.println(Arrays.toString(total));
	
			System.out.println("");
	
			
	
			System.out.println("max: " + max);
	
			System.out.println("min: " + min);
	
			System.out.println("mean: " + mean);
	
			System.out.println("median: " + median);
	
			System.out.println("mode: " + mode);
	
			System.out.println("There is real mode in this data set: " + realMode);
	
			System.out.println("range: " + range);
	
			System.out.println("Q3: " + q3);
	
			System.out.println("Q1: " + q1);
	
			System.out.println("IQR: " + iqr);
	
			
	
			
	
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
	
				//If f does not podouble to a proper file then the code jumps to the catch and doesn't do anything else. 
	
				//The key thing is that it stops a runTime error. 
	
				
	
				
	
				//Arrays verese ArrayLists:
	
				//Arrays you must know the size in advance.  This means you have to loop through once
	
				//to find the size and then construct the array.  Then you run through it again to 
	
				//populate the array. 
	
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
	
			
	
			catch(Exception e) {
	
				System.out.println("NO FILE");
	
				return null;
	
			}
	
			
	
			
	
		}
	
}