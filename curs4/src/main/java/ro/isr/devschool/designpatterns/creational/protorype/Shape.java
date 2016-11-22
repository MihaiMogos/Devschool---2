package ro.isr.devschool.designpatterns.creational.protorype;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Mihai MOGOS on 03/11/16.
 */


//a prototype MUST implement Cloneable
public abstract class Shape implements Cloneable {

    @Getter @Setter
    private String id;
    @Getter
    protected String type;

    abstract void draw();

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
