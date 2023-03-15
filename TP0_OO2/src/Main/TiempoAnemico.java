package Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TiempoAnemico {
	public LocalDate horario;


	public TiempoAnemico() {
		this.horario = LocalDate.now(); //LocalDate.now() <--- Para la fecha actual
	}


}
