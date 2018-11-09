a, b = 0, 1
while b < 10000:
    #输出在一行中
    print(b, end=',')
    a, b = b, a+b
