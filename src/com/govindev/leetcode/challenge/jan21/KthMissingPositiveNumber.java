package com.govindev.leetcode.challenge.jan21;

/***
 * Kth Missing Positive Number
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3594/
 * 
 * @author Govind
 *
 */
public class KthMissingPositiveNumber {
	public int findKthPositive(int[] arr, int k) {
		int z = 0, val = 1;
		for (int i = 0; i < arr.length; val++) {
			if (val == arr[i]) {
				i++;
				continue;
			}
			// val not found
			z++; // z number of values are not found
			if (z == k) {
				return val;
			}
		}
		for (int i = z + 1; i <= k; i++, val++) {
			if (i == k)
				return val;
		}
		return val;
	}
}
