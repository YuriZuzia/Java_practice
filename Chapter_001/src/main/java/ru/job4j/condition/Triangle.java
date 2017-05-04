package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**@author YuZuzia (mailto:zuziayv@ya.ru).
*@since 03.05.2017
*/
public class Triangle {
	/**Класс Triangle - треугольник, заданный точками.
	*a  вершина А*/
	private Point a;
	/**b  вершина B. */
	private Point b;
	/**c  вершина C.*/
	private Point c;
	/** конструктор Triangle.
	*@param a  вершина А
	*@param b  вершина B
	*@param c  вершина C */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**метод l - вычисление длины отрезка.
	*@param p1 - точка начала отрезка
	*@param p2 - точка конца отрезка
	*@return - значение длины отрезка
	*/
	private double l(Point p1, Point p2) {
		return sqrt(pow((p2.getX() - p1.getX()), 2) + pow((p2.getY() - p1.getY()), 2));
	}
	/**метод square - вычисление площади треугольника.
	*по формуле Герона
	*s = sqrt(p(p-a)*(p-b)*(p-c)),
	*p - полупериметр, a,b,c - длины сторон
	*s - площадь
	*@return - значение площади
	*/
	public double square() {
		double p;
		double s;
		p = (l(a, b) + l(b, c) + l(a, c)) / 2;
		s = sqrt(p * (p - l(a, b)) * (p - l(b, c)) * (p - l(a, c)));
		return s;
	}
	/**метод is - треугольник ли это?.
	*@return - булевый ответ
	*/
	public boolean is() {
		return this.square() > 0;
	}
	}