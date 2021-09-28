public class DivideBySubtract implements DivideAlgorithm {
    private int operationCount;
    private int result;

    @Override
    public int run(int numerator, int denominator) {
        result = 0;
        operationCount = 0;
        while (numerator >= denominator){
            numerator = numerator - denominator;
            result += 1;
            operationCount++;
        }
        return result;
    }

    @Override
    public int getOperationCount() {
        return operationCount;
    }
}

