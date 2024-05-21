import os
from typing import List

def sortedSquares(nums: List[int]) -> List[int]:
    result = []
    
    for i in nums:
        result.append(i ** 2)
    result.sort()   
    return result 
    
    

def main():
    os.system('cls')
    lista = [2,5,11, -7,-3]
    sqList = sortedSquares(lista)
    # sqList.sort()
    print(sqList)
    

if __name__ == '__main__':
    main()