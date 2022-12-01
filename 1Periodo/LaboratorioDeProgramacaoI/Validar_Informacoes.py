""" Programa que lê e valida as seguintes informações:
        1. Nome: maior que 3 caracteres;
        2. Idade: entre 0 e 150;
        3. Salário: maior que zero;
        4. Sexo: 'f' ou 'm';
        5. Estado Civil: 's', 'c', 'v', 'd'; """

erro = 1

while (erro != 0):
    erro = 0
    nome = str(input('Informe o nome: '))
    idade = int(input('Informe a idade: '))
    salario = float(input('Informe o salário: '))
    sexo = input('Informe o seu sexo: ')
    estado_civil = input('Informe o estado civil: ')

    if (len(nome) <= 3):
        erro = 1
        print('Nome precisa ter mais que 3 caracteres.')

    if (idade < 0 or idade > 150):
        erro = 1
        print('Idade inválida')

    if (salario < 0):
        erro = 1
        print('Salário tem que ser maior que 0. ')

    if (sexo.upper() != 'F' and sexo.upper() != 'M'):
        erro = 1
        print('Sexo inválido.')

    if (estado_civil.upper() != 'S' and estado_civil.upper() != 'C' and estado_civil.upper() != 'V' and estado_civil.upper() != 'D'):
        erro = 1
        print('Estado civil inválido.')

print('Obrigada pela sua atenção.')