package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**.
 *class CalculatorTest проверка работы калькулятора
 */
public class CalculatorTest {
	/**.
	*whenOnePlusOneThanTwo() - проверка сложения
	*/
  @Test
  public void whenOnePlusOneThanTwo() {
  	Calculator calc = new Calculator(1D, 1D);
  	calc.add();
  	double result = calc.getResult();
  	double expected = 2D;
  	assertThat(result, is(expected));
  }
  /**.
	*whenOneSubtructOneThanZero() - проверка вычитания
	*/
	@Test
  public void whenOneSubtructOneThanZero() {
  	Calculator calc = new Calculator(1D, 1D);
  	calc.subtruct();
  	double result = calc.getResult();
  	double expected = 0D;
  	assertThat(result, is(expected));
  }
  /**.
	*whenOneMultOneThanOne() - проверка умножения
	*/
	@Test
  public void whenOneMultOneThanOne() {
  	Calculator calc = new Calculator(1D, 1D);
  	calc.mult();
  	double result = calc.getResult();
  	double expected = 1D;
  	assertThat(result, is(expected));
  }
  /**.
	*whenOneDivOneThanOne() - проверка деления
	*/
	@Test
  public void whenOneDivOneThanOne() {
  	Calculator calc = new Calculator(1D, 1D);
  	calc.div();
  	double result = calc.getResult();
  	double expected = 1D;
  	assertThat(result, is(expected));
  }
};