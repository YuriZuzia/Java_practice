package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**ArrayDuplicateTest - проверка работы класса ArrayDuplicate.*/
public class ArrayDuplicateTest {
	/**начало теста.*/
	@Test
	/**whenArrayIsSentenceWithDubs - проверка, когда массив с дубликатами.*/
	public void whenArrayIsSentenceWithDubs() {
		/**ar - тестируемый объект.*/
		ArrayDuplicate ar = new ArrayDuplicate();
		String[] sentence = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		String[] expectSentence = {"Привет", "Мир", "Супер"};
		assertThat(ar.remove(sentence), is(expectSentence));
	}
};
