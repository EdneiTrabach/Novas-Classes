public class Car {

    // ENCAPSULAMENTO
    private String marca;
    private String modelo;
    private int ano;
    private int valor;

    // COSTRUCTOR
    Car(String marca, String modelo, int ano, int valor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public double valorVenda(){
        double valorFinal = (valor * 0.1) + valor;
        return valorFinal;
    }
    // GETTER
    public String getMarca (){
        return marca;
    }
    public String getModelo (){
        return modelo;
    }
    public int getAno (){
        return ano;
    }
    public int getValor (){
        return valor;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
}
