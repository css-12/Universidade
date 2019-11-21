
public class TestaProduto {
    
    public static void main(String[] args){
        
        Motor m1 = new Motor("001", "Universal", "Para carro", 100, 100, 10);
        Parafuso p1 =new Parafuso("005", "Rosca", "abc", 10, 7, 5);
        
        System.out.println(m1.imprimirDados());
        System.out.println(m1.calcularPrecoFinal());
        
        System.out.println(p1.imprimirDados());
        System.out.println(p1.calcularPrecoFinal());
    }
    
}
