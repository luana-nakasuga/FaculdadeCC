#Imprime o triângulo
#9 8 7 6 5 4 3 2 1
#8 7 6 5 4 3 2 1
#7 6 5 4 3 2 1
#6 5 4 3 2 1
#5 4 3 2 1
#4 3 2 1
#3 2 1
#2 1
#1


for i in range(9, 0, -1):
    for j in range(i, 0, -1):
        print(j, end=' ')
    print()