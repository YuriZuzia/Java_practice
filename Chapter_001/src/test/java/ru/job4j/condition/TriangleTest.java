package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**class TriangleTest проверка работы класса Triangle.
 */
public class TriangleTest {
	/**точка a - экземпляр Point.*/
	private Point a = new Point(2, 2);
	/** b. */
	private Point b = new Point(6, 7);
	/** c .*/
	private Point c = new Point(8, 3);
	/** Создаём наш треугольник.*/
	private Triangle abc = new Triangle(a, b, c);
	/**Запуск тестов .*/
	@Test
	/**метод whenSqureRight() проверка определения площади.
 	*/
	public void whenSqureRight() {
		double expectSquare = 12.999;
		/* Отбрасываем дробную часть после четвёртого знака, чтобы
		* сравнить с наим значением - есть другой способ?*/
		double result = ((double) ((int) (abc.square() * 1000))) / 1000;
		assertThat(result, is(expectSquare));
	}
	/**Запуск тестов .*/
	@Test
	/**метод whenTriangleRight() проверка существ. треугольника.
 	*/
  	public void whenTriangleRight() {
  		boolean expectIs = true;
  		assertThat(abc.is(), is(expectIs));
  	}
};