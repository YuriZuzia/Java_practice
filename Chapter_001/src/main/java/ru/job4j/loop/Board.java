package ru.job4j.loop;

/**@author Y.Zuzia (mailto: zuziayv@ya.ru).
*since 9.05.2017
*Board - шахматная доска */

public class Board {
	/**cr - символ возвр.каретки/перевода строки.*/
	private String cr = System.getProperty("line.separator");
	/** метод Paint - построение доски.
	*@param width - ширина в симолах,
	*@param height - высота в симолах.
	*вообще-то, если это шахматная доска,
	*то ширина равна высоте и обычно = 8 :)
	*@return - возврат строки - изобр-я доски
	*/
	public String paint(int width, int height) {
		StringBuilder boardBuild = new StringBuilder();
		/**cell - поле доски.*/
		char cell;
		/**i - количество строк, формируем высоту.*/
		for (int i = 1; i <= height; i++) {
			/**firstCell - начинаем "шахматку" с чёрного поля.*/
			char firstCell = (i % 2 != 0) ? 'x' : ' ';
			/**secondCell - второе поле - белое.*/
			char secondCell = (i % 2 != 0) ? ' ' : 'x';
			/**j = количество полей в строке - ширина доски.*/
			for (int j = 1; j <= width; j++) {
				cell = (j % 2 != 0) ? firstCell : secondCell;
				boardBuild.append(cell);
			}
			boardBuild.append(cr);
		}
		return boardBuild.toString();
	}
}
