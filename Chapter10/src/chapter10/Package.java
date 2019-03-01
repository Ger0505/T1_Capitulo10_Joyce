package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class Package {
    public static final String A = "Air";
    public static final String T = "Truck";
    public static final String M = "Mail";
    
    private Integer weight;
    private String method;
    private Double cost;

    public Package(Integer weight, String method) {
        this.weight = weight;
        this.method = method;
        calculateCost();
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
    
    
    
    public static void display(){
        System.out.println("Weight(oz.)    Air    Truck    Mail");
        System.out.println("  1 to 8      2.00    1.50     0.50 ");
        System.out.println("  9 to 16     3.00    2.35     1.50 ");
        System.out.println(" 17 to over   4.50    3.25     2.15 ");
        System.out.println("------------------------------------");
    }
    
    private void calculateCost(){
        switch(method){
            case A:
                if(this.weight>1 && this.weight<9) 
                    this.cost = 2.0;
                else if(this.weight>=9 && this.weight<17)
                    this.cost = 3.0;
                else if(this.weight>=17)
                    this.cost = 4.5;
                break;
            case T:
                if(this.weight>1 && this.weight<9) 
                    this.cost = 1.5;
                else if(this.weight>=9 && this.weight<17)
                    this.cost = 2.35;
                else if(this.weight>=17)
                    this.cost = 3.25;
                break;
            case M:
                if(this.weight>1 && this.weight<9) 
                    this.cost = 0.5;
                else if(this.weight>=9 && this.weight<17)
                    this.cost = 1.5;
                else if(this.weight>=17)
                    this.cost = 2.15;
                break;
            default: System.out.println("Método no identificado");
            this.cost=0.0;
            break;
        }
    }

    @Override
    public String toString() {
        return "Package{" + "weight=" + weight + ", method=" + method + ", cost=" + cost + '}';
    }
    
    
}
