package Operations;

/**
 *
 * @author dntn
 */
public class Addition implements Arithmetic{

    @Override
    public void execute(int firstNumber, int secondNumber) {        
        System.out.println(firstNumber + secondNumber);
    }

    @Override
    public String getType() {
        return "Suma";
    }
    
}
