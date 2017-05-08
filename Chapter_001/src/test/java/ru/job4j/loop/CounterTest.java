package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**Класс CounterTest -  проверка работы Counter.
*/
public class CounterTest {
	/**Запуск теста.*/
	@Test
	/**метод WhenRangeOneToTen() - поверка суммы чётных.
	* чисел от 1 до 10 */
	public void whenRangeOneToTen() {
	Counter count = new Counter();
		/** expected - ожидаемое значение суммы. */
	int expectedSum = 30;
  	assertThat(count.add(1, 10), is(expectedSum));
  	}
};