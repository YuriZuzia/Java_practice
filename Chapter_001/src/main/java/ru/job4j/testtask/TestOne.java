package ru.job4j.testtask;

/**@author Y.Zuzia (mailto: zuziayv@ya.ru).
*since 28.05.2017
*TetsOne - слияние и упорядочивание двух массивов */

public class TestOne {
	/**sum - слияние двух массивов.
	*@param arOne - первый входной массив
	*@param arTwo - второй входной массив
	*@return итоговый массив
	*/
	public int[] sum(int[] arOne, int[] arTwo) {
		/**iOne - индекс массива arOne.*/
		int iOne = 0;
		/**iTwo - индекс массива arTwo.*/
		int iTwo = 0;
		/**lengthSum - длина итогового массива.*/
		int lengthSum = arOne.length + arTwo.length;
		/**arSum - итоговый массив.*/
		int[] arSum = new int[lengthSum];
		/**i - индекс массива.*/
		for (int i = 0; i < lengthSum; i++) {
			/**outOfArOne - индекс первого массива вышел за пределы.*/
			boolean outOfArOne = iOne >= arOne.length;
			/**outOfArTwo - индекс второго массива вышел за пределы.*/
			boolean outOfArTwo = iTwo >= arTwo.length;
			if (!(outOfArOne | outOfArTwo)) {
				if (arOne[iOne] < arTwo[iTwo]) {
					arSum[i] = arOne[iOne];
					iOne++;
				} else {
					arSum[i] = arTwo[iTwo];
					iTwo++;
					}
			}
			if (outOfArOne) {
				arSum[i] = arTwo[iTwo];
				iTwo++;
			}
			if (outOfArTwo) {
				arSum[i] = arOne[iOne];
				iOne++;
			}
		}
	return arSum;
	}
};