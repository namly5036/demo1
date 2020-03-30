package demo1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Demo {
	public static void main(String[] args) {
		System.out.println(round1(1205.6358, 2));
		System.out.println(round1(1205.6358, 2));
		System.out.println(round1(1205.6358, 2));
	}

	public static double round1(double a, int scale) {//1, 2, 3, 4, 5
		String scale10Str = "1";
		for (int i = 0; i < scale; i++) {
			scale10Str += "0";//1.23
		}
		double scale10 = Double.parseDouble(scale10Str.toString());
		double result = Math.round(a * scale10) /scale10;
		return result;
	}

	public static double round2(double a, int scale) {
		return BigDecimal.valueOf(a).setScale(scale, RoundingMode.HALF_UP).doubleValue();
	}
	
	public static double round3(double a, int scale) {
		String format = "0.";
		for (int i = 0; i < scale; i++) {
			format += "0";//1.23
		}
		DecimalFormat df = new DecimalFormat(format);
		return Double.parseDouble(df.format(a));
	}
	
	public static double round4(double a) {
		return 0;
	}
	
	public static double round5(double a) {
		return 0;
	}
}
