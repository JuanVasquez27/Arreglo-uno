
import java.util.Scanner;

public class Alumno {

 
    public static void main(String[] args) 
    {
        int Num = 0;
        Scanner OBJ = new Scanner(System.in);        
        int Mayor = -123;
        int pos=0;
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Introduzca la nota del estudiante "+(i+1)+":");
            Num = OBJ.nextInt();  
            if (Num >= Mayor)
            {
              Mayor = Num;
              pos = i+1;
            }
        }
        System.out.println("---------------");
        System.out.println("La nota mayor es: " + Mayor);
        System.out.println("En la posicion " + pos);
            
              
    }
}