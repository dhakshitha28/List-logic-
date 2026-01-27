public class MyList {
    private int size;
    private int[] array ;
    public MyList(int size){
        this.array=new int[size];
    }

    public MyList(){
        this.size=0;
        this.array=new int[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }


    public void add(int value){
        int []temp=new int[size+1];
        temp[size]=value;
        for (int i=0;i<size;i++){
            temp[i]=array[i];
            }
        size=size+1;
        array=temp;
        }
        public int size(){
         return size;
        }

        public boolean isEmpty(){
        for (int i=0;i<size;i++){
            if (array[i]==0){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
        }

        public int getElement(int index){
         int element=array[index];
         return element;
        }
        public void setValue(int index,int element){
        if(size>=index) {
            array[index] = element;
        }
        else {
            System.out.println("ur index value is invalided");
        }
        }

}
