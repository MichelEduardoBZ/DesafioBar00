package Bar;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Bill;

public class ConsumptionBar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Bill person[] = new Bill[10];
		
		System.out.print("1 - 10 | Quantas pessoas gostaria de calcular? ");
		String personTotal = entrada.nextLine();
		int personTotalValidated = Integer.parseInt(personTotal);
		
		//Apresentação
		
		for(int i = 0; i < personTotalValidated; i++) {
			
			person[i] = new Bill();
			
			System.out.println("--- Status ---");
			
			System.out.print("Informe seu sexo: ");
			String gender = entrada.nextLine();
			
			System.out.print("Quantidade de cervejas: ");
			String beer = entrada.nextLine();
			
			System.out.print("Quantidade de refrigerantes: ");
			String softDrink = entrada.nextLine();
			
			System.out.print("Quantidade de espetinhos: ");
			String barbecue = entrada.nextLine();
			
		//Conversão
			
			person[i].setGender(gender);
			
			int beerValidated = Integer.parseInt(beer);
			person[i].setBeer(beerValidated);
			
			int softDrinkValidated = Integer.parseInt(softDrink);
			person[i].setSoftDrink(softDrinkValidated);
			
			int barbecueValidated = Integer.parseInt(barbecue);
			person[i].setBarbecue(barbecueValidated);
			
			
		//Apresentação
			
			System.out.println();
			System.out.println("-------- RELATÓRIO --------");
			
			System.out.println("Consumo = R$ " + person[i].feeding());
			
			if(person[i].cover() > 30) {
				System.out.println("Isento de Couvert");
			} else {
				System.out.println("Couvert = R$ " + person[i].cover());
			}
			
			System.out.println("Ingresso = R$" + person[i].ticket());
			System.out.println();
			System.out.println("Valor a pagar = R$ " + person[i].total());
			System.out.println("----------------------------");
			System.out.println();
		}	
		
		
	}
}
