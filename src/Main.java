import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите факультет:");
        String fakultet = input.nextLine();
        System.out.println("Введите дату поступления:");
        String data_postup = input.nextLine();
        Student[] massiv = new Student[3];
        massiv[0] = new Student(17,"Safarov.A.A",89042661461L,1,"Инф-Тех", "2023.09.01");
        massiv[1] = new Student(18, "Neronov.I.S",  89052734771L,1, "Инф-Тех", "2023.09.01");
        massiv[2] = new Student(20, "Agisev.R.A",89354766543L,1,"Инф-Тех","2023.09.01");
        for(int i = 0;i < massiv.length;i++){
            System.out.println(massiv[i].FIO);
            System.out.println(massiv[i].getAge());
            if(massiv[i].fakultet.equals(fakultet)){
                System.out.println("Студент " + massiv[i].FIO + " учится в заданном вами факультете");
            }
            if(massiv[i].getData_postup().equals(data_postup)){
                System.out.println("Студент " + massiv[i].FIO + " поступил в заданном вами годе");
            }
        }

    }
}

class Person{
    public Person(int age, String FIO, long Phone){
        this.age = age;
        this.FIO = FIO;
        this.Phone = Phone;
    }
    private int age;
    public String FIO;
    public long Phone;

    public int getAge(){
        return this.age;
    }

}

class Student extends Person{
    public Student(int age, String  FIO, long Phone, int kurs, String fakultet, String data_postup){
        super(age, FIO, Phone);
        this.kurs = kurs;
        this.fakultet = fakultet;
        this.data_postup = data_postup;
    }
    public int kurs;
    public String fakultet;
    private String data_postup;

    public String getData_postup(){
        return this.data_postup;
    }

}
