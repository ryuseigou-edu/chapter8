public class Main {
    public static void main(String[] args) {

        Hero h1 = new Hero("ミナト");
        h1.hp = 100;
        Hero h2 = new Hero("アサカ");
        h2.hp = 100;
        Wizard w = new Wizard("スガワラ");
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
        Matango m = new Matango('A');
        w.heal(m);
    }
}