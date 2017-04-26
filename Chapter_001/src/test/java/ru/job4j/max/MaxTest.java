package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/** Class MaxTest - проверка работы метода max класса Max.
*@author YuZuzia (mailto:zuziayv@ya.ru)
*@since 26.04.2017s
*/
public class MaxTest {
	/** whenOneBiggerThanTwo() - проверка метода max когда.
	*первый операнд больше
	*/
	@Test
	public void whenOneBiggerThanTwo() {
		Max pair = new Max();
		int expected = 10;
		assertThat(pair.max(10, 1), is(expected));
	}
	/**whenOneSmallerThanTwo - проверка метода max когда.
	*первый операнд меньше
	*/
	@Test
	public void whenOneSmallerThanTwo() {
		Max pair = new Max();
		int expected = 10;
		assertThat(pair.max(1, 10), is(expected));
	}
};