"""Programa que leia um nome de usuário e a sua senha 
     e não aceite a senha igual ao nome do usuário, mostrando uma mensagem 
     de erro e voltando a pedir as informações."""

usuario = input('Digite o nome do usuário: ')
senha = input('Digite uma senha: ')

while (usuario == senha):
    print('A senha não pode ser igual ao nome de usuário. Por favor, informe outras credenciais.')
    usuario = input('Digite um nome de usuário: ')
    senha = input('Digite uma senha que se diferencie de seu nome: ')
    
print('Obrigada pela sua atenção.')