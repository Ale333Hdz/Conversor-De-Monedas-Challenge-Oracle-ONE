package principal;

import javax.swing.JOptionPane;

import conversorDeMonedas.TestConversor;
import conversorDeTemperatura.TestTemperatura;

public class Principal {
	public static void main(String[] args) {
		TestConversor monedas = new TestConversor();
		TestTemperatura temperatura = new TestTemperatura();
		
		boolean program = true;
		while(program) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
		
		switch(opciones) {
		case "Conversor de Moneda":
			String entrada = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir: ");
			if(ValidarNumero(entrada)) {
				double Nentrada = Double.parseDouble(entrada);
				monedas.ConversionDeMonedas(Nentrada);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Seleccione Ok");
				}else {
					program = false;
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
				}else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}	
				break;
				
		   case "Conversor de Temperatura":
        	 entrada = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que desee convertir ");
             if(ValidarNumero(entrada) == true) {
                 double Minput = Double.parseDouble(entrada);
                 temperatura.ConversorTemperatura(Minput);

                 int respuesta = 0;
                 respuesta = JOptionPane.showConfirmDialog(null, "¿Continuar?");
                 if((respuesta == 0) && (ValidarNumero(entrada) == true)) { 
                 } else {
                     JOptionPane.showMessageDialog(null, "Programa Finalizado");                     
                 }

             } else {
                 JOptionPane.showMessageDialog(null, "Valor inválido");                
             }
             break;
        }  
	}
			
  }
	
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}

	


