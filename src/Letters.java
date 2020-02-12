import java.math.BigInteger;

public class Letters {
    public static void main(String[] args) {
        BigInteger wis = new BigInteger("5726398");
        BigInteger cal = new BigInteger("38041430");
        BigInteger texas = new BigInteger("26059203");
        BigInteger letterCal = wis.multiply(cal);
        BigInteger copyTexas = letterCal.multiply(texas);
        BigInteger exagMoney = new BigInteger("323000");
        BigInteger cost = copyTexas.multiply(exagMoney);
        BigInteger divide = new BigInteger("100000");
        BigInteger actualCost = cost.divide(divide);

        System.out.println("California: " + letterCal);
        System.out.println("Texas: " + copyTexas);
        System.out.println("$" + actualCost);
    }
}
