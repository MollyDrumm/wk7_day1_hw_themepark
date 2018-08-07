package Attractions;

import interfaces.ISecurity;
import visitors.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name){
        super(name);
    }


    public boolean isAllowedTo(Visitor visitor) {
        if ((visitor.getAge() < 12) && (visitor.getHeight() < 5.0)) {
            return false;
        }

        return true;
    }

}
