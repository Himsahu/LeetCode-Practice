import java.io.*;
public class Calculator {
	
	int add(int a, int b) {
		return a+b;
	}
	int subtract(int a,int b) {
		return a-b;
	}
	int multiply(int a, int b) {
		return a*b;
	}
	
	int divide(int a, int b) {
		return a/b;
	}

	
	public static void main (String args []) throws IOException {
		
		Calculator obj = new Calculator();
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		

		System.out.println("Number 1: ");
		int n1 = Integer.parseInt(br.readLine());
		System.out.println("Number 2: ");
		int n2 = Integer.parseInt(br.readLine());
		System.out.println("Choose \n"
						+ "1- Add\n"
						+ "2- Subtract\n"
						+ "3- Multiply\n"
						+ "4- Divide");
		int ch = Integer.parseInt(br.readLine());
		
		switch(ch) {
		case 1:
			System.out.println(obj.add(n1,n2));;
			break;
		
		case 2:
			System.out.println(obj.subtract(n1, n2));;
			break;	
		
		case 3:
			System.out.println(obj.multiply(n1, n2));;
			break;
		
		case 4:
			System.out.println(obj.divide(n1,n2));;
			break;
		
		default:
			System.out.println("Not in List");
		}
	}
}
