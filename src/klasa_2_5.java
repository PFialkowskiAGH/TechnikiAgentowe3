import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class klasa_2_5 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        addBehaviour(new CyclicBehavior1());

        addBehaviour(new CyclicBehavior2());
    }

    private class CyclicBehavior1 extends CyclicBehaviour {
        public void action() {
            System.out.println("cyclic 1");
            block(1000);
        }
    }

    private class CyclicBehavior2 extends CyclicBehaviour {
        public void action() {
            System.out.println("cyclic 2");
            block(2000);
        }
    }
}
