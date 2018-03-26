
import java.util.ArrayList;
import java.util.List;

class BasicStack{

    public static void main(String[] arg){

    }

}

class BasicArrayStack<E> implements Stack<E>{

    private int basicStackCounter;

    private E[] valuesList;

    BasicArrayStack(int listLimit){
        valuesList =(E[])new Object[listLimit];
        basicStackCounter=0;

    }
    @Override
    public void addItem(E item) {

        valuesList[basicStackCounter++]=item;

    }

    @Override
    public E accessItem() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public E removeItem() {
        --basicStackCounter;
        return null;
    }
}


class ListStack<E> implements Stack<E>{

    @Override
    public void addItem(E item) {

    }

    @Override
    public E accessItem() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public E removeItem() {
        return null;
    }
}

interface Stack<E>{

    void addItem(E item);

    E accessItem();

    int getSize();

    E removeItem();
}