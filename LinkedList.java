
import java.util.*; 
class Node 
{ 
 protected int regd_no; 
 protected float mark; 
 protected Node  next; 
} 
 
class LinkedList  
{     
static Node start = null; 
  public static void create() 
  { 
      Scanner sc = new Scanner(System.in); 
      Node p; 
      Node last = null; 
      System.out.println("How many nodes are created"); 
      int n = sc.nextInt(); 
      for(int i = 1;i<=n;i++) 
      { 
          p = new Node(); 
          System.out.println("Enter reg no"); 
          p.regd_no = sc.nextInt(); 
          System.out.println("Enter marks "); 
          p.mark = sc.nextFloat(); 
          p.next = null; 
          if(start == null) 
          { 
              start = p; 
              last = p; 
          } 
          else 
          { 
              last.next = p; 
              last = p; 
          } 
      } 
  } 
  public static void display(Node start) 
  { 
      Node q = start; 
      if(start == null) 
      { 
           System.out.println("Empty linked list"); 
      } 
      else 
      { 
           System.out.println("Reg no \t marks"); 
           while(q!=null) 
           { 
               System.out.println(q.regd_no+"\t"+q.mark); 
               q = q.next; 
           } 
      } 
  } 
 
  public static Node InsBeg(Node start) 
  { 
      Scanner sc = new Scanner(System.in); 
      Node p = new Node(); 
      System.out.println("Enter reg no"); 
      p.regd_no = sc.nextInt(); 
      System.out.println("Enter marks "); 
      p.mark = sc.nextFloat(); 
      p.next = start; 
      start = p; 
      return start; 
  } 
 
public static Node InsEnd(Node start) 
  { 
      Scanner sc = new Scanner(System.in); 
      Node p = new Node(); 
      System.out.println("Enter reg no"); 
      p.regd_no = sc.nextInt(); 
      System.out.println("Enter marks "); 
      p.mark = sc.nextFloat(); 
      p.next = null; 
if(start == null) 
      { 
           start = p; 
      } 
else 
      { 
          Node q = start; 
          while(q.next!=null) 
          { 
               q = q.next; 
          } 
         q.next = p; 
          
} 
          return start; 
  } 
   
  public static Node InsAny(Node start) 
  { 
      Scanner sc = new Scanner(System.in); 
      Node p = new Node(); 
      System.out.println("Enter reg no"); 
      p.regd_no = sc.nextInt(); 
      System.out.println("Enter marks "); 
      p.mark = sc.nextFloat(); 
      p.next = null; 
      System.out.println("Enter the inserted position"); 
      int pos = sc.nextInt(); 
      if(pos<=0) 
      { 
           p.next = start; 
           start = p; 
           System.out.println("Invalid Position, so node add first position"); 
      } 
      else if(start == null && pos == 1) 
      { 
           p.next = start; 
           start = p; 
          System.out.println("Node inserted at first position"); 
      } 
      else 
      { 
           Node q = start; 
           for(int i = 1;i<pos-1 && q.next!=null; i++) 
           { 
               q = q.next; 
           } 
           if(q.next == null) 
           { 
                q.next = p; 
              System.out.println("Position not found, node inserted at last position"); 
           } 
           else 
           { 
               p.next = q.next; 
               q.next = p; 
              System.out.println("Node inserted at "+pos+" position"); 
           } 
      } 
      return start; 
  } 
   
  public static Node DelBeg(Node start) 
  { 
      if(start == null) 
      { 
           System.out.println("Empty linked list"); 
      } 
      else 
      { 
       Node p = start; 
       start = start.next; 
       System.out.println("Delated node details: regd no:"+p.regd_no+", and marks: "+p.mark); 
      } 
      return start; 
  } 
   
  public static Node DelEnd(Node start) 
  { 
      if(start == null) 
      { 
           System.out.println("Empty linked list"); 
      } 
      else if(start.next == null) 
      { 
           Node p = start; 
           start = null; 
           System.out.println("Delated node details: regd no:"+p.regd_no+", and marks: "+p.mark); 
      } 
      else 
      { 
       Node q = start; 
       Node p = start; 
       while(p.next!=null) 
       { 
            q = p; 
            p = p.next; 
       } 
       q.next = null; 
       System.out.println("Delated node details: regd no:"+p.regd_no+", and marks: "+p.mark); 
      } 
      return start; 
  } 
   
  public static Node DelAny(Node start) 
  { 
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter the deleted position"); 
      int pos = sc.nextInt(); 
      if(pos<=0) 
      { 
           System.out.println("Invalid Position, delete not possible"); 
      } 
else if(start == null) 
{ 
   System.out.println("Empty linked list"); 
} 
      else if(pos == 1) 
      { 
           Node p = start; 
           start = start.next; 
           System.out.println("Delated node details: regd no:"+p.regd_no+", and marks: "+p.mark); 
      } 
      else 
      { 
           Node q = start; 
           for(int i = 1;i<pos-1 && q.next!=null; i++) 
           { 
               q = q.next; 
           } 
           if(q.next == null) 
           { 
              System.out.println("Position not found, delete not possible"); 
           } 
           else 
           { 
               Node p = q.next; 
               q.next = p.next; 
              System.out.println("Delated node details: regd no:"+p.regd_no+", and marks: "+p.mark); 
           } 
      } 
      return start; 
  } 
 
 public static Node DelByRegNo(Node start) 
  { 
  Scanner sc = new Scanner(System.in); 
      if(start == null) 
      { 
           System.out.println("Empty linked list"); 
      } 
      else 
      { 
       Node p = start; 
       start = start.next; 
       System.out.println("Delated node details: regd no:"+p.regd_no+", and marks: "+p.mark); 
      } 
      return start; 
  } 
 
   
  public static int count(Node start) 
  { 
      int count = 0; 
      if(start == null) 
      { 
           System.out.println("Empty linked list"); 
      } 
      else 
      { 
           Node q = start; 
           while(q!=null) 
           { 
               count++; 
               q = q.next; 
           } 
      } 
      return count; 
  } 
   
  public static Node Search(Node start) 
  { 
      Scanner sc = new Scanner(System.in); 
      if(start == null) 
      { 
           System.out.println("Empty linked list, search not possible"); 
      } 
      else 
      { 
           System.out.println("Enter the registration number based on search node "); 
           int regd_no = sc.nextInt(); 
           Node q = start; 
           while(q!=null) 
           { 
               if(q.regd_no == regd_no) 
               { 
                   System.out.println("Enter the updated marks "); 
                   q.mark = sc.nextFloat(); 
                   System.out.println("Marks updated"); 
                   break; 
               } 
               q = q.next; 
           } 
      } 
      return start; 
  } 
 
public static Node sort(Node start) 
  { 
      if(start == null) 
      { 
           System.out.println("Empty linked list"); 
      } 
      else 
      { 
           Node m = start; 
           while(m.next!=null) 
           { 
    Node  p = start; 
               Node q = p.next; 
               while(q!=null) 
               { 
                   if(p.mark>q.mark) 
                   { 
                       int reg = p.regd_no; 
                       float mark = p.mark; 
                       p.regd_no = q.regd_no; 
                       p.mark = q.mark; 
                       q.regd_no = reg; 
                       q.mark = mark; 
                   } 
     p = p.next; 
     q = q.next; 
            } 
    m = m.next; 
   } 
      } 
      return start; 
  } 
 
public static Node reverse(Node start) 
{ 
  if(start == null) 
  { 
   System.out.println("Empty linked list"); 
  } 
  else 
  { 
   Node p = start; 
   Node q = start.next; 
   start.next = null; 
   while(q!=null) 
{ 
    p = q; 
              q = q.next; 
              p.next = start; 
              start = p; 
} 
  }   
return start; 
} 
public static void main(String[] args)  
{ 
      Scanner sc = new Scanner(System.in); 
      int n; 
      char ch; 
      do  
{ 
          System.out.println("Press 1: create\n Press 2: display\n Press 3: Insert beginning\n Press 4: Insert last\n Press 5: Insert any position\n Press 6: Delete first\n Press 7: delete last\n Press 8: delete any position\n Press 9: Search by reg_no\n Press 10: Count nodes\n Press 11: sort list\n Press 12: Reverse the list"); 
              
          System.out.println("Enter your choice "); 
          n = sc.nextInt(); 
          switch(n) 
          { 
              case 1:create();break; 
              case 2: display(start);break; 
              case 3: start = InsBeg(start); break; 
              case 4: start = InsEnd(start); break; 
              case 5: start = InsAny(start); break; 
              case 6: start = DelBeg(start); break; 
              case 7: start = DelEnd(start); break; 
              case 8: start = DelAny(start); break; 
              case 9: Search(start); break; 
              case 10: int c = count(start); 
              System.out.println("Number of nodes are "+c); 
              break; 
              case 11: start = sort(start); break; 
    case 12: start = reverse(start); break; 
    default: System.out.println("Wrong input"); 
          } 
          System.out.println("Press y for continue operation"); 
          ch = sc.next().charAt(0); 
      }while(ch=='y'||ch=='Y'); 
 } 
} 