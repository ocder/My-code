import math

posi = [0.20, 0.19, 0.18, 0.17, 0.15, 0.10, 0.01]
sum = 0
for item in posi:
    # 以二为底
    sum = math.log(item, 2) + sum
    print(math.log(item, 2))

print(sum)
