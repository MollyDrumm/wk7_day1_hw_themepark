package ThemePark;

import ThemePark.Attractions.Attraction;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Visitor> themeparkVisitors;
    private ArrayList<Attraction> themeparkAttractions;


    public ThemePark(ArrayList<Visitor> themeparkVisitors, ArrayList<Attraction> themeparkAttractions) {
        this.themeparkVisitors =  new ArrayList<Visitor>();
        this.themeparkAttractions = new ArrayList<Attraction>();
    }

    public ArrayList<Visitor> getThemeparkVisitors() {
        return themeparkVisitors;
    }

    public ArrayList<Attraction> getThemeparkAttractions() {
        return themeparkAttractions;
    }
}


