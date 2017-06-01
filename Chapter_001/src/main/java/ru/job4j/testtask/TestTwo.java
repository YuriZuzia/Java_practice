package ru.job4j.testtask;

/**@author Y.Zuzia (mailto: zuziayv@ya.ru).
*since 01.06.2017
*TestTwo - анализ строки*/

public class TestTwo {
	/**contains - проверка вхождения подстроки.
	*@param origin - исходная строка
	*@param sub - подстрока
	*@return логическое значение  вхождения подстроки*/
	public boolean contains(String origin, String sub) {
		/**arOrigin - массив анализируемой строки.*/
		char[] arOrigin = origin.toCharArray();
		/**arSub - массив подстроки.*/
		char[] arSub = sub.toCharArray();
		/**result - вхождение обнаружено.*/
		boolean result = false;
		/**i - индекс перебора исходной строки.*/
		for (int i = 0; i < arOrigin.length; i++) {
			if (arOrigin[i] == arSub[0]) {
				/**j - индекс перебора подстроки.*/
				for (int j = 1; j < arSub.length; j++) {
					if (arOrigin[i + j] != arSub[j]) {
					break;
					}
					result = true;
					return result;
				}
			}
		}
		return result;
	}
};