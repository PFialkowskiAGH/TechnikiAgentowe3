import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

import jade.core.Agent;

public class klasa_1 extends Agent {
    protected void setup() {
        System.out.println("startuję");
    }

    protected void takeDown() {
        System.out.println("zaraz się usunę");
    }
}
