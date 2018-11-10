end = int(input("请输入你想求和的数列中最后一位\n"))
count = 1
sum = 0
while count <= end:
    sum += count
    count += 1
print("和为%d" % (sum))
