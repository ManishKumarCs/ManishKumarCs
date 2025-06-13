class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgcolor = image[sr][sc];
        if(image[sr][sc]==color)return image;
        dfs(image, sr, sc, color, orgcolor);
        return image;
    }
    public static void dfs(int[][] image, int sr, int sc, int color, int orgcolor){
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=orgcolor)return;
        image[sr][sc]=color;
        dfs(image,sr+1,sc,color, orgcolor);
        dfs(image,sr-1,sc,color, orgcolor);
        dfs(image,sr,sc+1,color, orgcolor);
        dfs(image,sr,sc-1,color, orgcolor);
    }
}