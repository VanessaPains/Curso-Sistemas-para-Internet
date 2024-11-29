public class Adicao1 {

    //aqui os meodos tem nomes diferentes
    //ja no o outro arquivo Sobrecarga2
    //eles teram o mesmo nome
    //mas o que ira diferencia-los são os tipos int ou float
    //presta + atenção
    
    public static int addInt(int a, int b){
        int soma = a + b;
        return soma;
    }

    public static float addFloat(float c, float d){
        float soma = c + d;
        return soma;
    }

    public String exibeInt(int a, int b, int c){
        return "Soma: "+a+"+"+b+" = "+c;
    }

    public String exibeFloat(float a, float b, float c){
        return "Soma: "+a+"+"+b+" = "+c;
    }
}
