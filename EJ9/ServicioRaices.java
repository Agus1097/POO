package EJ9;

public class ServicioRaices {
    
    double discriminante;
    double raiz1;
    double raiz2;
    
    public double getDiscriminante(Raices raices) {
        return discriminante = Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();
    }
    
    public boolean tieneRaices(Raices raices) {
        if (this.getDiscriminante(raices) > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean tieneRaiz(Raices raices) {
        if (this.getDiscriminante(raices) == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void obtenerRaices(Raices raices) {
        System.out.println("La raiz 1 es = " + (-raices.getB() + Math.sqrt(discriminante)));
        System.out.println("La raiz 1 es = " + (-raices.getB() - Math.sqrt(discriminante)));
    }
    
    public void obtenerRaiz(Raices raices) {
        System.out.println("La raiz es = " + (-raices.getB()));
    }
    
    public void calcular(Raices raices) {
        if (this.tieneRaices(raices) == true) {
            this.obtenerRaices(raices);
        } else if (this.tieneRaiz(raices) == true) {
            this.obtenerRaiz(raices);
        } else {
            System.out.println("El discriminante es menor a cero por lo tanto no hay solucion");
        }
    }
    
}
