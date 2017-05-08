package ru.job4j.loop;

/**@author Y.Zuzia (mailto: zuziayv@ya.ru).
*since 8.05.2017
*Factorial - факториал числа */

public class Factorial {
	/** метод calc - вычиление факториала.
	*@param n - аргумент
	*@return result - результат вычиления факториала*/
	public int calc(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
	return result;
	}

}