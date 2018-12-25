import math
'''
posi = [0.8, 0.2]
sum = 0
for item in posi:
    # 以二为底
    sum = -(item * math.log(item, 2)) + sum

print(sum)
'''
ans1 = 0
posi = [1/2, 1/3, 1/6]
for item in posi:
    ans1 = ans1 + item * math.log(item, 2)

print(ans1+math.log(3, 2))
