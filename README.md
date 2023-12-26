
# LeetCode Challenge D12

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2639.  Find the Width of Columns of a Grid](https://leetcode.com/problems/find-the-width-of-columns-of-a-grid/) Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

Given a  *0-indexed*  `m x n`  integer matrix  `grid`. The width of a column is the maximum  *length* of its integers.

Return  _an integer array_  `ans`  _of size_  `n`  _where_  `ans[i]`  _is the width of the_  `ith`  _column_.

The  *length*  of an integer  `x`  with  `len`  digits is equal to  `len`  if  `x`  is non-negative, and  `len + 1`  otherwise.

**Example**

>**Input:** grid = [[1],[22],[333]]
>
>**Output:** [3]
>
>**Explanation:** In the 0th column, 333 is of length 3.

**Language Used**
> Java

**Difficulty**

> Easy



## Solution Overview
The function initializes an array `result` to store the widths of each column. It uses a nested loop to iterate through each column of the matrix. For each column, it calculates the maximum length of its integers by converting each element to a string and determining its length. The maximum length for each column is updated, and the result is stored in the `result` array. The final result is an integer array `result` containing the widths of each column in the matrix.
