package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**BoardTest - проверка работы класса Board.*/
public class BoardTest {
	/**Запуск теста.*/
	@Test
	/**whenWidthThreeHeghtThreeOsWindowsThanBoard() - проверка построения доски 3х3.
	* в оперционной системе семейства MS Wndows.*/
	public void whenWidthThreeHeghtThreeOsWindowsThanBoard() {
		/**cr - команда "carriage return".*/
		String cr = "\r\n";
		/**chessBoard - тестируемый объект доски.*/
		Board chessBoard = new Board();
		/**expectedBoard - ожидаемая "доска".*/
		String expectedBoard = String.format("x x" + cr + " x " + cr + "x x" + cr);
		assertThat(chessBoard.paint(3, 3), is(expectedBoard));
	}
	/**Запуск теста.*/
	@Test
	/**whenWidthFiveHeghtFourOsUxThanBoard() - проверка построения доски 5х4.
	* в оперционных системах Unix.*/
	public void whenWidthFiveHeghtFourOsUxThanBoard() {
		/**cr - команда "carriage return".*/
		String cr = "\r\n";
		/**chessBoard - тестируемый объект доски.*/
		Board chessBoard = new Board();
		/**expectedBoard - ожидаемая "доска".*/
		String expectedBoard = String.format("x x x" + cr + " x x " + cr + "x x x" + cr
		+ " x x " + cr);
		assertThat(chessBoard.paint(5, 4), is(expectedBoard));
	}
}