package day7;


public class Player {
    private int stamina;
    private static final int MAX_STAMINA=100;
    private static final int MIN_STAMINA=0;
    private static int countPlayers=0;

    int getStamina(){

        return stamina;
    }

    void run(){
        if(stamina<=0) {
            stamina = 0;
            return;
        }

        stamina-=10;

        if(stamina<=0){
            stamina=0;
            countPlayers--;
        }
    }

    public Player(int stamina){
        this.stamina=stamina;
        if(countPlayers<7)
            countPlayers++;
    }

     static void info(){
        int difference=6-countPlayers;
       if(countPlayers<6)
           System.out.println("Команды неполные, еще есть "+difference+" мест");
       else if(countPlayers>=6)
           System.out.println("На поле нет свободных мест");
    }


}
