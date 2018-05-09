package github.hhelibep.core;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class NumbersCalculation_multiArray implements Issue {
	Logger logger = LoggerFactory.getLogger(Issue.class);

	/**
	 * ����һЩ������������ǵ���Сֵ�����ֵ��ƽ��ֵ������3λС���������뱣֤��Щ �����ǲ�����1000������
	 */

	@Test
	public void issue() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			logger.info("please input numbers and seperate with space");
			int count = 0;
			count = scanner.nextInt();
			logger.info("count is {}", count);
			if (count != 0) {
				if (scanner.hasNext()) {
					String line = scanner.nextLine();
					line = scanner.nextLine();
					logger.info("line is {}", line);
					String[] stringNumbers = line.split(" ");
					int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
					for (String s : stringNumbers) {
						try {
							Integer number = Integer.valueOf(s);
							if (number <= min) {
								min = number;
							}
							if (number >= max) {
								max = number;
							}
							sum += number;
						} catch (Exception e) {
							logger.error("unable to format {} to int", s);
						}
					}
					if (min != Integer.MAX_VALUE) {
						logger.info("min is {}", min);
					} else {
						logger.warn("there is no min value or min value is Integer.MAX_VALUE");
					}
					if (max != Integer.MIN_VALUE) {
						logger.info("max is {}", max);
					} else {
						logger.warn("there is no max value or min value is Integer.MIN_VALUE");
					}
					if (count != 0) {
						logger.info("average is {}", (float) sum / count);
					}
				}
			} else {
				logger.info("user input 0, now exit!");
				scanner.close();
				break;
			}
		}

	}
}
