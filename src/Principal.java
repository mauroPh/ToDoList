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
        	System.out.println("Digite o nome da categoria sem espaços : ");
			
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
        //Tarefa:Implementar no codigo a remoção de uma categoria da lista.//
      //Ex: opção 3 Lista as categorias(com indice) e quando o usuario digitar o indice deve remover a opção//
        case "3":{
        	int i;
        	Scanner ler = new Scanner(System.in);
        	//Lista os itens com seus indices respectivos e pede ao usuario para escolher a opção a ser removida
        	System.out.printf("Os itens que você pode remover são:\n");
    	    int n = categorias.size();
    	    for (i=0; i<n; i++) {
    	      System.out.printf("%d- %s\n", i, categorias.get(i));
    	    }
    	    System.out.printf("\nInforme o índice do item que será excluído:\n");
    	    i = ler.nextInt();
 
    	    try {
    		      // remove o item
    		      categorias.remove(i);
    		    } catch (IndexOutOfBoundsException e) {
    		        //indica que um indice escolhido não é válido.
    		    	System.out.printf("\nErro: Posição inválida (%s).",
    		          e.getMessage());
    		    }
    	    System.out.printf("\nCategoria removida com sucesso! Lista Atualizada :\n");
    		    i = 0;
    		    for (String categoria: categorias) {
    		      System.out.printf("Posição %d- %s\n", i, categoria);
    		      i++;
    		    }
    	    
     	   break ;
     }
        	   case"0":{
        		   System.exit(0);
        	   }
        	   default:{
        		   System.out.println("Opção Inválida.");	
        		   break;        	   }
        	   
        	   }  	   
        		}
	        }
		}

