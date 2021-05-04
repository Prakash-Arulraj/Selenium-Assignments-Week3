package week3.day2.Assignments7;
/* assignment 7(polimorphism):
create the class calculator with below methods,
two methods for add.
       1.one method with 2 int arguments 
       2.another one method with 3 int argms.

two methods for multiply.
       1.one method with 2 int arguments 
       2.another one method with 1 int & 1 double argms.

two methods for subtract.
       1.one method with 2 int arguments 
       2.another one method with 2 double argms.
       
two methods for divide.
       1.one method with 2 int arguments 
       2.another one method with 1 double, 1 int argms.       

description:
create object for the calculator class and execute all the methods.
*/


public class Calculator {
	public void add(int num1, int num2) {
		int add = num1 + num2;
		System.out.println(add);

	}

	public void add(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		int add = num1 + num2 + num3;
		System.out.println(add);

	}

	public void multiple(int num1, int num2) {
		// TODO Auto-generated method stub
		int multiple = num1 + num2;
		System.out.println(multiple);

	}

	public void multiple(int num1, double num2) {
		double multiple = num1 * num2;
		System.out.println(multiple);

	}

	public void subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		int subtract = num1 - num2;
		System.out.println(subtract);

	}

	public void subtract(double num1, double num2) {
		// TODO Auto-generated method stub
		double subtract = num1 - num2;
		System.out.println(subtract);
	}

	public void divide(int num1, int num2) {
		// TODO Auto-generated method stub
		int divide = num1 / num2;
		System.out.println(divide);

	}

	public void divide(double num1, int num2) {
		// TODO Auto-generated method stub
		double divide = num1 / num2;
		System.out.println(divide);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculate = new Calculator();
		calculate.add(10, 20);
		calculate.add(5, 10, 50);
		calculate.multiple(20, 30);
		calculate.multiple(15, 10.55);
		calculate.subtract(30, 50);
		calculate.subtract(20.22, 45.64);
		calculate.divide(60, 45);
		calculate.divide(22.54, 31);
	}

}
