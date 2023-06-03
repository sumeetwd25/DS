package graph;

public class TesterGraph {
	public static void main(String[] args) {
		Graph g=new Graph();
		g.init();
		g.printMatrix();
		g.bft(0);
		g.dft(0);
	}
}
