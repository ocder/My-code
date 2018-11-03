# python可以同时给多个变量赋值，复数是j
a, b, c, d = 1, 2.00, 'runoob', 4 + 5j
print(type(a), type(b), type(c), type(d))

# 注意isinstance的用法
print(isinstance(a, float))

# type()和isinstance()在对子类父类的判断，type()认为子类父类不同


class A:
    pass


class B(A):
    pass

print(isinstance(A(), A))
print(isinstance(B(), A))
print(type(B()) == A)

# del语句
del a
# print(a)

# list——使用最频繁的数据类型
list = ['abcd', 786, 2.23, 'runoob', 70.2]
tinylist = [123, 'runoob']
print(list + tinylist)
print(tinylist * 2)
# list类似数组，其中元素可变
list[0] = 999
print(list)

# Tuple，其中元素不能修改，其余操作和list相仿
tuple = ('abcd', 786, 2.23, 'runoob', 70.2)
tinytuple = (123, 'runoob')
print(tuple + tinytuple)

# set——集合（没有重复元素），可以用{}或set()函数创建集合
student = {'Tom', 'Jim', 'Mary', 'Tom', 'Jack', 'Rose'}
print(student)

if 'Mary' in student:
    print("Mary是学生")
else:
    print("Mary不是学生")

# dictionary是无序对象的集合，元素通过唯一的键来存取，键必须使用不可变类型
dict = {'name': 'runoob', 'code': 1, 'site': 'www.runoob.com'}
print(dict.keys())
print(dict.values())
