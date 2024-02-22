# This file is initialized with a code version of this
# question's sample test case. Feel free to add, edit,
# or remove test cases in this file as you see fit!

import os
import unittest


def twoNumberSum(array, targetSum):
    for i in range(len(array) - 1):
        firstNum = array[i]
        for j in range(i + 1, len(array)):
            secondNum = array[j]
            if firstNum + secondNum == targetSum:
                return [firstNum, secondNum]
    return []


def test_case_1():
    output = twoNumberSum([3, 5, -4, 8, 11, 1, -1, 6], 10)
    #self.assertTrue(len(output) == 2)
    #self.assertTrue(11 in output)
    #self.assertTrue(-1 in output)
    print(len(output) == 2)
    print(11 in output)
    print(-1 in output)
    print(output)



def main():
    os.system('cls')
    test_case_1()


if __name__ == '__main__':
    main()    


