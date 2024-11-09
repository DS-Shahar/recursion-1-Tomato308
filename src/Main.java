package recoursions;

public class Main 
{
	public static void main (String[]args) 
	{
		System.out.println(sum(10));
		System.out.println(mult(4));
		System.out.println(multUneven(7));
		System.out.println(countDigit(8978687));
		System.out.println(divPlusMinus(9, 3));
		System.out.println(divPlusMinus(60, 12));
		System.out.println(divPlusMinusFix(60, 13));
		System.out.println(isItDouble(30, 5));
		System.out.println(isPrime(29, 2));
		System.out.println(evenOrUneven(4192000, 4192000));
	}
	
	
	public static int sum(int n) 
	{
		if (n==1)
		{
			return 1;
		}
		return sum(n-1)+n;
	}
	
	public static int mult(int n)
	{
		if (n==1)
		{
			return 1;
		}
		return mult(n-1)*n;
	}
	
	public static int multUneven(int n) 
	{
		if (n==1)
		{
			return 1;
		}
		if (n%2 != 0)
		{
			return multUneven(n-1)*n;
		}
		else
			return multUneven(n-1);
	}
	
	public static int countDigit(int n)
	{
		if (n/10 == 0)
		{
			return 1;
		}
		n = n/10;
		return countDigit(n)+1;
	}
	
	public static int divPlusMinus(int n, int m)
	{
		if (m == 0)
		{
			return -1;
		}
		if (n<m)
		{
			return 0;
		}
		return divPlusMinus(n-m,m)+1;
	}
	
	public static int divPlusMinusFix(int n, int m)
	{
		if (m == 0) 
		{
			return -1;
		}
		if (n<m) // 3%12 = 3
		{
			return n;
		}
		return divPlusMinusFix(n-m,m);
	}
	
	public static boolean isItDouble(int x, int y)
	{
		if(x == 0)
		{
			return true;
		}
		if (x<y)
		{
			return false;
		}
		return isItDouble(x-y , y);
	}
	
	public static boolean isPrime(int n, int x)
	{
		if (n == 1)
		{
			return true;
		}
		if (n == 0)
		{
			return false;
		}
		if (x == n)
		{
			return true;
		}
		if (n%x == 0)
		{
			return false;
		} 
		return isPrime(n, x+1);
	}
	
	public static boolean evenOrUneven(int n, int x)
	{
		if (x%2 != (x/10)%2)
		{
			return false;
		}
		if ( x == 0)
		{
			return true;
		}
		return evenOrUneven(n, x/10);
	}
}
