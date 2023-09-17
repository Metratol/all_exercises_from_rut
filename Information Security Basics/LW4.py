alphabet = " ,.!?#абвгдеёжзийклмнопрстуфхцчшщъыьэюя1234567890АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
alphabet1 = list(alphabet)
array = [[" ",",",".","!","?","#","а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф",
           "х","ц","ч","ш","щ","ъ","ы","ь","э","ю","я","1","2","3","4","5","6",'7','8','9','0',"А","Б","В","Г","Д","Е","Ё","Ж","З","И","Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф","Х","Ц","Ч","Ш","Щ","Ъ","Ы","Ь","Э","Ю","Я"]]
for i in range(1,len(alphabet)):
    alphabet_changed =[]
    first = alphabet1[0]
    alphabet1.append(first)
    alphabet1.pop(0)
    alphabet_changed.extend(alphabet1)
    array.append(alphabet_changed)

for i in array:
    print(i)



enter = input("Введите текст:")
key = input("Введите ключ:")
change = int(input("Что вам нужно? Выберите цифру \n1)Зашифровать\n2)Расшифровать"))
output = ""
k = 0
for i in range(len(enter)):
    if change == 1:
        output += array[alphabet.find(key[k])][alphabet.find(enter[i])]
    elif change == 2:
        member = array[alphabet.find(key[k])]
        member = member.index(enter[i])
        output += array[0][member]
    if k >= len(key) - 1:
        k = 0
    else:
        k += 1
print(output)







