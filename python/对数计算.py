import math

posi = [0.1, 0.18, 0.4, 0.05, 0.06, 0.1, 0.07, 0.04]
sum = 0
for item in posi:
    # 以二为底
    sum = -(item * math.log(item, 2)) + sum

print(sum)
