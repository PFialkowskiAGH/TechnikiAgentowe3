import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SequentialBehaviour;

public class klasa_2_4 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        GenericBehavior behavior1 = new GenericBehavior("pierwszy krok");
        GenericBehavior behavior2 = new GenericBehavior("drugi krok");
        GenericBehavior behavior3 = new GenericBehavior("trzeci krok");

        SequentialBehaviour sequentialBehaviour = new SequentialBehaviour() {
            public int onEnd() {
                myAgent.doDelete();
                return super.onEnd();
            }
        };
        sequentialBehaviour.addSubBehaviour(behavior1);
        sequentialBehaviour.addSubBehaviour(behavior2);
        sequentialBehaviour.addSubBehaviour(behavior3);

        addBehaviour(sequentialBehaviour);
    }

    private class GenericBehavior extends OneShotBehaviour {
        private String message;

        public GenericBehavior(String message) {
            this.message = message;
        }

        public void action() {
            System.out.println(message);
        }
    }
}
