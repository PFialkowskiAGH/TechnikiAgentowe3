import jade.core.behaviours.Behaviour;

public class klasa_4 extends klasa_1 {
    protected void setup() {
        super.setup();
        addBehaviour(new Behaviour() {
            private int krok = 1;

            public void action() {
                switch (krok) {
                    case 1:
                        System.out.println("pierwszy krok");
                        krok++;
                        break;
                    case 2:
                        System.out.println("drugi krok");
                        krok++;
                        break;
                    case 3:
                        System.out.println("trzeci krok");
                        krok++;
                        break;
                }
            }

            public boolean done() {
                return krok > 3;
            }
        });
    }
}
