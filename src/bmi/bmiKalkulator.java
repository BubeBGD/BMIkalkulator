package bmi;

import java.text.DecimalFormat;

public class bmiKalkulator {

	public double bmi(double tezina, double visina) {

		double r = tezina / ((visina / 100) * (visina / 100));

		return r;
	}

	public String ispisi(double r) {

		DecimalFormat d = new DecimalFormat("#.##");
		String r1 = d.format(r);

		if (r <= 18.5) {
			return "Vaš bmi je nizak i iznosi: " + r1;
		}
		if (r > 18.5 && r <= 24.9) {
			return "Vaš bmi je idealan i iznosi: " + r1;
		}
		if (r > 24.9 && r <= 29.9) {
			return "Vaš bmi je visok i iznosi: " + r1;
		}
		if (r > 29.9) {
			return "Vaš bmi je nizak i iznosi: " + r1;
		} else {
			return " ";
		}
	}

}
