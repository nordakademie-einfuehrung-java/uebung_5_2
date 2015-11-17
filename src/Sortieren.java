
public class Sortieren {

	public static void main(String[] args) {
		
		long time = System.nanoTime();
		
		int[] array;
		int[] sortiert;
		
		array = Zufall.erzeugeIntArray(10000);
		sortiert = new int[10000];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Sortiert: ");
		
		int z = 0;
		
		//in der Schleife würde auch i <= 1000000 reichen, da erzeugeIntArray max 999999 ausgibt
		
		for (int i = 0; i <= 2000000; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == array[j]) {
					sortiert[z] = i;
					z++;
				}
			}
			if (z == array.length) {
				break;
			}
		}
		
				
		for (int i = 0; i < array.length; i++) {
			System.out.println(sortiert[i]);
		}
		
		System.out.println("Zeit: " + ((System.nanoTime() - time) / 10E8) + "s");
		
		//Vergleich zu integriertem Sortieralgorithmus
		
		long time2 = System.nanoTime();
		
		java.util.Arrays.sort(array);

				
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Zeit: " + ((System.nanoTime() - time2) / 10E8) + "s");
		
		

	}

}
