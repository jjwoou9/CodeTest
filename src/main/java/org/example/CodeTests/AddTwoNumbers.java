package org.example.CodeTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {

    /*
    * You are given two non-empty linked lists representing two non-negative integers.
    * The digits are stored in reverse order, and each of their nodes contains a single digit.
    * Add the two numbers and return the sum as a linked list.
    * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    * */

    /*
    * Input: l1 = [2,4,3], l2 = [5,6,4]
    * Output: [7,0,8]
    * Explanation: 342 + 465 = 807.
    * */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
         * 2, 리스트 reverse
         * 2. 하나씩 꺼내서 숫자만들기 ( 0번 = x1, 1번 = x10 ...)
         * 3. 그렇게 만들어진 숫자 두개 더하기
         * 4. 숫자 쪼개서 리스트로 담기
         * 5. 역순
         *
         * OR
         * 리스트로 꺼낸 숫자 String 으로 만든후 다 시 int로
         * */

        int num1 = getIntFromListNode(l1);
        int num2 = getIntFromListNode(l2);

        int ans = num1 + num2;

        StringBuilder sb = new StringBuilder(Integer.toString(ans));
        sb.reverse();

        String temp = sb.toString();

        ListNode node = new ListNode(0);
        for (int i = 0; i < temp.length(); i++) {
            int digit = Integer.parseInt(temp.substring(i, i+1));
            int next = Integer.parseInt(temp.substring(i+1, i+2));
            node = new ListNode(digit,new ListNode(next));
        }

        return node;
    }

    private int getIntFromListNode(ListNode listNode){
        StringBuilder sb = new StringBuilder();

        ListNode curr = listNode;
        while (curr != null){
            sb.append(curr.toString());
            ListNode nextTemp = curr.next;
            curr = nextTemp;
        }

        String str = sb.reverse().toString();

        return Integer.parseInt(str);
    }

    private List ListNodeToList(ListNode listNode){
        List list = new ArrayList<>();

        ListNode curr = listNode;
        while (curr != null){
            list.add(curr.val);
            ListNode nextTemp = curr.next;
            curr = nextTemp;
        }
        return list;
    }

    private int LIstToIntger(List list){
        int num = 0;
        return num;
    }



     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode solutionFromGpt(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // dummy node to simplify code
        ListNode current = dummy; // current node to build the result list
        int carry = 0; // carry digit

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;
            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummy.next; // skip the dummy node and return the result
    }
}
