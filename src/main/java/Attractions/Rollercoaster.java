package Attractions;

import interfaces.ISecurity;
import visitors.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name){
        super(name);
    }


    public boolean isAllowedTo(Visitor visitor) {
        return false;
    }
}
