public class Wizard {
    String name;
    int hp;

    public Wizard(String name) {
        this.hp = 100;
        this.name = name;
    }
    public void heal(Hero h) {
        h.hp += 10;
        System.out.println
                ("魔法少女" + this.name + "は、" + h.name + "のHPを10回復した！");
        System.out.println(heart_mark());
        System.out.println(h.name + "のHP:" + h.hp);
    }
    public void heal(Matango m) {
        m.hp += 10;
        System.out.println
                ("魔法少女" + this.name + "は、お化けキノコ" + m.suffix + "のHPを10回復してしまった！？");
        System.out.println(heart_mark());
        System.out.println("お化けキノコ" + m.suffix + "のHP:" + m.hp);
    }

    private String heart_mark(){
        if(Math.random() < 0.5) {
            return
                    ("⠀⠀⣀⣤⣤⣤⣀ ⠀⠀ ⣀⣤⣤⣤⣀ ⠀\n" +
                     "⢠⣾⣿⣿⣿⠿⢿⣷⣤⣾⡿⠿⣿⣿⣿⣷⡄\n" +
                     "⣿⣿⣿⠏ ⠀⠀ ⠈⠛⠁⠀⠀⠀ ⠹⣿⣿⣿\n" +
                     "⢻⣿⣿⠀⠀⠀⣾⣿⣶⣿⣷⠀⠀⠀ ⣿⣿⡟\n" +
                     "⠈⢻⣿⣧⠀⠀⠻⣿⣿⣿⠟ ⠀⢀⣼⣿⡟\n" +
                     "⠀⠀⠙⢿⣿⣤⡀⠈⠛⠁⢀⣤⣿⡿⠋⠀\n" +
                     "⠀⠀⠀⠀⠙⢿⣿⣦⣤⣴⣿⡿⠋\n" +
                     "⠀⠀⠀⠀⠀⠀ ⠙⠻⣿⠟⠋⠀⠀\n" );
        } else {
            return
                    ("⠀⠀⣀⣤⣤⣤⣀ ⠀⠀ ⣀⣤⣤⣤⣀ ⠀\n" +
                     "⢠⣾⣿⣿⣿⠿⢿⣷⣤⣾⡿⠿⣿⣿⣿⣷⡄\n" +
                     "⣿⣿⣿⠏ ⠀⠀ ⠈⠛⠁⠀⠀ ⠹⣿⣿⣿\n" +
                     "⢻⣿⣿⠀⠀⠀ ⣾⣿⣶⣿⣷⠀⠀ ⣿⣿⡟\n" +
                     "⠈⢻⣿⣧⠀⠀ ⠻⣿⣿⣿⠟ ⢀⣼⣿⡟\n" +
                     "⠀⠀⠙⢿⣿⣤⡀ ⠈⠛⠁⣤⣿⡿⠋⠀\n" +
                     "⠀⠀⠀⠀⠙⢿⣿⣦⣤⣴⣿⡿⠋\n" +
                     "⠀⠀⠀⠀⠀⠀ ⠙⠻⣿⠟⠋⠀⠀\n" );
        }
    }
}
