
import java.util.ArrayList;

/**
 *
 * @author Aidan Glas
 */
public class app
{

    public static void main(String[] args)
    {
        ArrayList<Song> songs = new ArrayList();
        
        Singer si1 = new Singer("Varials", 20);
        Song so1 = new Song(si1, "In Darkness", 2018);
        
        Singer si2 = new Singer("WYS", 23);
        Song so2 = new Song(si2, "Snowman", 2019);
        
        Singer si3 = new Singer("Palisades", 28);
        Song so3 = new Song(si3, "Bad Girls", 2020);
        
        songs.add(so1);
        songs.add(so2);
        songs.add(so3);
        
        Playlist p1 = new Playlist("Aidan", songs);
        
        System.out.println(p1.getOwner());
        System.out.println(si2.getName());
        System.out.println(p1.findSongBySingerName("WYS"));
    }
    
}
