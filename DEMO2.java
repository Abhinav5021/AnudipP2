class Demo{
    public void m(){
        System.out.println("Hello");
    }
}

class My{
    Demo d;
    public void Show(){
        d.m();
    }
}

public class DEMO2 {
    public static void main(String[] args) {
        My s = new My();
        s.Show();
    }
}
