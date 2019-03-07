package ch06;

enum Gendar{
    F,M
}

public enum  Size {

    S("small"),M,L,XL,XXL;
    private int i = 1;
    private String size;
    public void foo(){}
    Size(){}
    Size(String s){
        this.size=s;
    }
}
