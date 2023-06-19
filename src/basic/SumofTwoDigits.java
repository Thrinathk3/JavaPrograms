package basic;

public class SumofTwoDigits {

	public static void main(String[] args) {

		sum(3,7);
		int z = add(8,4);
		System.out.println("SUM OF 8 and 4 is : "+z);
		int a = addRecursive(1,4);
		System.out.println("SUM OF TWO NUMBERS: "+a);
		int b = addIterative(1,4);
		System.out.println("SUM OF TWO NUMBERS: "+b);


	}
	//Standard method for addition of two digits
	static void sum(int q, int r) {
		int z = q+r;
		System.out.printf("Sum of %d and %d is : %d\n",q, r , z);
	}


	//Addition of two digits with out using "+" symbol
	static int add(int a, int b) {
		while(a--!=0) {
			b++;
		}
		return b;
	}

	public static int addRecursive(int a, int b){
		if(b == 0) return a;
		int sum = a ^ b; //SUM of two integer is A XOR B
		int carry = (a & b) << 1;  //CARRY of two integer is A AND B
		return addRecursive(sum, carry);
	}


	public static int addIterative(int a, int b){  
		while (b != 0){
			int carry = (a & b) ; //CARRY is AND of two bits

			a = a ^b; //SUM of two bits is A XOR B

			b = carry << 1; //shifts carry to 1 bit to calculate sum
		}
		return a;
	}





}
