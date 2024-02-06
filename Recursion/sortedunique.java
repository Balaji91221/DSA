import java.util.List;
import java.util.ArrayList;
public class sortedunique {

    public static void Perm(int[] arr,List<List<Integer>> ans,List<Integer> temp){
        if (temp.size() == arr.length){
            ans.add(new ArrayList<>(temp));
        }
        for (int i = 0; i < arr.length; i++){
            if (temp.contains(arr[i])) continue;
            temp.add(arr[i]);
            Perm(arr,ans,temp);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        Perm(arr,ans,new ArrayList<>());
        System.out.println(ans);
    }
}
//