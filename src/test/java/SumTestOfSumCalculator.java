import mycalculator.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SumTestOfSumCalculator {
    List<SumCalculator> sums;
    @BeforeEach
    public void beforeEachMethod(){
        sums = List.of(new SumCalculator());
    }

    @Test
    void getResult_ShouldOne() {
        //Given
        Integer n = 1;
        //When
        Integer actual = sums.get(0).sum(n);
        //Then
        Assertions.assertEquals(1, actual);
    }

    @Test
    void getResult_ShouldSix() {
        //Given
        Integer n = 3;
        //When
        Integer actual = sums.get(0).sum(n);
        //Then
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void getResult_ShouldNull(){
        //Then
        Assertions.assertThrows(IllegalArgumentException.class, ()->sums.get(0).sum(0));
    }
}
