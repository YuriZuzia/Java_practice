package ru.job4j.condition;
/**@author YuZuzia (mailto:zuziayv@ya.ru).
*@since 27.04.2017
*/
public class Point {
	/**class Point - положение точки.
	*@param int x - абцисса точки
	*@param int y - ордината точки
	*/
	private int x, y;
	/**@param x - инициализация объекта.
	*@param y - инициализация объекта
	*/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**метод getX - получение абциссы.
	*@return - возврат значения x
	*/
	public int getX() {
		return this.x;
	}
	/**метод getY() - получение ординаты.
	*@return - возврат значения y
	*/
	public int getY() {
		return this.y;
	}
	/**метод is() - принадлежит ли точка (x,y) ф-ии.
	*y = ax + b
	*@param a - параметры фунции
	*@param b - параметры фунции
	*@return - булевый ответ на вопрос
	*/
	public boolean is(int a, int b) {
	return y == a * x + b;
	}
};