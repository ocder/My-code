age = int(input('请输入你家狗狗的年龄'))
print('')
if age < 0:
    print('你在逗我吧')
elif age == 1:
    print('相当于14岁的人')
elif age == 2:
    print('相当于22岁的人')
else:
    print('对应人类年龄：', 22 + (age-2) * 5)
