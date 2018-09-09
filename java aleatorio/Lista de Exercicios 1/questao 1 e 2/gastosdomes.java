public class gastosdomes{
	public static void main(String[]args){
		int gastosalimentacao = 600;
		int gastossaude = 1000;
		int gastostransporte = 500;
		int gastoslazer = 400;
		int gastototal = gastoslazer + gastostransporte + gastossaude + gastosalimentacao;
		int mediagastos = gastototal / 4;
		System.out.println("O gasto total do mes e: \n" + gastototal);
		System.out.println("A media de gasto desse mes e: \n" + mediagastos);

	}
}