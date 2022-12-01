# Programa para a leitura de duas notas parciais de um aluno. O programa deve calcular
# a média alcançada por aluno e apresentar:
# A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
# A mensagem "Reprovado", se a média for menor do que sete;
# A mensagem "Aprovado com Distinção", se a média for igual a dez.

nota1 = int(input(" Qual a sua nota1? "))
nota2 = int(input(" Qual sua nota2? "))

media = (nota1 + nota2) / 2
print(f"A sua média é {media}.")

if media >=7 and media <=9:
    print("Aprovado.")
elif media < 7:
    print("Reprovado.")
else:
    print("Aprovado com distinção")