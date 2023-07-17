public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa(); // Creating a new pessoa
        p.nome="Joao";
     

        Vendedor v = new Vendedor(); //creating a new vendedor
        v.nome ="Armando";
        v.comissao = 6.7; 

System.out.println("O nome da pessoa eh: " + p.nome);
System.out.println("O nome do vendedor eh: "+ v.nome);
System.out.println("A comissao eh de: "+ v.comissao);

    }
}
