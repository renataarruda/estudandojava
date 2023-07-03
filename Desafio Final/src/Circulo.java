public class Circulo  {
    private double raio;
    public Circulo(double raio){

        this.setRaio(raio);
    }
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcula_raio(){
        return 3.14 * Math.pow(this.getRaio(), 2);
    }
    public String mostraResultado(){

        return "O resultado é: " + calcula_raio();
    }
}
