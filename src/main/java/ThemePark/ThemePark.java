package ThemePark;

import ThemePark.Attractions.Attraction;

public class ThemePark {

    Visitor visitor;
    Attraction attraction;

    public ThemePark(Visitor visitor, Attraction attraction) {
        this.visitor = visitor;
        this.attraction = attraction;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public Attraction getAttraction() {
        return attraction;
    }

}

