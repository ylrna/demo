import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class demo {
    //初始化，建立数字与字母的关系
    private static HashMap<Integer,char[]> map = new HashMap();

    public static void init(){
        char letterofOne[] = {};
        char letterofTwo[] = {'a','b','c'};
        char letterofThree[] = {'d','e','f'};
        char letterofFour[] = {'g','h','i'};
        char letterofFive[] = {'j','k','l'};
        char letterofSix[] = {'m','n','o'};
        char letterofSeven[] = {'p','q','r','s'};
        char letterofEight[] = {'t','u','v'};
        char letterofNine[] = {'w','x','y','z'};
        char letterofZero[] = {};
        map.put(1,letterofOne);
        map.put(2,letterofTwo);
        map.put(3,letterofThree);
        map.put(4,letterofFour);
        map.put(5,letterofFive);
        map.put(6,letterofSix);
        map.put(7,letterofSeven);
        map.put(8,letterofEight);
        map.put(9,letterofNine);
        map.put(0,letterofZero);
    }


    /***
     * 获取返回的数组
     * @author hp
     * @param arr
     * @return
     */
   public static ArrayList<String> get_letter_combinations(int arr[]){
//     初始化
       init();
       ArrayList<String> res = new ArrayList<>();
       res.add("");
       String num = "";
//     将整形数组转化为字符串   简化整形数组中出现大于10的操作
       for(int i = 0;i < arr.length;i++){
           num = num + arr[i];
       }
//     根据之前建立的hashmap中数字与字母的关系进行运算
       for(int i = 0;i < num.length();i++){
           String letter = "";
           ArrayList<String> tmp = new ArrayList<>();
           int len = map.get(Integer.parseInt(String.valueOf(num.charAt(i)))).length;
           for(int j = 0;j < len;j++){
               char c = map.get(Integer.parseInt(String.valueOf(num.charAt(i))))[j];
               for(int k = 0;k < res.size();k++){
                   tmp.add(res.get(k) + c);
               }
           }
           res = tmp;
       }
//     得到返回结果
       return res;
   }

   public static void main(String[] args){
       int arr[] = {9};
       ArrayList<String> res = get_letter_combinations(arr);
       for(int i = 0;i < res.size();i++){
           System.out.print(res.get(i) + " ");
       }
   }

}
