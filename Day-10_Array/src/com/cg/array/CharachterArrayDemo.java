package com.cg.array;

class CharachterArrayDemo
{ 

	public static void main(String[] args)
	{
      char arr[]= {'a', 'b', '1','?', 'A'};
      for(int i=0;i<arr.length;i++)
      {
    	  if(Character.isDigit(i));
    	  {
    	  System.out.println(arr[i]+" is a digit");
          }
    	  if(Character.isLetter(i));
    	  {
    	  System.out.println(arr[i]+" is a Letter");
    	  }
         
    	  if(Character.isWhitespace(arr[i]))
    	  {
    	  System.out.println(arr[i]+" is a Whitespace");
          }
    	  if(Character.isUpperCase(arr[i]))
    	  {
    	  System.out.println(arr[i]+" is a Uppercase");
          }
    	  if(Character.isLowerCase(arr[i]))
    	    {
    	    System.out.println(arr[i]+" is a lowecase");
    	      }


}
}

}
