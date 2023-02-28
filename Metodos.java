/*
 * @Autor: Juan Jose Solorzano Carrillo.
 * @Propose: This script was made to explain some Jave methods.	 
 */
package rangonumerico;

public class Metodos {
    //Variables para la clase 'Metodos'.
    private int x1;
    private int x2;
    private int i;
    private int j;
    
    public Metodos (){
    //Método constructor por defecto.
    //Variables.    
        x1=-15;
        x2=30;
        j=0;
        i=0;

     while(x1<0){x1=x1+1;i=i+1;}//Contador de números.
        System.out.println("El rango por defecto es: [-15,30]\n "+i+" números son negativos \n "
                          + (x2+1)+" números son positivos");
    }
    
    
    public Metodos(int x1){//Método constructor con un argumento de entrada.
        
        x2=30;
        j=0;
        i=0;
        
        if(x1<0){
        while(x1<0){x1=x1+1;i=i+1;}
        System.out.println("\n "+i+" números son negativos \n "
                           + (x2+1)+"   números son positivos");
        }
        
        if(x1>0){
            j=Math.abs(x1-x2);
            System.out.println("\n "+i+" números son negativos \n "
                           + (j)+" números son positivos");
        }
    } 
    
    public Metodos(int x1, int x2){//Método constructor con dos argumentos de entrada.
   
        j=0;
        i=0;
        
        if(x1<0 && x2>0){
        while(x1<0){x1=x1+1;i=i+1;}
        System.out.println("\n "+i+" números son negativos \n "
                           + (x2+1)+   " números son positivos");
        }
        
        if(x1>0 && x2>0){
            j=Math.abs(x1-x2);
            System.out.println("\n "+i+" números son negativos \n "
                           + (j)+" números son positivos");
        }
        
        if(x1<0 && x2<0){
        i=Math.abs(x1)-Math.abs(x2);
        System.out.println("\n "+i+" números son negativos \n "
                           + (j)+" números son positivos");
        }
    } 
    }
