public class PlayerName implements Player{
    public String color;
    public int energy;
    public String location;
    public PlayerName (String location)
    {
        this.location=location;
    }

    public void setColor(String color)
    {
        this.color=color;
    }

    public void setEnergy(int energy)
    {
        this.energy=energy;
    }


    @Override
    public void create() {
        System.out.println("Player have Color:"+color+"\t\tEnergy:"+energy+"% War Location ::"+location);
    }
}
