#Programa que lê 5 números e informa o maior número.

maior_num = -100000

for i in range(5):
    numero = float(input('Digite o número:'))
    if numero > maior_num:
        maior_num = numero

print(f'Maior valor: {maior_num}')