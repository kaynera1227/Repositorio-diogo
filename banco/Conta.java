package banco;

import javax.swing.JOptionPane;

public class Conta extends Pessoas {

    public double saque ;
    public double deposito = 0;
    public double emprestimo = 0;
    public double saldo;
    public static String senha;
    public int acao = 0;
    public int codigo = 0;

    public void criarConta() {
        JOptionPane.showMessageDialog(null, "Criação de Conta");
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: ")));

        if (getIdade() >= 18) {
            acao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Modo de Conta\n 1 - Pessoa Física  2 - Pessoa Jurídica"));

            switch (acao) {
                case 1:
                    setNome(JOptionPane
                            .showInputDialog("Criação de Conta - Pessoa Física \n Informe o Nome da Conta: "));
                    setCpf(JOptionPane.showInputDialog("Criação de Conta - Pessoa Física \n Informe Seu CPF: "));
                    setSenha(JOptionPane.showInputDialog("Criação de Conta - Pessoa Física \n Informe uma Senha: "));
                    codigo++;
                    JOptionPane.showMessageDialog(null, "Seu Código de Conta é " + codigo);
                    break;

                case 2:
                    setNome(JOptionPane
                            .showInputDialog("Criação de Conta - Pessoa Jurídica \n Informe o Nome da Conta: "));
                    setCnpj(JOptionPane.showInputDialog("Criação de Conta - Pessoa Jurídica \n Informe Seu CNPJ: "));
                    setSenha(JOptionPane.showInputDialog("Criação de Conta - Pessoa Jurídica \n Informe uma Senha: "));
                    codigo++;
                    JOptionPane.showMessageDialog(null, "Seu Código de Conta é " + codigo);

                default:
                    JOptionPane.showMessageDialog(null, "Ação Inválida!");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Idade Inválida!");

        }

    }

    public void saque() {
        JOptionPane.showMessageDialog(null, "Efetue seu Saque");
        saque = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor do Saque (Limite R$2500): "));

        if (getSaldo() < saque || saque > 2500) {
            JOptionPane.showMessageDialog(null, "Não Foi Possivel Efetuar o Saque");

        } else  {
            saldo = saldo - saque;
            JOptionPane.showMessageDialog(null, "Saque Efetuado! \n Saldo Atual" + saldo);

        }
    }

    public void deposito() {
        JOptionPane.showMessageDialog(null, "Efetue seu Depósito");
        deposito = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor do Depósito: "));

        if (deposito > 0) {
            saldo = saldo + deposito;
            JOptionPane.showMessageDialog(null, "Depósito Efetuado! \n Saldo Atual " + saldo);

        } else {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Efetuar o Depósito.");

        }
    }

    public void emprestimo() {
        JOptionPane.showMessageDialog(null, "Efetue seu Emprestimo");
        emprestimo = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor do Emprestimo (Limite R$5000): "));

        if (emprestimo > 0 && emprestimo < 5000) {
            saldo = saldo + emprestimo;
            JOptionPane.showMessageDialog(null, "Emprestimo Efetuado! Saldo Atual: " + saldo);

        } else {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Efetuar o Emprestimo.");

        }
    }

    public void saldo(){
        JOptionPane.showMessageDialog(null, "Saldo Atual: " + saldo);
    }



    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}