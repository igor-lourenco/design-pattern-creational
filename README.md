# Padrões de projeto criacionais

Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.

## Factory method


Esse padrão de projeto fornece uma interface ou classe abstrata para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que são criados. 

---

### Antes de usar o padrão de projeto
  
![Before](https://github.com/igor-lourenco/design-patterns/blob/creational-patterns/uml/before_factory_method.png)

Nesse exemplo, antes de usar o padrão `Factory Method`, a classe **Client** precisa entender não apenas a classe abstrata que representa a interface comum entre os diferentes modelos de iPhone, mas também todas as classes concretas que representam cada modelo específico (por exemplo, iPhoneX, iPhoneXSMax, iPhone11, etc.). Isso significa que a classe **Client** teria que lidar com detalhes da implementação específicas de cada modelo de iPhone, o que poderia ser complicado e propenso a erros. Alguns desses problemas incluem:

- **Complexidade do código**: O cliente precisa entender e lidar com todas as classes concretas, o que aumenta a complexidade do código e torna-o mais difícil de manter e entender.

- **Dependência excessiva**: O cliente fica fortemente acoplado às implementações específicas das classes concretas, o que dificulta a substituição ou atualização de implementações sem afetar o cliente.

- **Risco de erros**: Lidar diretamente com múltiplas classes concretas aumenta o risco de erros de programação, especialmente ao instanciar objetos ou gerenciar suas dependências.

- **Dificuldade na extensão**: Adicionar novos tipos de objetos requer que o cliente atualize seu código para lidar com as novas classes concretas, tornando o sistema menos flexível e mais propenso a erros.

---

### Usando o Simple Factory Method:

![Simple](https://github.com/igor-lourenco/design-patterns-creational/blob/creational-patterns/uml/simple_factory_method.png)

Nessa abordagem usando o Simple Factory Method,  Em vez de criar uma interface, é criada apenas uma classe chamada iPhoneSimpleFactory. Nessa classe, o método static chamado **orderiPhone(String, String)** é responsável por criar diferentes modelos de iPhones com base nos parâmetros fornecidos. A explicação do processo:

- **Classe iPhoneSimpleFactory**: É criada uma única classe responsável por criar diferentes modelos de iPhones. Esta classe contém um método static chamado **orderiPhone(String, String)**, que recebe parâmetros indicando o tipo de iPhone desejado.

- **Método static orderiPhone(String, String)**: Dentro deste método, a lógica de criação dos iPhones é encapsulada. Com base nos parâmetros fornecidos (como "standard" para um iPhone X normal ou "high end" para um iPhone 11 Pro), o método decide qual modelo de iPhone deve ser criado.

- **Criação do iPhone**: O método static **orderiPhone(String, String)** instancia e retorna o modelo de iPhone correto com base nos parâmetros recebidos. Por exemplo, se na classe  **Client** solicitar um iPhone X padrão, o método cria um iPhone X normal. Se o **Client** solicitar um iPhone 11 de alta qualidade, o método cria um iPhone 11 Pro.

- **Simplificação**: A classe **Client** agora só precisa interagir com a classe iPhoneSimpleFactory, chamando o método **orderiPhone(String, String)** com os parâmetros corretos. Ele não precisa conhecer detalhes específicos de cada modelo de iPhone ou lidar diretamente com múltiplas classes de fábrica.

Essa abordagem simplifica o código ao encapsular toda a complexidade de criação de objetos dentro de uma única classe e método, tornando o sistema mais fácil de entender, manter e estender. Embora diferente da implementação completa do `Factory Method` com a interface Factory, essa abordagem simplificada ainda segue o conceito, que é delegar a criação de objetos para uma classe especializada, facilitando a manutenção e a extensão do código.

---

### Usando o Half Factory Method:

![Half](https://github.com/igor-lourenco/design-patterns-creational/blob/creational-patterns/uml/half_simple_factory_method.png)



Essa abordagem permite uma organização mais estruturada das fábricas de iPhones, agrupando modelos semelhantes sob uma única fábrica:


- **IPhoneFactory**: Esta é uma classe abstrata com o método **createIPhone(String)** que será implementada pelas fábricas concretas. Esse método vai definir qual tipo de IPhone será criado usando a String que está sendo passada no parâmetro desse método.

- **IPhoneXFactory**: Esta é uma classe concreta que implementa a classe abstrata **IPhoneFactory**. Ela é responsável por criar modelos específicos de iPhones da linha X, como o iPhone X e o iPhone XS Max. Dentro desta fábrica, há uma lógica para determinar qual modelo específico de iPhone X deve ser criado com base no parâmetro fornecido no metódo **createIPhone(String)**.

- **IPhone11Factory**: Esta é outra classe concreta que implementa a classe abstrata **IPhoneFactory**. Ela cria modelos específicos da linha iPhone 11, como o iPhone 11 e o iPhone 11 Pro. Similar a **IPhoneXFactory**, ela possui lógica interna para determinar o modelo específico de iPhone 11 a ser criado com base no parâmetro fornecido no metódo createIPhone(String).

- **Client**: A classe **Client** interage com as fábricas de iPhones usando a classe abstrata **IPhoneFactory**. Em vez de lidar diretamente com a criação de objetos de modelos específicos, o **Client** chama método **orderIPhone(String)** passando o tipo de iPhone no parâmetro e a classe abstrata **IPhoneFactory** passa esse parâmetro no **createIPhone(String)** que será implementado pelas fábricas concretas para criar os iPhones desejados. Isso permite que o **Client** seja independente das implementações concretas dos modelos de iPhone e simplifica a manutenção e a extensão do código.


Essa abordagem organiza as fábricas de iPhones por grupos de modelos, tornando o código mais modular e fácil de entender. Se novos modelos de iPhone forem introduzidos, basta adicionar uma nova fábrica correspondente e o cliente poderá criar esses novos modelos sem a necessidade de modificar seu código existente.

---

### Usando o padrão completo Factory Method:

![After](https://github.com/igor-lourenco/design-patterns-creational/blob/creational-patterns/uml/factory_method.png)


Essa forma de implementação, com uma fábrica para cada tipo de objeto concreto, pode ser mais complexa e menos flexível do que outras abordagens mais simplificadas.


- As fábricas concretas agora tem seu próprio tipo concreto de objeto e contêm a lógica específica para criar esses objetos concretos. Cada tipo concreto de objeto (por exemplo, iPhone 11 Pro, iPhone X, etc.) agora tem sua própria fábrica dedicada. No exemplo, em vez de referenciar a classe abstrata **IPhoneFactory** para criar modelos específicos de iPhones, agora estamos referenciando as fábricas concretas, como **iPhoneXFactory** e **iPhone11ProFactory**.

- O **Client** agora precisa interagir com as fábricas concretas (por exemplo, **iPhoneXFactory**, **iPhone11ProFactory**) para criar os objetos desejados.

Embora seja uma abordagem válida, essa não é a forma mais comum de implementar o padrão Factory. Em certos casos, pode ser útil quando há uma necessidade específica de ter uma lógica de criação altamente especializada para cada tipo de objeto, mas em muitos casos, é preferível uma abordagem mais simplificada, onde uma única fábrica pode lidar com a criação de vários tipos de objetos. 









