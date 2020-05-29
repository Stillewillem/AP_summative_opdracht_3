package Dijkstra;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // Graph opzetten
        comparable.Node nodeA = new comparable.Node("A"), nodeB = new comparable.Node("B"), nodeC = new comparable.Node("C"),
                nodeD = new comparable.Node("D"), nodeE = new comparable.Node("E"), nodeF = new comparable.Node("F");
        nodeA.setVariables(List.of(nodeB, nodeC), new Vlucht().getWeight(List.of(10, 15)));
        nodeB.setVariables(List.of(nodeE, nodeD), new Rit().getWeight(List.of(15, 12)));
        nodeC.setVariables(List.of(nodeF), new Treinrit().getWeight(List.of(10)));
        nodeD.setVariables(List.of(nodeE, nodeF), new Rit().getWeight(List.of(1, 2)));
        nodeE.setVariables(List.of(nodeF), new Vlucht().getWeight(List.of(5)));

        // Dijkstra starten
        Reis reis = new Reis();
        reis.dijkstra(nodeA, nodeF);
    }
}
