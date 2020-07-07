/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aidan Glas
 */
public class Song
{
    private Singer singer;
    private String name;
    private int year;

    public Song(Singer singer, String name, int year)
    {
        this.singer = singer;
        this.name = name;
        this.year = year;
    }
    
    public Song()
    {
        this.singer = new Singer();
        this.name = "";
        this.year = 0;
    }

    @Override
    public String toString()
    {
        return "Song{" + "singer=" + singer + ", name=" + name + ", year=" + year + '}';
    }

    public Singer getSinger()
    {
        return singer;
    }

    public void setSinger(Singer singer)
    {
        this.singer = singer;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
    
    
}
