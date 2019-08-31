package com.yinduo;

import com.yinduo.no1ArraySum.Solution;

import java.util.Arrays;

/**
 * ClassName:Main
 * PackageName:com.yinduo
 * Description:
 *
 * @date:2019/8/31 14:56
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Main {

    //第一题
    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3,6,7,10,20,30,45,67};
        int target = 8;
        Solution solution = new Solution();
        int[] ints = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

}
