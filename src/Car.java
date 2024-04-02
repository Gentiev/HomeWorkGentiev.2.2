public class Car extends VidTransporta {
    public Car(String modelName, int wheelsCount){
        setModelName(modelName);
        setWheelsCount(wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель легкового автомобиля");
    }
}
