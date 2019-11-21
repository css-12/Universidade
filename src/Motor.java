
public class Motor extends Produto {
    
    private double potencia;
    private double rpm;
    
    public Motor(String c, String n, String d, double p, double pot, double rpm){
        super(c, n, d, p);
        this.setPotencia(pot);
        this.setRpm(rpm);
    }
    
    public double getPotencia(){
        return this.potencia;
    }
    public void setPotencia(double pot){
        this.potencia = pot;
    }
    
    public double getRpm(){
        return this.rpm;
    }
    public void setRpm(double rpm){
        this.rpm = rpm;
    }
    
    public double calcularPrecoFinal(){
        return this.getPreco() - (this.getPreco() * 0.05);
    }
    
    public String imprimirDados(){
        return ("Codigo: " + getCod() + " Nome: " + getNome() + " Descricao: " + getDescricao()
                + " Valor: " + getPreco() + " Potencia: " + getPotencia() + " RPM: " + getRpm());
    }
    
}
