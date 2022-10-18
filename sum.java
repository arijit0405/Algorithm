public class sum {
    public static void main(String[] args) {
        float[] marks= {24.5f, 45.6f,67.68f,34.56f,89.9f };
        int i =0;
        float sum=0;
        for(i=0;i<marks.length-1;i++){
            sum= sum+marks[i];
        }
        System.out.println(sum);
    }
}

}
