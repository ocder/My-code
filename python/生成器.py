import time
# 生成器是惰性运算的
start1 = time.time()


def create_counter(n):
    print('creat_count')
    while True:
        yield n
        # print('increment n')
        n += 1

generator = create_counter(10)
for i in generator:
    # print(i)
    if i == 1000:
        break

end1 = time.time()
print(end1 - start1)

n = 10
start2 = time.time()
print('creat_count')
while True:
    # print('increment n')
    # print(n)
    n += 1
    if n == 1000:
        break

end2 = time.time()
print(end2 - start2)
