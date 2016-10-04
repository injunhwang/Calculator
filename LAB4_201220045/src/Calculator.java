
public class Calculator {

	public double add(double x, double y) {
		return x + y;
	}

	public double subtract(double x, double y) {
		return x - y;
	}

	public double multiply(double x, double y) {
		return x * y;
	}

	public double divide(double x, double y) {
		if (y != 0) {
			return x / y;
		} else {
			return -1;
		}

	}
	
	public double remainder(double x, double y){
		return x % y;
	}

	public String string() {
		return "ChanghyukIm_201120218, InjunHwang_201220045, SungkwonSon_201323152\nhttps://github.com/injunhwang/Calculator ";
	}
}
