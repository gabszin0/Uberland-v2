# 🚗 UberLand - Sistema de Gestão de Mobilidade Urbana

O **UberLand** é um sistema de simulação de transporte por aplicativo desenvolvido em **Java**. O projeto aplica os pilares da **Programação Orientada a Objetos (POO)** para gerenciar o ecossistema completo de uma plataforma de mobilidade, desde a validação de documentos até a aplicação de regras de fidelidade e precificação dinâmica.

Nesta etapa, o sistema conta com uma interface gráfica baseada em **Swing**, permitindo a interação fluida para cadastros e solicitações de viagens.

## 🚀 Funcionalidades Principais

* **Gestão de Perfis:** Cadastro e diferenciação entre Passageiros e Motoristas através de uma base comum.
* **Interface Gráfica (GUI):** Telas interativas para cadastro de Clientes, Motoristas, Veículos e solicitações de Corridas.
* **Validações Rigurosas:** Lógica interna para validação de **CPF**, formato de **E-mail**, **CNH** e **Datas de Nascimento**.
* **Categorias de Veículos:** Suporte a múltiplas categorias com características específicas:
    * **UberX:** Foco em economia com taxas base.
    * **UberComfort:** Veículos com espaço extra e ar-condicionado dual zone.
    * **UberBlack:** Categoria premium com gestão de bagagem e acabamento superior.
* **Sistema de Fidelidade (VIP):** Conversão automática de clientes frequentes para o status **VIP**, liberando descontos progressivos (10%, 15% ou 20%) conforme o histórico de uso.
* **Gestão Financeira:** Divisão automatizada de valores entre a taxa da plataforma e o rendimento líquido do motorista.

## 🛠️ Conceitos de POO Aplicados

O projeto demonstra a aplicação prática dos quatro pilares de POO:

* **Abstração:** Uso de classes abstratas (`Pessoa` e `Veiculos`) como modelos base que não podem ser instanciados isoladamente.
* **Herança:** * No modelo de dados: `ClienteVip` herda de `Cliente`.
    * Na interface gráfica: Todas as telas (ex: `TelaCliente`, `TelaVeiculos`) estendem a classe `JFrame`.
* **Polimorfismo:** Implementação do método `calcularCustoViagem`, que varia conforme a categoria do veículo e o nível de conforto.
* **Encapsulamento:** Proteção de atributos sensíveis e uso de métodos acessores (`get` e `set`) com validações integradas.

## 📁 Estrutura do Projeto

### Camada de Visão (Interfaces Swing)
| Arquivo | Descrição |
| :--- | :--- |
| `TelaCliente.java` | Interface para cadastro de passageiros e formas de pagamento. |
| `TelaMotorista.java` | Formulário de registro para motoristas e validação de CNH. |
| `TelaVeiculos.java` | Gestão de atributos do veículo (ar-condicionado, bagageiro, etc). |
| `TelaCorrida.java` | Painel de solicitação de viagem com seleção de categoria. |



### Camada de Modelo e Lógica
| Arquivo | Descrição |
| :--- | :--- |
| `Pessoa.java` | Classe abstrata com lógica de CPF e avaliações. |
| `Cliente.java` | Extensão de Pessoa com dados de pagamento. |
| `Motorista.java` | Extensão de Pessoa com gestão de veículos vinculados. |
| `Veiculos.java` | Base para as categorias UberX, Comfort e Black. |
| `Corrida.java` | Motor do sistema que gerencia o fluxo (Solicitada -> Finalizada). |
| `RegrasUberLand.java` | Central de inteligência para promoções VIP e taxas. |

## ⚙️ Exemplo de Uso (Lógica Interna)

// Instanciando um cliente e um veículo premium
Cliente passageiro = new Cliente("João Silva", "12345678901");
UberBlack carro = new UberBlack("ABC1234", "CHASSI123...", "Preto", 4, 2024, "Marca", "Modelo", true, true, 2);

// Criando uma nova solicitação de corrida
Corrida novaViagem = new Corrida(passageiro, carro, "Rua A", "Rua B", LocalDateTime.now(), "CARTAO");

// Fluxo da viagem
novaViagem.iniciarCorrida("10:00");
novaViagem.finalizarCorrida(12.5, "10:25"); 

System.out.println("Valor total: R$ " + novaViagem.getValorTotal());