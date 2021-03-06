package com.one.learn.linkedlist.K个一组翻转链表;

import com.one.learn.linkedlist.ListNode;

/**
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * <p>
 * k 是一个正整数，它的值小于或等于链表的长度。
 * <p>
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 给你这个链表：1->2->3->4->5
 * <p>
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 * <p>
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 * <p>
 *  
 * <p>
 * 说明：
 * <p>
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 * <p>
 */
class Solution {
    /**
     * 双指针迭代法：
     * 时间复杂度：O（N*k）
     * 分为三部分：已翻转，待翻转，无翻转
     * 临时节点next 记录新的首节点，start，end 记录待翻转的首节点和未节点，prev 记录上一次翻转后的尾结点
     * 对待翻转进行反向，加入下一次待翻转节点操作，直到 end 为 null
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        return null;
    }


}