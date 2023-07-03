public class TrianguloRetangulo extends FiguraGeometrica{
    public TrianguloRetangulo(double base, double altura) {
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

    public double calcula_area_trianguloRetangulo(){
        return (this.getBase() * this.getAltura()) / 2;
    }

    public String mostraResultado(){
        return "O resultado é: " + calcula_area_trianguloRetangulo();
    }
}
