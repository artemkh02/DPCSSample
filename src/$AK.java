import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
public class $AK {

	public static boolean isVowel(char c) {
		String a = "" + c;
		a = a.toLowerCase();
		c = a.charAt(0);
		
		if (c == 'a' || c =='e' || c == 'i' || c == 'o' || c == 'u')  {
			return true;
		}
		return false;	
	}
	
	
	public static boolean isVowel(String a) {
		if ("aeiou".indexOf(a) != -1) {
			return true;
		}
		return false;
	}
	public static void main(String[]args) {
		//Reference type = object type (construction the array list) 
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int sum = 0;

		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i)==2) {
				sum = sum + list.remove(i);
				//list.remove(i);
			}
		}
		
		System.out.println(list);
		System.out.println(sum);
		
		ArrayList<Character> vow = new ArrayList<Character>();		
		String vowels = "";
		vow.add('a');
		vow.add('e');
		vow.add('i');
		vow.add('o');
		vow.add('u');
		vow.add('8');

		for (int i = list.size() - 1; i >= 0; i++) {
			if(isVowel(vow.get(i))) {
				
				vowels = vowels + vow.get(i);
				
				vow.remove(i);
				
			}
		}
		System.out.print(vow);
	
			
		//int[] arr = {23,12,89};
		//int[] arr2 = {2,12,89};
		//System.out.println(fidnArrayDigitSum(arr));
		//printMatrix(9,9);
		
		// TODO Auto-generated method stub
		//Variables to use
		/*int x = 0;
		int y = 0;
		int z = 0;*/
		
		//int[] result = createRandomArray(4, 1, 9);
		//System.out.println(Arrays.toString(result));
		
		//System.out.println(foundElement(result, 16));

		
		/*
		print("Artem");
		//Test Code addString
		System.out.println(addStrings("Artem","Khachaturov"));
		
		int[] nums = {1,2,3,4,5,6};
		double value = calcEvenAverage(nums);
		System.out.println(value);
		
		
		//Test Code base2To10A
		System.out.println(base2To10A(100000));
		
		//Test Code base10To2
		System.out.println(base10ToBase2(233));*/
		
		//Test Code 
//
	}

	
	private static boolean isVowel(Integer integer) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * This function converts a base 10 value to base 2.  It takes an ingeter value. 
	 * It returns an integer value. 
	 * @param n
	 * @return
	 * 
	 * @precondition: The passed integer is in base 10
	 * @postcondition: The returned integer is base 2
	 */
	public static int base10ToBase2(int n) {
		
		/*
		 * If I divide two integers in java it automatically
		 * does integer division
		 * int x = 7;
		 * int y = 3;
		 * int z = x/y --> 2
		 */
		String r = "";
	
		
		while (n > 0) {
			
			int x = n%2;
			n = n / 2; //This is integer division. 
			r = x + r;
			
		}
		
		//Changing Type:
		//Changing type is called "casting"
		//In Java (and all languages) there are "shortcuts"
	
		return Integer.parseInt(r);
			
		
	}
	
	//If you fininsh this, create a version that does
	//base 10 to base n
	
	/**
	 * 
	 * @param n
	 * @param base
	 * @return
	 * 
	 * precondition: n < 10
	 * 
	 */
	public static int base10toBaseN(int n, int base) {
		
		/*
		 * If I divide two integers in java it automatically
		 * does integer division
		 * int x = 7;
		 * int y = 3;
		 * int z = x/y --> 2
		 */
		String r = ""; 
	
		
		while (n > 0) {
			
			int x = n%base;
			n = n / base; //This is integer division. 
			r = x + r;
			
		}
		
		//Changing Type:
		//Changing type is called "casting"
		//In Java (and all languages) there are "shortcuts"
	
		return Integer.parseInt(r);
			
		
	}
	
	/**
	 * This method takes a base 2 value and returns the base 10 value
	 * @param n
	 * @return
	 * 
	 * pre-condition: n can only contain 1 and 0 values. 
	 */
	public static int base2To10A(int n) {
		
		int pwr = 0;
		int r = 0;
		
		while (n > 0) {
			
			int x = n % 10;
			n = n / 10; //INTEGER DIVISION
			
			//Cast Math.pow(2,pwr) to an int
			//Casting is the process of changing type
			//When we cast a double to an int we chop off decimal
			r = r + x * (int)Math.pow(2, pwr);
			
			pwr = pwr + 1;
		
		}
		

		return r;
		
		
	}
	
	

	public static boolean linearSearch(int[] nums, int a) {
		//CODE NEEDED
		for (int i = 0; i < nums.length; i = i + 1) {
			if (nums[i] == a) {
				return true;
			}
		}
		
		
		return false;
	}
	
	/**
	 * This method takes a positive base 10 integer and returns a binary representation. 
	 * 
	 * @param n
	 * @return
	 * 
	 * precondition: n must be a positive integer value. 
	 * 
	 */
	public static int base10To2(int n) {
		
		//Why does storing the result in string makes sense here?
		//
		String result = "0";
		
		while (n != 0) {
			
			int value = n % 2;
			System.out.println(value);
			n = n / 2; //integer division
			result = ""+ value + result;
			
			
				
		}
		
		return Integer.parseInt(result);
		
	}
	
	/**
	 * 
	 * @param s
	 */
	public static void print(String s) {
		
		System.out.println(s);
	}//end print
	
	/**
	 * This takes two strings a and b and returns a + b
	 * @param a
	 * @param b
	 * @return
	 * 
	 * preconditions - a and b are valid strings 
	 * postconditions - no post conditions
	 * 
	 */
	public static String addStrings(String a, String b) {
		
		return a + b;
	}
	
	/**
	 * This method takes a string as a parameter and returns
	 * true if it is even length and false if it is odd length
	 * @param a
	 * @return
	 */
	public static boolean isEvenString(String a) {
		
		return a.length() % 2 == 0;
		
	}
	
	/**
	 * 
	 * @param a
	 * @param n
	 * @return
	 */
	public static String pullN(String a, int n) {
		
		if (n > a.length()) {
			return a;
		}
		
		String result = a.substring(0,n);
		
		return result;
		
	}
	
	/**
	 * This function takes an array of integers and 
	 * returns the average as a double. 
	 * @param a
	 * @return
	 */
	public static double calcEvenAverage(int[] a) {
		
		double sum = 0;
		int ctr = 0;
		
		for (int i = 0; i < a.length; i = i + 1) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
				ctr = ctr + 1;
			}
		}
		
		double average = sum/ctr;
		return average;
		
	}
	
	
	
	
	
	
	
	/**
	 * This function takes an array of integers and returns 
	 * the sum of digits.
	 * @param a
	 * @return
	 * 
	 * pre-condition: All elements are 2 digit in length
	 * post-condition:  a is not changed when the function is done
	 * 
	 */
	public static int fidnArrayDigitSum(int[] a) {
		
		
		int sum = 0;
		
		for (int i=0; i < a.length; i = i++) {
			
			String temp = "" + a[i];
			String n1 = temp.substring(0,1);
			String n2 = "0";
			
			if (temp.length() > 1) {
				n2 = temp.substring(1,2);
			}
			sum = sum + Integer.parseInt(n1) + Integer.parseInt(n2);
			
		}
		return sum;
	}
	
	

	
	public static int[] inputIntArray() {
			
			Scanner s = new Scanner(System.in);
			
			System.out.print("How many elements");
			int n = s.nextInt();
			
			int[] result = new int[n];
			
			for (int i = 0; i < n; i = i++) {
				System.out.print("Input value");
				result[i] = s.nextInt();
			}
			return result;
	
	
	
	
	
	}
	
	/*
	 * precondition: The array can be any length but must exist
	 * postcondition: the array is left unchanged
	 */
	public static String findAlphaSmallest(String[] s) {
		
		String min = s[0];
		
		for (int i = 0; i < s.length; i = i + 1) {
			if (s[i].compareToIgnoreCase(min) < 0) {
				min = s[i];
			}
		}
		
		return min;
		
	}
	
	public static class ClassWordStacks {
		
		public static void main33(String[] args) {
			
			Stack <String> s1 = new Stack <>();
			//Reference Type;	It tells you what to expect 
			//					when you follow the reference
			//					to the object.
			//Object Type: 		This is what you actually find.
			
			//Generally at this stage the object type and reference
			//type match. Eventually they won't
			Scanner s = new Scanner(System.in);
			Object OS = new Scanner(System.in);
			//Scanner so = new Object(); //INVALID
			
			s1.push("one");
			s1.push("two");
			s1.push("three");
			System.out.println(s1);
			s1.pop();
			System.out.println(s1);

		}
		
	
		
		
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String seeColor(String str) {
	    if(str.length() >= 3 && str.substring(0, 3).equals("red"))
	        return "red";
	          
	    if(str.length() >= 4 && str.substring(0, 4).equals("blue"))
	        return "blue";
	                    
	    return "";
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static int sumDigits(String str) {
	    int sum = 0;
	    
	    for(int i = 0; i < str.length(); i++) {
	        if(Character.isDigit(str.charAt(i)))
	            sum = sum + str.charAt(i) - '0';
	    }
	                    
	    return sum;
	}
	
	/**
	 * 
	 * @param q
	 */
	public static void  reverseQueue(Queue<String> q) {
	
		Stack<String> s = new Stack<String>();
		//Empty the queue and fill up the stack
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		//Empty stack and put it back in the queue
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
	}
	
	
	/**
	 * 
	 * @param r
	 * @param c
	 * @return
	 */
	
	public static void printMatrix(int r, int c) {
	
		for(int i = 0; i < r; i++) {
			
			int count = 1;
			
			for (int p = 0; p < c; p ++) {
				
				System.out.print(count + " ");
				count++;
			}
			
			System.out.println("");
		}
	}
	
	
	
	
	
	
	
	/**
	 * This method takes an int then compares it to k and prints out k until input is equal to k. 
	 * Returns nothing
	 * @param n
	 */
	public static void test1_3_6(int n) {
		
		int k = 1;
		// loop while k<=n
		while (k <= n) {
			
			System.out.println(k);
			
			k++;
		}
	}
	
	/**
	 * Creates an Array with random digits
	 * @param a
	 * @param b
	 * @param c
	 * @return Array
	 */
	public static int[] createRandomArray(int a, int b, int c) {
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			Random rand = new Random();
			arr[i] = rand.nextInt(c + 1 - b)+b;
			
		}
		return arr;
	}
	
	
	
	public static boolean foundElement(int a[], int b) {
		int q = 0;
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 0) {
				q = 1;
				break;
			}
		}
		if (q == 1) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 
	 * @param rows
	 * @param columns
	 * @return
	 */
	public static int[][] createRandom2DArray(int rows, int columns) { 
		int[][] arr = new int[rows][columns];
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr.length; c++) {
				
				arr[r][c] = (int)(Math.random()*100);
			}
		}
		return arr;
	}
	/**
	 * 
	 * @param arr
	 */
	public static void print2DRowMajor(int[][] arr) {
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr[r].length; c++) {
				System.out.println(arr[r][c]);
				arr[r][c] = (int)(Math.random()*100);
			}
		}	
	}
	/**
	 * 
	 * @param arr
	 */
	public static void print2DcolumnMajor(int[][] arr) {
		for(int c = 0; c < arr.length; c++) {
			for(int r = 0; r < arr.length; r++) {
				System.out.println(arr[r][c]);
			}
		}
	}
	
	/*public class StackFileAccess {
		
		public static void main (String[] args) {
			Stack<Integer> stack1 = readToIntStack("dataInt.txt");
			System.out.println(stack1);
			Stack<Integer> stack2 = new Stack<Integer>();
			
			int r = (int)(Math.random()*100);
			
			for (int i = 0; i < r; i++) {
				int v = (int)(Math.random()*100);
				stack2.add(v);
			}
		}
	}
	*/
	
	
	/*public static int[][] genSpiralArray(int n) {
		int z = 1;
		int top = 0;
		int bottom = n-1;
		int left = 0;
		int right = n-1;
		int[][] arr = new int[n][n];
		if (z <= n*n) {
			int count1 = left;
			if (count1 <= right) {
				arr[top][count1] = z;
				z = z + 1;
				count1 = count1+1;
			}
			top = top + 1;
			int count2 = top;
			if (count2 <= bottom) {
				arr[count2][right] = z;
				z = z + 1;
				count2 = count2 + 1;
			}
			right = 
		}
	}*/
		
	
}//end class