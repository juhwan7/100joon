class Solution {
   public int solution(int[][] sizes) {
            int saveInt;
            int minX = 0;
            int minY = 0;
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i][0] < sizes[i][1]) {
                    saveInt = sizes[i][1];
                    sizes[i][1] = sizes[i][0];
                    sizes[i][0] = saveInt;
                }

                if (sizes[i][0] >= minX) {
                    minX = sizes[i][0];
                }

                if (sizes[i][1] >= minY) {
                    minY = sizes[i][1];
                }
            }
            return minX * minY;
        }
}