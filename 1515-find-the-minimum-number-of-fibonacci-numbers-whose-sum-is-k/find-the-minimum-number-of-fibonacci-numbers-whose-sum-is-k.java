class Solution {
    public int findMinFibonacciNumbers(int k) {
      ArrayList<Integer> arr = new ArrayList<>();  
      arr.add(1);
      arr.add(1);
      while(arr.get(arr.size()-1)<k){
        arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
      }
      int start=0;
      int end = arr.size()-1;
      int count=0;
      for(int i=end;i>=start;i--){
        if(arr.get(i)<=k){
            k-=arr.get(i);
            count++;
        }
      }
      System.out.println(arr);
      return count;
    }
}