package if_else_practice.megaByte_converter;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegeBytesAndKiloBytes(2500);
    }
    public static void printMegeBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.print("Invalid Value");
        } else {
            System.out.print(kiloBytes + " KB = "+ (kiloBytes/1024)+" MB and "+ (kiloBytes%1024) +" KB");
        }
    }
}
