package sec02;

class ParentCls{
    public ParentCls() {
    }
}

class RestrictCls extends ParentCls{
    public RestrictCls() {
    }
}

class Brother extends ParentCls{

}

class Sibling extends ParentCls{

}

class Season extends RestrictCls{

}
class Seasaw extends Brother{

}



public class ChildGen<T extends RestrictCls> {
    public ChildGen() {
    }
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
