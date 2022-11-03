public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String from, to;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }
    
    public static void main(String[] args) throws Exception {

        // create an object of Graph class
        int noVertices = 14;
        int noEdges = 26;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].from = "Gavin";
        myGraph.edge[0].to = "Sean";


        // Edge 2
        myGraph.edge[1].from = "Gavin";
        myGraph.edge[1].to = "Ryu";

        // Edge 3
        myGraph.edge[2].from = "Gavin";
        myGraph.edge[2].to = "Paul";

        // Edge 4
        myGraph.edge[3].from = "Gavin";
        myGraph.edge[3].to = "Teo";
        
        // Edge 5
        myGraph.edge[4].from = "Gavin";
        myGraph.edge[4].to = "Joey";
        
        // Edge 6
        myGraph.edge[5].from = "Gavin";
        myGraph.edge[5].to = "Roi";
        
        // Edge 7
        myGraph.edge[6].from = "Gavin";      
        myGraph.edge[6].to = "AJ";
        
        // Edge 8
        myGraph.edge[7].from = "Gavin";
        myGraph.edge[7].to = "Carl";
        
        // Edge 9
        myGraph.edge[8].from = "Gavin";
        myGraph.edge[8].to = "Jerwin";
        
        // Edge 10
        myGraph.edge[9].from = "Gavin";
        myGraph.edge[9].to = "Manuel";

        // Edge 11
        myGraph.edge[10].from = "Sean";
        myGraph.edge[10].to = "Dave";
        
        // Edge 12
        myGraph.edge[11].from = "Sean";
        myGraph.edge[11].to = "Rey";
        
        // Edge 13
        myGraph.edge[12].from = "Ryu";
        myGraph.edge[12].to = "Dave";
        
        // Edge 14
        myGraph.edge[13].from = "Ryu";
        myGraph.edge[13].to = "Eric";
        
        // Edge 15
        myGraph.edge[14].from = "Ryu";
        myGraph.edge[14].to = "Paul";
        
        // Edge 16
        myGraph.edge[15].from = "Ryu";
        myGraph.edge[15].to = "Teo";
        
        // Edge 17
        myGraph.edge[16].from = "Dave";
        myGraph.edge[16].to = "Eric";
        
        // Edge 18
        myGraph.edge[17].from = "Paul";
        myGraph.edge[17].to = "JM";
        
        // Edge 19
        myGraph.edge[18].from = "Paul";
        myGraph.edge[18].to = "Teo";
        
        // Edge 20
        myGraph.edge[19].from = "Teo";
        myGraph.edge[19].to = "Joey";
        
        // Edge 21
        myGraph.edge[20].from = "Roi";
        myGraph.edge[20].to = "Manuel";
        
        // Edge 22
        myGraph.edge[21].from = "Manuel";
        myGraph.edge[21].to = "Carl";
        
        // Edge 23
        myGraph.edge[22].from = "Carl";
        myGraph.edge[22].to = "AJ";     
        
        // Edge 24
        myGraph.edge[23].from = "Carl";
        myGraph.edge[23].to = "Jerwin";
        
        // Edge 25
        myGraph.edge[24].from = "Carl";
        myGraph.edge[24].to = "Patrick";
        
        // Edge 26
        myGraph.edge[25].from = "Patrick";
        myGraph.edge[25].to = "Jerwin";
        
        
        System.out.println("Gavin Network of Friends");

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(i+1 + ") " + myGraph.edge[i].from + " - " + myGraph.edge[i].to);
        }

    }
}
