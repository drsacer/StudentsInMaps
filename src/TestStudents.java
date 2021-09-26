import java.io.*;
import java.util.*;

public class TestStudents {
    public static void main(String[] args) throws IOException {

        Student s = new Student(1, "Dragan ", "IS ", 4);
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(s.idNumber, s);

        boolean izlaz = false;
        while (!izlaz) {
            System.out.println("a) upis novog studenta");
            System.out.println("b) ispis stunenta po id_broju");
            System.out.println("c) brisanje studenta po id_broju");
            System.out.println("d) promjena godine studija");
            System.out.println("e) ispis svih studenata");
            System.out.println("f) izlaz");
            System.out.println("unesite zeljenu akciju");

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String i = in.readLine();

            if (i.equals("a")) {
                Student newStudent = upisNovogStudenta();
                studentMap.put(newStudent.idNumber, newStudent);
                //System.out.println(studentMap.values());
            }
            if (i.equals("b")) {
                System.out.println("unesite id_broj studenta:");
                int idNumber = Integer.parseInt(in.readLine());
                studentMap.get(idNumber);
                System.out.println(studentMap.values());
            }
            if (i.equals("c")) {
                System.out.println("unesite id_broj studenta:");
                int idNumber = Integer.parseInt(in.readLine());
                studentMap.remove(idNumber);
                System.out.println(studentMap.values());
            }
            if (i.equals("d")) {
                //Student newStudent=povecajGodinu();
                //studentMap.put(newStudent.idNumber, newStudent);
                System.out.println("unesite id_broj studenta:");
                int idNum = Integer.parseInt(in.readLine());
                studentMap.get(idNum);

            }
            if (i.equals("e")) {
                System.out.println(studentMap.values());
            }
            if (i.equals("f")) {
                izlaz = true;
            }
        }
    }

    private static Student upisNovogStudenta() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Student newStudent = new Student();
        System.out.println("mati�ni broj");
        newStudent.idNumber = Integer.parseInt(in.readLine());
        System.out.println("ime studenta:");
        newStudent.name = in.readLine();
        System.out.println("godina studija");
        newStudent.god = Integer.parseInt(in.readLine());
        System.out.println("vrsta studija:");
        newStudent.typeOfStudy = in.readLine();
        return newStudent;
    }
}
