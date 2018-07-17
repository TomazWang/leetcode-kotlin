package p001.twosum

/**
 * Created by TomazWang on 2018/07/17.
 *
 *
 * @author Tomaz Wang
 * @since 2018/07/17
 **/

class Solution001 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val count = nums.size
        for (firstIdx in 0 until count){
            val first = nums[firstIdx]
            for (secIdx in firstIdx until count){
                val sec = nums[secIdx]
                if (first + sec == target){
                    return intArrayOf(firstIdx, secIdx)
                }
            }
        }
        
        return intArrayOf()
    }
}