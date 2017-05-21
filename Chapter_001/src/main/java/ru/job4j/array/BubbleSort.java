package ru.job4j.array;

/**@author Y.Zuzia (mailto: zuziayv@ya.ru).
*since 21.05.2017
*BubbleSort - переупорядочивание массива */

public class BubbleSort {
	/**sort() - сортировка "пузырьком".
	*@param array - исходный массив
	*@return - упорядоченный массив*/
	public int[] sort(int[] array) {
		/**i - индекс внешнего цикла.*/
		for (int i = 0; i < array.length; i++) {
			/**j - индекс внутренего цикла перебора.*/
			for (int j = i + 1; j < array.length; j++) {
			if (array[i] > array[j]) {
				/**buffer - переменная временно хранения значений массива.*/
				int buffer = array[i];
				array[i] = array[j];
				array[j] = buffer;
			}
			}
		}
		return array;
	}
}