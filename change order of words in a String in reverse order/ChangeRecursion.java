class ChangeRecursion
{
static void changeorder(String str)
{
int count=0;
String[] arr=str.split(" ");
count=arr.length;
while(count>0){
System.out.println(arr[count-1]);
count--;
}
}
public static void main(String args[])
{
String str= new String("one two three");
changeorder(str);
}
}