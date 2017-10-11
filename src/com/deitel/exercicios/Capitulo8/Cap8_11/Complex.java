package Cap8_11;


import java.lang.Math;

public class Complex
{
	private double a; // n�mero real
	private double b; // n�mero imaginario
	private double c; // n�mero real
	private double d; // n�mero imaginario
	
	private double parteReal;
	private double parteImaginaria;
	
	private final double i = Math.sqrt( -1 );
	
	// contructors
	public Complex()
	{
		this( 0, 0, 0, 0 );
	}
	
	public Complex( double a, double b, double c, double d )
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public void sumeTwoNumbers()
	{
		parteReal = a + c;
		parteImaginaria = b + d;
	}
	
	public void subtractionTwoNumbers()
	{
		parteReal = a - c;
		parteImaginaria = b - d;
	}
	
	public String toString()
	{
		return String.format( "%3.1f%9.1fi%n", parteReal, parteImaginaria );
	}
}
