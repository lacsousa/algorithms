# This file is initialized with a code version of this
# question's sample test case. Feel free to add, edit,
# or remove test cases in this file as you see fit!

import os
import unittest


# O(n^2) time | O(1) space
def twoNumberSum(array, targetSum):
    for i in range(len(array) - 1):
        firstNum = array[i]
        for j in range(i + 1, len(array)):
            secondNum = array[j]
            if firstNum + secondNum == targetSum:
                return [firstNum, secondNum]
    return []


# O(n) time | O(1) space
def twoNumberSum2(array, targetSum):
    nums = {}
    for num in array:
        potentialMatch = targetSum - num
        if potentialMatch in nums:
            return [potentialMatch, num]
        else:
            nums[num] = True
    return []


# O(nlog(n)) time | O(1) space
def twoNumberSum3(array, targetSum):
    array.sort()
    left = 0 
    right = len(array) - 1

    while left < right:
        currentSum = array[left] + array[right]
        if currentSum == targetSum:
            return [array[left], array[right]]
        elif currentSum < targetSum:
            left += 1
        elif currentSum > targetSum:
            right -= 1   

    return []



def test_case_1():
    print('Test case 1')
    output = twoNumberSum([3, 5, -4, 8, 11, 1, -1, 6], 10)
    #self.assertTrue(len(output) == 2)
    #self.assertTrue(11 in output)
    #self.assertTrue(-1 in output)
    print(len(output) == 2)
    print(11 in output)
    print(-1 in output)
    print(output)
    print('\n')


def test_case_2():
    print('Test case 2')
    output = twoNumberSum2([2, 5, -4, 8, 16, 10, -1, 6, 20, 30, 12], 17)
    
    print(len(output) == 2)
    print(12 in output)
    print(5 in output)
    print(output)
    print('\n')


def test_case_3():
    print('Test case 3')
    output = twoNumberSum3([2, 5, -4, 8, 16, 10, -1, 6, 20, 30, 12], 30)
    
    print(len(output) == 2)
    print(10 in output)
    print(20 in output)
    print(output)
    print('\n')


def main():
    os.system('cls')
    test_case_1()
    test_case_2()
    test_case_3()



if __name__ == '__main__':
    main()    


