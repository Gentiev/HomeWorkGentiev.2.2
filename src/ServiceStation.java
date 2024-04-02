public class ServiceStation {
    public void check(VidTransporta transport) {
        System.out.println("\n Обслуживаем " + transport.getModelName() + ":");
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
        transport.checkEngine();

        if (transport instanceof Truck) {
            ((Truck) transport).checkTrailer();
        }
    }
}