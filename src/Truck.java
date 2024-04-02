public class Truck extends VidTransporta {
    public Truck(String modelName, int wheelsCount){
        setModelName(modelName);
        setWheelsCount(wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузового автомобиля");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}