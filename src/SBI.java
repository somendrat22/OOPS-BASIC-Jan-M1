public class SBI implements Bank{
    // Method overloading is compile time polymorphism
    // Implement was something that just provide behaviour not properties
    public void deposit(){
        int y = x;
    }


    public int  deposit(int x, int y){
        return 5;
    }

    public String deposit(String x, String y){

    }

    public void deposit(int x, String y){

    }

    public void withdraw(){

    }

}
