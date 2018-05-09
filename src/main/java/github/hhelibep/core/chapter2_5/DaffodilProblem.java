package github.hhelibep.core.chapter2_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import github.hhelibep.core.Issue;

public class DaffodilProblem implements Issue {
	Logger logger = LoggerFactory.getLogger(Issue.class);

	/**
	 * ���100��999�е�����ˮ�ɻ�������3λ��ABC����ABC=A�����η���B�����η���C�����η��������Ϊˮ�ɻ�
	 * ��������153=13��53��33������153��ˮ�ɻ�����
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
