package com.govindev.leetcode.challenge.jan21;

/***
 * Beautiful Arrangement
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3591/
 * 
 * @author Govind
 *
 */
public class BeautifulArrangement {
	int count = 0;

	private void calculate(int n, int pos, boolean[] visited) {
		if (pos > n) {
			count++;
			return;
		}
		for (int i = 1; i <= n; ++i) {
			if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
				visited[i] = true;
				calculate(n, pos + 1, visited);
				visited[i] = false;
			}
		}
	}

	public int countArrangement(int n) {
		boolean[] visited = new boolean[n + 1];
		calculate(n, 1, visited);
		return count;
	}
}
