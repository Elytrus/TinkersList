package me.tlwv2.tinkerslist.material;

public class StatValue<T extends Comparable> implements Comparable<T>{
    private T value;

    public StatValue(T value){
        this.value = value;
    }

    @Override
    public int compareTo(T o) {
        return value.compareTo(o);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
