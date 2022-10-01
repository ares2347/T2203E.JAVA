package session_6;

public class Main {
    public static void main(String[] args){
        try{
            int x =10;
            int y=0;
            if(y==0){
                throw new NullPointerException();// throw active Exception
            }
            System.out.println(x+":"+y+"=");
            int z = x/y;
            System.out.println(z);
        }catch (ArithmeticException aerr){
            System.out.println("Arith Error");
        }catch(NullPointerException nullerr){
            // loi chua duoc cap o nho
            System.out.println("Null");
        }catch(Exception err){
            System.out.println("Error");
        }finally {
            //always exec
        };

    }
}
