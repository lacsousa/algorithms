import os

def findNumbersEvenCountDigits(arr):
    
    even_dig_count = 0
    
    for num in arr:
        # print (str(num) , ' tamanho ' , len(str(num)) , ' digits')
       if (len(str(num)) % 2 == 0):
           even_dig_count += 1
           print(even_dig_count)    

    return even_dig_count

def testFindNumbersEvenCountDigits():
    print('Test FindNumbersEvenCountDigits')
    output = findNumbersEvenCountDigits([12,345,2,6,7896])
    # output = findFindNumbersEvenCountDigits([1,0,1,1,1,1,0,1,1,1,0])
    print(output)


def main():
    os.system('cls')
    testFindNumbersEvenCountDigits()


if __name__ == '__main__':
    main()    