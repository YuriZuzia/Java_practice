package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**class PointTest проверка работы класса Point.
 */
public class PointTest {
	/**whenPointOnFunc() - проверка, когда точка принадлежит ф-ии.
	* y = a *x + b
	*/
	@Test
	public void whenPointOnFunc() {
		int x = 2, y = 9;
		Point point = new Point(x, y);
		int a = 2;
		int b = 5;
		/* 9 = 2 * 2 + 5 */
		boolean expected = true;
	assertThat(point.is(a, b), is(expected));
	}
	/**whenPointOutFunc() - проверка, когда точка не принадлежит ф-ии.
	*/
	@Test
	public void whenPointOutFunc() {
		int x = 3, y = 9;
		Point point = new Point(x, y);
		int a = 2;
		int b = 5;
		/* 9 != 3 * 2 + 5 */
		boolean expected = false;
		assertThat(point.is(a, b), is(expected));
	}
};
