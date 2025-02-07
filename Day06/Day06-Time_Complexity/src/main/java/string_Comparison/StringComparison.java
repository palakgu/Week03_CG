package string_Comparison;

public class StringComparison {
    public static void main(String[] args) {
        int arr[] = {1000, 10000 , 10000};
        for(int size : arr) {
            compare(size);
        }
    }
    public static double[] compare(int size){
        String str ="";
        StringBuilder sb = new StringBuilder();
        StringBuffer ss = new StringBuffer();
        double ans[] = new double[3];
        double stringStart = System.nanoTime();
        for(int i=0;i<size;i++){
            str+= "Palak";
        }
        double stringEnd = System.nanoTime();
        double stringTime =  stringEnd-stringStart;
        ans[0] = stringTime;

        double SbStartTime = System.nanoTime();
        for(int i=0;i<size;i++){
            sb.append("Palak");
        }
        double SbEndTime = System.nanoTime();
        double sbTime = SbEndTime- SbStartTime;
        ans[1] = sbTime;
        double ssStartTime = System.nanoTime();
        for(int i=0;i<size;i++){
            ss.append("Palak");
        }
        double ssEndTime = System.nanoTime();
        double ssTime = ssEndTime-ssStartTime;
        ans[2] = ssTime;

        System.out.println(" The time for String is "+ stringTime);
        System.out.println(" The time for String builder is "+ sbTime);
        System.out.println(" The time forn String buffer is "+ ssTime);
        return  ans;
    }
}
