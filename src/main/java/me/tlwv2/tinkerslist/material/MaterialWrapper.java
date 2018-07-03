package me.tlwv2.tinkerslist.material;

import slimeknights.tconstruct.library.materials.Material;

import java.util.HashMap;

public class MaterialWrapper implements Comparable<MaterialWrapper>, Cloneable{
    private Material material;
    private HashMap<String, Boolean> registeredCategories;
    private HashMap<String, HashMap<String, StatValue>> stats;

    private String currentCategory;
    private String currentStat;

    public MaterialWrapper(Material material){
        this.material = material;
        this.currentCategory = null;
        this.currentStat = null;
        this.registeredCategories = new HashMap<>();
        this.stats = new HashMap<>();

        for(String category : Util.MATERIAL_TYPES){
            registeredCategories.put(category, false);
        }
    }

    public void registerCategory(String category){
        registeredCategories.put(category, true);
    }

    public void setCategory(String category){
        currentCategory = category;
    }

    public void setStat(String stat){
        currentStat = stat;
    }

    public void registerStat(String stat, Comparable value){
        stats.get(currentCategory).put(stat, new StatValue(value));
    }

    public void nullifyCurrents(){
        currentCategory = null;
        currentStat = null;
    }

    public StatValue getCurrentStat(){
        return stats.get(currentCategory).get(currentStat);
    }

    public String getType(){
        return getCurrentStat().getClass().getSimpleName();
    }

    public MaterialWrapper reproduceFinalVersion(){
        final MaterialWrapper wrapper = new MaterialWrapper(material);
        wrapper.registerCategory(currentCategory);
        wrapper.setCategory(currentCategory);
        wrapper.registerStat(currentStat, new StatValue(getCurrentStat()));
        return wrapper;
    }


    @Override
    public int compareTo(MaterialWrapper o) {
        return stats.get(currentCategory).get(currentStat).compareTo(o);
    }

    @Override
    public String toString() {
        return ""; //TODO: toString of MaterialWrapper
    }

    //Getter+Setter

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public HashMap<String, Boolean> getRegisteredCategories() {
        return registeredCategories;
    }

    public void setRegisteredCategories(HashMap<String, Boolean> registeredCategories) {
        this.registeredCategories = registeredCategories;
    }

    public HashMap<String, HashMap<String, StatValue>> getStats() {
        return stats;
    }

    public void setStats(HashMap<String, HashMap<String, StatValue>> stats) {
        this.stats = stats;
    }

    public String getCurrentCategory() {
        return currentCategory;
    }

    public void setCurrentCategory(String currentCategory) {
        this.currentCategory = currentCategory;
    }

    public void setCurrentStat(String currentStat) {
        this.currentStat = currentStat;
    }
}
