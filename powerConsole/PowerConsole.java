package powerConsole;
import powerConsole.Colors.Colors;
//la libreria esegue tutto tramite i codici di escape ANSI, ogni funzione o costante per funzionare deve essere richiamata in un System.out.print().

public class PowerConsole {
	public static final String ESC = "\033";
	public static final String CLEAR = ESC + "[H" + ESC + "[2J";	//codice utilizzato per cancellare la console.
	public static final String HIGHLIGHTED_TEXT = ESC + "[107;30m";	//codice utilizzato per evidenziare un testo con colori default.
	public static final String RESET_COLOR = ESC + "[0m";			//codice utilizzato per riportare i colori della console al loro valore di default.
	
	public static String setColor(Colors.forCol color0, Colors.backCol color1) {	//funzione utilizzata per impostare manualmente dei colori nella console.
		return ESC+"["+color0.color+";"+color1.color+"m";	
	}
	
	public static String setCursorPosition(int x, int y) {	//funzione utilizzata per portare il puntatore della console a coordinate x e y.
		//n = y, m = x
		return ESC+"["+Integer.toString(y+1)+";"+Integer.toString(x+1)+"H";
	}
	
	public static Integer intTryParse(String string) {	//funzione che emula l'int.TryParse di c#.
		try {
			return Integer.parseInt(string);
		}
		catch(NumberFormatException e) {
			return null;
		}
	}
}