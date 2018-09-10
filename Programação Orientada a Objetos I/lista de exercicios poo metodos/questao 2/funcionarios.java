class Data{
	int dia, mes, ano;

	String getFormatada(){
		return (dia + "/" + mes + "/" + ano);
	}
}
class Funcionario{
	String nome;
	String funcao;
	String departamento;
	String matricula;
	String situacao;
	double salario;
	Data dataDeEntrada = new Data();

	void recebeAumento(double acrescimo){
		//calculo simples para acréscimo de salário
		this.salario = this.salario + acrescimo;
	}
	void descontosMensais(double desconto){
		//calculo simples para descontos mensais
		this.salario = this.salario - desconto;
	}
	
	double calculaGanhoAnual(){
		//multiplica o salário por 12 para obter o ganho anual
		double ganhoanual = this.salario*12;
		return ganhoanual;	
	}

	
	void mostra(){
		//mostra todos os atributos da classe funcionario
		System.out.println("Nome: " + nome);
		System.out.println("Funcao: " + funcao);
		System.out.println("Departamento: " + departamento);
		System.out.println("Matricula: " + matricula);
		System.out.println("Situacao: " + situacao);
		System.out.println("Salario: " + salario);
		System.out.println("Data de Entrada: " + this.dataDeEntrada.getFormatada());
	}
}