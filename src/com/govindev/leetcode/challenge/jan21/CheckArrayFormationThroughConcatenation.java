package com.govindev.leetcode.challenge.jan21;

import java.util.List;
import java.util.ArrayList;

/***
 * Check Array Formation Through Concatenation
 * 
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3589/
 * 
 * @author Govind
 *
 */

public class CheckArrayFormationThroughConcatenation {
	public boolean canFormArray(int[] arr, int[][] pieces) {
		List<int[]> orderedPieces = new ArrayList<>();
		int[] orderedArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < pieces.length; j++) {
				if (arr[i] == pieces[j][0]) {
					orderedPieces.add(pieces[j]);
					i += pieces[j].length - 1;
					break;
				}
			}
		}
		int k = 0;
		for (int[] piece : orderedPieces) {
			for (int i = 0; i < piece.length; i++) {
				orderedArray[k++] = piece[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != orderedArray[i]) {
				return false;
			}
		}
		return true;
	}
}
