package calculator;

public class Calculadora {
	
	public int SomaInteiros(int a, int b) {
		return a + b;
	}
	
	public int subtraInteiros(int a, int b) {
        return a - b;
    }
	
	public int multiplicaInteiros(int a, int b) {
        return a * b;
    }
	
	public int dividiInteiros(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Impossível dividir por zero");
        }
        return a / b;
    }
	

}
