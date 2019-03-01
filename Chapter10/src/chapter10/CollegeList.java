package chapter10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gerardo A A
 */
public class CollegeList {
    public static void collegeList(){
        Integer c =4,f =3,s=7;
        char option;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> regular = new ArrayList<>();
        do{
            System.out.println("C - CollegeEmployees");
            System.out.println("F - Faculty");
            System.out.println("S - Students");
            System.out.println("Q - Quit");
            System.out.print("Escoge opcion [C,F,S,Q]:");
            option = scanner.next().charAt(0);
            switch(option){
                case 'C':   if(c>0){
                            CollegeEmployee per = new CollegeEmployee(12344,1200,"Laboratorio");
                             System.out.print("NOmbre: ");
                            per.setName(scanner.next());
                            System.out.print("Apellido: ");
                            per.setLast_name(scanner.next());
                            System.out.print("Dirección: ");
                            scanner.nextLine();
                            per.setAdress(scanner.nextLine());
                            System.out.print("Telefono: ");
                            per.setPhone(scanner.nextInt());
                            System.out.print("Código: ");
                            per.setZip_code(scanner.nextInt());
                            regular.add(per);
                            }
                            else System.out.println("ERROR : Inscripciones de este tipo ya no son disponibles"); 
                            c--;
                            break;
                case 'F':   if(f>0){
                            Faculty per = new Faculty(true,12344,1200,"Laboratorio");
                             System.out.print("NOmbre: ");
                            per.setName(scanner.next());
                            System.out.print("Apellido: ");
                            per.setLast_name(scanner.next());
                            scanner.nextLine();
                            System.out.print("Dirección: ");
                            per.setAdress(scanner.nextLine());
                            System.out.print("Telefono: ");
                            per.setPhone(scanner.nextInt());
                            System.out.print("Código: ");
                            per.setZip_code(scanner.nextInt());
                            regular.add(per);
                            }else System.out.println("ERROR : Inscripciones de este tipo ya no son disponibles"); 
                    f--;
                    break;
                case 'S':   if(s>0){
                            Student per = new Student("Naranjas",9.8);
                            System.out.print("NOmbre: ");
                            per.setName(scanner.next());
                            System.out.print("Apellido: ");
                            per.setLast_name(scanner.next());
                            scanner.nextLine();
                            System.out.print("Dirección: ");
                            per.setAdress(scanner.nextLine());
                            System.out.print("Telefono: ");
                            per.setPhone(scanner.nextInt());
                            System.out.print("Código: ");
                            per.setZip_code(scanner.nextInt());
                            regular.add(per);
                            }
                            else System.out.println("ERROR : Inscripciones de este tipo ya no son disponibles"); 
                    s--;
                    break;
                case 'Q': 
                    break;
            }
        }while(option!='Q');
        for(Person p:regular){
            System.out.println("Información:");    
            System.out.println(p.toString());
        }
    }
}
