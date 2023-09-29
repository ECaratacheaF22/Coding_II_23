public class Cell {
    private String CellName;
    private Boolean DoorOpen;
    private int secCode;

    public Cell (String CellName, Boolean DoorOpen, int secCode){
        this.CellName = CellName;
        this.DoorOpen = DoorOpen;
        this.secCode = secCode;
    }

    public String getName(){
        return CellName;
    }

    public boolean getDoorOpen(){
        return DoorOpen;
    }

    public void setDoorOpen(int code){
        if (code != secCode){
            System.out.println("That code is incorrect");
        } else {
            if (DoorOpen){
                DoorOpen = false;
                System.out.println("Cell Door has Closed" );
            } else {
                DoorOpen = true;
                System.out.println("Cell Door has Opened" );
            }
        }
    }
}
