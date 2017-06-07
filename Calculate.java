/* 
 20.02.2017
 * Зюзя Ю.В
 * Калькулятор
 */
package ru.yz;
public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		System.out.println(String.format("%s + %s = %s", first, second, sum(first, second)));
	}
	

	public static int sum(int first, int second){
		return first+second;
	}
}