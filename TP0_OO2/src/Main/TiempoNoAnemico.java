package Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TiempoNoAnemico {
	public LocalDate horario;

	public TiempoNoAnemico() {
		this.horario = LocalDate.now(); //LocalDate.now() <--- Para la fecha actual
	}

	public void formatoTextoLargo () {
		//Formato de texto largo (Lunes 3 de Abril de 2020) <-- Asi se deberia ver
		String horarioNuevo = horario.format(DateTimeFormatter .ofLocalizedDate(FormatStyle.FULL));
		System.out.println("Formato Largo: " + horarioNuevo);
	}
	
	public void formatoCorto () {
		 //Formato corto de la fecha (03/04/2020) <-- Asi se deberia ver
		String horarioNuevo = horario.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)); 
		System.out.println("Formato Corto: " + horarioNuevo); 
	}
}
