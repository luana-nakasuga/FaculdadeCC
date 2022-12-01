#Programa que lê 5 números e informa a soma e a média dos números.

soma = 0
for i in range(5):
    numero = float(input('Digite o número:'))
    soma = numero + soma
    media = soma/5

print(f'Soma: {soma:2f}')
print(f'Média: {media:2f}')