public class multiplo3{
	public static void main(String[]args){
		int i = 1;
		System.out.println("Os números multiplos de 3 de 1 a 100 são: \n");
		while (i <= 100){
				if (i % 3 == 0){
					System.out.println(i);
				}
			i++;
		}
	}
}