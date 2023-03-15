package Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main1 {

	public static void main(String[] args) {
		
		TiempoAnemico tanemico = new TiempoAnemico ();
		TiempoRecord tiempoRecord = new TiempoRecord();
		TiempoNoAnemico tnoAnemico = new TiempoNoAnemico();
		
		//Formato No Anemico
		tnoAnemico.formatoCorto();
		tnoAnemico.formatoTextoLargo();
		
		//Formato Anemico
		String tiempo = tanemico.horario.format(DateTimeFormatter .ofLocalizedDate(FormatStyle.FULL));
		System.out.println(tiempo);
		
		tiempo = tanemico.horario.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)); 
		System.out.println(tiempo);
		
		//Formato con Record
		String tiempo1 = tiempoRecord.horario.format(DateTimeFormatter .ofLocalizedDate(FormatStyle.FULL));
		System.out.println(tiempo1);
		
		tiempo1 = tiempoRecord.horario.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)); 
		System.out.println(tiempo1);
	}

}
