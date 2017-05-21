package ru.job4j.array;

/**@author Y.Zuzia (mailto: zuziayv@ya.ru).
*since 21.05.2017
*RotateArray - вращение квадратного массива */

public class RotateArray {
	/**rotate - вращение квадратного массива по часовой стрелке.
	*@param array  - исходный массив
	*@return прелбазованный массив*/
	public int[][] rotate(int[][] array) {
	/**tempArray - временный массив для выполнения преобразований.*/
	int[][] tempArray = new int[array.length][array.length];
		/**i - индекс, цикл по строкам исходного массива.*/
		for (int i = 0; i < array.length; i++) {
			/**j - индекс, пробегаем по строке в исходном массиве.*/
			for (int j = 0; j < array.length; j++) {
				tempArray[j][array.length - 1 - i] = array[i][j];
			}
		}
		return tempArray;
	}
};