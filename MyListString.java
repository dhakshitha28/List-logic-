public class MyListString {
    private int size;
    private String[] array;

    public MyListString(int arraySize) {
        this.array = new String[arraySize];
    }

    public MyListString() {
        this.size = 0;
        this.array = new String[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void add(String value) {
        if (size < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = value;
                    size++;
                    break;
                } else {
                    continue;
                }
            }
        } else {
            String[] temp = new String[size + 1];
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


    public String getElement(int index) {
        if (index != 0) {
            String element = array[index];
            return element;
        }
        return null;
    }

    public void addValueUsingIndex(int index, String element) {
        String[] temp = new String[size + 1];
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


    public void setValue(int index, String element) {
        String[] temp = new String[size + 1];
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
            array[index] = null;
            String[] temp = new String[size - 1];
            for (int i = 0; i < size - 1; i++) {
                if (array[i] != null) {
                    temp[i] = array[i];
                }
                if (array[i] == null) {
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


    public boolean removeElement(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                array[i] = null;
                int count = 0;
                String[] temp = new String[size - 1];
                for (int j = 0; j < size - 1; j++) {
                    if (array[j] != null) {
                        temp[j] = array[j];
                    }
                    if (array[j] == null) {
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

    public boolean contains(String elements) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(elements)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }


    public int lastIndexOf(String element) {
        for (int i = size - 1; i > 0; i--) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }


    public void clear() {
        String[] temp = new String[0];
        array = temp;
    }

    public boolean addAll(MyListString list2) {
        if (list2.getSize() == 0) {
            return false;
        } else {
            int sizeOfTempArray = size + list2.getSize();
            String[] temp = new String[sizeOfTempArray];
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

    public boolean addAll(int index, MyListString list2) {
        if (list2.getSize() == 0) {
            return false;
        } else {
            int sizeOfTempArray = size + list2.getSize();
            String[] temp = new String[sizeOfTempArray];
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
