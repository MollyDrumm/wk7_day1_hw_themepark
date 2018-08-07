package Attractions;

import interfaces.ISecurity;
import visitors.Visitor;

public class Playground extends Attraction implements ISecurity {


    public Playground(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 16) {
            return false;
        }
        return true;
    }
}

