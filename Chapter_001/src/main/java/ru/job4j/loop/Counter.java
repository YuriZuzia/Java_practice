package ru.job4j.loop;

/**@author Y.Zuzia (mailto: zuziayv@ya.ru).
*since 8.05.2017
*Counter - сумма чётных чисел в
* заданном диапазоне */

public class Counter {
	/** add() - функция подсчёта.
	*@param start - начало диапазона
	*@param finish - конец диапазона
	*@return summ - сумма диапазона*/
	public static int add(int start, int finish) {
		/**summ - сумма диапазона.*/
		int summ = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
			summ = summ + i;
			}
		}
		return summ;
	}
}