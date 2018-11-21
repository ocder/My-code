with open("test.txt", "wt") as out_file:
    out_file.write("文件写入成功\n测试换行")

with open("test.txt", "rt") as in_file:
    text = in_file.read()

print(text)
