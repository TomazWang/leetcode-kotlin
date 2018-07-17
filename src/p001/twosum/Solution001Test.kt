package p001.twosum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 * Created by TomazWang on 2018/07/17.
 *
 * @author Tomaz Wang
 * @since 2018/07/17
 */

class Solution001Test {
    
    @Test
    fun twoSum_should_return01_when_given2_7_11_15_and_9() {
        val sol = Solution001()
        val result = sol.twoSum(intArrayOf(2, 7, 11, 15), 9)
        
        assertThat(result, equalTo(intArrayOf(0, 1)))
    }
    
    
    @Test
    fun twoSum_should_return23_when_given2_7_11_15_and_26() {
        val sol = Solution001()
        val result = sol.twoSum(intArrayOf(2, 7, 11, 15), 26)
        
        assertThat(result, equalTo(intArrayOf(2, 3)))
    }
    
    
    @Test
    fun twoSum_should_return02_when_given2_7_11_15_and_13() {
        val sol = Solution001()
        val result = sol.twoSum(intArrayOf(2, 7, 11, 15), 13)
        
        assertThat(result, equalTo(intArrayOf(0, 2)))
    }
    
    
}