public class HolaMundo {
	public static  void main (String args []){
		if (args.length == 0){
		System.out.print("Hola mundo!");
		}//Fin if
		else {
			System.out.print("Hola ");
			for (int i = 0; i < args.length; i++)
				System.out.print(args[i] + " ");
		}//Fin for
		System.out.print("!");
	}//Fin main
}//Fin class