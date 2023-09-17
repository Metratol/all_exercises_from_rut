alphabet =" ,.!?#абвгдеёжзийклмнопрстуфхцчшщъыьэюя1234567890АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
enter = input("Введите текст:")
key = input("Введите ключ:")
change = int(input("Что вам нужно? Выберите цифру \n1)Зашифровать\n2)Расшифровать"))
output = ""
k = 0
for i in range(len(enter)):
    n = (alphabet.find(enter[i]) ^ alphabet.find(key[k])) % len(alphabet)
    output += alphabet[n]
    if k >= len(key) - 1:
        k = 0
    else:
        k += 1

print(output)