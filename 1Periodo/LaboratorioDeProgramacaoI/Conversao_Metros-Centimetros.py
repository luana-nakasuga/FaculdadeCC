medida_metros = float(input('Qual a medida em metros?'))

metros_centimetros = medida_metros * 100

mensagem = ('Sua conversão de metros para centímetros é: ' + str(metros_centimetros))
# ou neste caso podemos usar -> mensagem = (f'Sua conversão de metros para centímetros é: {metros_centimetros}')
print(mensagem)