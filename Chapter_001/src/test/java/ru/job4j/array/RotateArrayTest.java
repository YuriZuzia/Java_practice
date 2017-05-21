package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**RotateArrayTest - проверка работы класса RotateArray.*/
public class RotateArrayTest {
	/**Запуск тестов.*/
	@Test
	/**rotateWhenArrayThreetoThree - проверка вращения массива 3х3.*/
	public void rotateWhenArrayThreetoThree() {
		/**array - исходный массив.*/
		int[][] array =	{
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		/**expectedArray - ожидаемый результат поворота.*/
		int[][] expectedArray = {
			{7, 4, 1},
			{8, 5, 2},
			{9, 6, 3}
		};
		/**rotateArray - создание тестируемого объекта.*/
		RotateArray rotateArray = new RotateArray();
		assertThat(rotateArray.rotate(array), is(expectedArray));
	}
	/**Запуск тестов.*/
	@Test
	/**rotateWhenArrayTwotoTwo - проверка вращения массива 2х2.*/
	public void rotateWhenArrayTwotoTwo() {
		/**array - исходный массив.*/
		int[][] array =	{
			{1, 2},
			{4, 5}
		};
		/**expectedArray - ожидаемый результат поворота.*/
		int[][] expectedArray = {
			{4, 1},
			{5, 2}
		};
		/**rotateArray - создание тестируемого объекта.*/
		RotateArray rotateArray = new RotateArray();
		assertThat(rotateArray.rotate(array), is(expectedArray));
	}
};