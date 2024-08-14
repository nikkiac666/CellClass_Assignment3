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

    public int getStrength() {
        return strength;
    }
    public void setStrength() {
        if (strength >= 0) {
            this.strength = strength;
        } else {
            this.strength = 0;
        }
    }


    public void setXcoordinate() {
        if (xcoordinate >= 0) {
            this.xcoordinate = xcoordinate;
        } else {
            this.xcoordinate = 0;
        }
    }
    public int getXcoordinate() {
        return this.xcoordinate;
    }

    public void setYcoordinate() {
        if (ycoordinate >= 0) {
            this.ycoordinate = ycoordinate;
        } else {
            this.ycoordinate = 0;
        }
    }
    public int getYcoordinate() {
        return this.ycoordinate;
    }

    public void setId() {
        if (id >= 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }
    public int getId() {
        return this.id;
    }

    //public void interactNeighbors(ArrayList<Cell> neighbors){
        //leave blank
   // }

    public static void main(String[] args) {
        CellAutomata Cell = new CellAutomata(-56 ,-1 , 5 , 7 );

        Cell.setStrength();
        Cell.setXcoordinate();
        Cell.setYcoordinate();
        Cell.setId();

        System.out.println(Cell.getStrength());
        System.out.println(Cell.getXcoordinate());
        System.out.println(Cell.getYcoordinate());
        System.out.println(Cell.getId());
    }
}




