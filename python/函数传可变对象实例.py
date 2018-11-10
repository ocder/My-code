def ChangeList(mylist):
    mylist.append([1, 2, 3, 4])
    return mylist

if __name__ == '__main__':
    list = [10, 20, 30]
    # 与java一样是值传递
    for i in ChangeList(list)[3]:
            print(i)
    print(list)
