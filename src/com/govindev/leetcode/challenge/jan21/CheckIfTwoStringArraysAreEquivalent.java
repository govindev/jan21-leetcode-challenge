package com.govindev.leetcode.challenge.jan21;

/***
 * Check if two String arrays are equivalent
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/580/week-2-january-8th-january-14th/3597/
 * 
 * @author Govind
 *
 */
public class CheckIfTwoStringArraysAreEquivalent {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder strb1 = new StringBuilder();
		StringBuilder strb2 = new StringBuilder();
		for (int i = 0; i < word1.length; i++) {
			strb1.append(word1[i]);
		}
		for (int i = 0; i < word2.length; i++) {
			strb2.append(word2[i]);
		}
		if (strb1.toString().equals(strb2.toString()))
			return true;
		return false;
	}
}
