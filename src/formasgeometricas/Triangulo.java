
package formasgeometricas;

public class Triangulo extends Poligono {

    private double lado;
    private double altura;
    
    
    @Override
    public double calculaArea() {
        return (this.lado * this.altura) / 2;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Esta forma é um Triângulo.");
        System.out.println("Ela possui " + this.getQuantidadeLados() + " lados.");
        System.out.println("O seu tamanho é: " + this.lado + " e sua altura: " + this.altura);
        System.out.println("A sua área total é de: " + this.calculaArea());
    }

    public double getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
