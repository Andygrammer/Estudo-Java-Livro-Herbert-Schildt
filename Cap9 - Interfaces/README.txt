Para executar esta revisão, siga:

1. Troque de diretório: no CMD, digite -> cd diretório\até\src
2. Compile os arquivos Java: agora digite -> javac interfaceTipo1\*java interfaceTipo2\*java interfaceTipo3\*java
3. Execute a classe principal (exemplo 1): digite -> java interfaceTipo1.ImplementandoInterfaces
4. Execute a classe principal (exemplo 2): digite -> java interfaceTipo2.ImplementandoInterfacesFilha
5. Execute a classe principal (exemplo 3): digite -> java interfaceTipo3.ImplementandoInterfaces

Se algo der errado, pode haver algum problema com as variáveis de ambiente do seu sistema operacional. Para resolver, veja o link a seguir:

https://www.java.com/pt_BR/download/help/path.xml

//////////////////////////////////////
Código fonte:

1. Há três pacotes:
1.a. o interfaceTipo1 tem 1 classe com o método main e 1 interface.
1.b. o interfaceTipo2 tem 1 superclasse, 1 subclasse com o método main e 1 classe com interface aninhada.
1.c. o interfaceTipo3 tem 1 classe com o método main e 1 interface.
2. O código consiste em verificar como o Java 8 se comporta com as novidades relacionadas às interfaces comparando com aquilo que já existia antes desta nova versão. 
3. Possibilidades do pacote interfaceTipo1:
3.a. para a interface:
3.a.1. dois métodos comuns, na forma tradicional do Java (antes da versão 8).
3.a.2. um método default (novidade do Java 8).
3.b. para a classe principal:
3.b.1. há override dos métodos na forma tradicional.
3.b.2. chamadas para o método default.
3.b.3. são duas maneiras de chamar os métodos da interface: com e sem Dynamic Method Lookup (pode ocasaionar overhead).
3.b.4. Dynamic Method Lookup ocorre quando o Java resolve em tempo de execução qual método executar (não há uma referência direta ao método usado pelo código).
4. Possibilidades do pacote interfaceTipo2:
4.a. há uma interface filha e uma interface mãe:
4.a.1. a interface mãe possui os seus próprios métodos, que são herdados pela interface filha. 
4.a.2. a interface filha possui um novo método e também uma chamada a um método da interface mãe.
4.b. há uma classe mostrando como se faz uma interface aninhada.
4.c. há uma classe abstrata (superclasse) para mostrar que não é obrigatório fazer override dos métodos da interface que ela implementa.
4.d. há uma subclasse que faz override dos métodos que não foram implementados pela classe mãe, e chamadas aos métodos das interfaces com e sem Dynamic Method Lookup:
4.d.1. chamadas de métodos da interface mãe.
4.d.2. chamadas de métodos da interface filha.
4.d.3. chamadas de métodos da interface aninhada.
4.d.4. chamadas de método da interface mãe, usando referência à interface filha.
5. Possibilidades do pacote interfaceTipo3:
5.a. para a interface:
5.a.1. há métodos de cada tipo: tradicional, default e estático.
5.b. para a classe principal:
5.b.1. chama o método tradicional (override).
5.b.2. chama um método default (sem override).
5.b.3. chama um método default (com override).
5.b.4. chama dois métodos estáticos, mostrando que não é possível fazer override.



//////////////////////////////////////
Código fonte criado por André Marinho.

https://fimdoloop.wordpress.com/

//////////////////////////////////////
Fim do arquivo.