package AlgStruct.Alg.recursion;

public class TripleStep {
    public static void main(String[] args) {
        System.out.println(tripleStep(2));
    }
    public static int tripleStep(int s){


        if (s<0){
            return 0;
        }
        else if (s==0){
            return 1;
        }
        return tripleStep(s-1)+tripleStep(s-2)+tripleStep(s-3);
    }
}
