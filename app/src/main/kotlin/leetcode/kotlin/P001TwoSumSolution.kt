package leetcode.kotlin

class P001TwoSumSolution {
    fun twoSum(nums: IntArray, target: Int): IntArray {


        val mm = mutableMapOf<Int, Int>()
        nums.forEachIndexed { idx, curr ->

            val delta = target - curr
            val solIdx = mm.getOrElse(delta) {
                mm.put(curr, idx)
                -1
            }

            if (solIdx >= 0 ) {
                return intArrayOf(idx, solIdx)
            }
        }

        return intArrayOf()
    }
}




