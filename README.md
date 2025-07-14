# LeetCodeSolutions
LeetCode solutions crafted in Java. This repository reflects my progress in mastering algorithms and problem-solving.
# 1. Two Sum
**Difficulty:** Easy
**Language:** Java

## Problem Summary

Given an array of integers nums and an integer target, return the indices of the tow numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice.

##  My Approach
- Iterate thorugh the array used nested for loop
- For each pair of indicez (i, j) where `J > i`, check if `nums[i] + nums[j] == target`
- If so, return the indicex `[i, j]`
>This is brute force solution with time complexity O(n2) and space complexity o(1)
