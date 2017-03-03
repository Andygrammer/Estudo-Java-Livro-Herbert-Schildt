Para executar esta revis�o, siga:

1. Troque de diret�rio: no CMD, digite -> cd diret�rio\at�\src
2. Compile os arquivos Java: agora digite -> javac pacote1\*java pacote2\*java
3. Execute a classe principal: digite -> java pacote1.ModificadoresDeAcessoComPacotes

Se algo der errado, pode haver algum problema com as vari�veis de ambiente do seu sistema operacional. Para resolver, veja o link a seguir:

https://www.java.com/pt_BR/download/help/path.xml

//////////////////////////////////////
C�digo fonte:

1. H� dois pacotes:
1.a. o pacote1 tem 3 classes: a classe que possui o m�todo main, uma superclasse e uma subclasse.
1.b. o pacote2 tem 2 classes: uma superclasse e uma subclasse.
2. O c�digo consiste em verificar como os membros de uma classe se comportam, quanto aos seus modificadores de acesso (default, public, private e protected), sobre diferentes classes e pacotes:
3. Possibilidades:
3.a. Vari�veis sendo referenciadas pela mesma classe (e mesmo pacote) onde foram definidas.
3.b. Vari�veis referenciadas por uma subclasse do mesmo pacote.
3.c. Vari�veis referenciadas por uma classe, que n�o � subclasse, do mesmo pacote.
3.d. Vari�veis referenciadas por uma subclasse de um pacote diferente.
3.e. Vari�veis referenciadas por uma classe, que n�o � subclasse, de um pacote diferente.



//////////////////////////////////////
C�digo fonte criado por Andr� Marinho.

http://ticomcc.blogspot.com.br

//////////////////////////////////////
Fim do arquivo.