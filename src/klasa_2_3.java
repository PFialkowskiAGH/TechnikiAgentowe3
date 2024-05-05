import jade.core.Agent;
import jade.core.behaviours.ParallelBehaviour;

public class klasa_2_3 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        GenericBehavior behavior1 = new GenericBehavior();
        GenericBehavior behavior2 = new GenericBehavior();
        GenericBehavior behavior3 = new GenericBehavior();

        ParallelBehaviour parallelBehaviour = new ParallelBehaviour(ParallelBehaviour.WHEN_ALL);
        parallelBehaviour.addSubBehaviour(behavior1);
        parallelBehaviour.addSubBehaviour(behavior2);
        parallelBehaviour.addSubBehaviour(behavior3);

        addBehaviour(parallelBehaviour);
    }

    private class GenericBehavior extends jade.core.behaviours.CyclicBehaviour {
        private int step = 0;

        public void action() {
            switch (step) {
                case 0:
                    System.out.println("pierwszy krok");
                    break;
                case 1:
                    System.out.println("drugi krok");
                    break;
                case 2:
                    System.out.println("trzeci krok");
                    myAgent.doDelete();
                    break;
            }
            step++;
        }
    }
}
