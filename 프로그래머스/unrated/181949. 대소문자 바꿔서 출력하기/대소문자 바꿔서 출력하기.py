str = input()
list = list(str)

result = ''
for i in list:
    if i.isupper():
        result+=i.lower()
    else:
        result+=i.upper()


print(result)