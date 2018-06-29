package me.tlwv2.tinkerslist.material;

import slimeknights.tconstruct.library.materials.Material;

public class MaterialWrapper implements Comparable<MaterialWrapper>{
    private Material material;
    private SortingValue sortingValue;

    public MaterialWrapper(Material material){
        this.material = material;
        this.sortingValue = null;
    }

    @Override
    public int compareTo(MaterialWrapper o) {
        return 0;
    }
}
