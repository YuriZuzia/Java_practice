package ru.job4j.testtask;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**TestOneTest - проверка работы класса TestOneTest.*/
public class TestOneTest {
	/**начало теста.*/
	@Test
	/**whenArOneSmallerThenArTwo() - слияние первого меньшего и второго большего массивов.*/
	public void whenArOneSmallerThenArTwo() {
		/**arOne[] - первый входной массив.*/
		int[] arOne = {1, 3, 5};
		/**arTwo[] - второй входной массив.*/
		int[] arTwo = {2, 4, 5, 7};
		/**to - тестируемый объект.*/
		TestOne to = new TestOne();
		int[] arExpected = {1, 2, 3, 4, 5, 5, 7};
		assertThat(to.sum(arOne, arTwo), is(arExpected));
	}
};