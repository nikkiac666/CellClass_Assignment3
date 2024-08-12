public class CellAutomata {
    private int strength; //strength of the cell used for combat; always >0
    private int xcoordinate; //cell coordinates; >=0
    private int ycoordinate;
    private int id; //distinguishes between cell types; always >=0

    public CellAutomata(int strength, int xcoordinate, int ycoordinate, int id) {
        this.strength = strength;
        this.xcoordinate = xcoordinate;
        this.ycoordinate = ycoordinate;
        this.id = id;
    }

    public CellAutomata() {
        this(0, 0, 0, 0);
    }

    public void setStrength(int strength) {
        if (strength >= 0) {
            this.strength = strength;
        } else {
            this.strength = 0;
        }
    }

    public int getStrength() {
        return this.strength;
    }

    public void setXcoordinate(int xcoordinate) {
        if (xcoordinate >= 0) {
            this.xcoordinate = xcoordinate;
        } else {
            this.xcoordinate = 0;
        }
    }

    public int getXcoordinate() {
        return this.xcoordinate;
    }

    public void setYcoordinate(int ycoordinate) {
        if (ycoordinate >= 0) {
            this.ycoordinate = ycoordinate;
        } else {
            this.ycoordinate = 0;
        }
    }

    public int getYcoordinate() {
        return this.ycoordinate;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    public int getId() {
        return this.id;
    }

    public void interactNeighbors(ArrayList<Cell> neighbors){
        //leave blank
    }

    public static void main(String[] args) {
        CellAutomata Cell = new CellAutomata(77 ,4 , 4 , 1 );

        System.out.println(Cell.strength);
        System.out.println(Cell.xcoordinate);
        System.out.println(Cell.ycoordinate);
        System.out.println(Cell.id);
    }
}




