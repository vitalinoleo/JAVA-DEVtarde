import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in);

    public void exercicio1 ()    {

        System.out.println("informe o 1° valor ");

        int valor1 = sc.nextInt(); 

        System.out.println("informe o 2° valor ");

        int valor2 = sc.nextInt();

        if (valor1>valor2) {
            System.out.println("o 1° valor é maior ");
            
        }else if (valor1<valor2) {
            System.out.println("o 2° valor é maior");

            
        }

    } 

    public void exercicio2 () {

        System.out.println("informe seu ano de nascimento");

        int AnoDeNascimento = sc.nextInt();
        
        if ( AnoDeNascimento<=2007) {

            System.out.println("autorizado(a) a votar! ");
            
        }else if (AnoDeNascimento>2007) {

            System.out.println(" não autorizado(a) a votar! ");

            
        }



    }
    public void exercicio3 () {

        System.out.println(" SENHA:");

        int SenhaUsuario = sc.nextInt();

        if (SenhaUsuario == 1234) {

            System.out.println(" ACESSO AUTORIZADO !");

            
        }else {
            System.out.println(" ACESSO NEGADO !");
            
            
        }


        
    }


    public void exercicio4 () {
            

       

    }


    public void exercicio5 () {

        

    }


    public void exercicio6 () {

        

    }

   

    

    
}
