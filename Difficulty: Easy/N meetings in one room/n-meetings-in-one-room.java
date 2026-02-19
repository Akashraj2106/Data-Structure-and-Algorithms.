import java.util.*;

class Solution {
    
    public int maxMeetings(int start[], int end[]) {
        
        int n = start.length;
        int[][] meeting = new int[n][2];
        
       
        for(int i = 0 ; i < n ; i++){
            meeting[i][0] = start[i];
            meeting[i][1] = end[i];
        }
        
       
        Arrays.sort(meeting, (a, b) -> a[1] - b[1]);
        
        int count = 1;
        int last = meeting[0][1];
        
        for(int i = 1 ; i < n ; i++){
            
            if(meeting[i][0] > last){
                count++;
                last = meeting[i][1];
            }
        }
        
        return count;
    }
}
