package mobile_charger;

import mobile_charger.adapters.SocketAdapter;
import mobile_charger.adapters.SocketAdapterImpl;
import mobile_charger.entities.Volt;

public class Main {
    public static void main(String[] args) {

        testClassAdapter();
    }

    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketAdapterImpl();
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v120 = getVolt(sockAdapter,120);
        System.out.println("v3 volts using Class Adapter="+v3.getVolts());
        System.out.println("v12 volts using Class Adapter="+v12.getVolts());
        System.out.println("v120 volts using Class Adapter="+v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        return switch (i) {
            case 3 -> sockAdapter.get3Volt();
            case 12 -> sockAdapter.get12Volt();
            default -> sockAdapter.get120Volt();
        };
    }
}
