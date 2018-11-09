import random

list1 = []
list2 = []


def compare(a, b):
    if a > 21 or b > 21:
            if a > 21 and b <= 21:
                print('玩家二胜利')
            elif a <= 21 and b > 21:
                print('玩家一胜利')
            else:
                print('平局')
    else:
        if a > b:
            print('玩家一胜利')
        elif a < b:
            print('玩家二胜利')
        else:
            print('平局')


def GetCard():
    flag = 0
    for i in range(1, 20):
        if(i % 2 == 1):
            get_card = int(input('玩家一:1代表要继续摸牌,2代表不摸牌\n'))
            if get_card == 1:
                temp = random.randint(1, 11)
                print(temp)
                list1.append(temp)
                print('玩家一当前总和为%d' % (sum1()))
            elif get_card == 2:
                print('玩家一当前总和为%d' % (sum1()))
                flag += 1
                if flag > 2:
                    break
        else:
            get_card = int(input('玩家二:1代表要继续摸牌,2代表不摸牌\n'))
            if get_card == 1:
                temp = random.randint(1, 11)
                print(temp)
                list2.append(temp)
                print('玩家二当前总和为%d' % (sum2()))
            else:
                print('玩家二当前总和为%d' % (sum2()))
                flag += 1
                if flag > 2:
                    break


def sum1():
    sum1 = 0
    for i in list1:
        sum1 += i
    return sum1


def sum2():
    sum2 = 0
    for i in list2:
        sum2 += i
    return sum2

if __name__ == "__main__":
    GetCard()
    compare(sum1(), sum2())
