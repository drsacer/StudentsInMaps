import java.util.*;

public class ConsoleTestStudents {

    static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args)  {

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();

        boolean izlaz = false;
        while (!izlaz) {
            System.out.println("a) upis novog studenta");
            System.out.println("b) ispis studenta po id_broju");
            System.out.println("c) brisanje studenta po id_broju");
            System.out.println("d) promjena godine studija");
            System.out.println("e) ispis svih studenata");
            System.out.println("f) izlaz");
            System.out.print("Unesite odabir:");

           String i = scanner.next();

            if (i.equals("a")) {
                Student newStudent = addNewStudent();
                studentMap.put(newStudent.getIdNumber(), newStudent);
            }
            else if (i.equals("b")) {
                System.out.print("Unesite id_broj studenta:");
                int idNumber = scanner.nextInt();
                for (Student ss:studentMap.values()) {
                    if (ss.getIdNumber() == idNumber) {
                        System.out.println(ss); // metoda toString
                    }
                }
            }
            else if (i.equals("c")) {
                System.out.print("Unesite id_broj studenta:");
                int idNumber = scanner.nextInt();
                studentMap.remove(idNumber);
                System.out.println(studentMap); // metoda toString
            }
            else if (i.equals("d")) {
                System.out.print("Unesite id_broj studenta:");
                System.out.println();
                for (Student ss : studentMap.values()) {
                    System.out.println(ss);
                }
                int idNumber = scanner.nextInt();
                for (Student ss : studentMap.values()) {
                    if (ss.getIdNumber() == idNumber) {
                        Student sss = studentMap.get(idNumber);
                        sss.increaseYear(sss);
                        studentMap.put(sss.getIdNumber(), sss);
                        System.out.println(sss);
                    }
                }
            }
            else if (i.equals("e")) {
                System.out.println(studentMap.values());
            }
            else if (i.equals("f")) {
                izlaz = true;
            }
        }
    }
    private static Student addNewStudent()  {
        Student newStudent = new Student();
        System.out.print("Id number:");
        newStudent.setIdNumber(scanner.nextInt());
        System.out.print("First name:");
        newStudent.setName(scanner.next());
        System.out.print("Year:");
        newStudent.setYear(scanner.nextInt());
        return newStudent;
    }
}
