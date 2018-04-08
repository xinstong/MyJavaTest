import java.util.*;

public class MyTestArray {
	
	public static void main(String[] args)
	{
		int[] a = new int[10];
		
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		for (int i : a)
		{
			System.out.print(i);
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < 10; i++)
		{
			a[i] = i;
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println();
		for (int i : a)
		{
			System.out.print(i);
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println(Arrays.toString(new int[] {1, 2, 3}));
	}
}
