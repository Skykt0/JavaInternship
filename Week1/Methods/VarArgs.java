package Week1.Methods;

public class VarArgs {
    public static void main(String[] args){

        // var args
        int ans = sum(1,2,3,4);
        System.out.println(ans);

        float[] arr = {2.3f,3.2f};
        System.out.println(sum(arr));
    
        System.out.println(sum());
    }
    static int sum(int ...num){
        int result =0;
        for(int e:num){
            result = result + e;
        }
        return result;
    }

    static float sum(float ...num){
        float result =0;
        for(float e:num){
            result = result + e;
        }
        return result;
    }
}
