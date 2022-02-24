import java.io.*;
import java.util.Scanner;

class DoublyLinkedlist{
Node head = null;
class Node{
int data;
Node next;
Node prev;
public Node(int data){
this.data = data;
this.next = null;
this.prev = null;
}
}

public void insert(int data){
Node temp = new Node(data);

if(head == null){
head = temp;
}
else{
Node ptr = head;
while(ptr.next != null){
ptr = ptr.next;
}
ptr.next = temp;
temp.prev = ptr;
}
System.out.println("Entered Data is : "+data);
}
public void delete(){

try{
if(head == null){
System.out.println("List is empty");
}

else{
int data = head.data;
head = head.next;
head.prev = null;
System.out.println("Removed Data is : "+data);
}}catch(Exception e){System.out.println("List is empty now");}
}

public void display(){
Node temp = head;
if(head == null){
System.out.println("List is empty");
}
else{
while(temp != null){
System.out.print(temp.data+" ");
temp = temp.next;
}
}
}

}
public class LinkedList{
public static void main(String args[]) throws NullPointerException{
DoublyLinkedlist dll = new DoublyLinkedlist();
int opt = 0;

while(opt != 4){
System.out.print("\n1. Insert at end\n2. Delete at front\n3. Display linked list\n4. Exit");
System.out.print("\nEnter your choice : ");
Scanner sc = new Scanner(System.in);
opt = sc.nextInt();
switch(opt){
case 1 : System.out.print("Enter the element : ");
int data = sc.nextInt();
dll.insert(data);
break;
case 2 : dll.delete();
break;

case 3 : dll.display();
break;

case 4 : break;
default : System.out.print("Invalid choice");
 break;

}
}
}

}
