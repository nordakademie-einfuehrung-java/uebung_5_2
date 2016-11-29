import java.util.Arrays;

public class ArraysSortieren {

	public static void main(String[] args) {

		int arrayGroesse = 10;

		while (arrayGroesse <= 100000000) {

			int[] array = Zufall.erzeugeIntArray(arrayGroesse);
			long startZeit = System.nanoTime();

			Arrays.sort(array);

			long bearbeitungszeit = System.nanoTime() - startZeit;

			System.out.println("Es hat " + (bearbeitungszeit * 0.000000001) + "s gedauert, um ein Array mit "
					+ arrayGroesse + " zu "
							+ "sortieren.");
			arrayGroesse = 10 * arrayGroesse;
		}
	}
}
