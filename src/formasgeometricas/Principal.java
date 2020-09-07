package formasgeometricas;

import java.util.Scanner;

public class Principal {
    
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        
        Triangulo t = new Triangulo();
        t.setQuantidadeLados(3);
        Retangulo r = new Retangulo();
        r.setQuantidadeLados(4);
        
        System.out.println("Qual a altura do triângulo?");
        t.setAltura(scan.nextInt());
        System.out.println("Informe a medida da base do triângulo");
        t.setLado(scan.nextInt());
        t.imprimir();
        System.out.println("\n");
        
        System.out.println("Qual a altura do retângulo?");
        r.setAltura(scan.nextInt());
        System.out.println("Qual o comprimento do retângulo");
        r.setLado(scan.nextInt());
        r.imprimir();
     
    }
    
}
