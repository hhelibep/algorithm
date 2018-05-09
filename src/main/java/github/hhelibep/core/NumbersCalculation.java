package github.hhelibep.core;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class NumbersCalculation implements Issue {
	Logger logger = LoggerFactory.getLogger(Issue.class);

	/**
	 * 输入一些整数，求出它们的最小值、最大值和平均值（保留3位小数）。输入保证这些 数都是不超过1000的整数
	 */

	@Test
	public void issue() {
		Scanner scanner = new Scanner(System.in);
		logger.info("please input numbers and seperate with space");
		String line = scanner.nextLine();
		scanner.close();
		String[] stringNumbers = line.split(" ");
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0, count = 0;
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
				count++;
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
}
