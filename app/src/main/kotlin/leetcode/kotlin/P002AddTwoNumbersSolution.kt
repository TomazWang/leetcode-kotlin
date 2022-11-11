package leetcode.kotlin

import kotlin.math.pow

/**
 * [problem](https://leetcode.com/problems/add-two-numbers/)
 *
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}


/**
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single
 *  digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0
 *  itself.
 */
class P002AddTwoNumbersSolution {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        var carry = 0
        var next1 = l1
        var next2 = l2
        val starter = ListNode(0)
        var sumPointer: ListNode = starter

        while (next1 != null || next2 != null) {
            val sumDigit = next1.getValue() + next2.getValue() + carry
            carry = sumDigit / 10

            val dig = sumDigit % 10

            sumPointer.next = ListNode(dig).also { sumPointer = it}

            next1 = next1?.next
            next2 = next2?.next

        }


        if (carry > 0) {
            sumPointer.next = ListNode(carry)
        }

        return starter.next
    }

    private fun ListNode?.getValue(): Int = this?.`val` ?: 0


    private fun ListNode.toNumber(): Int {
        var digit = 0
        var sum = 0f
        var nDg: ListNode? = this

        do {
            sum += this.`val` * 10f.pow(digit)
            digit++
            nDg = nDg?.next
        } while (nDg != null)

        return sum.toInt()
    }


}