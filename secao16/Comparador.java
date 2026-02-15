package secao16;

public class Comparador<T extends Number> {
    
    public T obterMaior(T num1, T num2) {
        
        if (num1.doubleValue() > num2.doubleValue()) {
            return num1;
        } else {
            return num2;
        }
    }
}
