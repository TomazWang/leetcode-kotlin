package leetcode.kotlin

import org.junit.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals


class P002AddTwoNumbersTest {

    @Test
    fun testExample01() {
        val sol = P002AddTwoNumbersSolution()

        val l1 = listToListNode(listOf(0))
        val l2 = listToListNode(listOf(0))

        val res = sol.addTwoNumbers(l1, l2)

        assertContentEquals(listOf(0), res?.toList())
    }


    /**
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     */
    @Test
    fun testExample02() {
        val sol = P002AddTwoNumbersSolution()

        val l1 = listOf(2, 4, 3).toListNode()
        val l2 = listOf(5, 6, 4).toListNode()

        val res = sol.addTwoNumbers(l1, l2)

        assertContentEquals(listOf(7, 0, 8), res?.toList())
    }


    /**
     * listOf(a, b, c, d) ==> [a] -> [b] -> [c] -> [d]
     */
    private fun listToListNode(value: List<Int>): ListNode {
        return value.map { it -> ListNode(it) }
            .reduceRight { curr, acc ->
                curr.next = acc
                curr
            }
    }

    private fun List<Int>.toListNode() = listToListNode(this)


    private fun ListNode.toList(): List<Int> {
        val ls = mutableListOf<Int>()

        ls.add(this.`val`)
        this.next?.let { nxt ->
            ls.addAll(nxt.toList())
        }

        return ls
    }


    @Test
    fun testListNodeToList() {

        // [0] -> [1] -> [2]

        val n0 = ListNode(0)
        val n1 = ListNode(1)
        val n2 = ListNode(2)

        n0.next = n1
        n1.next = n2

        assertContentEquals(n0.toList(), listOf(0, 1, 2))
    }

    @Test
    fun testListNodeToListMore() {

        // [7] -> [5] -> [0] -> [2]

        val n0 = ListNode(7)
        val n1 = ListNode(5)
        val n2 = ListNode(0)
        val n3 = ListNode(2)

        n0.next = n1
        n1.next = n2
        n2.next = n3

        assertContentEquals(n0.toList(), listOf(7, 5, 0, 2))
    }


    @Test
    fun testListToListNode() {

        // [7] -> [5] -> [0] -> [2]
        val list = listOf(7, 5, 0, 2)

        val ln = listToListNode(list)


        val v1 = ln.`val`
        val v2 = ln.next?.`val`
        val v3 = ln.next?.next?.`val`
        val v4 = ln.next?.next?.next?.`val`

        assertEquals(7, v1)
        assertEquals(5, v2)
        assertEquals(0, v3)
        assertEquals(2, v4)

    }

}

