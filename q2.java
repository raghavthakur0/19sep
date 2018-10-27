import java.util.*;
class Stu
{
	private int id;
	private String name;
	Stu(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	int getId()
	{
		return id;
	}

}
public class q2
{
	public static void main(String args[])
	{
		Map<Integer,Stu> m = new HashMap<>();
		m.put(1,new Stu(10,"abc"));
		m.put(2,new Stu(11,"def"));
		m.put(3,new Stu(12,"ijk"));
		m.put(4,new Stu(13,"lmn"));
		 
		for(Map.Entry<Integer, Stu> e : m.entrySet())
		{  

        int key = e.getKey();  
        Stu b = e.getValue();  

        System.out.print(" Details for key "+key);  
        System.out.println(" id "+b.getId()+" name "+b.getName());   
    }    

	}
}