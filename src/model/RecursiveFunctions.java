package model;

public class RecursiveFunctions{


	public static int factorial(int fact){
		int f = fact;

		if(f <=1){
			return 1;
		}else{
			return f*factorial(f-1);
		}
	}

	public static long fibonacci(long fib) {
		long f = fib;
		if(f == 0 || f == 1) {
			return f;
		}else {
			return fibonacci(f-1)+fibonacci(f-2);
		}
	}

	public static long arraySummatory() {
	    long array = 0;
		
		return array;
	}
}
