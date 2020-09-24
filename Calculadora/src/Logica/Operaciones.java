/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.util.*;
/**
 *
 * @author HP
 */

public class Operaciones {
    Scanner leer=new Scanner (System.in);
    int a,b,r;
    
    public int suma() {
    
    
        System.out.println("ingresa el primer numero---> ");
        a=leer.nextInt();
        System.out.println("ingresa el segundo numero---> ");
        b=leer.nextInt();
        r=a+b;
        System.out.println("El resultado es ---> "+ r);
        return r;
    }
    public int resta() {
    
        
        System.out.println("ingresa el primer numero---> ");
        a=leer.nextInt();
        System.out.println("ingresa el segundo numero---> ");
        b=leer.nextInt();
        r=a-b;
        System.out.println("El resultado es ---> "+ r);
        return r;
    }
    public int multiplicacion() {
    
        
        System.out.println("ingresa el primer numero---> ");
        a=leer.nextInt();
        System.out.println("ingresa el segundo numero---> ");
        b=leer.nextInt();
        r=a*b;
        System.out.println("El resultado es ---> "+ r);
        return r;
    }
    public int divicion() {
    
        System.out.println("ingresa el primer numero (divisor) ---> ");
        a=leer.nextInt();
        System.out.println("ingresa el segundo numero (dividedo)---> ");
        b=leer.nextInt();
        r=a/b;
        System.out.println("El resultado es ---> "+ r);
        return r;
    }
    
    
}

