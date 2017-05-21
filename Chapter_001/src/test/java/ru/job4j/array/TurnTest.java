package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**TurnTest - проверка работы класса Board.*/
public class TurnTest {
	/**Запуск теста - чёт.*/
	@Test
	/**whenArrayLengthIsFour - число элементов - 4.*/
	public void whenArrayLengthIsFour() {
		/**argArray -тестируемый массив.*/
		int[] argArray = {1, 2, 3, 4};
		/**expectArray - массив после преобразования.*/
		int[] expectArray = {4, 3, 2, 1};
		/**turn - объект для тестирования.*/
		Turn turn = new Turn();
		assertThat(turn.back(argArray), is(expectArray));
	}
	/**Запуск теста - нечет.*/
	@Test
	/**whenArrayLengthIsFour - число элементов - 5.*/
	public void whenArrayLengthIsFive() {
		/**argArray - тестируемый массив.*/
		int[] argArray = {1, 2, 3, 4, 5};
		/**expectArray - массив после преобразования.*/
		int[] expectArray = {5, 4, 3, 2, 1};
		/**turn - объект для тестирования.*/
		Turn turn = new Turn();
		assertThat(turn.back(argArray), is(expectArray));
	}
	/**Запуск теста - один эл-т.*/
	@Test
	/**whenArrayLengthIsOne - число элементов - 1.*/
	public void whenArrayLengthIsOne() {
		/**argArray -тестируемый массив.*/
		int[] argArray = {1};
		/**expectArray - массив после преобразования.*/
		int[] expectArray = {1};
		/**turn - объект для тестирования.*/
		Turn turn = new Turn();
		assertThat(turn.back(argArray), is(expectArray));
	}
}
