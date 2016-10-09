# SearchRotatedArray
An ordered array has been rotated for unknown times, find the index of a given element

Given a sorted array of n integers that has been rotated an unknown number of times, write code to find an element in the array. You may assume that the array was originally sorted in increasing order.

EXAMPLE

Input:find5in{15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14} 

Output: 8 (the index of 5 in the array)

Binary Search, check not only the mid, also compare a[low]>,<,==a[mid]

if(a[low]>a[mid]) right side is normally ordered, search right first

if(a[low]<a[mid]) left side is normally ordered, search left first

if(a[low]==a[mid]) left side is all repeated, search right first, if right is also repeated, search both sides
