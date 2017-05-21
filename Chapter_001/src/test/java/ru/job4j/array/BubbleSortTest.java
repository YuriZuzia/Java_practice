package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**BubbleSortTest - проверка работы класса BubbleSort.*/
public class BubbleSortTest {
	/**начало теста.*/
	@Test
	/**whenArray51273ThanArray12357 - проверка упорядочивания массива {5, 1, 2, 7, 3}.*/
	public void whenArray51273ThanArray12357() {
		/**argArray -тестируемый массив.*/
		int[] argArray = {5, 1, 2, 7, 3};
		/**expectArray - массив после преобразования.*/
		int[] expectArray = {1, 2, 3, 5, 7};
		/**bubbleSort - тестируемый объект.*/
		BubbleSort bubbleSort = new BubbleSort();
		assertThat(bubbleSort.sort(argArray), is(expectArray));
	}
};