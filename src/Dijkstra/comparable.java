package Dijkstra;

import java.util.List;

public interface comparable {
    class Node implements Comparable<Node>{

        String name;
        List<Node> nextNode;
        List<Integer> weight;
        Node node = null;
        int cost = 0;

        public Node(String name){
            this.name = name;
        }

        public void setVariables(List<Node> nextNode, List<Integer> weight) {
            this.nextNode = nextNode;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o){
            return Integer.compare(cost, o.cost);
        }
    }
}