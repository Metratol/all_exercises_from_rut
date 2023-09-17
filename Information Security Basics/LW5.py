enter = input("Введите текст:")
n = 0
key = [4,0,1,5,3,2]
output = ""
for i in range(2, len(enter) + 1):
    if len(enter) % i == 0 and i != len(enter):
        n = i
        break
matrix = []
m = len(enter) // n
for i in range(0, n):
    piece = []
    for y in range(0, m):
        piece.append(enter[0])
        enter = enter[1:]
    matrix.append(piece)

matrixtrans = [[0 for y in range(n)] for x in range(m)]
for i in range(len(matrix)):
    for j in range(len(matrix[0])):
        matrixtrans[j][i] = matrix[i][j]
        a = matrix[j][i]
        output += a

print(output)








































print()
