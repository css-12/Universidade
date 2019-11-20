
public class RegimeIntegral extends Professor {
    
    private double salarioFixo;
    
    public RegimeIntegral(String n, double f){
        super(n);
        this.setSalarioFixo(f);
    }
    
    public double getSalarioFixo(){
        return this.salarioFixo;
    }
    public void setSalarioFixo(double f){
        this.salarioFixo = f;
    }
    
    public double calcularSalarioLiquido(){
        return this.getSalarioFixo() - (this.getSalarioFixo() * 0.11);
    }
    
}
