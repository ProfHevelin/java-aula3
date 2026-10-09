public class Main{
    public static void main(String[] args){
        Cliente cliente = new Cliente("João", 20, 13456, 1000);
        Gerente gerente = new Gerente("Ana", 35, 10000);

        System.out.println("====== Cliente ======");

        cliente.apresentar();
        cliente.consultarSaldo();

        cliente.depositar(500);
        cliente.sacar(200);
        cliente.consultarSaldo();


        System.out.println();

        System.out.println("===== Gerente =======");
        gerente.apresentar();
    }
}