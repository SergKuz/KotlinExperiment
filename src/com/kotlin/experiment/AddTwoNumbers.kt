package com.kotlin.experiment

class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null
}

/*class Solution {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l3 : ListNode

        if (l1 != null && l2 != null) {

            while (l1.next != null && l2.next != null) {
                l3.next(sum(l1.`val`, l1.`val`))
            }
        }
    }

    fun sum(first :Int = 0, second :Int = 0): Int {
        return first + second
    }
}*/