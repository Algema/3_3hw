public class Car extends Transport{



    public Car (String modelName, int wheelsCount){
        super(modelName,  wheelsCount);
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель у машины");
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}
