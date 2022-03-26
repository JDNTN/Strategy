package Operations;

/**
 *
 * @author dntn
 */
public class Subtraction implements Arithmetic{

    @Override
    public void execute(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }            

    @Override
    public String getType() {
        return "Resta";
    }
}
