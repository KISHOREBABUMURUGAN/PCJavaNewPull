
public class Enum {
enum gamelevel{
	high,
	low,
	medium
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
gamelevel g= gamelevel.high;
System.out.println(g);

//enum by switch
switch(g) {
case high:
	System.out.println("it is high");
	break;
case low:
	System.out.println("it is low");
	break;
case medium:
	System.out.println("it is medium");
	break;
}

//enum by enhanced forloop
for(gamelevel level : gamelevel.values()) {
	System.out.println(level);
}
	}

}
