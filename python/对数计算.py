import math
'''
posi = [0.8, 0.2]
sum = 0
for item in posi:
    # 以二为底
    sum = -(item * math.log(item, 2)) + sum

print(sum)
'''
ans1 = []
posi = [5/6, 1/6, 3/4, 1/4]
for item in posi:
    ans1.append(-(item * math.log(item, 2)))

print(ans1)
sum = 0
sum = 0.6 * (ans1[0]+ans1[1]) + 0.4 * (ans1[2]+ans1[3])
print(sum)
# print(math.log(5/6/0.6, 2))