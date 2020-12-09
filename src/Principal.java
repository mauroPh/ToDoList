import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	public class Principal {

	public static void main(String[] args) {
	Menu menu= new Menu() ;
	List<String> categorias = new ArrayList<String>();
	
	        boolean	continua= true ;
	while(continua){
		menu.imprimeMenu();
        String valorDecisao = menu.decisaoUsuario();
        
        switch (valorDecisao) {
        case"1":{
        	System.out.println("Digite o nome da categoria sem espa�os : ");
			
			Scanner scanNomeCategoria = new Scanner(System.in);
			String nomeCategoria = scanNomeCategoria.next();
		
			
			categorias.add(nomeCategoria);
        	break ;
        }	
        case "2":{
        	   for (String nome : categorias)	{		
   				System.out.println("Nome da Categoria =  " + nome);	
   				}
        	   break ;
        }
        //Tarefa:Implementar no codigo a remo��o de uma categoria da lista.//
      //Ex: op��o 3 Lista as categorias(com indice) e quando o usuario digitar o indice deve remover a op��o//
        case "3":{
        	int i;
        	Scanner ler = new Scanner(System.in);
        	//Lista os itens com seus indices respectivos e pede ao usuario para escolher a op��o a ser removida
        	System.out.printf("Os itens que voc� pode remover s�o:\n");
    	    int n = categorias.size();
    	    for (i=0; i<n; i++) {
    	      System.out.printf("%d- %s\n", i, categorias.get(i));
    	    }
    	    System.out.printf("\nInforme o �ndice do item que ser� exclu�do:\n");
    	    i = ler.nextInt();
 
    	    try {
    		      // remove o item
    		      categorias.remove(i);
    		    } catch (IndexOutOfBoundsException e) {
    		        //indica que um indice escolhido n�o � v�lido.
    		    	System.out.printf("\nErro: Posi��o inv�lida (%s).",
    		          e.getMessage());
    		    }
    	    System.out.printf("\nCategoria removida com sucesso! Lista Atualizada :\n");
    		    i = 0;
    		    for (String categoria: categorias) {
    		      System.out.printf("Posi��o %d- %s\n", i, categoria);
    		      i++;
    		    }
    	    
     	   break ;
     }
        	   case"0":{
        		   System.exit(0);
        	   }
        	   default:{
        		   System.out.println("Op��o Inv�lida.");	
        		   break;        	   }
        	   
        	   }  	   
        		}
	        }
		}

