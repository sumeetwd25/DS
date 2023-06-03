package graph;

import java.util.Scanner;

public class Graph {
	private int size;
	private char v[];
	private int e[][];
	
	public Graph() {
		size = 3;
		v = new char[size];
		e = new int[size][size];
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public char[] getV() {
		return v;
	}

	public void setV(char[] v) {
		this.v = v;
	}

	public int[][] getE() {
		return e;
	}

	public void setE(int[][] e) {
		this.e = e;
	}

	public void init() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter vertices names:");
		for(int i=0;i<size;i++) {
			v[i] = sc.next().charAt(0);
		}
		int arr[]= {0,1,1,1,0,1,1,1,0};
		int k=0;
		for(int i=0;i<v.length;i++) {
			for(int j=0;j<v.length;j++) {
				e[i][j]=arr[k++];
			}
		}
	}
	
	public void printMatrix() {
		System.out.println("\nAdjacency matrix:");
		for(int i=0;i<v.length;i++) {
			System.out.print("\t"+v[i]);
		}
		System.out.println();
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]);
			for(int j=0;j<v.length;j++) {
				System.out.print("\t"+e[i][j]);
			}
			System.out.println();
		}
	}
	
	public void bft(int start) {
		System.out.println("\nBFT:");
		
		boolean visited[]= new boolean[size];
		int que[] = new int[10];
		int f=-1,r=-1;
		
		que[++r]=start;
		f=0;
		
		while(f<=r) {
			int t = que[f++];
			if(visited[t]==false) {
				System.out.print(v[t]+"\t");
				visited[t]=true;
			}
			for(int i=0;i<size;i++) {
				if(visited[i]==false && e[t][i]==1) {
					que[++r]=i;
				}
			}
		}
	}
	
	public void dft(int start) {
		System.out.println("\nDFT:");
		
		boolean visited[] = new boolean[size];
		int stk[] = new int[10];
		int top=-1;
		stk[++top]=start;
		
		while(top>-1) {
			int t=stk[top--];
			if(visited[t]==false) {
				System.out.print(v[t]+"\t");
				visited[t]=true;
			}
			for(int i=size-1;i>=0;i--) {
				if(visited[i]==false && e[t][i]==1) {
					stk[++top]=i;
				}
			}
		}
	}
}
