import java.util.logging.Logger;

public class Calculator {
    public static  final Logger LOGGER = Logger.getLogger(Calculator.class.getName());
    public Complexnumber sum( Complexnumber a,Complexnumber b){
        LOGGER.info("Выполняем операцию сложения комплексных чисел: ");
        Complexnumber result =  a.sum(b);
        LOGGER.info("Результат"+ result);
        return result;
    }
    public Complexnumber multiply(Complexnumber a, Complexnumber b){
        LOGGER.info("Выполняем операцию умножения комплексных чисел:");
        Complexnumber result =  a.multiply(b);
        LOGGER.info("Результат"+ result);
        return result;
    }
    public Complexnumber devided(Complexnumber a, Complexnumber b){
        LOGGER.info("Выполняем операцию деления комплексных чисел: ");
        Complexnumber result =  a.devided(b);
        LOGGER.info("Результат"+ result);
        return result;
    }
}
