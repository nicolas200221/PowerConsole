package powerConsole.Colors;

/* ex:
	public... enum forCol{
		Black("30");
		[colore --> Black] [("30") <-- codice colore[*]]
		public... String color; <-- oggetto con il quale si richiamerà il codice del colore.
		private... forCol(String colorCode [*]){
			this.color = colorCode; color diverra' colorCode, il codice che identifica i colori.
		}
	}
*/


//classe contente i colori disponibili per le funzione di PowerConsole.
public class Colors {
	
	//colori di foreground.
	public static enum forCol {
		Black("30"),
		Red("31"),
		Green("32"),
		Yellow("33"),
		Blue("34"),
		Magenta("35"),
		Cyan("36"),
		White("37"),
		Gray("90"),
		LightRed("91"),
		LightGreen("92"),
		LightYellow("93"),
		LightBlue("94"),
		LightMagenta("95"),
		LightCyan("96"),
		LightWhite("97");
		
		public final String color;
		private forCol(String colorCode) {
			this.color = colorCode;
		}
	}
	
	//colori di background.
	public static enum backCol {
		Black("40"),
		Red("41"),
		Green("42"),
		Yellow("43"),
		Blue("44"),
		Magenta("45"),
		Cyan("46"),
		White("47"),
		Gray("100"),
		LightRed("101"),
		LightGreen("102"),
		LightYellow("103"),
		LightBlue("104"),
		LightMagenta("105"),
		LightCyan("106"),
		LightWhite("107");
		
		public final String color;
		private backCol(String colorCode) {
			this.color = colorCode;
		}
	}
}

