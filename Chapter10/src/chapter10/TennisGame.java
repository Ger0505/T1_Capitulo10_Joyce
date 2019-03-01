package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class TennisGame {
    private String player1;
    private String player2;
    private Integer scores_p1;
    private Integer scores_p2;
    private Scores sc_p1;
    private Scores sc_p2;

    public void setNames(String player1,String player2) {
        this.player1 = player1;
        this.player2 = player2;
        
    }

    public void setScores_p1(Integer scores_p1,Integer scores_p2) {
        this.scores_p1 = scores_p1;
        this.scores_p2 = scores_p2;
        if((scores_p1<0 || scores_p1>4)||(scores_p2<0 || scores_p2>4)){
            this.scores_p1 = this.scores_p2 = 0;
            this.sc_p1 = this.sc_p2 = Scores.ERROR;
        }else if(scores_p1==4 && scores_p2==4){
            this.scores_p1 = this.scores_p2 = 0;
            this.sc_p1 = this.sc_p2 = Scores.ERROR;
        }else{
            if(scores_p1==0) this.sc_p1 = Scores.LOVE;
            else if(scores_p1 == 1) this.sc_p1 = Scores.QUINCE;
            else if(scores_p1 == 2) this.sc_p1 = Scores.TREINTA;
            else if(scores_p1 == 3) this.sc_p1 = Scores.CUARENTA;
            else this.sc_p1 = Scores.GAME;
            if(scores_p2==0) this.sc_p2 = Scores.LOVE;
            else if(scores_p2 == 1) this.sc_p2 = Scores.QUINCE;
            else if(scores_p2 == 2) this.sc_p2 = Scores.TREINTA;
            else if(scores_p2 == 3) this.sc_p2 = Scores.CUARENTA;
            else if(scores_p2 == 4) this.sc_p2 = Scores.GAME;
            
            
        }
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public Integer getScores_p1() {
        return scores_p1;
    }

    public Integer getScores_p2() {
        return scores_p2;
    }

    public Scores getSc_p1() {
        return sc_p1;
    }

    public Scores getSx_p2() {
        return sc_p2;
    }

    @Override
    public String toString() {
        return "TennisGame{" + "player1=" + player1 + ", player2=" + player2 + ", scores_p1=" + scores_p1 + ", scores_p2=" + scores_p2 + ", sc_p1=" + sc_p1 + ", sc_p2=" + sc_p2 + '}';
    }
    
    
}

enum Scores{
    LOVE,QUINCE,TREINTA,CUARENTA,GAME,ERROR;
}

 class DoublesTennisGame extends TennisGame{
    private String partner1;
    private String partner2;

    public String getPartner1() {
        return partner1;
    }

    public String getPartner2() {
        return partner2;
    }
    
    public void setNames(String player1,String player2,String partner1,String partner2) {
        super.setNames(player1, player2);
        this.partner1 = partner1;
        this.partner2 = partner2;
                
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "DoublesTennisGame{" + "partner1=" + partner1 + ", partner2=" + partner2 + '}';
    } 
    
}

class DemoTennisGames {
    public static void demoTennisGames(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.getPlayer1();
        tennisGame.setNames("Pablito","Paca");
        tennisGame.setScores_p1(2,0);
        DoublesTennisGame doubleGame = new DoublesTennisGame();
        doubleGame.setNames("Pablito","Paca","María","Francesco");
        doubleGame.setScores_p1(5,0);
        System.out.println(tennisGame.toString());
        System.out.println(doubleGame.toString());
    }
}