
public class TestaProfessores {
    
    public static void main(String[] args){
        
        RegimeIntegral r1 = new RegimeIntegral("Noah", 4000);
        
        Horista h1 = new Horista("Any", 100);
        
        System.out.println("Salário Liquido do professor de Regime Integral: " + r1.calcularSalarioLiquido());
        System.out.println("Salário Líquido do professor Horista " + h1.calcularSalarioLiquido());
        
    }
    
}
