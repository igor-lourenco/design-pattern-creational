# Padrões de projeto criacionais

Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.

## Factory method

Fornece uma interface ou classe abstrata para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que são criados. 

### Antes de usar o padrão de projeto `factory method`:
  
![Before](https://github.com/igor-lourenco/design-patterns/blob/creational-patterns/uml/before_factory_method.png)

Nesse exemplo, antes de usar o padrão `factory method`, a classe **Client** precisa entender não apenas a classe abstrata que representa a interface comum entre os diferentes modelos de iPhone, mas também todas as classes concretas que representam cada modelo específico (por exemplo, iPhoneX, iPhoneXSMax, iPhone11, etc.). Isso significa que a classe **Client** teria que lidar com detalhes da implementação específicas de cada modelo de iPhone, o que poderia ser complicado e propenso a erros. Alguns desses problemas incluem:

- **Complexidade do código**: O cliente precisa entender e lidar com todas as classes concretas, o que aumenta a complexidade do código e torna-o mais difícil de manter e entender.

- **Dependência excessiva**: O cliente fica fortemente acoplado às implementações específicas das classes concretas, o que dificulta a substituição ou atualização de implementações sem afetar o cliente.

- **Risco de erros**: Lidar diretamente com múltiplas classes concretas aumenta o risco de erros de programação, especialmente ao instanciar objetos ou gerenciar suas dependências.

- **Dificuldade na extensão**: Adicionar novos tipos de objetos requer que o cliente atualize seu código para lidar com as novas classes concretas, tornando o sistema menos flexível e mais propenso a erros.
