package mycalculator;

public class SumCalculator {
    public Integer sum(Integer number) throws IllegalArgumentException{
        if (number == 0){
            throw new IllegalArgumentException("The sum of null is 0. Please use numbers bigger then 0.");
        }
        Integer integer = number;
        if(number == 1){
            return integer;
        }
        integer = integer + sum(number-1);
        return integer;
    }
}
