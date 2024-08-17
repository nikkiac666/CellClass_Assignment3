import java.util.HashMap;

public class CellAutomata {
    protected int strength; //strength of the cell used for combat; always >0
    protected int xcoordinate; //cell coordinates; >=0
    protected int ycoordinate;
    protected int id; //distinguishes between cell types; always >=0
    private HashMap<String,Double> chemicals;

    public CellAutomata(int strength, int xcoordinate, int ycoordinate, int id) {
        this.strength = Math.max(strength, 0);
        this.xcoordinate = Math.max(xcoordinate, 0);
        this.ycoordinate = Math.max(ycoordinate, 0);
        this.id = Math.max(id, 0);

        chemicals = new HashMap<>();

        chemicals.put("Lactate", 0.50); //normal lactate level: 0.5-1.8 mmol/L
        chemicals.put("ATP", 1.00); //normal atp: 1-10 mmol/L
        chemicals.put("Glucose", 3.90); //normal glucose: 3.9-5.5 mmol
        chemicals.put("Creatine kinase", 22.00); //normal CK: 22-198 U/L
        chemicals.put("Troponin", 0.00); //normal troponin: 0-0.04 ng/mL

    }

    public CellAutomata() {
        this(0, 0, 0, 0);

        chemicals = new HashMap<>();

        chemicals.put("Lactate", 0.50);
        chemicals.put("ATP", 0.10);
        chemicals.put("Glucose", 3.90);
        chemicals.put("Creatine kinase", 22.00);
        chemicals.put("Troponin", 0.00);
    }

    //getters for CellAutomata parameters
    public int getStrength() {
        return strength;
    }
    public int getXcoordinate() {
        return this.xcoordinate;
    }
    public int getYcoordinate() {
        return this.ycoordinate;
    }
    public int getId() {
        return this.id;
    }

    //setters for CellAutomata parameters
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setXcoordinate(int xcoordinate) {
        this.xcoordinate = xcoordinate;
    }
    public void setYcoordinate(int ycoordinate) {
        this.ycoordinate = ycoordinate;
    }
    public void setId(int id) {
        this.id = id;
    }

    //setters and getters for chemicals
    public void setLactate(double lactate) {
        chemicals.replace("Lactate", lactate);
    }
    public void setATP(double ATP) {
        chemicals.replace("ATP", ATP);
    }
    public void setGlucose(double glucose) {
        chemicals.replace("Glucose", glucose);
    }
    public void setCreatineKinase(double creatineKinase) {
        chemicals.replace("Creatine kinase", creatineKinase);
    }
    public void setTroponin(double troponin) {
        chemicals.replace("Troponin", troponin);
    }

    public double getLactate() {
        return chemicals.get("Lactate");
    }
    public double getATP() {
        return chemicals.get("ATP");
    }
    public double getGlucose() {
        return chemicals.get("Glucose");
    }
    public double getCreatineKinase() {
        return chemicals.get("Creatine kinase");
    }
    public double getTroponin() {
        return chemicals.get("Troponin");
    }

    //public void interactNeighbors(ArrayList<Cell> neighbors){
    //leave blank
    //}
}




