package nl.ru.ai.p4ai.exercise1;

import static nl.ru.ai.karel.Karel.*;

public class Tutorial {

    public static void safeStep() {
        // Make sure Charles' step is safe
        if(!inFrontOfWall()) {
            step();
        }
    }
    public static void diagonalStep(){
        // Makes Charles move up diagonally
        turnRight();
        safeStep();
        turnLeft();
        safeStep();
    }

    public static void main(String[] args){
        map("empty.map");
        speed(100);

        // Walk diagonally up as long as possible
        while(!inFrontOfWall()) {
            diagonalStep();
        }
    }
}
