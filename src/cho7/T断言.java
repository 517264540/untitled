package cho7;
 class  AA{
    public static void a(){
        assert 1>2:"meinamejiandan";
    }
}
 class BB{
    public static void b(){
        AA.a();
    }
}
class T断言 {
    public static void main(String[] args) {
        AA.a();
    }

}
