package AlgStruct.dataStruc;


class Rotation {
    public static void main(String[] args) {

        int tt[] = new int[]{1,2,3,4,5,6,7};
        Rotation t = new Rotation();
        for (int i = 0; i < tt.length; i++) {
            System.out.println(t.rotate(tt,2,7)[i]);
        }

    }

    public int[] rotate(int i[],int d,int n){  //n is size, d is element.
        int[] temp = new int[n];
        for (int j = 0; j < d; j++) {
            temp[n-d+j] = i[j];
        }
        for (int j = 0,k = d; j <= n-d-1; j++,k++) {
            temp[j] = i[k];
        }
        return temp;
    }
}