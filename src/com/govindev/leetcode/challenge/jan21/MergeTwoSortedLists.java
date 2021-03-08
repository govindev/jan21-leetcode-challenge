package com.govindev.leetcode.challenge.jan21;

/**
 * Merge Two Sorted Lists
 * 
 * @author Govind
 *
 */
public class MergeTwoSortedLists {
	private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode root = null;
		ListNode l3 = null;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				if (l3 == null) {
					l3 = l2;
					root = l3;
				} else {
					l3.next = l2;
				}
				l3 = l2;
				l2 = l2.next;
			} else if (l2 == null) {
				if (l3 == null) {
					l3 = l1;
					root = l3;
				} else {
					l3.next = l1;
				}
				l3 = l1;
				l1 = l1.next;
			} else {
				if (l1.val < l2.val) {
					if (l3 == null) {
						l3 = l1;
						root = l3;
					} else {
						l3.next = l1;
					}
					l3 = l1;
					l1 = l1.next;
				} else if (l1.val > l2.val) {
					if (l3 == null) {
						l3 = l2;
						root = l3;
					} else {
						l3.next = l2;
					}
					l3 = l2;
					l2 = l2.next;
				} else {
					if (l3 == null) {
						l3 = l1;
						root = l3;
					} else {
						l3.next = l1;
					}
					l3 = l1;
					l1 = l1.next;
					l3.next = l2;
					l3 = l2;
					l2 = l2.next;
				}
			}

		}
		return root;
	}

	public static void main(String[] args) {
		ListNode root1 = null;
		ListNode ptr1 = null;
		int[] vals = { 1, 2, 4 };
		for (int val : vals) {
			ListNode node = new ListNode();
			node.val = val;
			if (root1 == null) {
				root1 = node;
			} else {
				ptr1.next = node;
			}
			ptr1 = node;
		}

		ListNode root2 = null;
		ListNode ptr2 = null;
		int[] vals2 = { 1, 3, 4 };
		for (int val : vals2) {
			ListNode node = new ListNode();
			node.val = val;
			if (root2 == null) {
				root2 = node;
			} else {
				ptr2.next = node;
			}
			ptr2 = node;
		}
		ListNode l3 = mergeTwoLists(root1, root2);
		while (l3 != null) {
			System.out.println(l3.val);
			l3 = l3.next;
		}

	}
}

//Definition for singly-linked list.
//private class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode() {
//	}
//
//	ListNode(int val) {
//		this.val = val;
//	}
//
//	ListNode(int val, ListNode next) {
//		this.val = val;
//		this.next = next;
//	}
//}
