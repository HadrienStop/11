public class DivideByPowerOfTwo implements DivideAlgorithm{
    private int operationsCount;



    @Override
    public int run(int numerator, int denominator) {
        int result = 0;
        int multiple = 1;
        while(2*multiple*denominator <= numerator){
            multiple = multiple * 2;
        }

        while(multiple >= 1){
            if(numerator >= multiple * denominator){
                result += multiple;
                numerator -= multiple * denominator;
            }
            multiple = multiple/2;
        }
        return result;
    }

    @Override
    public int getOperationCount() {
        return operationsCount;
    }
}
