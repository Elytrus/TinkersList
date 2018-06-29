package me.tlwv2.tinkerslist.material;

import slimeknights.tconstruct.library.materials.Material;

public class MaterialWrapper implements Comparable<MaterialWrapper>{
    //TODO: stuff
    private Material material;
    private SortingValue sortingValue;

    public MaterialWrapper(Material material){
        this.material = material;
        this.sortingValue = null;
    }

    @Override
    public int compareTo(MaterialWrapper o) {
        return 0; //TODO: compareTo of MaterialWrapper
    }

    @Override
    public String toString() {
        return ""; //TODO: toString of MaterialWrapper
    }
}
