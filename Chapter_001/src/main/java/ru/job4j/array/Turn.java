package ru.job4j.array;

/**@author Y.Zuzia (mailto: zuziayv@ya.ru).
*since 21.05.2017
*Turn - переупорядочивание массива */

public class Turn {
	/**back() - метод, переворачивающий массив.
	*@param array - массив  операнд
	*@return - преобразованный массив
	*/
	public int[] back(int[] array) {
		/**needTurn - необходима обработка массива.*/
		boolean needTurn = (array.length > 1);
		/** i - индекс для обращения к ячейкам массива.*/
		int i = 0;
		/**endI - индекс последней ячейки.*/
		int endI = array.length - 1;
		while (needTurn) {
			/** item - буфер временного хранения.*/
			int item = array[i];
			array[i] = array[endI - i];
			array[endI - i] = item;
			needTurn = (((endI - i) - i) > 2);
			i++;
		}
		return array;
	}
}