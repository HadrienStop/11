public class DivideBysubtractTricky implements DivideAlgorithm{

    private int operationCount;
    private int result;
    private int multiple;

    @Override
    public int run(int numerator, int denominator) {
        result = 0;
        operationCount = 0;
        multiple = 1;
        while (numerator >= denominator){
            numerator = numerator - multiple * denominator;
            result += multiple;
            multiple++;
            operationCount++;
        }
        return result;
    }

    @Override
    public int getOperationCount() {
        return operationCount;
    }
}
