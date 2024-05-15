interface BaeMin {
    public void deliver();
}

abstract class Vehicle {

    protected int velocity; //속도 변수
    protected int wheelNum; //바퀴 개수
    public String carName;
    public Vehicle() {
        wheelNum = 6;
        velocity = 0;
    }
    public void setCarName(String name) {
        carName = name;
    }
    public abstract void speedUp() ;
}

class Car
{
    protected int velocity;
    protected int wheelNum;
    protected String carName;
    public Car()
    {
        wheelNum = 4;
        velocity = 100;
    }
    public void speedUp()
    {
        velocity++;
    }
}

class Cycle implements BaeMin //자전거 클래스 배민 인터페이스 참조
{
    int velocity;
    public void deliver()
    {
        System.out.println("자전거로 배달합니다.");
    }

    public void speedUp()
    {
        velocity++;
    }
}

public class Study extends Car implements BaeMin{ //트럭을 class 이름 때문에 Study로 바꿈
    public void speedUp() // Car 클래스 오버라이드
    {
        velocity += 30; //트럭 속도가 30 증가함
    }
    public void warn()
    {
        System.out.println("경적을 울림");
    }

    public void deliver()
    {
        System.out.println("트럭으로 배달합니다.");
    }

    public static void main(String args[])
    {
        // 일반 클래스에 의한 다형성
        Study myTruck = new Study();
        myTruck.speedUp(); //myTruck은 study클래스의 객체로 선언. 즉 study의 speedup 함수인 velocity인 130을 호출 (100 + 30)
        System.out.println("트럭의 속도 " + myTruck.velocity);

        Car myCar = myTruck;
        // Car myCar = new Car(); 이렇게 하면 myCar의 speedup 함수인 velcity++ 함수를 구현. 즉 101 (100++)
        myCar.speedUp(); //myTruck 객체를 참조. 즉 speedup 함수는  Study 클래스의 speedup 함수 활용. 즉 160 (130 + 30)
        System.out.println("트럭의 속도 " + myCar.velocity);

        // myCar.warn(); // 컴파일 에러 myCar는 car 클래스에 이미 car라는 생성자 존재.

        // 인터페이스 다형성
        BaeMin myBaeMin = new Cycle(); //Cycle클래스객체생성
        myBaeMin.deliver(); // Cycle의 deliver함수는 "자전거로 배달합니다"이다.
        myBaeMin = myTruck; //myTruck은 main 클래스에 Study클래스 객체로 정의 되어있음.
        myBaeMin.deliver(); // 그러므로 myBaemin.deliver는 study 클래스를 참조. 즉 "트럭으로 배달합니다"임

    }
}