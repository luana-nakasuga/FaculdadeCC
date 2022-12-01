# Programa que lê três valores inteiros, e calcula e exibe 
# a sua média ponderada. A primeira nota tem peso 2, a segunda tem 
# peso 3 e a terceira tem peso 5

nota1 = int(input('Qual sua nota1?'))
nota2 = int(input('Qual sua nota2?'))
nota3 = int(input('Qual sua nota3?'))

print(f"Notas:\n\tNota1 = {nota1} \n\tNota2 = {nota2}")
print(f"\tNota3 = {nota3}")

media_ponderada = nota1 * 2 + nota2 * 3 + nota3 * 5
media_ponderada = media_ponderada / (2+3+5)

print(f"\nSua média ponderada é: {media_ponderada} ")