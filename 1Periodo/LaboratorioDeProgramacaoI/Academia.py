"""Programa para academia que calcula o cliente mais alto, o mais baixo, a mais gordo e o mais magro.
     Pede-se o codigo, altura e peso da pessoa, para finalizar o cadastro digite 0 no campo codigo. 
     Ao final do programa será informado os códigos e valores do clente mais alto, do mais baixo, 
     do mais gordo e do mais magro, além da média das alturas e dos pesos dos clientes"""

# Mais alto
codigo_mais_alto = 0
valor_mais_alto = 0

# Mais Baixo
codigo_mais_baixo = 0
valor_mais_baixo = 9999999999

# Mais gordo
codigo_mais_gordo = 0
valor_mais_gordo = 0

# Mais magro
codigo_mais_magro = 0
valor_mais_magro = 9999999999

#Codigo =)
codigo = 1

# Quantidade de clientes
qtd_clientes = 0

# Variáveis para a média
alturas = 0
pesos = 0

while (True):
    codigo = int(input('Informe o seu código: '))
    if (codigo == 0):
        break
    altura = float(input('Informe a sua altura: '))
    peso = float(input('Informe o seu peso: '))

    qtd_clientes += 1
    alturas += altura
    pesos += peso

    if (altura > valor_mais_alto):
        codigo_mais_alto = codigo
        valor_mais_alto = altura
    
    if (altura < valor_mais_baixo):
        codigo_mais_baixo = codigo
        valor_mais_baixo = altura
        
    if (peso > valor_mais_gordo):
        codigo_mais_gordo = codigo
        valor_mais_gordo = peso
    
    if(peso < valor_mais_magro):
        codigo_mais_magro = codigo
        valor_mais_magro = peso

media_altura = alturas / qtd_clientes
media_peso = pesos / qtd_clientes

print(f'O mais alto é o cliente {codigo_mais_alto} com a altura {valor_mais_alto:.2f} m.')
print(f'O mais baixo é o cliente {codigo_mais_baixo} com a altura {valor_mais_baixo:.2f} m.')
print(f'O mais gordo é o cliente {codigo_mais_gordo} com o peso {valor_mais_gordo:.2f} Kg.')
print(f'O mais magro é o cliente {codigo_mais_magro} com o peso, {valor_mais_magro:.2f} Kg.')

print(f'A média das alturas da academia é: {media_altura:.2f} cm.')
print(f'A média de pesos da academia é: {media_peso:.2f} kg.')
print('Obrigada.')