import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.SequentialBehaviour;

import java.util.Random;

public class klasa_1_2 extends Agent {
    protected void setup() {
        addBehaviour(new SequentialBehaviour(this)
        {
            public int onEnd() {
                myAgent.doDelete();
                return  super.onEnd();
            }

            public void onStart() {
                addSubBehaviour(new StateBehavior());
            }
        });
    }

    private class StateBehavior extends Behaviour {
        private int state = 0;

        public void action() {
            switch (state) {
                case 0:
                    System.out.println("A");
                    state++;
                    break;
                case 1:
                    System.out.println("B");
                    Random r = new Random();
                    int rInt = r.nextInt(2);
                    System.out.println("Random number: " + rInt);
                    if(rInt == 0) {
                        state = 3;
                    }else {
                        state = 2;
                    }
                    break;
                case 2:
                    System.out.println("D");
                    state++;
                    break;
                case 3:
                    System.out.println("B");
                    Random r2 = new Random();
                    int rInt2 = r2.nextInt(2);
                    System.out.println("Random number: " + rInt2);
                    if(rInt2 == 0) {
                        state = 4;
                    }else {
                        state = 0;
                    }
                    break;
                case 4:
                    System.out.println("E");
                    state++;
                    break;
                default:
                    state++;
                    break;
            }
        }

        @Override
        public boolean done() {
            return state == 5;
        }
    }
}
