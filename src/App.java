import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
         * Una empresa paga comisión según el monto vendido:
         * Menos de $1,000 → 5% de comisión
         * Entre $1,000 y $4,999 → 8% de comisión
         * Entre $5,000 y $9,999 → 12% de comisión
         * $10,000 o más → 15% de comisión,
         * más un bono de $200 si el vendedor lleva más de 5 años en la empresa
         * 
         * Pide el monto vendido y los años de antigüedad,
         * y calcula el pago total (comisión + bono si aplica).
         */

        // Declarar variables
        double monto;
        double comision;
        int año;
        final int bono = 200;

        // ingresar los datos pedidos
        System.out.println("Ingrese el monto total");
        monto = entrada.nextDouble();
        System.out.println("Ingrese los años que tienes");
        año = entrada.nextInt();

        // validar segun el porcentaje requerido
        if (monto < 1000) {
            comision = monto * 0.05;
            System.out.println("Su comision total es de " + comision);
        } else if (monto >= 1000 && monto <= 4999) {
            comision = monto * 0.08;
            System.out.println("Su comision total es de " + comision);
        } else if (monto >= 5000 && monto <= 9999) {
            comision = monto * 0.12;
            System.out.println("Su comision total es de " + comision);
        } else {
            comision = monto * 0.15;

            if (año > 5) {
                comision += bono;
            }

            System.out.println("Su comision total es de " + comision);
        }
        entrada.close();
    }
}
