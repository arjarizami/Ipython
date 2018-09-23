/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author Arkai Ariza
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Ingrese el numero Fibonacci deseado: ");
        
        int fib = 0;
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("0");
        
        while(c.compareTo(BigInteger.ZERO) >= 0 )
        {
            /*a=BigInteger.ZERO;
            b=BigInteger.ONE;
            c=BigInteger.ZERO;
            */
            System.out.println("fib " + fib);
            
            c = a.add(b);
            a = b;
            b = c;
                
            
            //System.out.println("c " + c);
            fib++;
        }
        
        System.out.println("El numero Fibonacci deseado es: " + c);
    }
}

//short overflows at Fibonacci 24
//int overflows at Fibonacci 47
//long overflows at Fibonacci 93
//BigInteger overflows acording to the available memory