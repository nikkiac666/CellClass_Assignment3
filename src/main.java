
public static void main(String[] args) {
    CellAutomata cell = new CellAutomata(-56 ,-1 , 5 , 7 );

    //print cell strength, x and y coordinates, ID
    System.out.println("Stength: " + cell.getStrength());
    System.out.println("(x,y): (" + cell.getXcoordinate() + "," + cell.getYcoordinate() + ")");
    System.out.println("Cell ID: " + cell.getId() + "\n");

    //print chemicals
    System.out.println("Lactate levels: " + cell.getLactate() + " mmol/L");
    System.out.println("ATP levels: " + cell.getATP() + " mmol/L");
    System.out.println("Glucose levels: " + cell.getGlucose() + " mmol/L");
    System.out.println("Creatine kinase levels: " + cell.getCreatineKinase() + " U/L");
    System.out.println("Troponin levels: " + cell.getTroponin() + " ng/mL \n");

    ImmuneCell firstCell = new ImmuneCell(1, 1);

    System.out.println("Immune cell strength: "+ firstCell.strength);
    System.out.println("Immune cell (x,y): (" + firstCell.xcoordinate + "," + firstCell.ycoordinate + ")");
    System.out.println("Immune cell ID: " + firstCell.id + "\n");

    TissueCell secondCell = new TissueCell(1, 1);

    System.out.println("Tissue cell strength: "+ secondCell.strength);
    System.out.println("Tissue cell (x,y): (" + secondCell.xcoordinate + "," + secondCell.ycoordinate + ")");
    System.out.println("Tissue cell ID: " + secondCell.id + "\n");

    DeadCell thirdCell = new DeadCell(1, 1);

    System.out.println("Dead cell strength: "+ thirdCell.strength);
    System.out.println("Dead cell (x,y): (" + thirdCell.xcoordinate + "," + thirdCell.ycoordinate + ")");
    System.out.println("Dead cell ID: " + thirdCell.id + "\n");

    CancerCell fourthCell = new CancerCell(1, 1);

    System.out.println("Cancer cell strength: "+ fourthCell.strength);
    System.out.println("Cancer cell (x,y): (" + fourthCell.xcoordinate + "," + fourthCell.ycoordinate + ")");
    System.out.println("Cancer cell ID: " + fourthCell.id + "\n");
}
