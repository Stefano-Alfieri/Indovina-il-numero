package org.generation.italy;

//import Scanner e Random
import java.util.Random;
import java.util.Scanner;
public class IndovinaIlNumeroGruppo1 {

	public static void main(String[] args) {
		//inserimento dati
		String risposta;
		int tentativi=0;
		int numeroRandom, numeroUtente;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		//numero random
		numeroRandom = r.nextInt(101);
		
		//ciclo nuova partita
		do {
		//inizio do while partita
			do {
			//richiesta numero
			System.out.println("inserisci un numero da 0 a 100:");
			numeroUtente = sc.nextInt();
			sc.nextLine();
			tentativi++;
			//verifica numero corretto
			if(numeroUtente<0||numeroUtente>100) {
				System.out.println("tentativo non valido, reinserire");
			//confronto numeri
			}else if (numeroUtente <numeroRandom) {
				System.out.print("Il numero selezionato è più piccolo del numero da indovinare ");
				System.out.println("Inserisci un altro numero");
			}else if (numeroUtente >numeroRandom) {
				System.out.print("Il numero selezionato è più grande del numero da indovinare ");
				System.out.println("Inserisci un altro numero");
			}
			
			//fine ciclo do While partita
		}while(numeroUtente != numeroRandom);
		//stampa numero corretto
		System.out.println("complimenti hai indovinato il numero in "+ tentativi+ " tentativi!");
		//azzeramento variabile tentativi
		tentativi=0;
		//richiesta nuova aprtita
		System.out.println("vuoi giocare ancora?");
		risposta=sc.nextLine();
		 if(risposta.equalsIgnoreCase("no")) {
			 System.out.println("grazie Arrivederci.");
		 }
		}while(risposta.equalsIgnoreCase("si")||risposta.equalsIgnoreCase("sì"));
		//fine ciclo nuova partita
		
	
	
	}// fine main
}//fine progetto
