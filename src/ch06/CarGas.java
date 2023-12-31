package ch06;

public class CarGas {
    int gas;

    void setGas(int gas){
        this.gas = gas;
    }

    boolean isGasLeft() {
        if(gas == 0){
            System.out.println("gas가 없습니다");
            return false;
        }
        System.out.println("gas가 있습니다");
        return  true;
    }

    void run(){
        while(true){
            if(gas > 0){
                System.out.println("달립니다. (gas 잔량 : " + gas +")");
                gas -=1;
            } else {
                System.out.println("멈춥니다. (gas 잔량 : " + gas +")");
                return;
            }
        }
    }

    static void simulate(){
        CarGas myCar = new CarGas();
        myCar.gas = 10;
        myCar.run();
    }

    static void main(String[] args){
        simulate();

        CarGas myCar = new CarGas();
        myCar.gas = 7;
        myCar.run();
    }
}
