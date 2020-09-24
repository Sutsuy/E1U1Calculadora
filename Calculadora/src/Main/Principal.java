/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Logica.Operaciones;
import java.util.*;

/**
 *
 * @author HP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        
     int c;
          do{
        int opc;
        
        System.out.println("---MENU-------");
        System.out.println("1.- suma ");
        System.out.println("2.- resta ");
        System.out.println("3.- multiplicacion  ");
        System.out.println("4.- divicion ");
        System.out.println("5.- SALIR ");
        System.out.println("Elige una opcion---->  ");
        opc=leer.nextInt();
        
    
        switch(opc)
        {
         
        
            case 1:
            {
               Operaciones instancia=new Operaciones();
               instancia.suma();
               
            break;
            
            }
            
            case 2:
            {
                Operaciones instancia=new Operaciones();
                instancia.resta();
                break;
                
            }
            
            case 3:
            {
                Operaciones instancia=new Operaciones();
                instancia.multiplicacion();
                break;
                
            }
            
            
            case 4:
            {
               Operaciones instancia=new Operaciones();
               instancia.divicion();
               break;
            }
            
            case 5:
            {
                System.out.println("bay nene");
                break;
                
            }
        
            
            
            default:
            {
                System.out.println("Lo siento opcion invalida :c ");
                break; 
            }
        
        }
         
        System.out.println("Quieres hacer otra cosa \n1)si \n2)no");
            c=leer.nextInt();
               
     
     
    }
    while(c==1);

        
    }}  
        
    
        
    
    
   
    
      
        
        
      
           
           
             
        
    

        
         
         
    
      
        
     
        
     
            
     
             
    
         

        
        
        
    
        
    
    
   
    
      
        
        
      
           
           
             
        
    

        
         
         
    
      
        
     
        
     
            
     
             
    
         

