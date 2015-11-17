
public class Sortieren {

	public static void main(String[] args) {
		
		int[] array;
		int[] sortiert;
		
		array = Zufall.erzeugeIntArray(10);
		sortiert = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Sortiert: ");
		
		int z = 0;
		
		//in der Schleife würde auch i <= 1000000 reichen, da erzeugeIntArray max 999999 ausgibt
		
		for (int i = 0; i <= 2147483647; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == array[j]) {
					sortiert[z] = i;
					z++;
					break;
				}
			}
			if (z == 10) {
				break;
			}
		}
		
				
		for (int i = 0; i < 10; i++) {
			System.out.println(sortiert[i]);
		}


	}

}
