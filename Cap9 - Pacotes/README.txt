Para executar esta revisão, siga:

1. Troque de diretório: no CMD, digite -> cd diretório\até\src
2. Compile os arquivos Java: agora digite -> javac pacote1\*java pacote2\*java
3. Execute a classe principal: digite -> java pacote1.ModificadoresDeAcessoComPacotes

Se algo der errado, pode haver algum problema com as variáveis de ambiente do seu sistema operacional. Para resolver, veja o link a seguir:

https://www.java.com/pt_BR/download/help/path.xml

//////////////////////////////////////
Código fonte:

1. Há dois pacotes:
1.a. o pacote1 tem 3 classes: a classe que possui o método main, uma superclasse e uma subclasse.
1.b. o pacote2 tem 2 classes: uma superclasse e uma subclasse.
2. O código consiste em verificar como os membros de uma classe se comportam, quanto aos seus modificadores de acesso (default, public, private e protected), sobre diferentes classes e pacotes:
3. Possibilidades:
3.a. Variáveis sendo referenciadas pela mesma classe (e mesmo pacote) onde foram definidas.
3.b. Variáveis referenciadas por uma subclasse do mesmo pacote.
3.c. Variáveis referenciadas por uma classe, que não é subclasse, do mesmo pacote.
3.d. Variáveis referenciadas por uma subclasse de um pacote diferente.
3.e. Variáveis referenciadas por uma classe, que não é subclasse, de um pacote diferente.



//////////////////////////////////////
Código fonte criado por André Marinho.

https://fimdoloop.wordpress.com/

//////////////////////////////////////
Fim do arquivo.