import java.math.BigDecimal;

public class Contacorrente {
    private int numeroDaConta;
    private int saldoDaConta;
    private boolean contaEspecial;
    private int saldoParaDeposito;
    private int saque;

    public Contacorrente(int numeroDaConta, int saldoDaConta, boolean contaEspecial, int saldoParaDeposito,int saque) {
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;
        this.contaEspecial = contaEspecial;
        this.saldoParaDeposito = saldoParaDeposito;
        this.saque = saque;
    }

    public void depositarSaldo() {
        System.out.println("você depositou " + saldoParaDeposito);
        saldoDaConta += saldoParaDeposito;
    }
    public void consultarSaldo(){

        System.out.println("seu saldo atual é: "+(saldoDaConta));
    }
    public void chequeEspecial(){
        if(saldoDaConta >= 0){
            System.out.println("Você não está usando cheque especial");
        }else{
            System.out.println("Você está usando cheque especial");
        }
    }
    public void sacar(){
        saldoDaConta -= saque;
        System.out.println(saldoDaConta);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(int saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public boolean isContaEspecial() {
        return contaEspecial;
    }

    public void setContaEspecial(boolean contaEspecial) {
        this.contaEspecial = contaEspecial;
    }

    public int getSaldoParaDeposito() {
        return saldoParaDeposito;
    }

    public void setSaldoParaDeposito(int saldoParaDeposito) {
        this.saldoParaDeposito = saldoParaDeposito;
    }
}
/**
 * reescreva os seguintes exercícios , criando todos os atributos do tipo privado, métodos getters e setters e construtores. os métodos utilizados na classe teste devem ser públicos.
 *  escreva uma classe que represente uma conta corrente
 *  ela deve conter os atributos: numero, saldo, um status que informa se é especial ou não
 *  e um limite
 *  desenvolva um método de saque(verificando se o cliente pode realizar saque)
 *  depositar dinheiro, verificar se a conta está usando cheque especial e teste a classe
 */