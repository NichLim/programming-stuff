import java.util.Scanner;


//este programa suporta até dois funcionarios diferentes
public class testefuncionarios{
	public static void main(String[]args){
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		Scanner user_in = new Scanner(System.in);

		
		//recolhe as informações do primeiro funcionario informadas pelo usuário e os guarda dentro do novo objeto chamado 'func1'
		System.out.println("Informe o nome do funcionario");
		func1.nome = user_in.next();

		System.out.println("Informe a funcao do funcionario");
		func1.funcao = user_in.next();
		
		System.out.println("Informe o departamento do funcionario");
		func1.departamento = user_in.next();
		
		System.out.println("Informe a matricula do funcionario");
		func1.matricula = user_in.next();
		
		System.out.println("Informe a situacao do funcionario (ativo, demitido, licenca, etc.)");
		func1.situacao = user_in.next();

		System.out.println("Informe o dia de entrada do funcionario");
		func1.dataDeEntrada.dia = user_in.nextInt();

		System.out.println("Informe o mes de entrada do funcionario");
		func1.dataDeEntrada.mes = user_in.nextInt();

		System.out.println("Informe o ano de entrada do funcionario");
		func1.dataDeEntrada.ano = user_in.nextInt();
	
		System.out.println("Informe o salario do funcionario");
		func1.salario = user_in.nextDouble();
	
		//recolhe as informações do segundo funcionario informadas pelo usuário e os guarda dentro do novo objeto chamado 'func2'
	
		System.out.println("Informe o nome do funcionario");
		func2.nome = user_in.next();

		System.out.println("Informe a funcao do funcionario");
		func2.funcao = user_in.next();
		
		System.out.println("Informe o departamento do funcionario");
		func2.departamento = user_in.next();
		
		System.out.println("Informe a matricula do funcionario");
		func2.matricula = user_in.next();
		
		System.out.println("Informe a situacao do funcionario (ativo, demitido, licenca, etc.)");
		func2.situacao = user_in.next();

		System.out.println("Informe o salario do funcionario");
		func1.salario = user_in.nextDouble();

		
		//comparação entre os dois funcionarios
		if(func1.salario == func2.salario){
			System.out.println("O salario dos dois funcionarios sao iguais");
		}
		else{
			System.out.println("O salario dos dois funcionarios são diferentes");
		}

		//sistema básico de multipla escolha
		System.out.println("Informe o nome do Funcionario que deseja utilizar");
		String matr = user_in.next();
		switch(matr){
			case "1":
			System.out.println("Informe a opcao desejada: ");
			System.out.println("  ('1') Mostra todas as informacoes do Funcionario Atual \n");
			System.out.println("  ('2') Mostra o Calculo de Ganho Anual do Funcionario \n");
			System.out.println("  ('3') Metodo de Aumento Salarial \n"); 
			System.out.println("  ('4') Metodo de Desconto Salarial \n");
			int opcao = user_in.nextInt();
			switch(opcao){
				case 1:
					//mostra todos atributos do funcionario
					func1.mostra();
					break;
					case 2:
					//realiza calculo de ganho anual e guarda na double GA
					double ga = func1.calculaGanhoAnual();
					System.out.println("O ganho anual do Funcionario " + func1.nome + " eh de: " + ga);
					break;
					case 3:
					//aciona o método aumento e informa o novo salário
					System.out.println("Informe o Aumento");
					double aumento = user_in.nextDouble();
					func1.recebeAumento(aumento);
					System.out.println("O novo salario eh de: " + func1.salario);
					break;
					case 4:
					//aciona o método de desconto e informa o novo salário
					System.out.println("Informe o Desconto");
					double desconto = user_in.nextDouble();
					func1.descontosMensais(desconto);
					System.out.println("O novo salario eh de: " + func1.salario);
					default:
					//default caso nenhuma das opções seja escolhida
					System.out.println("Informe um valor valido");
					break;
				}
			break;	
			case "2":
			System.out.println("Informe a opcao desejada: ");
			System.out.println("  ('1') Mostra todas as informacoes do Funcionario Atual \n");
			System.out.println("  ('2') Mostra o Calculo de Ganho Anual do Funcionario \n");
			System.out.println("  ('3') Metodo de Aumento Salarial \n"); 
			System.out.println("  ('4') Metodo de Desconto Salarial \n");
			int opcao2 = user_in.nextInt();
			switch(opcao2){
				case 1:
					//mostra todos atributos do funcionario
					func1.mostra();
					break;
					case 2:
					//realiza calculo de ganho anual e guarda na double GA
					double ga2 = func2.calculaGanhoAnual();
					System.out.println("O ganho anual do Funcionario " + func2.nome + " eh de: " + ga2);
					break;
					case 3:
					//aciona o método aumento e informa o novo salário
					System.out.println("Informe o Aumento");
					double aumento2 = user_in.nextDouble();
					func2.recebeAumento(aumento2);
					System.out.println("O novo salario eh de: " + func2.salario);
					break;
					case 4:
					//aciona o método de desconto e informa o novo salário
					System.out.println("Informe o Desconto");
					double desconto2 = user_in.nextDouble();
					func1.descontosMensais(desconto2);
					System.out.println("O novo salario eh de: " + func2.salario);
					default:
					//default caso nenhuma das opções seja escolhida
					System.out.println("Informe um valor valido");
					break;
				}
			break;
			default:
			System.out.println("Matricula invalida");
			break;
			}
		}
}