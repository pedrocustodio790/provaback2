1) Explique com suas palavras:
a) Em JS existe alguma possibilidade de manipulação de
Strings associadas a Arrays? Como isso funciona? Dê
exemplos:
b) Explique a diferença entre Math.floor(), Math.ceil() e
Math.round() no arredondamento de números em JS.
c) Como objetos do tipo data são criados em JS? Em sua
explicação faça uma demonstração capturando a data atual.

2) Explique com suas palavras:
a) O que é uma expressão regular em JS? Qual o seu
propósito?
b) Para que serve o método .test? Qual a sua relação com a
validação de strings.

3) Explique com suas palavras:
a) O que é e como funciona Programação Assíncrona em JS?
b) Como o conceito de Single-Threaded pode afetar o
comportamento no fluxo de tarefas no JavaScript?
c) Qual a diferença entre promises e async await? Existe
alguma relação entre promises, async await e callbacks? Se
sim explique:
d) No contexto de JavaScript o que é event loop?

4) Dado o seguinte script.js.

Informe a saída obtida em console, com base na data atual.
Para validar o programa você deve, respeite a estrutura de callback
bem como a regex criada.

5) Dado o seguinte script.js.

Qual a ordem de exibição dos números? Explique com suas palavras
porque essa ordem acontece?

6) Crie um programa que conta o número de caracteres do texto
fornecido pelo usuário. Será necessário evidenciar que são aceitos
apenas 70 caracteres.
Caso a adição de texto exceda o tamanho limite informe a
necessidade de alteração do texto, caso contrário serão registrados
apenas os 70 caracteres permitidos.
- Crie uma interface HTML com um campo de entrada e um botão.
- Exiba os resultados na tela e trate exceções, como entrada vazia.

7) Crie um programa para calcular a idade do usuário com base em
sua data de nascimento. Faça uma expressão regular que aceita
apenas o padrão dia/mês/ano ou seja DD/MM/YYYY;
Implemente uma interface HTML contendo:
O campo de entrada deverá utilizar (<input type="text">) para validar
a regex.
Utilize um botão que, ao ser clicado, exibe a idade do usuário na tela.
Utilize try-catch para validar as exceções por exemplo datas futuras,
e entradas inválidas como símbolos e letras.

8) Faça um programa que permita a inserção do nome e sobrenome
de pessoas separados por vírgula, essas pessoas participarão de um
sorteio o qual separa os indivíduos em duplas logo, garanta que
serão inseridos um número par de pessoas.
• Trate erros se a inserção estiver vazia ou contiver nomes
inválidos ou duplicados (ex.: números ou símbolos).
• Escolher aleatoriamente as duplas, para isso utilize a
Math.random.
• Em sua interface HTML exiba duplas sorteadas.

9) Crie um programa que permita ao usuário adicionar, visualizar,
editar e excluir informações dos alunos do SENAI, como CPF, nome,
data de nascimento, telefone e-mail e curso.
• Utilize expressão regular para validar as entradas, como
formatos de nome, data de nascimento, e-mail número de
telefone e CPF no formato inválido.
- Padrão para CPF: 99.999.999-99
- Padrão para Telefone: (16) 91234-5678
- Padrão para e-mail: "nome@dominio.com".
Os domínios aceitos serão: gmail, hotmail e outlook
Também defina quais TLDs (Top-Level Domains), ou seja, o
domínio de nível superior serão aceitos, neste caso serão aceitos:
com, com.br e org

• Implemente tratamento de exceções para lidar com erros.
• Forneça funcionalidades para pesquisa de contatos por nome
e ordenação alfabética.
• Não permita inserir alunos com o mesmo CPF e e-mail.
• Desenvolva uma interface em HTML para o usuário interagir
com seu programa.

10) Acesse o link utilize o exercício 6 como base para essa atividade.
Refatore o exercício 6 para que sejam criados os elementos em tela
de maneira dinâmica.
Para efetuar o processo de exibição das imagens das frutas utilize
elementos de programação assíncrona, assim, carregue as imagens
contidas em um diretório (para tanto você pode utilizar o método
decode() apresentado no exemplo v3 do link).
Obs.: o comportamento do programa deverá ser o mesmo, trocar a
imagem e o texto de descrição com base na escolha do usuário,
porém de forma dinâmica e com base em programação assíncrona.
