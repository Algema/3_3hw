public class ServiceStation {
   /* public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }
    }*/
   public void check(Car car) {
       if (car != null) {
           car.check();
       }
   }
    public void check( Truck truck) {
        if (truck != null) {
            truck.check();
        }
    }
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
       bicycle.check();
    }


}
}


