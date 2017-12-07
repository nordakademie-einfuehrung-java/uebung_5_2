


public class Arrayssortieren {
	public static void main(String[] args) {
		
int min;
		
		int array [] = Zufall.erzeugeIntArray(10);
		for (int i : array){
			System.out.println(i);
		}
		for (int index = 0; index < array.length; index++){
			
				
			for (int i = 0; i < array.length; i++){
				if (array[i]>array[index]){
					min = array[index];
					
					array[index] = array[i];
					array[i] = min;
					
				}
			}
		}
		System.out.println();
		for (int i : array){
			System.out.println(i);
		}
		
		
	}
}
