public class Main {
    public static void  main(String[] args){
        //List 1
        MyList list1=new MyList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println(list1.getElement(0));
        list1.setValue(10,20);


        //List 2
        MyList list2=new MyList(5);
        list2.add(10);
        list2.add(20);
        list2.add(30);

    }
}