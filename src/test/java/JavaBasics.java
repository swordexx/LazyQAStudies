import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaBasics {
    private String text = "Sum is: ";

    @Test
    public void firstTest() {
        Integer a = 15;
        Integer b = 99;

        Integer c = 95;
        Integer d = 150;

        sumAndPrint(a,b);
        sumAndPrint(c,d);

        Assertions.assertEquals(245,c+d,"wrong sum!!!");
    }
    private void sumAndPrint(Integer a, Integer b){
        Integer sum = a + b;
        System.out.println(text + sum);

    }
}
