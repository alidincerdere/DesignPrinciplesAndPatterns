package CreationalDesignPatterns.Factory;

/**
 * Created by adere on 1.07.2019.
 */
public class AlgorithmFactory {

    public static final int SHORTEST_PATH = 1;
    public static final int SPANNING_TREE = 2;

    public static Algorithm getAlgorithm(int type) {

        switch (type) {
            case SHORTEST_PATH:
                return new ShortestPath();
            case SPANNING_TREE:
                return new SpanningTree();

            default:
                return null;
        }

    }
}
