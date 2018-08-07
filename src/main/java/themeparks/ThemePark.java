package themeparks;

import Attractions.Attraction;
import Stalls.Stall;
import visitors.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Visitor> themeparkVisitors;
    private ArrayList<Attraction> themeparkAttractions;
    private ArrayList<Stall> themeparkStalls;

    public ThemePark(ArrayList<Visitor> themeparkVisitors, ArrayList<Attraction> themeparkAttractions, ArrayList<Stall> themeparkStalls) {
        this.themeparkVisitors =  new ArrayList<Visitor>();
        this.themeparkAttractions = new ArrayList<Attraction>();
        this.themeparkStalls = new ArrayList<Stall>();
    }
    
}


