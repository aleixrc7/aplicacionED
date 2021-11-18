public class Aplicacion {

    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + " : ");
        System.out.println(veredicto(args[1], args[1]));
    }

    // Esta es la rama master de Aleix Rodriguez Cayuelas alumno de ED

    private static String veredicto(String valor1, String valor2) {

        if (valor1.equals(valor2)) {
            return "Bien. Pero " + valor2 + " horas de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}
