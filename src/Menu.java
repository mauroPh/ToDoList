import java.util.Scanner;

public class Menu {

	public void imprimeMenu() {
		System.out.println("Bem vindo ao sistema de ToDoList !");

		System.out.println("Selecione a opção que deseja :");

		System.out.println("1)Adicionar categoria.");
		System.out.println("2)Listar todas as categorias.");
		System.out.println("3)Remover categoria.");	
		System.out.println("0)Sair do programa.");														}
			
			public String decisaoUsuario() {
					Scanner decisaoUsuario= new Scanner(System.in);
					String valorDecisao = decisaoUsuario.next();		
		return valorDecisao ;
			}
}