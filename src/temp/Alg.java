package temp;

import org.jetbrains.annotations.NotNull;

public class Alg {
    public static void main(String[] args) {
        Alg alg = new Alg();
        String [] test = new String[1000];
        for (int i = 0; i <999 ; i++) {
            test[i] = "nemo";
        }

        alg.findNemo(test);


    }

    public void findNemo(@NotNull String... arr){
        long st = System.nanoTime();
        for (String i : arr){
            if (i == "nemo"){
                System.out.println("found");
            }
        }
        long et = System.nanoTime();
        double t = (et - st)/10000;
        System.out.println(t);
    }
}
