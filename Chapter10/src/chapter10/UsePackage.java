package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class UsePackage {
    public static void usePackage(){
        Package [] paquetes = new Package[6];
        paquetes[0] = new Package(100,Package.A);
        paquetes[1] = new Package(150,Package.T);
        paquetes[2] = new Package(40,Package.M);
        paquetes[3] = new InsurePackage(100,InsurePackage.A);
        paquetes[4] = new InsurePackage(200,InsurePackage.T);
        paquetes[5] = new InsurePackage(10,InsurePackage.M);
        Package.display();
        for(Package paq: paquetes){
            System.out.println(paq.toString());
        }
    }
}
