import math


def IsPrime(n):
    if n > 1:
        for i in range(2, n):
            if (n % i) == 0:
                print("不是质数")
                break
        else:
            print("是质数")
    else:
        print("不是质数")

if __name__ == '__main__':
    num = int(input("请输入一个数:"))
    IsPrime(num)
