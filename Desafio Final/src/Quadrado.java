public class Quadrado extends FiguraGeometrica{
    public Quadrado(double base, double altura) {
        super(base, altura);
    }
    @Override
    public double getBase() {
        return super.getBase();
    }

    @Override
    public void setBase(int base) {
        super.setBase(base);
    }

    @Override
    public double getAltura() {
        return super.getAltura();
    }

    @Override
    public void setAltura(int altura) {
        super.setAltura(altura);
    }
    public double calcula_area_quadrado(){
        return this.getBase() * this.getAltura();
    }
    public String mostraResultado(){
        return "O resultado é: " + calcula_area_quadrado();
    }
}

