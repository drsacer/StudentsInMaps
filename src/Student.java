public class Student {
        private int idNumber;
        private String name;
        private int year;

        public Student(){
        }

        public Student(int idNumber,String name, int year){
            this.idNumber=idNumber;
            this.name=name;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(int idNumber) {
            this.idNumber = idNumber;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void increaseYear(Student sss) {
            if (year > 2)  System.out.println("*** Ovo je zadnja godina studija za " + sss.getName() + "a  ***");
            else year++;
        }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

