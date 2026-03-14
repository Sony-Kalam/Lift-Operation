import java.util.*;
class lift_order
{
Scanner s=new Scanner(System.in);
int curfloor=0;
void operating_lift()
{
System.out.println("Requested floor : ");
int reqfloor = s.nextInt();
int[] arrfloor= {0,1,2,3,4,5};
if(reqfloor>curfloor&& reqfloor<6)
{
for(int i=curfloor;i<=reqfloor;i++)
{
System.out.println("current floor:"+arrfloor[i]);
}
curfloor=reqfloor;
System.out.println("you have reached your requested floor!");
}
else if(reqfloor<curfloor && reqfloor>=0)
{
for(int i=curfloor;i>=reqfloor;i--)
{
System.out.println("current floor:"+arrfloor[i]);
}
curfloor=reqfloor;
System.out.println("you have reached your requested floor!");
}
else if (reqfloor==curfloor)
{
System.out.println("you are already in the same floor");
}
else
{
System.out.println("the requested floor doesn't exist");
}
}
}
class lift_operation
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
System.out.println("number of persons entered inside the lift:");
int persons=s1.nextInt();
if(persons<7)
{
System.out.println("Wait till the doors closed....!");
System.out.println("Lift Initialised at ground floor(0)");
System.out.println("Total floors:0,1,2,3,4,5");
int j=1;
lift_order obj=new lift_order();
while(j<=persons)
{
obj.operating_lift();
j++;
}
}
else
{
int remaining = persons - 6;
System.out.println("Only 6 persons are allowed inside the lift");
System.out.println("Could any "+remaining+" of you please wait outside for few minutes..!");
}
}
}