package Singleton;

public class singleton {
        private singleton(){}
        private static singleton instance = new singleton();
        public static singleton getInstance(){
            return instance;
        }
        public void showData(){
            System.out.println("Hello Singleton!");
        }
}

