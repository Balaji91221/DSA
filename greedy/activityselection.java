package greedy;

// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.Scanner;

// public class activityselection {

//     static class Activity {
//         int start;
//         int end;

//         Activity(int start, int end) {
//             this.start = start;
//             this.end = end;
//         }
//     }

//     static class MyComparator implements Comparator<Activity> {
//         public int compare(Activity a1, Activity a2) {
//             return a1.end - a2.end;
//         }
//     }

//     public int maxActivities(Activity arr[], int n) {
//         Arrays.sort(arr, new MyComparator());
//         int res = 1;
//         int prev = 0;
//         for (int curr = 1; curr < n; curr++) {
//             if (arr[curr].start >= arr[prev].end) {
//                 res++;
//                 prev = curr;
//             }
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of activities: ");
//         int n = scanner.nextInt();

//         Activity arr[] = new Activity[n];
//         System.out.println("Enter the start and end times of each activity:");

//         for (int i = 0; i < n; i++) {
//             System.out.print("Activity " + (i + 1) + " start time: ");
//             int start = scanner.nextInt();
//             System.out.print("Activity " + (i + 1) + " end time: ");
//             int end = scanner.nextInt();
//             arr[i] = new Activity(start, end);
//         }

//         activityselection obj = new activityselection();
//         System.out.println("Maximum number of activities that can be performed: " + obj.maxActivities(arr, n));

//         scanner.close();
//     }
// }


// // Time Complexity: O(nlogn)
// // Space Complexity: O(1)
// // Output: 2
// // Explanation: We can perform only 2 activities. The first activity will be performed from 10 to 20 and the second activity will be performed from 20 to 30.
// // The first activity finishes at 20 and the second activity starts at 20. Hence, they can be performed together.
// // Hence, the maximum number of activities that can be performed is 2.
// // The output is 2.




import java.util.*;
class  activityselection{
    static class Activity{
        int start;
        int end;
        Activity(int start,int end){
            this.start=start;
            this.end=end;
        }
        
    }

    static class MyComparator implements Comparator<Activity>{
        public int compare(Activity a1,Activity a2){
            return a1.end-a2.end;
        }
    }
    public int maxActivities(Activity arr[] ,int n){
        Arrays.sort(arr, new MyComparator());
        int res=1;
        int prev=0;
        for(int curr=0;curr<n;curr++){
            if(arr[curr].start >=arr[prev].end){
                res++;
                prev=curr;

            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner  s=new Scanner(System.in);
        int n=s.nextInt();
        Activity arr[] = new Activity[n];

        for(int i=0;i<n;i++){
            int start=s.nextInt();
            int end=s.nextInt();
        }
        activityselection obj=new activityselection();
        obj.maxActivities(arr,n);    
    }
}