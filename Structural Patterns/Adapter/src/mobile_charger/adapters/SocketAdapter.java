package mobile_charger.adapters;

import mobile_charger.entities.Volt;

public interface SocketAdapter {
    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
