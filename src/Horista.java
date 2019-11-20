
public class Horista extends Professor {
    
    private double salario;
    
    public Horista(String n, double s){
        super(n);
        this.setSalario(s);
    }
    
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double s){
        this.salario = s;
    }
    
    public double calcularSalarioLiquido(){
        return this.getSalario() - (this.getSalario() * 0.05);
    }
    
}
