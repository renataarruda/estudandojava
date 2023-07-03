public abstract class FiguraGeometrica {
    private double base;
    private double altura;

    public FiguraGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}




