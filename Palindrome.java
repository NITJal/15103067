import java.util.*;
public class Palindrome {
	public static void main(String args[])
	{
		String s=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string ");
		s=sc.nextLine();
		int l=0;
		int r=s.length()-1;
		int flag=0;
		while(l<r)
		{
			if(s.charAt(l)!=s.charAt(r))
			{
				flag=1;
				break;
			}
			else
			{
				l++;
				r--;
			}
		}
		if(flag==0)
			System.out.println("Palindrome ;)");
		else
			System.out.println("Not a Palindrome ;(");
	}
}
