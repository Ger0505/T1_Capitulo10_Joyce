package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class Candle {
    private Color color;
    public Integer height;
    public Double price;

    public Color getColor() {
        return color;
    }

    public Integer getHeight() {
        return height;
    }

    public Double getPrice() {
        return price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setHeight(Integer height) {
        this.height = height;
        this.price = (double)height*2;
    }

    @Override
    public String toString() {
        return "Candle{" + "color=" + color + ", height=" + height + ", price=" + price + '}';
    } 
}

enum Color{
    ORANGE,YELLOW,WHITE,BLUE,BLACK,PINK;
}

class ScentedCandle extends Candle{
    private String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
    
    @Override
    public void setHeight(Integer height){
        this.height = height;
        this.price = (double)height*3;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "ScentedCandle{" + "scent=" + scent + '}';
    }
    
    
}

class DemoCandles {
    public static void demoCandles(){
        Candle c1 = new Candle();
        c1.setColor(Color.YELLOW);
        c1.setHeight(10);
        ScentedCandle c2 = new ScentedCandle();
        c2.setColor(Color.WHITE);
        c2.setScent("Rose");
        c2.setHeight(10);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}