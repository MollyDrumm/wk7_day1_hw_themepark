package ThemePark.Attractions;

import ThemePark.ISecurity;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name){
        super(name);
    }
    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return false;
    }
}
