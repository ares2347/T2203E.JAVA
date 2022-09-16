package session_1;
import java.lang.Math;

public class Triangle {

    int a;
    int b;
    int c;

    public boolean check(){
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Legit triangle");
            return true;
        }else{
            System.out.println("Wrong");
            return false;
        }
    }
    public int chuVi(){
        return (check() ? (a+b+c) : 0);
    }
    public double dienTich() {
        return (check() ? Math.sqrt(chuVi()/2*(chuVi()/2-a)*(chuVi()/2-b)*(chuVi()/2-c)) : 0);
    }

    //access and modify attribute should through get method
    public int getA(){
        return a;
    }
    public void setA(int newValue){
        this.a = newValue;
    }
}
