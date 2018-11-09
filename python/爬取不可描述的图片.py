from urllib import request
from bs4 import BeautifulSoup
import re
import time

url = "https://mashable.com/category/pornhub/"
html = request.urlopen(url).read().decode('utf-8')
soup = BeautifulSoup(html, 'html.parser')
# print(soup.prettify())
links = soup.find_all('img', "origin_image \
zh-lightbox-thumb", src=re.compile(r'.jpg$'))
# print(links)
path = r'C:\Users\lenovo\Desktop\不可描述的图片'
for link in links:
    print(link.attrs['src'])
    request.urlretrieve(link.attrs['src'], path+'\%s.jpg' % time.time())
