package me.tlwv2.tinkerslist.material;

import com.google.common.collect.ImmutableList;
import slimeknights.tconstruct.library.materials.IMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.materials.MaterialTypes;
import slimeknights.tconstruct.tools.TinkerMaterials;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Util {
    public static final String[] MATERIAL_TYPES = {
            MaterialTypes.PROJECTILE,
            MaterialTypes.HANDLE,
            MaterialTypes.EXTRA,
            MaterialTypes.BOW,
            MaterialTypes.BOWSTRING,
            MaterialTypes.FLETCHING,
            MaterialTypes.HEAD,
            MaterialTypes.SHAFT,
    };

    private static HashMap<String, ArrayList<String>> statsMap;

    public static void init(){
        //Initialization

        statsMap = new HashMap<>();

        //Adding stuff
        Material sample = TinkerMaterials.cobalt; // Cobalt material best material

        for(String category : MATERIAL_TYPES){
            IMaterialStats stats = sample.getStatsOrUnknown(category);
            ArrayList<String> statList = new ArrayList<>();

            for(Field field : stats.getClass().getFields()){
                if(fieldIsStat(field)){
                    statList.add(field.getName());
                }
            }

            statsMap.put(category, statList);
        }
    }

    public static boolean fieldIsStat(Field field){
        Class<?> type = field.getType();
        return type.equals(Integer.class) || type.equals(Float.class);
    }

    public static HashMap<String, ArrayList<String>> getStatsMap(){
        return statsMap;
    }

    public static Collection<String> statsForCategory(String category){
        return ImmutableList.copyOf(statsMap.get(category));
    }
}
