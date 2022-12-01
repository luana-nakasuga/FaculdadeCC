#Programa que recebe dois números inteiros 
# e gera os números inteiros que estão no intervalo compreendido por eles.

num1 = int(input('Digite o número inferior:'))
num2 = int(input('Digite o número superior:'))


for i in range(num1 + 1, num2):
		print(i)
