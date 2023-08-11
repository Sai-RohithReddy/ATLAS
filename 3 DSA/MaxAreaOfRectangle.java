public class MaxAreaOfRectangle {
    public static void main(String[] args) {
        int[][][] arr = {
            {{1,1},{1,5},{5,5},{5,1}}, //rect 1
            {{2,3},{3,7},{6,7},{6,3}}, //rect 2
            {{3,2},{3,6},{8,6},{8,2}}  //rect 3
        };
        int area = 0,maxArea=0,maxIndex=0;
        for(int i=0;i<arr.length;i++){
            area = calculateArea(arr[i]);
            if(area>maxArea)
            {
                maxArea = area;
                maxIndex = i;
            }
        }
        System.out.println("The rectangle with the largest area of "+maxArea+" is "+maxIndex);
    }
    static int calculateArea(int[][] rectangle) {
        int area;
        int x1 = rectangle[0][0];
        int y1 = rectangle[0][1];
        int x2 = rectangle[2][0];
        int y2 = rectangle[2][1];
        area = Math.abs((x2-x1)*(y2-y1));
        return area;
    }
}
