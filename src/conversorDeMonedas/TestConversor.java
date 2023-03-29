package conversorDeMonedas;

import javax.swing.JOptionPane;

public class TestConversor {

	ConversionDeMonedas monedas = new ConversionDeMonedas();
	
	ConversionDeMonedasAPesosM pesos = new ConversionDeMonedasAPesosM();
	
	public void ConversionDeMonedas(double Nentrada) {
		
	String opcion = (JOptionPane.showInputDialog(null, "Elige la moneda a la que desees convertir tu dinero",
			"Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos Mexicanos a Dólar","De Pesos Mexicanos a Euros",
					"De Pesos Mexicanos a Libras","De Pesos Mexicanos a Yen","De Pesos Mexicanos a Won","De Dólar a Pesos Mexicanos", "De Euro a Pesos Mexicanos", "De Libras a Pesos Mexicanos","De Yen a Pesos Mexicanos","De Won Coreano a Pesos Mexicanos"}, "Selección")).toString();

		switch(opcion) {
		case "De Pesos Mexicanos a Dólar":
			monedas.ConvertirPesosMexicanosADolares(Nentrada);
			break;
		case "De Pesos Mexicanos a Euros":
			monedas.ConvertirPesosMexicanosAEuros(Nentrada);
			break;
		case "De Pesos Mexicanos a Libras":
			monedas.ConvertirPesosMexicanosALibras(Nentrada);
			break;
		case "De Pesos Mexicanos a Yen":
			monedas.ConvertirPesosMexicanosAYenes(Nentrada);
			break;
		case "De Pesos Mexicanos a Won":
			monedas.ConvertirPesosMexicanosAWones(Nentrada);
			break;
		case "De Dólar a Pesos Mexicanos":
        	pesos.ConvertirDolaresAPesosMexicanos(Nentrada);
        	break;
        case "De Euro a Pesos Mexicanos":
        	pesos.ConvertirEurosAPesosMexicanos(Nentrada);
        	break;
        case "De Libras a Pesos Mexicanos":
        	pesos.ConvertirLibrasAPesosMexicanos(Nentrada);
        	break;
        case "De Yen a Pesos Mexicanos":
        	pesos.ConvertirYenesAPesosMexicanos(Nentrada);
        	break;
        case "De Won Coreano a Pesos Mexicanos":
            pesos.ConvertirWonesAPesosMexicanos(Nentrada);
            break;
				
			
		}
    }
}
