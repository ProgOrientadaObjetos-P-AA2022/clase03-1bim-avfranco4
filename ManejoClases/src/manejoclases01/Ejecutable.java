package manejoclases01;

public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        Hospital hosp = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "10 de Agosto";
        hospital.numeroCamas = 300;
        hospital.presupuesto = 870680.69;
        
        hosp.nombre = "Rio Napo";
        hosp.numeroCamas = 500;
        hosp.presupuesto = 789852.45;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto, hosp.numHabitaciones);
        
        System.out.printf("Presentando nuevo objeto");
        System.out.println("");
        System.out.printf("%s - %d - %.2f\n", hosp.nombre,
                hosp.numeroCamas, hosp.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
