//import java.util.ArrayList;
//public class Main {
//    public static void main (String[] args) {
//        Student student1 = new Student(1 ,"Madi","Berikkazy", "12.08.2004" , "Merke" , "87751856015","IT",3,"E");
//        Student student2 = new Student(2 ,"Jalgas","Palgas", "24.06.2004" , "Taraz" , "87025021331","MAth",1,"G");
//        Student student3 = new Student(3 ,"Doni","Poni", "25.01.2005" , "Taraz" , "87778965412","Economic",2,"F");
//        Student student4 = new Student(4 ,"Roma","Poma", "12.08.2004" , "Almaty" , "87756541235","IT",3,"E");
//        Student student5 = new Student(5 ,"Jomart","Tomart", "06.05.2006" , "Kyzylorda" , "87011136589","tr",4,"E");
//
//        ArrayList<Student> list3E = new ArrayList<>();
//        list3E.add(student1);
//        list3E.add(student2);
//        list3E.add(student3);
//        list3E.add(student4);
//        list3E.add(student5);
//
//        getByFacultetName(list3E,"IT");
//        getByFAciltetAndCourse(list3E,"IT",3);
//        getByBirthYear(list3E,2004);
//        getByGroup(list3E,"E");
//    }
//    public static void getByFacultetName(ArrayList<Student> list, String facultetName) {
//        Student res = null;
//        for (Student s : list) {
//            if (s.getFacultet().equals(facultetName)) {
//                res = s;
//                System.out.println(res);
//            }
//        }
//    }
//
//    public static void getByFAciltetAndCourse(ArrayList<Student> list, String facultetName,int course) {
//        Student res = null;
//        for (Student s : list) {
//            if (s.getFacultet().equals(facultetName)&&s.getCourse()==course) {
//                res = s;
//                System.out.println(res);
//            }
//        }
//    }
//
//    public static void getByBirthYear(ArrayList<Student> list, int year) {
//        Student res = null;
//        for (Student s : list) {
//            String qyrqu = s.getBirthday().substring(6);
//            int qyrqylganSan = Integer.parseInt(qyrqu);
//
//            if (qyrqylganSan<= year) {
//                res = s;
//                System.out.println(res);
//            }
//        }
//    }
//    public static void getByGroup(ArrayList<Student> list, String group) {
//        Student res = null;
//        for (Student s : list) {
//            if (s.getFacultet().equals(group)) {
//                res = s;
//                System.out.println(res);
//            }
//        }
//    }
//}
//class Student {
//    int id;
//    String name;
//    String sourname;
//    String birthday;
//    String addres;
//    String pNumber;
//    String facultet;
//    int course;
//    String group;
//
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public String getSourname() {
//        return sourname;
//    }
//    public void setSourname(String sourname) {
//        this.sourname = sourname;
//    }
//    public String getBirthday() {
//        return birthday;
//    }
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//    public String getAddres() {
//        return addres;
//    }
//    public void setAddres(String addres) {
//        this.addres = addres;
//    }
//    public String getFacultet() {
//        return facultet;
//    }
//    public void setFacultet(String facultet) {
//        this.facultet = facultet;
//    }
//    public int getCourse() {
//        return course;
//    }
//    public void setCourse(int course) {
//        this.course = course;
//    }
//    public String getGroup() {
//        return group;
//    }
//    public void setGroup(String group) {
//        this.group = group;
//    }
//    public Student(int id,String name,String sourname,String birthday ,String addres, String pNumber,String facultet,int course, String group) {
//        this.id = id;
//        this.name = name;
//        this.sourname = sourname;
//        this.birthday = birthday;
//        this.addres = addres;
//        this.pNumber = pNumber;
//        this.facultet=facultet;
//        this.course=course;
//        this.group = group;
//    }
//    public String toString() {
//        String result = "\nid: " + id + "  Name: " + name + "  Sourname: " + sourname + "  Birthday: " + birthday+"  Address: "+addres+"Phone number: "+pNumber+"  Facultet: "+facultet+"  Course: "+course+"  Group: "+group;
//        return result;
//    }
//}




//import java.util.Scanner; // импорт сканера
//class Main {
//    public static void main(String args[]){
//        Scanner scan = new Scanner(System.in);
//        int senin_sanyn = 5937;
//        int senin_sanyn_first = senin_sanyn/1000;
//        int senin_sanyn_second = senin_sanyn/100%10;
//        int senin_sanyn_third = senin_sanyn/10%10;
//        int senin_sanyn_forth = senin_sanyn%10;
//        int number = scan.nextInt();
//        int number_sany=(int) Math.floor(Math.log10(number) + 1);
//        int number_first = number/1000;
//        int number_second = number/100%10;
//        int number_third = number/10%10;
//        int number_forth = number%10;
//
//        if(number_sany==4&&number_first!=number_second&&number_first!=number_second&&number_first!=number_forth&&number_second!=number_third&&number_second!=number_forth&&number_third!=number_forth){
//
//            int buqa_sany = 0;
//            int siyr_sany = 0;
//
//            if (senin_sanyn_first==number_first){
//                buqa_sany = buqa_sany+1;
//            }
//            if (senin_sanyn_second==number_second){
//                buqa_sany = buqa_sany+1;
//            }
//            if (senin_sanyn_third==number_third){
//                buqa_sany = buqa_sany+1;
//            }
//            if (senin_sanyn_forth==number_forth){
//                buqa_sany = buqa_sany+1;
//            }
//
//            if (senin_sanyn_first!=number_first  &&  senin_sanyn_first==number_second  ||  senin_sanyn_first==number_third  ||  senin_sanyn_first==number_forth){
//                siyr_sany = siyr_sany+1;
//            }
//            if (senin_sanyn_second!=number_second  && senin_sanyn_second==number_first  ||  senin_sanyn_second==number_third  ||  senin_sanyn_second==number_forth){
//                siyr_sany = siyr_sany+1;
//            }
//            if (senin_sanyn_third !=number_third  && senin_sanyn_third==number_first  ||  senin_sanyn_third==number_second  ||  senin_sanyn_third==number_forth){
//                siyr_sany = siyr_sany+1;
//            }
//            if (senin_sanyn_forth !=number_forth  && senin_sanyn_forth==number_first  ||  senin_sanyn_forth==number_second  ||  senin_sanyn_forth==number_third){
//                siyr_sany = siyr_sany+1;
//            }
//
//            System.out.println(buqa_sany+" BUQA");
//            System.out.println(siyr_sany+" SIYR");
//        }
//        else{
//            System.out.println ("Төрт сан жазбағансыз немесе сандар қайталанған");
//        }
//    }
//}
//import java.util.ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Problem2 {
    public static void main (String[] args) {
        Buyer student1 = new Buyer(1, "Madi", "Berikkazy", "Mukhitzhnauly", 1282004, "Merke", "87021874596");
        Buyer student2 = new Buyer(2, "Jomart", "Aldabay", "Pomart", 2572003, "Taraz", "87725487856");
        Buyer student3 = new Buyer(3, "Jalgas", "Palgas", "Salgas", 1632004, "Almaty", "87024587891");
        Buyer student4 = new Buyer(4, "Doni", "Poni", "Qoni", 18102005, "Shyym", "87056428404");
        Buyer student5 = new Buyer(5, "Nurik", "Purik", "Shurik", 2532005, "Balasagun 55", "87056408505");

        ArrayList<Buyer> list3E = new ArrayList<>();
        list3E.add(student1);
        list3E.add(student2);
        list3E.add(student3);
        list3E.add(student4);
        list3E.add(student5);

        Collections.sort(list3E, new SortByName());
        for (Buyer s : list3E){
            System.out.println(s);
        }
        for (Buyer s : list3E){
            if (s.getCreditNumber() > 1500000 && s.getCreditNumber() < 2500000){
                System.out.println(s.getName() + " " + s.getSourname() + " " + s.getSourname());
            }
        }

    }
}
class  Buyer{
    int id;
    String name;
    String sourname;
    String fatherhood;
    String address;
    int creditNumber;
    String phoneNumber;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSourname() {
        return sourname;
    }
    public void setSourname(String sourname) {
        this.sourname = sourname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFatherhood(String fatherhood) {
        this.fatherhood = fatherhood;
    }
    public int getCreditNumber() {
        return creditNumber;
    }
    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Buyer(int id,String name,String sourname ,String fatherhood,int creditNumber,String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.sourname = sourname;
        this.fatherhood = fatherhood;
        this.address = address;
        this.creditNumber=creditNumber;
        this.phoneNumber = phoneNumber;
    }
    public String toString() {
        String result = "\nid: " + id + "  Name: " + name + "  Sourname: " + sourname + "  Fatherhood: " + fatherhood+"  CreditCard: "+creditNumber+"  Address: "+address+"  Phone number: "+phoneNumber;
        return result;
    }
}
class SortByName implements Comparator<Buyer> {
    @Override
    public int compare(Buyer name1, Buyer name2) {
        return name1.getName().compareTo(name2.getName());
    }
}