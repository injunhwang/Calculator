
public class CalculatorTest {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		double a = cal.add(15, 10);
		System.out.println(a);

		a = cal.subtract(15, 10);
		System.out.println(a);

		a = cal.multiply(15, 10);
		System.out.println(a);

		a = cal.divide(15, 0);
		if(a == -1){
			System.out.println("ERROR");
		}else{
		System.out.println(a);
		}

		a = cal.remainder(15, 10);
		System.out.println(a);

		String s = cal.string();
		System.out.println(s);
		

		
	}

}
