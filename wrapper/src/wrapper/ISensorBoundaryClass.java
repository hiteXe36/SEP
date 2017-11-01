package wrapper;

public class ISensorBoundaryClass {

	/**
	 * Konvertiert einen diskreten Wert zwischen 0 und 255 und berechnet die entsprechende Entfernung in cm
	 * anhand der gegebenen Formel.
	 * 
	 * @param d Diskreter Wert
	 * @return Entfernung in CM
	 */
	public int wertUmwandlungCM(char d)
	{
		return (int) ((60/Math.PI)*(Math.acos(1-((d+5)/265.0))));
	}
}
