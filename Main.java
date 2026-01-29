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

    }
}