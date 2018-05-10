package github.hhelibep.core.chapter2_5;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

import github.hhelibep.core.Issue;

public class HanxinProblem implements Issue {

	/**
	 * 相传韩信才智过人，从不直接清点自己军队的人数，只要让士兵先后以三人一排、五人
	 * 一排、七人一排地变换队形，而他每次只掠一眼队伍的排尾就知道总人数了。输入包含多组
	 * 数据，每组数据包含3个非负整数a，b，c，表示每种队形排尾的人数（a＜3，b＜5，c＜
	 * 7），输出总人数的最小值（或报告无解）。已知总人数不小于10，不超过100。输入到文件 结束为止。
	 * 
	 * 
	 */

	@Test
	public void test() {
		logger.info("testing start");
		issue();
	}

	public void issue() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line = scanner.nextLine();
			logger.info(line);
			if (line.trim().equals("exit")) {
				break;
			}
			int[] numbers = Arrays.asList(line.split(" ")).stream().mapToInt((s) -> Integer.valueOf(s)).toArray();

			if (numbers.length != 3) {
				logger.error("wrong numbers count, should be 3");
			} else {
				if (numbers[0] > 2 || numbers[1] > 4 || numbers[2] > 6) {
					logger.error("wrong numbers!");
				} else {
					for (int i = 10; i < 100; ++i) {
						if (i % 3 == numbers[0] && i % 5 == numbers[1] && i % 7 == numbers[1]) {
							logger.info("people count is {}", i);
							break;
						}
						if (i == 99) {
							logger.info("no valid count!");
						}
					}

				}
			}
		}
		scanner.close();
	}

}
