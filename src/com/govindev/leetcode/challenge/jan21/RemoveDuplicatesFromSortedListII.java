package com.govindev.leetcode.challenge.jan21;

/***
 * Remove Duplicates From Sorted List||
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3593/
 * 
 * @author Govind
 *
 */
public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		int a[] = { 1, 1, 1, 2, 3 };
		ListNode head = null;
		ListNode curr = null;
		for (int val : a) {
			if (head == null) {
				head = new ListNode(val, null);
				curr = head;
			} else {
				curr.next = new ListNode(val, null);
				curr = curr.next;
			}
		}
		deleteDuplicates(head);
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;
		ListNode next = null;
		while (curr != null) {
			next = curr.next;
			if (next == null)
				break;
			if (curr.val != next.val) {
				prev = curr;
				curr = next;
				continue;
			}
			while (next != null && curr.val == next.val) {
				next = next.next;
			}
			if (curr == head) {
				// This is a special case, where duplicates are found
				// at the start of the list
				head = next;
			}
			curr = next;
			if (prev != null)
				prev.next = next;
		}
		return head;
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