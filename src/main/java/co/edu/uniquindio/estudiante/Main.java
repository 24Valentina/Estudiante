package co.edu.uniquindio.estudiante;

public class Main {
    public static int ganaronCurso= 0;
    public static int perdieronCurso= 0;
    public static int CantidadEstudiantesNotaMayor4= 0;


    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Juan");
        estudiante1.setEdad(17);
        estudiante1.setCorreo("juan@mail.com");
        estudiante1.setSemestre(3);
        estudiante1.setNota1(3.0);
        estudiante1.setNota2(3.5);
        estudiante1.setNota3(4.5);

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Maria");
        estudiante2.setEdad(15);
        estudiante2.setCorreo("pepita@mail.com");
        estudiante2.setSemestre(1);
        estudiante2.setNota1(2.0);
        estudiante2.setNota2(2.5);
        estudiante2.setNota3(4.5);

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Pepe");
        estudiante3.setEdad(20);
        estudiante3.setCorreo("pepe@mail.com");
        estudiante3.setSemestre(4);
        estudiante3.setNota1(4.0);
        estudiante3.setNota2(2.5);
        estudiante3.setNota3(4.5);

        double definitivaEstudiante1= calcularDefinitivaEstudiante(estudiante1.getNota1(), estudiante1.getNota2(),
                estudiante1.getNota3());

        double definitivaEstudiante2= calcularDefinitivaEstudiante(estudiante2.getNota1(), estudiante2.getNota2(),
                estudiante2.getNota3());

        double definitivaEstudiante3= calcularDefinitivaEstudiante(estudiante3.getNota1(), estudiante3.getNota2(),
                estudiante3.getNota3());

        System.out.println("La nota definitiva del estudiante "+ estudiante1.getNombre()+" es: "+ definitivaEstudiante1);
        System.out.println("La nota definitiva del estudiante "+ estudiante2.getNombre()+" es: "+ definitivaEstudiante2);
        System.out.println("La nota definitiva del estudiante "+ estudiante3.getNombre()+" es: "+ definitivaEstudiante3);


        System.out.println(aprobacionCurso(definitivaEstudiante1, estudiante1.getNombre()));
        System.out.println(aprobacionCurso(definitivaEstudiante2, estudiante2.getNombre()));
        System.out.println(aprobacionCurso(definitivaEstudiante3, estudiante3.getNombre()));

        calcularPorcentajeGanaronCurso(ganaronCurso);
        calcularPorcentajePerdieronCurso(perdieronCurso);
        obtenerEstudianteNotaMayor4(estudiante1.getNombre(), estudiante1.getNota1(), estudiante1.getNota2(), estudiante1
                .getNota3());
        obtenerEstudianteNotaMayor4(estudiante2.getNombre(), estudiante2.getNota1(), estudiante2.getNota2(), estudiante2
                .getNota3());
        obtenerEstudianteNotaMayor4(estudiante3.getNombre(), estudiante3.getNota1(), estudiante3.getNota2(), estudiante3
                .getNota3());
        cantidadEstudiantesNotasMayor4();
    }
    public static double calcularDefinitivaEstudiante(double nota1, double nota2, double nota3){

        double notaDefinitiva = (nota1+nota2+nota3)/3;
        return notaDefinitiva;

    }
    public static String aprobacionCurso(double defEstudiante, String nombreEstudiante){

        if (defEstudiante >=3.0){
            ganaronCurso= ganaronCurso +1;
            return "El estudinte "+ nombreEstudiante + " Aprobo el curso ";

        }else {
            perdieronCurso=perdieronCurso +1;
            return "El estudinte "+ nombreEstudiante + " No aprobo el curso ";

        }
    }
     public static double calcularPorcentajeGanaronCurso(int ganaronCurso){
        double porcentajeGanaronCurso= (ganaronCurso*100)/3;
         System.out.println("El porcentaje de estudiantes que ganaron el curso es: "+ porcentajeGanaronCurso +"%");
        return porcentajeGanaronCurso;


     }
    public static double calcularPorcentajePerdieronCurso(int perdieronCurso){
        double porcentajeperdieronCurso= (perdieronCurso*100)/3;
        System.out.println("El porcentaje de estudiantes que perdieron el curso es: "+ porcentajeperdieronCurso +"%");
        return porcentajeperdieronCurso;


    }

    public static String obtenerEstudianteNotaMayor4(String nombre, double nota1,double nota2, double nota3){
        if (nota1 >=4 && nota2 >=4 && nota3 >=4){
            CantidadEstudiantesNotaMayor4 = CantidadEstudiantesNotaMayor4+1;
            System.out.println( "El estudiante "+nombre +"tiene todas las notas mayores o iguales a 4");
            return "El estudiante "+nombre +"tiene todas las notas mayores o iguales a 4";

        }
       return null;

    }
    public static String cantidadEstudiantesNotasMayor4(){
        if (CantidadEstudiantesNotaMayor4 == 0){
            System.out.println("No se encontro estudiante con notas mayor o igual a 4");
            return "No se encontro estudiante con notas mayor o igual a 4";
        }
        System.out.println("hay " + CantidadEstudiantesNotaMayor4 +" con notas mayor o igual a 4");
        return "hay " + CantidadEstudiantesNotaMayor4 +" con notas mayor o igual a 4";
    }
    }