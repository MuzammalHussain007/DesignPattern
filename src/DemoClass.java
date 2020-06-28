public class DemoClass {
   private static final String []
    location = new String[]{"Erangel","Miramar","Vikendi","Sanhok"};
    private static final int []
            energy = new int[] {30,20,85,50};
    private static final String []
            color = new String[]{"Red","Yellow","White","Black"};


    public static void main(String args[])
    {
   for (int i=0;i<5;i++)
   {
       PlayerName p= (PlayerName) Playerfactory.getPlayer(getRandomlocation());
       p.setColor(getRandomcolor());
       p.setEnergy(getRandomenergy());
       p.create();
   }
    }
    private static String getRandomlocation()
    {
        return location[(int)(Math.random()*location.length)];
    }

    private static int getRandomenergy()
    {
        return energy[(int)(Math.random()*energy.length)];
    }

    private static String getRandomcolor()
    {
        return color[(int)(Math.random()*energy.length)];
    }
}
