package conversorDeMonedas;

import javax.swing.JOptionPane;

public class ConversionDeMonedasAPesosM {
	
	public void ConvertirDolaresAPesosMexicanos(double valor) {
		double monedaDolar = valor * 18.81;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Es igual a $" + monedaDolar + " Pesos Mexicanos");
	}
	
	public void ConvertirEurosAPesosMexicanos(double valor) {
		double monedaEuro = valor * 20.17;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Es igual a $" + monedaEuro + " Pesos Mexicanos");
	}
	
	public void ConvertirLibrasAPesosMexicanos(double valor) {
		double monedaLibras = valor * 23.10;
		monedaLibras = (double) Math.round(monedaLibras * 100d)/100;
		JOptionPane.showMessageDialog(null, "Es igual a $" + monedaLibras + " Pesos Mexicanos");
	}
	
	public void ConvertirYenesAPesosMexicanos(double valor) {
		double monedaYen = valor * 0.14;
		monedaYen = (double) Math.round(monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Es igual a $" + monedaYen + " Pesos Mexicanos");
	}
	
	public void ConvertirWonesAPesosMexicanos(double valor) {
		double monedaWon = valor * 0.014;
		monedaWon = (double) Math.round(monedaWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Es igual a $" + monedaWon + " Pesos Mexicanos");
	}
}
