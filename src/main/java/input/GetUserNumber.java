package input;
import java.util.Objects;
import java.util.Scanner;

public class GetUserNumber {
    private Scanner in = new Scanner(System.in);
    private Integer integer;
    public GetUserNumber(){
        setInteger();
    }
    private void setInteger(){
        System.out.println("Please enter your number - ");
        this.integer = in.nextInt();
        in.close();

    }

    public Integer getInteger() {
        return integer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetUserNumber)) return false;
        GetUserNumber that = (GetUserNumber) o;
        return Objects.equals(integer, that.integer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer);
    }
}