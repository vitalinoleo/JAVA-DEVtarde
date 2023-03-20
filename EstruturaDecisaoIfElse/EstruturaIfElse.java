package EstruturaDecisaoIfElse;

import java.util.Scanner;

/**
 * EstruturaIfElse
 */
public class EstruturaIfElse {

    Scanner sc = new Scanner(System.in); 
    
    //criar os métodos >>>>>>>>>>//

    public void decisaoIfElse ()          {

        System.out.println(" Informe o preço do produto ");
    
        double PrecoProduto = sc.nextDouble() ;

        double Desconto = 0.0 ;
        // se PrecoProduto for >100 entáo Desconto = 5// 

        if(PrecoProduto>=100 && PrecoProduto<200)        {
            Desconto = 5.0;

        }
        

        if ( PrecoProduto>=200 && PrecoProduto<300)        {

            Desconto = 10.0; 
            
        }

        if (PrecoProduto>=300) {
            Desconto = 15.0; 
            
        }

        // realizar a conta 

        double ValorDesconto = PrecoProduto*Desconto/100;

        double PrecoFinal = PrecoProduto-ValorDesconto; 

        System.out.println("O valor do produto é R$"+ PrecoFinal);

        
    }
    // if encadeado ( if-else)
    public void decisaoIf ()          {

        System.out.println(" Informe o preço do produto ");
    
        double PrecoProduto = sc.nextDouble() ;

        double Desconto ;
        // estrutura de decisão encadeada if-else 

        if (PrecoProduto>=300) {
            Desconto = 15;
            
        }else

        if (PrecoProduto>=200) {
            Desconto = 10;
            
        }else // encadeado tornando Códigos em apenas um só

        if (PrecoProduto>=100)    {
            Desconto = 5; 
            
        }else{
            Desconto=0;
        }

// realizar a conta 

double ValorDesconto = PrecoProduto*Desconto/100;

double PrecoFinal = PrecoProduto-ValorDesconto; 

System.out.println("O valor do produto é R$"+ PrecoFinal);

}


}