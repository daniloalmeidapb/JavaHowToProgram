package Cap5_11;


public class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		int amountNumber;
		int number;
		int little = 0;
		
		System.out.print( "Quantidade de n�meros: " );
		amountNumber = input.nextInt();
		
		System.out.println(  );
		
		for( int count = 0; count < amountNumber; count++ )
		{
			System.out.print( "Informe o n�mero: " );
			number = input.nextInt();
			
			if( count == 0 )
				little = number;
			
			if( number < little )
				little = number;
		}
		
		System.out.printf( "Menor n�mero: %d%n", little );
	}
}
