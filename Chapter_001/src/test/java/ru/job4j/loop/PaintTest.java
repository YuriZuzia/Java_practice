package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**PaintTest - проверка работы класса Paint.*/
public class PaintTest {
	/**cr - перевод строки.*/
	private String cr = "\r\n";
	/**Запуск теста.*/
	@Test
	/**Проверим пирамидку из одной строки.
	*whenHiSOneThenPiramid*/
	public void whenHiSOneThenPiramid() {
		/**piramid - проверяемый объект.*/
		Paint piramid = new Paint();
		/**expectedString - ожидаемый рисунок.*/
		String expectedString = "^" + cr;
		assertThat(piramid.piramid(1), is(expectedString));
	}
	/**Запуск теста.*/
	@Test
	/**Проверим пирамидку из пяти строк.
	*whenHiSFiveThenPiramid*/
	public void whenHiSFiveThenPiramid() {
		/**piramid - проверяемый объект.*/
		Paint piramid = new Paint();
		/**expectedString - ожидаемый рисунок.*/
		String expectedString = "    ^    " + cr + "   ^^^   " + cr + "  ^^^^^  "
		+ cr + " ^^^^^^^ " + cr + "^^^^^^^^^" + cr;
		assertThat(piramid.piramid(5), is(expectedString));
	}
}