
import java.util.ArrayList;

/**
 *
 * @author Aidan Glas
 */
public class Playlist
{
    private String owner;
    private ArrayList<Song> songs;

    public Playlist(String owner, ArrayList<Song> songs)
    {
        this.owner = owner;
        this.songs = songs;
    }
    
    public Playlist()
    {
        this.owner = owner;
        this.songs = songs;
    }

    @Override
    public String toString()
    {
        return "Playlist{" + "owner=" + owner + ", songs=" + songs + '}';
    }

    public Song findSongBySingerName(String singerName) {
        for (int i = 0; i < songs.size(); i++) {
            if (singerName.matches(songs.get(i).getSinger().getName())) 
            {
                return songs.get(i);
            }
        }
        return null;
    }
    
    public ArrayList<Song> getSongs()
    {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs)
    {
        this.songs = songs;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    
    
}
