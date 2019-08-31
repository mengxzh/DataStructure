package com.yinduo.no1ArraySum;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Solution
 * PackageName:com.yinduo.no1ArraySum
 * Description:
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * @date:2019/8/31 14:47
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        //用来存放数组下标值的数组
        int indexs[] = new int[2];

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i =0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                int tmp = map.get(complement);
                indexs[0] = tmp;
                indexs[1] = i;
                return indexs;
            }
            map.put(nums[i],i);
        }
        return indexs;
    }


}
