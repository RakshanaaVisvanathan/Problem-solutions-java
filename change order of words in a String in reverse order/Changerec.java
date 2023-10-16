class Changerec
{
static void reverse(String[] arr,int index)
{
if(index>=0){
System.out.println(arr[index]);
reverse(arr,index-1);}
}
public static void main(String args[])
{
String str=new String("one two three");
String arr[]=str.split(" ");
int index=(arr.length)-1;
reverse(arr,index);
}
}