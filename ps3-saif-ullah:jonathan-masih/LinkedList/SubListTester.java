
/**
 * Write a description of class SubListTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SubListTester
{
    public static void main(String[] args){

        SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
        //Adding things in The list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Testing subList:");
        System.out.println(list.toString());
        System.out.println("Testing subList method with indexs 1 and 3 Expected: 4 3 Actual: " );
        System.out.println(list.subList(1,3).toString());

        //testing with empty list
        SimpleLinkedList<Integer> emptyList = new SimpleLinkedList<Integer>();
        System.out.println("\ntesting subList method with EmptyList Expected:  Actual: "+ emptyList .subList(0,0).toString() );

        //testing with string list
        SimpleLinkedList<String> stringList = new SimpleLinkedList<String>();
        stringList.add("Jon");
        stringList.add("Saif");
        stringList.add("Paul");
        stringList.add("Dog");
        stringList.add("Cat");
        System.out.println("\nTesting Stringlist with subList:");
        System.out.println(stringList.toString());
        System.out.println("\nTesting Stringlist with index 3 and 5 expected: Saif and Jon Acutal: ");
        System.out.println(stringList.subList(3,5).toString());

        //Testing with illgal indexes 
        System.out.println("\nTestin StringList with index 0 ,10 Expected: Illegal index value!  Acutal: ");
        try{
            stringList.subList(0,10).toString();
        }catch (IndexOutOfBoundsException nfe){

            System.out.println("Illegal index value!"); 
        }
    }
}
