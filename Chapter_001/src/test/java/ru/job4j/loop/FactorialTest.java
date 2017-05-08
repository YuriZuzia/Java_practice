package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**Класс FactorialTest -  проверка работы Counter.
*/
public class FactorialTest {
/** Запуск теста.*/
	@Test
	/**метод whenArgIsTen() -  вычисление факториала 10.*/
	public void whenArgIsTen() {
		/**fact - тестовый объект */
		Factorial fact = new Factorial();
		assertThat(fact.calc(10), is(3628800));
	}
	/** Запуск теста.*/
	@Test
	/**метод whenArgIsZero() -  вычисление факториала 0.*/
	public void whenArgIsZero() {
		/**fact -тетовый объект */
		Factorial fact = new Factorial();
		assertThat(fact.calc(0), is(1));
	}
}