package interface_;

import java.util.ArrayList;
import java.util.List;

public class player implements ISaveable{
    private String name;
    private String hitPoint;
    private String strength;
    private String weapon;

    public player(String name, String hitPoint, String strength, String weapon) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.strength = strength;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(String hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "player{" +
                "name='" + name + '\'' +
                ", hitPoint='" + hitPoint + '\'' +
                ", strength='" + strength + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public ArrayList medium() {
        ArrayList<String> v = new ArrayList<String>();
        v.add(0,this.name);
        v.add(1,this.hitPoint);
        v.add(2,this.strength);
        v.add(3,this.weapon);
        return v;
    }

    @Override
    public void pop(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size()>0) {
            this.name = arrayList.get(0);
            this.hitPoint = arrayList.get(1);
            this.strength = arrayList.get(2);
            this.weapon = arrayList.get(3);
        }

    }
}
