public class Hero  extends Thread {
    String name;
    Hero enemy;
int hp = 1000;
    public Hero(String name) {
        this.name = name;
    }

    public void assignEnemy(Hero enemy) {
        this.enemy = enemy;
    }

        public void run() {
            for (int i = 0; i <= 1000; i++) {
                if (hp <= 0) {
                    System.out.println(name + "убит!!!");
                }
                enemy.hp--;
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(name + "ударил" + enemy.name + " " + i + "раз");

            }
        }
    }
