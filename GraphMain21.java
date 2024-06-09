import java.util.Scanner;

public class GraphMain21 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Graph21 gedung = new Graph21(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.print("Masukkan gedung asal: ");
        int asal5 = scanner.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan5 = scanner.nextInt();
        if (gedung.isAdjacent(asal5, tujuan5)) {
            System.out.println("Gedung " + (char)('A' + asal5) + " dan Gedung " + (char)('A' + tujuan5) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char)('A' + asal5) + " dan Gedung " + (char)('A' + tujuan5) + " tidak bertetangga");
        }
        System.out.println("");

        GraphMatriks21 gdg = new GraphMatriks21(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
    }
}
