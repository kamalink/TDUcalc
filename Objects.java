
public class Objects {
    private double maxRevs;
    private int hp;
    private double engineDisplacement;

    public static void main(String[] args) {
        Objects integra = new Objects(8.4,195,1.8);
        Objects NSX = new Objects(7.6,290,3.2);
        Objects TSX = new Objects(6.8,280,3.5);
        Objects Alfa155 = new Objects(6.5,188,2);
        Objects Brera = new Objects(6.8,256,3.2);
        Objects MiTo = new Objects(6,168,1.4);
        Objects Gremlin = new Objects(4.7,150,5);
        Objects DBS = new Objects(7,510,5.9);
        Objects Vanquish = new Objects(7.7,565,5.9);
        Objects V600 = new Objects(7,603,5.3);
        Objects A4 = new Objects(4.8,241,3.0);
        Objects RS2 = new Objects(7,310,2.2);
        Objects Q7 = new Objects(4.5,493,6);
        Objects R8 = new Objects(8.5,562,5.2);
        Objects RS6 = new Objects(7.1,572,5);
        Objects S4 = new Objects(6.3,261,2.7);
        Objects S5 = new Objects(7.5,349,4.2);
        Objects TT = new Objects(6.8,247,3.2);
        Objects TTRS = new Objects(7,335,2.5);
        Objects i125 = new Objects(6.5,215,2);
        Objects CSi850 = new Objects(5.8,375,5.6);
        Objects m3 = new Objects(7.2,197,2.3);
        Objects m3CSL = new Objects(8,355,3.2);
        Objects m3GTS = new Objects(8.4,444,4.4);
        Objects m4 = new Objects(7.5,493,3);
        Objects m594 = new Objects(7.4,335,3.8);
        Objects m5 = new Objects(7.2,552,4.4);
        Objects m6 = new Objects(7.2,552,4.4);
        Objects x5 = new Objects(6.5,350,4.8);
        Objects x6m = new Objects(7,547,4.4);
        Objects z4m = new Objects(8,330,3.2);
        Objects z8 = new Objects(7,394,4.9);
        Objects CTSV = new Objects(6.2,556,6.2);
        Objects Z28 = new Objects(5.7,320,5.7);
        Objects ZL1 = new Objects(6.2,580,6.2);
        Objects GS96 = new Objects(6.3,330,5.7);
        Objects GS = new Objects(6.4,430,6.2);
        Objects Stingray = new Objects(6.6,455,6.2);
        Objects Z06 = new Objects(6.6,650,6.2);
        Objects C300 = new Objects(6.4,425,6.1);
        Objects srt300 = new Objects(6.4,470,6.4);
        Objects DS3 = new Objects(6.5,118,1.6);
        Objects nexia = new Objects(6,89,1.5);
        Objects challenger = new Objects(6.4,425,6.1);
        Objects daytona = new Objects(6.5,425,7);
        Objects chargerRT = new Objects(5.8,370,5.7);
        Objects viperGTS = new Objects(6.2,640,8.4);
        Objects viperACR = new Objects(5.7,460,8);
        Objects viperSRT = new Objects(6,500,8.3);


        calc(RevsValue.revsValue(viperSRT), HPvalue.hpValue(viperSRT) , EDValue.edValue(viperSRT));
    }

    private Objects(double maxRevs, int hp, double engineDisplacement){
        this.maxRevs=maxRevs;
        this.hp=hp;
        this.engineDisplacement=engineDisplacement;
    }

    private static double calc(double a, int b, double c){
        double result = a+b-c;
        System.out.println("result is " + result);
        return result;
    }


    public double getMaxRevs() {
        return maxRevs;
    }

    public void setMaxRevs(double maxRevs) {
        this.maxRevs = maxRevs;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }


}
