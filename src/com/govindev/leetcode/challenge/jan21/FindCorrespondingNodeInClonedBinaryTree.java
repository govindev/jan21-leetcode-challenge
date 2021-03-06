package com.govindev.leetcode.challenge.jan21;

/***
 * Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3590/
 * 
 * @author Govind
 *
 */
public class FindCorrespondingNodeInClonedBinaryTree {
	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
		if (original != null && cloned != null && target != null) {
			if (original == target)
				return cloned;
			TreeNode left = null;
			TreeNode right = null;
			if (original.left != null) {
				left = getTargetCopy(original.left, cloned.left, target);
			}
			if (left != null)
				return left;
			if (original.right != null) {
				right = getTargetCopy(original.right, cloned.right, target);
			}
			if (right != null)
				return right;
		}
		return null;
	}
}

//  Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
