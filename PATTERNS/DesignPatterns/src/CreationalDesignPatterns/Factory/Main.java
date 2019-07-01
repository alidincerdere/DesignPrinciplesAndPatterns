package CreationalDesignPatterns.Factory;

/**
 * Created by adere on 1.07.2019.
 */
public class Main {

    public static void main(String [] args) {

        Algorithm algorithm = AlgorithmFactory.getAlgorithm(AlgorithmFactory.SPANNING_TREE);

        algorithm.solve();
    }
}
