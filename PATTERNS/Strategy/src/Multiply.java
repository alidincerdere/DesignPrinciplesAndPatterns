/**
 * Created by adere on 19.06.2019.
 */
public class Multiply implements Strategy {

    @Override
    public void operation(int num1, int num2) {
        System.out.println(num1 * num2);
    }
}
