package Operations;

/**
 *
 * @author dntn
 */
public class Division implements Arithmetic {

    @Override
    public void execute(int firstNumber, int secondNumber) {     
        double resultado = firstNumber / secondNumber;        
        System.out.println(String.valueOf(resultado));
    }

    @Override
    public String getType() {
        return "Division";
    }

}
