import os

def findMaxConsecutiveOnes(arr):
        max_count = 0
        current_count = 0
        
        for num in arr:
           if num == 1:
                current_count += 1
                if current_count > max_count:
                     max_count = current_count
           else:
                current_count = 0

        return max_count

def testMaxConsecutiveOnes():
    print('Test MaxConsecutiveOnes')
    #output = findMaxConsecutiveOnes([1,0,1,1,1,0])
    output = findMaxConsecutiveOnes([1,0,1,1,1,1,0,1,1,1,0])
    print(output)


def main():
    os.system('cls')
    testMaxConsecutiveOnes()


if __name__ == '__main__':
    main()    