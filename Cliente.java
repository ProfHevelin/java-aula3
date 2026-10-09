class Cliente extends  Pessoa{
    int numeroConta;
    double saldo;

    Cliente(String nome, int idade, int numeroConta, double saldo){
        super(nome, idade);
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado!");
        }else{
            System.out.println("Valor invalido!");
        }
    }

    void sacar(double valor){

        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque relaizado!");
        }else{
            System.out.println("Saque não permitido");
        }
    }

    void  consultarSaldo(){
        System.out.println("Conta: "+ numeroConta);
        System.out.println("Slado: R$"+ saldo);
    }

}