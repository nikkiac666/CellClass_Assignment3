public static void main(String[] args) {
    CellAutomata cell = new CellAutomata(2 ,1 , 1 , 1 );

    //print cell strength, x and y coordinates, ID
    System.out.println("Strength: " + cell.getStrength());
    System.out.println("(x,y): (" + cell.getXcoordinate() + "," + cell.getYcoordinate() + ")");
    System.out.println("Cell ID: " + cell.getId() + "\n");

    //print chemicals
    System.out.println("Lactate levels: " + cell.getLactate() + " mmol/L");
    System.out.println("ATP levels: " + cell.getATP() + " mmol/L");
    System.out.println("Glucose levels: " + cell.getGlucose() + " mmol/L");
    System.out.println("Creatine kinase levels: " + cell.getCreatineKinase() + " U/L");
    System.out.println("Troponin levels: " + cell.getTroponin() + " ng/mL \n");

    ImmuneCell firstCell = new ImmuneCell(1,1);

    System.out.println("Immune cell strength: "+ firstCell.getStrength());
    System.out.println("Immune cell (x,y): (" + firstCell.getXcoordinate() + "," + firstCell.getYcoordinate() + ")");
    System.out.println("Immune cell ID: " + firstCell.getId() + "\n");

    TissueCell secondCell = new TissueCell(1, 1);

    System.out.println("Tissue cell strength: "+ secondCell.getStrength());
    System.out.println("Tissue cell (x,y): (" + secondCell.getXcoordinate() + "," + secondCell.getYcoordinate() + ")");
    System.out.println("Tissue cell ID: " + secondCell.getId() + "\n");

    DeadCell thirdCell = new DeadCell(1, 1);

    System.out.println("Dead cell strength: "+ thirdCell.getStrength());
    System.out.println("Dead cell (x,y): (" + thirdCell.getXcoordinate() + "," + thirdCell.getYcoordinate() + ")");
    System.out.println("Dead cell ID: " + thirdCell.getId() + "\n");

    CancerCell fourthCell = new CancerCell(1, 1);

    System.out.println("Cancer cell strength: "+ fourthCell.getStrength());
    System.out.println("Cancer cell (x,y): (" + fourthCell.getXcoordinate() + "," + fourthCell.getYcoordinate() + ")");
    System.out.println("Cancer cell ID: " + fourthCell.getId() + "\n");
}
