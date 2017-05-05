package ru.job4j.max;
/** @author YuZuzia (mailto:zuziayv@ya.ru).
*@since 26.04.2017
*class Max - сравнение двух целых
*/
public class Max {
/** Метод max - сравнение двух различных целых.
*@param first - первый операнд
*@param second - второй операнд
*@return - возврат большего из двух
*/
	public int max(int first, int second) {
		return first > second ? first : second;
	}
/** Метод maxOfThree - сравнение трёх различных целых.
*@param first - первый операнд
*@param second - второй операнд
*@param third - третий операнд
*@return - возврат большего из двух
*/
	public int maxOfThree(int first, int second, int third) {
		return max(first, max(second, third));
	}
  };