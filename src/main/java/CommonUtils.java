public class CommonUtils {
    public static int allAdd(int ...data){
        int rtnData = 0;
        for(int i : data){
            rtnData += i;
        }
        return rtnData;
    }

    public static int allMultiply(int ...data){
        int rtnData = 1;
        for(int i : data){
            rtnData *= i;
        }
        return rtnData;
    }
}
