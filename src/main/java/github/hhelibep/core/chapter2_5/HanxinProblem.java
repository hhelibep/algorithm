package github.hhelibep.core.chapter2_5;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

import github.hhelibep.core.Issue;

public class HanxinProblem implements Issue {

	/**
	 * �ഫ���Ų��ǹ��ˣ��Ӳ�ֱ������Լ����ӵ�������ֻҪ��ʿ���Ⱥ�������һ�š�����
	 * һ�š�����һ�ŵر任���Σ�����ÿ��ֻ��һ�۶������β��֪���������ˡ������������
	 * ���ݣ�ÿ�����ݰ���3���Ǹ�����a��b��c����ʾÿ�ֶ�����β��������a��3��b��5��c��
	 * 7�����������������Сֵ���򱨸��޽⣩����֪��������С��10��������100�����뵽�ļ� ����Ϊֹ��
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
