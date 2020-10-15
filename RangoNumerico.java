/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangonumerico;
import java.util.*;


public class RangoNumerico {


    public static void main(String[] args) {
    //Asignación de objetos en memoria.
        Metodos objMet0;
        Metodos objMet1;
        Metodos objMet2;
        Scanner In = new Scanner (System.in);
        int res,res2,res3; //Variables para el menú.

    //Menú de opciones.
        do{
        System.out.println("¿Cuántos digítos desea ingresar?\n Opciones: 0, 1 o 2.");
        res=In.nextInt();
        }while(res!=0&&res!=1&&res!=2);
        
        if(res==0)
            objMet0=new Metodos();//Se llama al método constructor por defecto.
        
        if(res==1){
            do{
            System.out.println("Rango [x1,30]\nIngrese el dato númerico x1, diferente de 0");
            res2=In.nextInt();
            }while(res2==0);
            objMet1=new Metodos(res2);//Se llama al método constructor que contiene un argumento de entrada.
        }
        
        if(res==2){
            do{
            System.out.println("Rango [x1,x2]\nIngrese el dato númerico x1, diferente de 0");
            res2=In.nextInt();
            }while(res2==0);
            do{
            System.out.println("Rango [x1,x2]\nIngrese el dato númerico x2, diferente de 0");
            res3=In.nextInt();
            }while(res2==0);
            objMet2=new Metodos(res2,res3);//Se llama al método constructor que contiene dos argumentos de entrada.
        }

    }
}


