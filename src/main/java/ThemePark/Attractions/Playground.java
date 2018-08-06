package ThemePark.Attractions;

import ThemePark.ISecurity;
import ThemePark.Visitor;


public class Playground extends Attraction implements ISecurity {


    public Playground(String name) {
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        int visitorAge = visitor.getAge();
        if (visitorAge < 16) {
            return false;
        }
        return false;
    }
}

