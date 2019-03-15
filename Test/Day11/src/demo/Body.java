package demo;

class Body {
    public class Heart {
        public void beat() {
            System.out.println("boom");
        }
    }

    public void eyes () {
        System.out.println("yanjin");
        class Myeyes{
            private void method() {
                System.out.println("my");
            }
        }
        Myeyes myeyes = new Myeyes();
        myeyes.method();
    }
}