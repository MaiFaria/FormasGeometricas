
package formasgeometricas;


public abstract class Poligono {

    private double quantidadeLados;
    
    public abstract void imprimir();
        
    public abstract double calculaArea();

    public double getQuantidadeLados() {
        return quantidadeLados;
    }
    
    public void setQuantidadeLados(int quantidadeLados) {
        this.quantidadeLados = quantidadeLados;
    }
}
