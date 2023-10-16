class Change
{
public static void main(String args[])
{
String str=new String("one two three");
String arr[]=str.split(" ");
int k=arr.length;
for(int i=k-1;i>=0;i--){
System.out.println(arr[i]);
}
}
}
