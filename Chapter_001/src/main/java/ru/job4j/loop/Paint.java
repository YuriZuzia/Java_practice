package ru.job4j.loop;

/**@author Y.Zuzia (mailto: zuziayv@ya.ru).
*since 11.05.2017
*Paint - рисунок пирамидки */

public class Paint {
	/**cr - перевод каретки в данной ОС.*/
	private String cr = System.getProperty("line.separator");
	/**метод piramid - построение пирамидки.
	*@param h - высота, колво строк,
	*@return - строковое представление пирамидки.*/
	public String piramid(int h) {
	/**piramidBuild - объект для удобной работы состроками.*/
	StringBuilder piramidBuild = new StringBuilder();
		/**width - Ширина основания пирамидки.*/
		int width = h * 2 - 1;
		/**i - индекс, цикл по строкам, рисуем пирамидку сверху вниз.*/
		for (int i = 1; i <= h; i++) {
			/**widthI - текущее, непустое, основание i-й строки.*/
			int widthI = i * 2 - 1;
			/**spaces - коичество пробелов до и после '^'.*/
			int spaces = (width - widthI) / 2;
			/*jStart - индекс начала рисования символа '^' в строке, от 1.*/
			int jStart = spaces + 1;
			/**jEnd - индекс последнего символа '^' в строке.*/
			int jEnd = spaces + widthI;
			/**j - индекс, цикл - заполнение символами строки.*/
			for (int j = 1; j <= width; j++) {
				/**cell - символ текущей ячейки.*/
				char cell = ((j < jStart) | (j > jEnd)) ? ' ' : '^';
				piramidBuild.append(cell);
			}
			piramidBuild.append(cr);
		}
		return piramidBuild.toString();
	}
};