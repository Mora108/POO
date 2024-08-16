public class GradeBookPro {
    public static void main(String[] args) {

        //Student[] students = new Student[3]; <- Se crea la lista

        // Forma 1: no tan eficiente
        //Student pedro = new Student(123,"Pedro Perez");
        //Student maria = new Student(456,"María Guzman");
        //Student ana = new Student(123,"Ana Román");
        //student[0] = pedro;
        //student[1] = maria;
        //student[2] = ana;


        //Forma 2: mejor pero algo largo
        //student[0] = new Student(123,"Pedro Perez");
        //student[1] = new Student(456,"María Guzman");
        //student[2] = new Student(123,"Ana Román");

        //Forma 3: En una sola linea creando la lista de una vez
        Student[] students = {new Student(123,"Pedro Perez"), 
            new Student(456,"María Guzman"), 
            new Student(123,"Ana Román")
        };

        students[0].setGrades(70, 80, 90, 95, 100);
        students[1].setGrades(100, 90, 100, 0, 95);
        students[2].setGrades(60, 70, 50, 0, 0);

        double sum = 0;
        double fg;
        for(Student s: students){
            fg = s.getFinalGrade();
            System.err.println(s.getName() + " - Promedio: " + fg);

            sum += fg;
        }

        double mean = (sum / students.length);

        System.out.println("\nPromedio General: " + mean);

    }
}
