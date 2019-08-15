package if_else_practice.barking_dog;
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        } else {
            if (hourOfDay >= 0 && hourOfDay <= 23) {
                if (hourOfDay < 8 || hourOfDay > 22) {
                    return true;
                } else {
                    return false;
                }
            } else
                return false;
        }
    }
}
