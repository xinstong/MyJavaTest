import java.util.*;
import java.math.*;

public class MyBigDataTest {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		
		BigInteger bi = BigInteger.valueOf(1);
		for (int i = 1; i < k; i++)
		{
			bi = bi.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("result = " + bi);
	}
}
