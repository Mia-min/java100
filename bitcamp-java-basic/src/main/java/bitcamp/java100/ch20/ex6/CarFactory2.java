// Car 객체를 생성해주는 역할 수행
package bitcamp.java100.ch20.ex6;

import java.util.HashMap;
import java.util.Map;

// "Factory Method" 설계 패턴
// - 객체 생성과정이 복잡할 경우 매번 개발자가 그 코딩을 하기에는 번거롭다.
// - 그런 경우 객체 생성과정이 복잡한 부분을 별도의 메서드에 넣어 놓고
//   호출하는 것이 편하다.
// - 이렇게 메서드를 호출하여 객체를 생성하는 방식을 "팩토리 메서드" 패턴이라 한다.
public class CarFactory2 {
    private Tire[] tires;
    
    public void setTires(Tire[] tires) {
        this.tires = tires;
    }

    // 팩토리 메서드가 스태틱이 아니라 인스턴스 메서드일 때 사용법?
    public Car createCar(String model) {
        Car car = null;
        
        switch (model) {
        case "티코":
            car = createTico();
            break;
        case "티코 골드": 
            car = createTicoGold();
            break;
        case "소나타": 
            car = createSonata();
            break;
        case "에쿠스": 
            car = createEquus();
            break;
        default: 
            car = createBasic();
        }
        
        car.setTires(tires);
        
        return car;
    }

    private Car createBasic() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(1500);
        engine.setName("비트엔진");
        engine.setValve(16);
        
        c.setEngine(engine);
        
        return c;
    }

    private Car createEquus() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(3500);
        engine.setName("비트스페셜엔진");
        engine.setValve(32);
        
        c.setEngine(engine);
        
        return c;
    }

    private Car createSonata() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(1980);
        engine.setName("비트표준엔진");
        engine.setValve(16);
        
        c.setEngine(engine);
        
        return c;
    }

    private Car createTicoGold() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(900);
        engine.setName("비트엔진");
        engine.setValve(16);
        
        c.setEngine(engine);
        
        Map<String,String> options = new HashMap<>();
        options.put("sunroof", "yes");
        options.put("airbag", "yes");
        options.put("blackbox", "yes");
        
        c.setOptions(options);
        
        return c;
    }

    private static Car createTico() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(900);
        engine.setName("비트엔진");
        engine.setValve(16);
        
        c.setEngine(engine);
        
        return c;
    }
}







