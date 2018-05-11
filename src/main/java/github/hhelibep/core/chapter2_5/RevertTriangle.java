package github.hhelibep.core.chapter2_5;

import java.util.Scanner;

import org.testng.annotations.Test;

import github.hhelibep.core.Issue;

public class RevertTriangle implements Issue {

	@Override
	public void issue() {
		Scanner scanner = new Scanner(System.in);
		int level = scanner.nextInt();
		for (int i = level; i > 0; --i) {
			StringBuilder stringBuilder = new StringBuilder();
			for (int j = 0; j < level - i; ++j) {
				stringBuilder.append(" ");
			}
			for (int k = 1; k < 2 * i; ++k) {
				stringBuilder.append("#");
			}
			System.out.println(stringBuilder.toString());
		}
	}

	@Test
	public void test() {
		issue();
	}
}
