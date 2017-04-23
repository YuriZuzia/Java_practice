package ru.job4j.calculator;
/**.
 *@author YuZuzia (mailto:zuziayv@ya.ru)
 *@since 20.04.2017
 */
public class Calculator	{
 /**.
 *class Calculator - арифметические перации
 *@param first, second, - операнды
 *@param result - результат вычисления
 */
	private double first, second, result;
/**.
*@param arg1 - инициализация объекта
*@param arg2 - инициализация объекта
*/
	Calculator(double arg1, double arg2) {
		first = arg1; second = arg2;
	}
/**.
 *Метод add - операция сложения.
 */
	public void add() {
		this.result = first + second;
	};
/**.
 *Метод subtruct - операция вычитания
 */
	public void subtruct() {
		this.result = first - second;
	}
/**.
 *Метод mult - операция умножения
 */
	public void mult() {
		this.result = first * second;
	}
/**.
 *Метод div - операция деления.
 */
	public void div() {
		this.result = first / second;
	}
/**.
 *Метод getResult - возвращение результата
 *@return - возвращение значения, double
 */
	public double getResult() {
		return this.result;
	}
};
