class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    // List<Integer> visited = new ArrayList<>();
    // Queue<Integer> queue = new LinkedList<>();
    // queue.offer(0);
    // visited.add(0);
    // while(!queue.isEmpty()){
    //     int room = queue.poll();
    //     for(int key : rooms.get(room)){
    //         if(!visited.contains(key)){
    //             visited.add(key);
    //             queue.offer(key);
    //         }
    //     }
    // }  
    // return visited.size()==rooms.size();

    //DFS
    boolean visited[] = new boolean[rooms.size()];
    dfs(0,rooms,visited);
    for(boolean v: visited){
        if(!v)return false;
    }
    return true;
   }
   public static void dfs(int room, List<List<Integer>> rooms, boolean[] visited){
    if(visited[room])return;
    else visited[room]=true;
    for(int key:rooms.get(room)){
        dfs(key, rooms, visited);
    }
   }
}