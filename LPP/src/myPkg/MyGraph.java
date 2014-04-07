package myPkg;

import java.util.ArrayList;
import java.util.Random;

public class MyGraph {
	public static final int GRAPH_SIZE = 10;

	public static final int MAX_VALUE = 1000;
	
	private ArrayList<Vertex> graph;
	int [][] tab;
	private Random random;

	public void printGraph(ArrayList<Vertex> graph) {
		for(int i=0; i<graph.size(); i++){
			System.out.println(i + ".");
			System.out.println(graph.get(i).toString());
		}
	}

	public void makeGraph() {
		random = new Random();
		tab = new int[GRAPH_SIZE][GRAPH_SIZE];
		for(int i=0;i<tab.length;i++)
			for(int j=i;j<tab[i].length;j++){
				if(i != j)
					tab[i][j] = rand();
			}
		graph = new ArrayList<>();
		for(int i=0;i<GRAPH_SIZE;i++)
			graph.add(new Vertex(tab, i));
	}
	
	//A pozatym rand mógłby zamiast tylko połączenia zwracać od razu jego wartość
	private int rand() {
		int r = random.nextInt(100);
		return r>50 ? r : 0;
	}

	public void makeGraph(int size){
		random = new Random();
		tab = new int[size][size];
		for(int i=0;i<tab.length;i++)
			for(int j=i;j<tab[i].length;j++){
				if(i != j)
					tab[i][j] = rand();
			}
		graph = new ArrayList<>();
		for(int i=0;i<size;i++)
			graph.add(new Vertex(tab,i));
	}

	public ArrayList<Vertex> getGraph() {
		return graph;
	}

	public void setGraph(ArrayList<Vertex> graph) {
		this.graph = graph;
	}
	
	

}
