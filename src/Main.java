// Interfaz EstrategiaAceleracion
interface EstrategiaAceleracion {
    void acelerar();
}

// Clase concreta para acelerar un auto
class AutoAceleracion implements EstrategiaAceleracion {
    @Override
    public void acelerar() {
        System.out.println("El auto está acelerando...");
    }
}

// Clase concreta para acelerar una motocicleta
class MotocicletaAceleracion implements EstrategiaAceleracion {
    @Override
    public void acelerar() {
        System.out.println("La motocicleta está acelerando...");
    }
}

// Clase Vehiculo
class Vehiculo {
    private EstrategiaAceleracion estrategiaAceleracion;

    public Vehiculo(EstrategiaAceleracion estrategiaAceleracion) {
        this.estrategiaAceleracion = estrategiaAceleracion;
    }

    public void acelerar() {
        estrategiaAceleracion.acelerar();
    }
}

// Clase principal Main
public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo(new AutoAceleracion());
        Vehiculo motocicleta = new Vehiculo(new MotocicletaAceleracion());

        auto.acelerar();
        motocicleta.acelerar();
    }
}