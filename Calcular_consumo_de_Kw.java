
//Calcular la cantidad de Killowatts consumidos 
//Con la tarifa de febrero del 2022 

import javax.swing.JOptionPane;


public class Calcular_consumo_de_Kw {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null,"De 0 kw a 200 precio 5.55\nDe 201 kw a 300 precio 7.88\nDe 301 kw a 700 precio 11.46\nMayor  701 kw a  precio 11.68");
		
		
		Double Killowatts =   Double.parseDouble(JOptionPane.showInputDialog("Coloque la cantidad de Killowatts que consume"));
		
		
		double tarifa;
		double resultado;
		
		//Estas variables suman la cantidad maxima que puede llegar una tarifa hasta saltar a la tarifa que le sigue 
		double x =200*5.55;
		double y = 100* 7.88;
		double z = 400* 11.46;
		
		if (Killowatts<201) {
				tarifa = 5.55;
				resultado = Killowatts*tarifa;
				JOptionPane.showMessageDialog(null,"Usted paga " + resultado + " pesos");
		}
		
		else if (Killowatts >200 && Killowatts <301) {
					tarifa = 7.88;
					Killowatts = Killowatts - 200;
					//Se resta la cantidad que alcanzo con la tarifa anterior ya que, en el caso de 250, 200 se cobraran por 5.55 y 50 se cobraran por 7.88
					resultado =  (Killowatts *tarifa) + x ;
					JOptionPane.showMessageDialog(null,"Usted paga " + resultado + " pesos");			
		}			

		else if (Killowatts > 300 && Killowatts <701){
					tarifa = 11.46;
					Killowatts = Killowatts - 300;
					resultado = (Killowatts *tarifa) + x + y;
					JOptionPane.showMessageDialog(null,"Usted paga " + resultado + " pesos");					
		}
		else if (Killowatts>701) {
					tarifa =11.68;
					Killowatts = Killowatts -700;
					resultado = (Killowatts *tarifa) + x + y + z;
					JOptionPane.showMessageDialog(null,"Usted paga " + resultado + " pesos");	
		}
		
		
	}
}
