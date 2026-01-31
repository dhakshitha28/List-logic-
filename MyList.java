public class MyList {
    private int size;
    private int[] array;

    public MyList(int arraySize) {
        this.array = new int[arraySize];
    }

    public MyList() {
        this.size = 0;
        this.array = new int[size];
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

    public void add(int value) {
        if (size < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = value;
                    size++;
                    break;
                } else {
                    continue;
                }
            }
        } else {
            int[] temp = new int[size + 1];
            temp[size] = value;
            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            size = size + 1;
            array = temp;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }


    public int getElement(int index) {
        if (index != 0) {
            int element = array[index];
            return element;
        }
        return -1;
    }


    public void addValueUsingIndex(int index, int element) {
        int[] temp = new int[size + 1];
        for (int i = 0; i < size; i++) {
            if (i < index) {
                temp[i] = array[i];
            }
            if (i == index) {
                temp[i] = element;
            }
            if (i > index) {
                temp[i + 1] = array[i];
            }
        }
        array = temp;
        size++;
    }


    public void setValue(int index, int element) {
        int[] temp = new int[size + 1];
        for (int i = 0; i < size; i++) {
            if (i < index) {
                temp[i] = array[i];
            }
            if (i == index) {
                temp[i] = element;
            }
            if (i > index) {
                temp[i + 1] = array[i];
            }
        }
        array = temp;
        size++;
    }

    public void remove(int index) {
        int count = 0;
        if (size >= index) {
            array[index] = 0;
            int[] temp = new int[size - 1];
            for (int i = 0; i < size - 1; i++) {
                if (array[i] != 0) {
                    temp[i] = array[i];
                }
                if (array[i] == 0) {
                    count++;
                    temp[i] = array[i + count];
                    count = 0;
                }
            }
            array = temp;
            size--;
        } else {
            System.out.println("Ur index is invalided");
        }
    }

    public boolean removeElement(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                array[i] = 0;
                int count = 0;
                int[] temp = new int[size - 1];
                for (int j = 0; j < size - 1; j++) {
                    if (array[j] != 0) {
                        temp[j] = array[j];
                    }
                    if (array[j] == 0) {
                        count++;
                        temp[j] = array[j + count];
                        count = 0;
                    }
                }
                array = temp;
                size--;
                return true;
            }
        }
        return false;
    }


    public boolean contains(int elements) {
        for (int i = 0; i < size; i++) {
            if (array[i] == elements) {
                return true;
            }
        }
        return false;
    }


    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int element) {
        for (int i = size - 1; i > 0; i--) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        int[] temp = new int[0];
        array = temp;
    }

    public boolean addAll(MyList list2) {
        if (list2.getSize() == 0) {
            return false;
        }
        else {
            int sizeOfTempArray = size + list2.getSize();
            int[] temp = new int[sizeOfTempArray];
            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            for (int j = 0; j < list2.getSize(); j++) {
                temp[size + j] = list2.getArray()[j];
            }
            array = temp;
            size = sizeOfTempArray;

            return true;
        }
    }

    public boolean addAll(int index, MyList list2) {
        if (list2.getSize() == 0) {
            return false;
        } else {
            int sizeOfTempArray = size + list2.getSize();
            int[] temp = new int[sizeOfTempArray];
            for (int i = 0; i < index; i++) {
                temp[i] = array[i];
            }
            for (int j = 0; j < list2.getSize(); j++) {
                temp[index + j] = list2.getArray()[j];
            }
            for (int i = index; i < size; i++) {
                temp[i + list2.getSize()] = array[i];
            }
            array = temp;
            size = sizeOfTempArray;

            return true;
        }

    }
}