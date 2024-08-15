
public static void main(String[] args) {
    CellAutomata cell = new CellAutomata(-56 ,-1 , 5 , 7 );

    //print cell strength, x and y coordinates, ID
    System.out.println("Stength: " + cell.getStrength());
    System.out.println("(x,y): (" + cell.getXcoordinate() + "," + cell.getYcoordinate() + ")");
    System.out.println("Cell ID: " + cell.getId() + "\n");

    System.out.println("Lactate levels: " + cell.getLactate() + " mmol/L");
    System.out.println("ATP levels: " + cell.getATP() + " mmol/L");
    System.out.println("Glucose levels: " + cell.getGlucose() + " mmol/L");
    System.out.println("Creatine kinase levels: " + cell.getCreatineKinase() + " U/L");
    System.out.println("Troponin levels: " + cell.getTroponin() + " ng/mL");
}
