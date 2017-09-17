import java.util.Scanner;
/**
 * matrix multiplication
 * @version 0.1
 * @author riya verma
 * @since 2/08/17
 * @see <a href="https://www.gmail.com">click here</a>
 */
public class MatrixMultiplication {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int row=sc.nextInt();
		int mat[][]=new int[row][row];
		int a[][]=new int[row][row];
		int b[][]=new int[row][row];
		System.out.println("Enter elements of matrix A:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of matrix B:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				for(int k=0;k<row;k++)
				{
					mat[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("matrix after multipication:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
