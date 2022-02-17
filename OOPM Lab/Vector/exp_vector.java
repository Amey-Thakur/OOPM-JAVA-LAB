import java.util.Vector;

class exp_vector
{
public static void main(String [] args)
{
//creation of an object of the vector class
Vector<Integer> v=new Vector<Integer>(15,3);

//add method adds data in vector which gets appended
v.add(24);
v.add(33);
v.add(26);
v.add(70);

//add method adds data at a specific index in the vector 
v.add(1,25);

//displaying the contents of the vector
System.out.println(v);

//size method display the number of elements that are stored in the vector
System.out.println(v.size());

//capacity method displays the total capacity of the vector
System.out.println(v.capacity());

//contains method checks whether the specified element is present in the vector or not. If the element is present then true is returned else false 
System.out.println((v.contains(26));

//This method returns the element at the specified position in this Vector 
System.out.println("Element at index 2 is: " + v.get(2)); 

//This method returns the index of the first occurrence of the specified element in this vector, or -1 if this vector does not contain the element. 
System.out.println("Index of 24 is: " + v.indexOf(24)); 

//This method tests if the vector is empty or not.If the vector is empty it returns true else false
System.out.println(v.isEmpty()); 

//This method removes the first occurrence of the specified element in this Vector If the Vector does not contain the element, it is unchanged. 
v.remove(1); 

//This method trims the capacity of this vector to be the vector’s current size. 
v.trimToSize(); 

//This method sets the component at the specified index of this vector to be the specified object. 
// Eg.set 4 at the place of 2 
v.setElementAt(4, 1); 

}
}
