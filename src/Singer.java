/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aidan Glas
 */
public class Singer
{
    private String name;
    private int age;

    public Singer(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public Singer()
    {
        this.name = "";
        this.age = 0;
    }

    @Override
    public String toString()
    {
        return "Singer{" + "name=" + name + ", age=" + age + '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    
    
}
