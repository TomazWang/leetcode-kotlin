package leetcode.kotlin

import org.junit.Test
import kotlin.test.assertContentEquals


class P001TwoSumSolutionTest {

    @Test
    fun testEample1() {

        // arrange
        val sol = P001TwoSumSolution()

        // action
        val res = sol.twoSum(intArrayOf(2, 7, 11, 15), 9)

        //assert
        assertContentEquals(intArrayOf(0,1).apply{sort()}, res.apply{sort()})

    }


    @Test
    fun testExample2(){
        val sol = P001TwoSumSolution()
        val res = sol.twoSum(intArrayOf(3,2,4), target = 6)

        assertContentEquals(intArrayOf(1,2).apply{sort()}, res.apply{sort()})
    }
}

