import random

true = random.randint(0, 99)
count = 0
# print(true)
while True:
    guess = int(input('请输入一个在0到99之间的整数\n'))
    if guess < true:
        print('小了')
        count = count + 1
    elif guess > true:
        print('大了')
        count = count + 1
    else:
        print("正确，猜的次数：%d" % (count + 1))
        break
