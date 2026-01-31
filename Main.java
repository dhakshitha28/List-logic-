public class Main {
    public static void  main(String[] args){
        //List 1
        MyList list1=new MyList();
        list1.add(10);
        list1.add(20);
        list1.add(10);
        list1.add(40);
        list1.add(50);
        list1.add(10);

        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println(list1.getElement(0));
        list1.setValue(3,20);
        //list1.remove(1);
        //list1.removeElement(40);
        // list1.clear();
        list1.contains(30);
        System.out.println(list1.indexOf(60));
        System.out.println(list1.lastIndexOf(10));
        list1.addValueUsingIndex(1,100);


        //List 2
        MyList list2=new MyList(3);
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(10);
        list2.add(40);
        list2.add(50);
        list2.add(10);

        System.out.println(list2.size());
        System.out.println(list2.isEmpty());
        System.out.println(list2.getElement(0));
        list1.setValue(1,20);
        //list2.remove(1);
        //list2.removeElement(40);
        // list2.clear();
        list2.contains(30);
        System.out.println(list2.indexOf(60));
        System.out.println(list2.lastIndexOf(10));

        //String 1
        MyListString stringList1=new MyListString();
        stringList1.add("apple");
        stringList1.add("Ball");
        stringList1.add("cat");
        stringList1.add("Dog");
        stringList1.add("Egg");

        System.out.println(stringList1.size());
        System.out.println(stringList1.getElement(1));
        //stringList1.clear();
        stringList1.remove(4);
        stringList1.removeElement("Egg");
        stringList1.contains("apple");
        stringList1.indexOf("cat");
        stringList1.lastIndexOf("Dog");
        stringList1.isEmpty();


        //String2
        MyListString stringList2=new MyListString(10);
        stringList2.add("apple");
        stringList2.add("Ball");
        stringList2.add("cat");
        stringList2.add("Dog");
        stringList2.add("Egg");
        stringList2.add("cat");
        stringList2.add("Dog");
        stringList2.add("Egg");
        stringList2.add("cat");
        stringList2.add("Dog");
        stringList2.add("Egg");

        System.out.println(stringList2.size());
        System.out.println(stringList2.getElement(1));
        //stringList2.clear();
        stringList2.remove(4);
        stringList2.removeElement("Egg");
        stringList2.contains("apple");
        stringList2.indexOf("cat");
        stringList2.lastIndexOf("Dog");
        stringList2.isEmpty();

    }
}
