public class Truck extends Car{

    public Truck (String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовой машины");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовой машины ");
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }
}
