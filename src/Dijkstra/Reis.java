package Dijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Reis{

    PriorityQueue<comparable.Node> pq;

    public Reis(){
        this.pq = new PriorityQueue<>();
    }

    public void dijkstra(comparable.Node begin, comparable.Node end){
        pq.add(begin);
        comparable.Node node = pq.peek();

        while (node != end) {
            assert node != null;
            for (comparable.Node sNode: node.nextNode) {
                if (sNode.cost != 0){
                    if (sNode.cost > (node.weight.get(node.nextNode.indexOf(sNode)) + node.cost)) {
                        pq.remove(sNode);
                        sNode.node = node;
                        sNode.cost = node.weight.get(node.nextNode.indexOf(sNode)) + node.cost;
                        pq.add(sNode);
                    }
                }
                else {
                    sNode.node = node;
                    sNode.cost = node.weight.get(node.nextNode.indexOf(sNode)) + node.cost;
                    pq.add(sNode);
                }
            }
            pq.remove(node);
            node = pq.peek();
        }

        List<String> path = new ArrayList<>();
        while (node != null) {
            path.add(0, node.name);
            node = node.node;
        }

        assert end != null;
        System.out.println(end.cost + "\nVia: " + path);
    }

}