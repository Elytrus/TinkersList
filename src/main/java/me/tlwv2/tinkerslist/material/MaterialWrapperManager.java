package me.tlwv2.tinkerslist.material;

import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.IMaterialStats;
import slimeknights.tconstruct.library.materials.Material;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

public class MaterialWrapperManager {
    private static ArrayList<MaterialWrapper> materials;

    public static void init(){
        for(Material material : TinkerRegistry.getAllMaterials()){
            MaterialWrapper wrapper = new MaterialWrapper(material);

            for(String category : Util.MATERIAL_TYPES){
                if(material.hasStats(category)){
                    IMaterialStats stats = material.getStats(category);

                    wrapper.registerCategory(category);
                    wrapper.setCategory(category);

                    for(String statName : Util.statsForCategory(category)){
                        Field field = null;

                        try {
                            field = stats.getClass().getField(statName);
                        } catch (NoSuchFieldException e) {
                            e.printStackTrace();
                        }

                        try {
                            wrapper.registerStat(field.getName(), (Comparable) field.get(material));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            wrapper.nullifyCurrents();
            materials.add(wrapper);
        }
    }

    //Dyn

    private ArrayList<MaterialWrapper> currentMaterials;
    private HashMap<String, Boolean> applied;

    public MaterialWrapperManager(){
        this.currentMaterials = new ArrayList<>();
        this.applied = new HashMap<>();

        for(MaterialWrapper materialWrapper : materials){
            applied.put(materialWrapper.getMaterial().getIdentifier(), true);
        }
    }

    public void applyCategory(String category){
        //TODO
    }

    public void applyFilter(String filterString){
        //TODO
    }

    public ArrayList<String> getMaterialStrings(){
        //TODO: tostring
        return null;
    }
}
