import java.util.*;
public class calculadora{
  public static void main(String[] args) {
    clearScreen();
    titulo();
    esperar();
    menuPrincipal();
  }
  public static void menuPrincipal(){
    clearScreen();
    System.out.print("Bienvenido a la Calculadora\n\nMENU PRINCIPAL\n\n1. Calculadora\n2. Extension de calculadora\n0. Salir\n\n(Elige la opcion deseada escribiendo en la consola el numero indicado)\n\n>");
    int eleccion = teclado.nextInt();
    switch(eleccion){
      case 1:
        calculadoraMenu();
        break;
      case 2:
        extensionMenu();
        break;
      case 0:
        System.exit(0);
        break;
      default:
        System.out.print("Introduce un numero valido");
        esperar();
        menuPrincipal();
    }

  }//Fin main 
  static Scanner teclado = new Scanner(System.in);
  static float x = 0;
  static float y = 0;
  static int resultado = 0;
  static boolean repetir = true;

  public static void clearScreen()
  {
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }
  
  static void introduccionNumeros1()
  {
        System.out.print("Introduce el primer numero\n\n>");
        x = teclado.nextInt();
        System.out.print("Introduce el segundo numero\n\n>");
        y = teclado.nextInt();
  }
  
  static void introduccionNumeros2()
  {
        System.out.print("Introduce la base del logaritmo\n\n>");
        x = teclado.nextInt();
        System.out.print("Introduce el numero\n\n>");
        y = teclado.nextInt();
  }
  public static void calculadoraMenu()
  {
    while(repetir==true)
    {
      x = 0;
      y = 0;
      clearScreen();
      System.out.println("MENU CALCULADORA\n\n1. Sumar");
      System.out.println("2. Restar");
      System.out.println("3. Multiplicar");
      System.out.println("4. Dividir");
      System.out.println("5. Potencias");
      System.out.println("6. Raices");
      System.out.println("7. Logaritmos");
      System.out.print("0. Atras\n\n>");
      int elegir = teclado.nextInt();
    
      switch(elegir)
      {
        //SUMA
        case 1:
          introduccionNumeros1();
          System.out.println();
          System.out.println("\nResultado:");
          System.out.println(x+y); 
          System.out.println(); 
          break; 
        //RESTA
        case 2:
          introduccionNumeros1();
          System.out.println();
          System.out.println("\nResultado:");
          System.out.println(x-y);
          System.out.println();
          break;
        //MULTIPLICACIoN
        case 3:
          introduccionNumeros1();
          System.out.println();
          System.out.println("\nResultado:");
          System.out.println(x*y);
          System.out.println();
          break;
        //DIVISIoN
        case 4:
          introduccionNumeros1();
          System.out.println();
          System.out.println("\nResultado:");
          System.out.println(x/y);
          System.out.println();
          break;
        //POTENCIAS
        case 5:
          introduccionNumeros1();
          System.out.println();
          System.out.println("\nResultado:");
          System.out.println(Math.pow(x,y));
          System.out.println();
          break;
        //RAICES
        case 6:
          introduccionNumeros1();
          System.out.println();
          System.out.println("\nResultado:");
          System.out.println((Math.round(Math.pow(x,1/y))*10000)/10000);
          System.out.println();
          break;
        //LOGARITMOS
        case 7:
          introduccionNumeros2();
          System.out.println();
          System.out.println("\nResultado");
          System.out.println((Math.log10(y))/(Math.log10(x)));
          System.out.println();
          break;
        //SALIDA
        case 0:
          menuPrincipal();
          break;
        default:
          System.out.print("Introduce un numero valido");
          esperar();
          calculadoraMenu();
      }
      if(elegir != 0)
      {
        try
        {
            Thread.sleep(2500);
        }catch(InterruptedException e){}
      }
      
    }
  }
  public static void esperar(){
            try
        {
            Thread.sleep(2500);
        }catch(InterruptedException e){}
  }
  public static int factorizar()
  {
    int n = 0;
    String espacio = " ";
    int iaux = 0;
    System.out.print("\nIntroduce el numero que desea factorizar\n\n>");
    n = teclado.nextInt();
    int l = n;
    System.out.print("\n");
    String espacioauxiliar = "   ";
    String espaciofinal= "   ";
    int naux = n;
    for (int i= 2 ; i<=n;)
    {
      int numdig = 0;
      int numdig2 = 0;
      if (n % i == 0)
      {
        for (int j = n; j > 0; j = j / 10)
        {
          numdig++;
        }//Fin for
        System.out.println (espaciofinal + n+" | "+i);
        n = n / i;
        for (int k = n; k > 0; k = k / 10)
        {
          numdig2++;
        }//fin for
        while (numdig > numdig2)
        {
          espaciofinal = espaciofinal + espacio;
          numdig--;
        }//fin if
      }//fin if
      if (n % i != 0)
      {
        i++;
      }
      iaux = i;
    }//fin for
    if (n == iaux)
    {
      System.out.println (espaciofinal + iaux+" | " +iaux);}
    int numdig = 0;
    for (int j = naux; j > 0 ; j = j / 10)
    {
      numdig++;
    }//fin for
    while (numdig > 1)
    {
      espacioauxiliar = espacioauxiliar + espacio;
      numdig--;
    }//fin while
    System.out.println (espacioauxiliar + 1+" | " +1 + "\n");
    System.out.print("Factorizacion de ");
    return l;
  }//fin factorizar
  
/*=========================================================================================================================================================*/
/* MINIMO COMÚN MÚLTIPLO                                                                                                                                   */       
/*=========================================================================================================================================================*/
  
  public static int mcm ()
  {
    int a = 0;
    int b = 0;
    int aux = 2;
    int resultado = 1;
    System.out.println("\nIntroduce el primer numero:\n");
    a=teclado.nextInt();
    System.out.println("\nIntroduce el segundo numero:\n");
    b=teclado.nextInt();
    while(aux <= a || aux <= b)
    {
      if(a % aux == 0 || b % aux == 0)
      {
        resultado = resultado * aux;
        if(a % aux == 0) a = a / aux;
        if(b % aux == 0) b = b / aux;
      }
      else
        aux = aux + 1;               
    }                        
    return resultado;                                          
  }//fin obtener_mcm
/*=========================================================================================================================================================*/
/* MAXIMO COMUN DIVISOR                                                                                                                                                */       
/*=========================================================================================================================================================*/
  
  public static int mcd (int a, int b) {
    if(b==0)
    {
      return a;
    }//fin if
    else
    {
      return mcd(b, a % b);
    }//fin else
  }//fin mcd
  
/*=========================================================================================================================================================*/
/* MENU                                                                                                                                                    */       
/*=========================================================================================================================================================*/
  
  public static void extensionMenu()
  {
    boolean repetir = true;
      clearScreen();
      System.out.print("MENU EXTENSION\n\n1.Factorizar \n2.Maximo comun divisor \n3.Minimo comun multiplo\n0.Atras\n\n>");
      switch(teclado.nextInt())
      {
        case 1:
          System.out.print(factorizar() + "\n\nIntroduce cualquier digito para continuar\n\n>");
          teclado.next();
          extensionMenu();
          break;
        case 2:
          System.out.print("\nIntroduce el primer numero:\n\n>");
          int a = teclado.nextInt();
          System.out.print("\nIntroduce el segundo numero:\n\n>");
          int b = teclado.nextInt();
          System.out.println("\nSolucion: " +mcd(a, b));
          esperar();
          extensionMenu();
          break;
        case 3:
          System.out.println("\nSolucion: " + mcm());
          esperar();
          extensionMenu();
          break;
        case 0:
          menuPrincipal();
          break;
        default:
          System.out.println("\nIntroduce un numero valido\n\n");
          esperar();
          extensionMenu();
      }//fin switch
  }//fin extensionMenu
  public static void titulo(){
    System.out.print("    .d8888b.           888                   888               888                          \n   d88P  Y88b          888                   888               888                          \n   888    888          888                   888               888                          \n   888         8888b.  888  .d8888b 888  888 888  8888b.   .d88888  .d88b.  888d888 8888b.  \n   888             88b 888 d88P     888  888 888      88b d88  888 d88  88b 888P        88b \n   888    888 .d888888 888 888      888  888 888 .d888888 888  888 888  888 888    .d888888 \n   Y88b  d88P 888  888 888 Y88b.    Y88b 888 888 888  888 Y88b 888 Y88..88P 888    888  888 \n     Y8888P    Y888888 888   Y8888P   Y88888 888  Y888888   Y88888   Y88P   888     Y888888 \n\n\n\n\n\n\n\n\n");
  }//Fin titulo
}//Fin class