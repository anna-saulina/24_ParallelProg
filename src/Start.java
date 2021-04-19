public class Start {
    public static void main(String[] args) {
        Hero dracula =new Hero("Дракула");
        Hero vanHelsing =new Hero("Ван Хельсинг");

        dracula.setPriority(10);
        vanHelsing.setPriority(1);

         dracula.assignEnemy (vanHelsing);
        vanHelsing.assignEnemy (dracula);

        dracula.start();
        vanHelsing.start();



    }
}
