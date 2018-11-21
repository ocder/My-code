start = int(input("输入起始值："))
end = int(input("输入终止值："))
end += 1
for i in range(start, end):
    if i > 1:
        for j in range(2, i):
            if (i % j) == 0:
                break
        else:
            print('%d' % (i))
