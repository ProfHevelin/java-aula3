/**
 * Gerente
 */
public class Gerente extends Pessoa {

     double salario;

     Gerente(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
     }


     @Override 
     void  apresentar(){
        System.out.println("Gerente: " + nome);
        System.out.println("Salario: R$ " + salario);
     }
}