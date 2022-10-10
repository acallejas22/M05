
/*
 * Program.java        20.10.2020
 *
 * Program to calculate the area and the perimeter
 * of a circle knowing the radius in meter.
 *
 * Copyright 2020 Joan Sèculi <jseculi@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package principal;
import java.util.Scanner;

public class Input {

    static Scanner input = new Scanner (System.in);


  public static void main(String[] args) 
  {

    Scanner input = new Scanner(System.in);
    System.out.print  ("ingresa el radio del circulo: ");
    float r = input.nextFloat();
    //float n1 = Integer.parseInt(input.nextFloat());

   
    double pi=(float)3.14159265;
    double sqrt=(float)r*r;
    

    double area = (float)(pi*sqrt);

    double perimetro = (float)(2*pi*r);

  

    
   
    System.out.println("El area del circulo es " + area); 
    System.out.println("El perimetro del circulo es " + perimetro);
    
  }

}
.gitignore
