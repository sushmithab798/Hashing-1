// Problem 3: Word pattern

// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Approach: create a hashmap for characters as keys and words as values
class Solution {
   public boolean wordPattern(String pattern, String str) {
       String[] arr= str.split(" ");
       int n = arr.length;
       int k = pattern.length();

       if(n != k) return false;
       HashMap <Character, String> pMap = new HashMap<Character, String>();
       HashMap <String, Character> sMap = new HashMap<String, Character>();

       for (int i = 0; i < n; i++){
           char a = pattern.charAt(i);
           if(!pMap.containsKey(a)){
               pMap.put(a,arr[i]);
           } else {
                if (!pMap.get(a).equals(arr[i])) return false;
           }
           if(!sMap.containsKey(arr[i])){
               sMap.put(arr[i],a);
           } else {
               if (!sMap.get(arr[i]).equals(a)) return false;
           }
       }
       return true;
   }
}