import os

def findMaxConsecutiveOnes(nums):
        consecOne = 0
        for i in range(len(nums) - 1):
            if nums[i] == 1 and nums[i+1] == 1:
                +consecOne   
        return consecOne

def testMaxConsecutiveOnes():
    print('Test MaxConsecutiveOnes')
    output = findMaxConsecutiveOnes([1,0,1,1,0,1])
    print(output)


def main():
    os.system('cls')
    testMaxConsecutiveOnes()


if __name__ == '__main__':
    main()    