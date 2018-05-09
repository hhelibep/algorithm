package github.hhelibep.core.chapter2_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import github.hhelibep.core.Issue;

public class DaffodilProblem implements Issue {
	Logger logger = LoggerFactory.getLogger(Issue.class);

	/**
	 * 输出100～999中的所有水仙花数。若3位数ABC满足ABC=A的三次方＋B的三次方＋C的三次方，则称其为水仙花
	 * 数。例如153=13＋53＋33，所以153是水仙花数。
	 * 
	 */
	@Test
	public void issue() {
		for (int number = 100; number < 1000; ++number) {
			int[] temp = dealNumber(number);
			int sum = 0;
			for (int i = 0; i < temp.length; ++i) {
				sum += Math.pow(temp[i], 3);
			}
			if (number == sum) {
				logger.info("Daffodi : {}", String.valueOf(number));
			}
			sum = 0;
		}
	}

	private int[] dealNumber(int number) {
		int lenth = 0;
		while (number >= Math.pow(10, lenth)) {
			++lenth;
		}
		int[] splitNumbers = new int[lenth];
		int i = lenth;
		while (i > 0) {
			int base = (int) (Math.pow(10, (i - 1)));
			splitNumbers[lenth - (i--)] = number / base;
			number = number % base;
		}
		return splitNumbers;
	}

}
