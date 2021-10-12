package training;

public class PatternPrint {

	public static void main(String args[]) {

		for (int i = 1; i <= 5; i++) {
			if(i==1||i==2||i==3){
			System.out.print("*\t");
			}
			else {
				System.out.print("**\t");
			}
			
			for (int j = 1; j <= i; j++) {

				System.out.print(j);

			}
			if(i==1||i==2||i==3){
				System.out.print("\t*");
				}
				else {
					System.out.print("\t**");
				}
			System.out.println();
		}
	}

}
