package ru.job4j.testtask;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**TestTwoTest - проверка работы класса TestTwo.*/
public class TestTwoTest {
	/**origin - исходная строка.*/
	private String origin = "Я помню чудное мгновенье - передо мной явилась ты";
	/**sub - строка, входящая в исходную.*/
	private String sub = "мной";
	/**nosub - строка, не входящая в исходную.*/
	private String nosub = "тобой";
	/**начало теста - вхождение.*/
	@Test
	/**whenOriginContainsSub - проверка когда подстрока входит.*/
	public void whenOriginContainsSub() {
		/**ttwo - тестируемый экзмпляр.*/
		TestTwo ttwo = new TestTwo();
		/**expected - результат вхождения.*/
		boolean expected = true;
		assertThat(ttwo.contains(origin, sub), is(expected));
	}
	/**начало теста - нет вхождения.*/
	@Test
	/**whenOriginDoesNotContainsSub - проверка когда подстрока не входит.*/
	public void whenOriginDoesNotContainsSub() {
		/**ttwo - тестируемый экзнмпляр.*/
		TestTwo ttwo = new TestTwo();
		/**expected - результат вхождения.*/
		boolean expected = false;
		assertThat(ttwo.contains(origin, nosub), is(expected));
	}
};
