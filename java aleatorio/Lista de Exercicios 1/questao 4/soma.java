public class soma{
	public static void main(String[]args){
	int i = 1;
	int aux = 0;

	while (i <= 512){
		aux = aux + i;
		i++;
	}
		System.out.println("A soma dos valors de 1 a 512 e:\n" + aux);
	}
}