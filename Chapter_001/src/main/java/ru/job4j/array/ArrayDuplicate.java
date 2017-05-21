package ru.job4j.array;
import java.util.Arrays;

/**@author Y.Zuzia (mailto: zuziayv@ya.ru).
*since 21.05.2017
*ArrayDuplicate - удаление дублей строк */

public class ArrayDuplicate {
	/**remove - метод, выполняющий: 1) сортировка - дубликаты в конец массива.
	*2) обрезка массива
	*@param array - исходный массив строк
	*@return - упорядоченный массив*/
	public String[] remove(String[] array) {
		/**dubIndex - индекс хранения дубликата.*/
		int dubIndex = array.length - 1;
		/**i - индекс, перебор "пузырьком".*/
		for (int i = 0; i < array.length; i++) {
			/**j - внутр. индекс, перебор "пузырьком".*/
			for (int j = i + 1; j <= dubIndex; j++) {
			if (array[i] == array[j]) {
				/**buffer - переменная для хранения перестановки.*/
				String buffer = array[dubIndex];
				array[dubIndex] = array[j];
				dubIndex--;
				array[j] = buffer;
			}
			}
		}
		array = Arrays.copyOf(array, dubIndex + 1);
		return array;
	}
};