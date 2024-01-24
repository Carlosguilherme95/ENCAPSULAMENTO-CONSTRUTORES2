public class Teste {
    public static void main(String args[]){
        Contacorrente cc = new Contacorrente(123456,1000,true,1500,500);
        cc.depositarSaldo();
        cc.consultarSaldo();
        cc.chequeEspecial();
        cc.sacar();
    }
}
