

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        University, School, Car жана Person деген класс тузунуз
//
//        Алардын свойстваларын ойлоп табыныз
//
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//
//        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//
//        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз

         University u1 = new University();
         University u2 = new University();
         University u3 = new University();

         School s1 = new School();
         School s2 = new School();
         School s3 = new School();

         Car c1 = new Car();
         Car c2 = new Car();
         Car c3 = new Car();

         Person p1 = new Person();
         Person p2 = new Person();
         Person p3 = new Person();

         u1.setName("MIT");
         u1.setHeadmaster("Adam Smith");
         u1.setLocation("America");

         System.out.println("University" + "\n");


         for(String i : u1.getUni()){
              System.out.println(i);

         }

         System.out.println("-------------------" );

         u2.setName("Autsa");
         u2.setHeadmaster("Jancloud wandam");
         u2.setLocation("Kyrgystan");

         for(String a : u2.getUni()) {
              System.out.println(a);

         }

         System.out.println("--------------------");

         u3.setName("MGU");
         u3.setHeadmaster("Dmitriy Osipov");
         u3.setLocation("Russia");

         for(String b : u3.getUni()) {
              System.out.println(b);
         }


         System.out.println("--------------------" + "\n" + "School" + "\n");

         s1.setName("Frunze");
         s1.setHeadmaster("Atymysh satayev");
         s1.setNumber("3");


         for(String c : s1.getScl()){
              System.out.println(c);
         }

         System.out.println("--------------------");

         s2.setName("Alykul Osmonov");
         s2.setHeadmaster("Moldobaeva Chynara");
         s2.setNumber("10");

         for(String d : s2.getScl()){
              System.out.println(d);
         }

         System.out.println("--------------------");


         s3.setName("Tashmatov");
         s3.setHeadmaster("Aytmamatov Tursunbay");
         s3.setNumber("8");

         for(String g : s3.getScl()) {
              System.out.println(g);
         }

         System.out.println("--------------------" + "\n" +"Car" + "\n");

         c1.setName("bmw");
         c1.setModel("500tr");
         c1.setColor("black");

         for(String f : c1.getCar()) {
              System.out.println(f);
         }

         System.out.println("--------------------");


         c2.setName("mercedec");
         c2.setModel("banan");
         c2.setColor("gray");

         for(String h : c2.getCar()) {
              System.out.println(h);
         }

         System.out.println("--------------------");


         c3.setName("kia");
         c3.setModel("crayy");
         c3.setColor("blue");

         for(String s : c3.getCar()) {
              System.out.println(s);
         }

         System.out.println("--------------------" + "\n" + "Person" + "\n");


         p1.setName("Nursultan");
         p1.setSurname("Kaiperdiev");
         p1.setAge("21");

         for(String t : p1.getPerson()) {
              System.out.println(t);
         }

         System.out.println("--------------------");


         p2.setName("Baibolot");
         p2.setSurname("Malikov");
         p2.setAge("22");

         for(String m : p2.getPerson()) {
              System.out.println(m);
         }

         System.out.println("--------------------");


         p3.setName("Suyun");
         p3.setSurname("Abdybaliev");
         p3.setAge("20");

         for(String l : p3.getPerson()) {
              System.out.println(l);
         }



    }
}