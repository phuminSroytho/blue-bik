import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> inputs = List.of(0, 3, 6, 2, 1, 5, 8, 7, 9);
        int sumInput = 0;
        int result = 0;

        for (Integer input : inputs) {
            sumInput += input;
        }

        result = arithmeticSeries(inputs.size()) - sumInput;
        System.out.println("one element randomly replaced by 0 is : " + result);

    }

    public static Integer arithmeticSeries(Integer size) {
        return (int) ((Double.valueOf(size) / 2) * (1 + size));
    }
}