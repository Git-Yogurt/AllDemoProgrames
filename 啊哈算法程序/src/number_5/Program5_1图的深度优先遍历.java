package number_5;
/*
 * Test instance
 * input:
5 5
1 2
1 3
1 5
2 4
3 5
 * output:
1 2 3 5 4 
 */
import java.util.Scanner;

public class Program5_1图的深度优先遍历 {
	private static Scanner sc;
	private static int n,m,sum=0;
	private static int[][] e;
	private static int[] book;
	private static final int MAX=Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		n=sc.nextInt();//顶点数
		m=sc.nextInt();//边数
		book=new int[n+1];
		e=new int[n+1][n+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j) e[i][j]=0;
				else e[i][j]=MAX;
			}
			book[i]=0;
		}
		for(int i=1;i<=m;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			e[a][b]=1;
			e[b][a]=1;
		}
		book[1]=1;
		dfs(1);
		
	}
	private static void dfs(int currentNode) {
		// TODO Auto-generated method stub
		System.out.print(currentNode+" ");
		sum++;
		if(sum==n) return;
		for(int i=1;i<=n;i++){
			if(e[currentNode][i]==1&&book[i]==0){
				book[i]=1;
				dfs(i);
			}
		}
	}
}
