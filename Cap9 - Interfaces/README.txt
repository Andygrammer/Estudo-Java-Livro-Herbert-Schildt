Para executar esta revis�o, siga:

1. Troque de diret�rio: no CMD, digite -> cd diret�rio\at�\src
2. Compile os arquivos Java: agora digite -> javac interfaceTipo1\*java interfaceTipo2\*java interfaceTipo3\*java
3. Execute a classe principal (exemplo 1): digite -> java interfaceTipo1.ImplementandoInterfaces
4. Execute a classe principal (exemplo 2): digite -> java interfaceTipo2.ImplementandoInterfacesFilha
5. Execute a classe principal (exemplo 3): digite -> java interfaceTipo3.ImplementandoInterfaces

Se algo der errado, pode haver algum problema com as vari�veis de ambiente do seu sistema operacional. Para resolver, veja o link a seguir:

https://www.java.com/pt_BR/download/help/path.xml

//////////////////////////////////////
C�digo fonte:

1. H� tr�s pacotes:
1.a. o interfaceTipo1 tem 1 classe com o m�todo main e 1 interface.
1.b. o interfaceTipo2 tem 1 superclasse, 1 subclasse com o m�todo main e 1 classe com interface aninhada.
1.c. o interfaceTipo3 tem 1 classe com o m�todo main e 1 interface.
2. O c�digo consiste em verificar como o Java 8 se comporta com as novidades relacionadas �s interfaces comparando com aquilo que j� existia antes desta nova vers�o. 
3. Possibilidades do pacote interfaceTipo1:
3.a. para a interface:
3.a.1. dois m�todos comuns, na forma tradicional do Java (antes da vers�o 8).
3.a.2. um m�todo default (novidade do Java 8).
3.b. para a classe principal:
3.b.1. h� override dos m�todos na forma tradicional.
3.b.2. chamadas para o m�todo default.
3.b.3. s�o duas maneiras de chamar os m�todos da interface: com e sem Dynamic Method Lookup (pode ocasionar overhead).
3.b.4. Dynamic Method Lookup ocorre quando o Java resolve em tempo de execu��o qual m�todo executar (n�o h� uma refer�ncia direta ao m�todo usado pelo c�digo).
4. Possibilidades do pacote interfaceTipo2:
4.a. h� uma interface filha e uma interface m�e:
4.a.1. a interface m�e possui os seus pr�prios m�todos, que s�o herdados pela interface filha. 
4.a.2. a interface filha possui um novo m�todo e tamb�m uma chamada a um m�todo da interface m�e.
4.b. h� uma classe mostrando como se faz uma interface aninhada.
4.c. h� uma classe abstrata (superclasse) para mostrar que n�o � obrigat�rio fazer override dos m�todos da interface que ela implementa.
4.d. h� uma subclasse que faz override dos m�todos que n�o foram implementados pela classe m�e, e chamadas aos m�todos das interfaces com e sem Dynamic Method Lookup:
4.d.1. chamadas de m�todos da interface m�e.
4.d.2. chamadas de m�todos da interface filha.
4.d.3. chamadas de m�todos da interface aninhada.
4.d.4. chamadas de m�todo da interface m�e, usando refer�ncia � interface filha.
5. Possibilidades do pacote interfaceTipo3:
5.a. para a interface:
5.a.1. h� m�todos de cada tipo: tradicional, default e est�tico.
5.b. para a classe principal:
5.b.1. chama o m�todo tradicional (override).
5.b.2. chama um m�todo default (sem override).
5.b.3. chama um m�todo default (com override).
5.b.4. chama dois m�todos est�ticos, mostrando que n�o � poss�vel fazer override.



//////////////////////////////////////
C�digo fonte criado por Andr� Marinho.

https://fimdoloop.wordpress.com/

//////////////////////////////////////
Fim do arquivo.