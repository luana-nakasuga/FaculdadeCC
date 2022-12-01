nome = (input('Qual o seu nome?'))
peso = float(input('Qual o seu peso?'))
altura = float(input('Qual sua altura?'))
imc = peso / (altura ** 2)
print(f"Olá {nome}, seu imc é: {imc:.2f}")

if imc<18.5:
    print(f"Você está com peso baixo.")
elif imc>=18.5 and imc<25:
    print(f"Você está saudável.")
elif imc<25 and imc>=29:
    print(f"Você está com excesso de peso, cuidado!")
elif imc>29 and imc<35:
    print('Você está com obesidade.')
else:
    print(f"Erro. Tente novamente!")