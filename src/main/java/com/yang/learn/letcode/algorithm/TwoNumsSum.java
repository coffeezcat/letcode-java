package com.yang.learn.letcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * */
public class TwoNumsSum {


    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        int[] res = new TwoNumsSum().twoSum(nums,9);
        System.out.println(1);
    }



    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        List<Integer> res = new ArrayList<>();
        for (int k=0;k<length;k++){
            int other = target-nums[k];
            int index = isIn(nums,k,other);
            if(index != -1){
                res.add(k);
                res.add(index);
            }
        }
        return listToArray(res);
    }

    private int[] listToArray( List<Integer> res){
        int size = res.size();
        int[] ints = new int[res.size()];
        int index =0;
        for (int num:res){
            ints[index++]=num;
        }

        return ints;
    }

    private int isIn(int[] nums,int begin,int target){
        int length = nums.length;
        for(int i=begin+1;i<length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
