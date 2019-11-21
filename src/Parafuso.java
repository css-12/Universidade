
public class Parafuso extends Produto{
    
    private double comprimento;
    private double diametro;
    
    public Parafuso(String c, String n, String d, double p, double com, double dia){
        super(c, n, d, p);
        this.setComprimento(com);
        this.setDiametro(dia);
    }
    
    public double getComprimento(){
        return this.comprimento;
    }
    public void setComprimento(double com){
        this.comprimento = com;
    }
    
    public double getDiametro(){
        return this.diametro;
    }
    public void setDiametro(double dia){
        this.diametro = dia;
    }
    
    public double calcularPrecoFinal(){
        return this.getPreco() + (this.getPreco() * 0.15);
    }
    
    public String imprimirDados(){
        return ("Codigo: " + getCod() + " Nome: " + getNome() + " Descricao: " + getDescricao()
                + " Valor: " + getPreco() + " Comprimento: " + getComprimento() + " Diametro: " + getDiametro());
    }
    
}
