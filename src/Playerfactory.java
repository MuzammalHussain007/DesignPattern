import java.util.HashMap;

public class Playerfactory {
    private static HashMap<String ,Player> map= new HashMap<String ,Player>();

    public static Player getPlayer(String location)
    {
        PlayerName pn = (PlayerName) map.get(location);
        if (pn==null)
        {
             pn=new PlayerName(location);
             map.put(location,pn);
             System.out.println("Creating Player of Location"+location);
        }
        return pn;

    }
}
