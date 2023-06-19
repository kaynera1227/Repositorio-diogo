package banco;

import javax.swing.JOptionPane;

public class App extends Conta {
    public static void main(String[] args) {

        Conta[] conta = new Conta[1];
        Conta banco1 = new Conta();
        int acao1 = 0;
        int cont = 0;
        boolean naoEncontrei = true;
        boolean naoEncontrei2 = true;
        boolean ligado = true;

        while (ligado) {
            JOptionPane.showMessageDialog(null, "-------------------------------------------------------------\n                         BANCO CENTRAL \n-------------------------------------------------------------\n1 - Abrir Conta |  2 - Visualizar Conta\n3 - Acessar Conta | 4 - Fechar");
            acao1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a Ação"));

            switch (acao1) {
                case 1:
                    for (int i = 0; i < conta.length; i++) {
                        conta[i] = new Conta();
                        conta[i].criarConta();
                    }

                    break;

                case 2:

                    String nomeBuscado = JOptionPane.showInputDialog("Insira o Nome de Conta Desejado");
                    while (naoEncontrei) {
                        if (nomeBuscado.equals(conta[cont].getNome())) {
                            naoEncontrei = false;
                            JOptionPane.showMessageDialog(null, "Informações da Conta \n Nome: " + conta[cont].getNome()
                                    + "\n Idade: " + conta[cont].getIdade() + "\n Saldo: " + conta[cont].getSaldo());

        
                    }}

                    break;

                case 3:
                   String nomeBuscado1 = JOptionPane.showInputDialog("Insira o Nome da Sua Conta");
                    while (naoEncontrei2) {
                        if (nomeBuscado1.equals(conta[cont].getNome())) {
                            naoEncontrei = false;

                            String senhaDigitada = JOptionPane.showInputDialog(null, "Insira a Senha");
                            if (senhaDigitada.equals(conta[cont].getSenha())) {
                                JOptionPane.showMessageDialog(null,
                                        "Informações da Conta \n Número de Conta: "+conta[cont].codigo+ "\n Nome: " + conta[cont].getNome()
                                                + "\n Idade: " + conta[cont].getIdade());

                                acao1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Informe a Ação \n 1 - Sacar  2 - Depositar \n 3 - Emprestimo  4 - Ver Saldo"));

                                switch (acao1) {
                                    case 1:
                                        banco1.saque();

                                        break;

                                    case 2:
                                        banco1.deposito();

                                        break;

                                    case 3:
                                        banco1.emprestimo();

                                        break;
                                        case 4:
                                          banco1.saldo();
                                        break;

                                    default:
                                        JOptionPane.showInputDialog(null, "Ação Inválida!");
                                        break;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Senha Inválida");
                            }
                        }
                    }
                break;
                case 4:
                JOptionPane.showMessageDialog(null,"Até Mais");
                    ligado = false;
break;
                default:
                    break;
            }
        }

    }
}