# LeetCodeSolutions
LeetCode solutions crafted in Java. This repository reflects my progress in mastering algorithms and problem-solving.
# 1. Two Sum
**Difficulty:** Easy
**Language:** Java

## Problem Summary

Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice.

##  My Approach
- Iterate thorugh the array used nested for loop
- For each pair of index (i, j) where `j > i`, check if `nums[i] + nums[j] == target`
- If so, return the index `[i, j]`
>This is brute force solution with time complexity O(n2) and space complexity O(1)



# 2. TwoSumII
**Difficulty:** Medium
**Language:* Java

## Problem Summary

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

## My Approach
- I would like to implement binary search algorithm for finding its complementary integer. Because this problem has already sorted array, binary search is just worked for sorted array.
- Also in here we have 1-index based on array.Java has always 0-index based and we cannot change its behaviour.
- In this case we need to increment each of integer index of result array.
>This solution has O(nlogn) time complexity and O(1) space complexity



