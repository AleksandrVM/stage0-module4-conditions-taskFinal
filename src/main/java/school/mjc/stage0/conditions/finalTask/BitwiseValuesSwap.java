package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first = first^second;
        second = first^second;
        first = first^second;
        System.out.println(first);
        System.out.println(second);
    }

    public static void main(String [] avrs){
        int first = 183;
        int second = 5;

        System.out.println(first^second^second);
    }

}
