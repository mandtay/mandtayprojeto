import java.util.Scanner;

public class ChatbotContabil {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Olá! Eu sou o Chatbot Contabil. Como posso ajudá-lo hoje?");

    while (true) {
      String mensagem = scanner.nextLine();

      if (mensagem.equalsIgnoreCase("sair")) {
        System.out.println("Até logo!");
        break;
      }

      // Demonstração Contábil
      else if (mensagem.contains("balanço")) {
        System.out.println("O balanço patrimonial é uma demonstração contábil que apresenta a situação financeira de uma empresa em um determinado momento.");
        System.out.println("Ele é composto por três seções: Ativo, Passivo e Patrimônio Líquido.");
      }

      // Resultado
      else if (mensagem.contains("lucro")) {
        System.out.println("O lucro é a diferença entre a receita e o custo de uma empresa.");
        System.out.println("Ele pode ser calculado pela fórmula: Lucro = Receita - Custo");
      }

      // Tributação
      else if (mensagem.contains("imposto")) {
        System.out.println("O imposto de renda é um tributo que incide sobre a renda das pessoas físicas e jurídicas.");
        System.out.println("Ele é calculado com base na receita bruta da empresa e pode ser deduzido de acordo com as despesas autorizadas.");
      }

      // Despesas
      else if (mensagem.contains("despesa")) {
        System.out.println("Uma despesa é um gasto realizado pela empresa para alcançar seus objetivos.");
        System.out.println("Exemplos de despesas incluem salários, aluguel, materiais, etc.");
      }

      // Fluxo de Caixa
      else if (mensagem.contains("fluxo de caixa")) {
        System.out.println("O fluxo de caixa é a movimentação de entrada e saída de recursos financeiros de uma empresa.");
        System.out.println("Ele é importante para avaliar a liquidez e a solvência da empresa.");
      }

      // Ativo
      else if (mensagem.contains("ativo")) {
        System.out.println("O ativo é a parte do balanço patrimonial que representa os recursos financeiros e materiais da empresa.");
        System.out.println("Exemplos de ativos incluem dinheiro, estoque, imóveis, etc.");
      }

      // Passivo
      else if (mensagem.contains("passivo")) {
        System.out.println("O passivo é a parte do balanço patrimonial que representa as obrigações financeiras da empresa.");
        System.out.println("Exemplos de passivos incluem dívidas, impostos a pagar, etc.");
      }

      // Patrimônio Líquido
      else if (mensagem.contains("patrimônio líquido")) {
        System.out.println("O patrimônio líquido é a parte do balanço patrimonial que representa a riqueza da empresa.");
        System.out.println("Ele é calculado pela fórmula: Patrimônio Líquido = Ativo - Passivo");
      }

      // Contabilidade
      else if (mensagem.contains("contabilidade")) {
        System.out.println("A contabilidade é a ciência que estuda a gestão e o controle dos recursos financeiros de uma empresa.");
        System.out.println("Ela é responsável por registrar, classificar e analisar as transações financeiras da empresa.");
      }

      // Estoque
      else if (mensagem.contains("estoque")) {
        System.out.println("O estoque é um ativo que representa os bens ou mercadorias que uma empresa tem em estoque.");
        System.out.println("Ele é importante para a gestão de estoque e para a determinação do valor do patrimônio líquido.");
      }

      // Custo
      else if (mensagem.contains("custo")) {
        System.out.println("O custo é o valor que uma empresa paga para produzir ou adquirir um bem ou serviço.");
        System.out.println("Ele é importante para a determinação do preço de venda e do lucro da empresa.");
      } else {
        System.out.println("Não entendi sua pergunta. Por favor, tente novamente.");
      }
    }
  }
}