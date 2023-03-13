package Generic_class;

public class MyGeneric<T1> {
	int val = 344;
    private T1 t1;

    public void setVal(int val) {
        this.val = val;
    }
    public int getVal() {
        return val;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
    public T1 getT1() {
        return t1;
    }

    public MyGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }
}
