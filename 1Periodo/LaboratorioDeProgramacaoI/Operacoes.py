# Programa que lê um número inteiro e mostra o seu triplo,
# sua metade, a sua raiz cúbica, o número elevado a potência 2/3 
# e, por fim, o número dividido por dois e multiplicado por 5


numero = int(input(f"Qual o seu número?\t" ))

print(f"O triplo do seu número é: {numero * 3}")
print(f"A metade do seu número é: {numero / 2}")
print(f"A raiz cúbica do seu número é: {numero ** (1/3)}")
print(f"O número elevado a 2/3 é: {numero ** (2/3)}")
print(f"O número dividido por dois e multiplicado por 5: {numero / 2 * 5}")