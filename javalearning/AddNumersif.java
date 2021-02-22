package webtesting;


public class AddNumersif {
	public static void main(String[] args) {
		if (args[0].contains(".") || args[1].contains(".")) {
			double paramDouble = Double.parseDouble(args[0]);
			double paramDouble1 = Double.parseDouble(args[1]);
			float sumfl = (float) (paramDouble + paramDouble1);
			System.out.print(sumfl);
		} else {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int sumint = a +b;
			System.out.print(sumint);
		}
	}
}
