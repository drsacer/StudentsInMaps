import java.io.*;

    public class Student {
        int idNumber;
        String name;
        String typeOfStudy;
        int god;

        public Student(){
        }

        public Student(int idNumber,String name,String typeOfStudy,int god){
            this.idNumber=idNumber;
            this.name=name;
            this.typeOfStudy=typeOfStudy;
            this.god=god;
        }
        @Override
        public String toString(){
            return name + " " + typeOfStudy + " " + god;
        }
    }

