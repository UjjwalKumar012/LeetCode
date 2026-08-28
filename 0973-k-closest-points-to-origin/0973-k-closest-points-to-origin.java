class Solution {
    
    class Pair {
        int x;
        int y;
        double dis;

        public Pair(int x, int y, double d) {
            this.x = x;
            this.y = y;
            this.dis = d;
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> Double.compare(a.dis, b.dis));

        for (int[] point : points) {

            int x = point[0];
            int y = point[1];

            double dis = Math.sqrt(x * x + y * y);

            Pair p = new Pair(x, y, dis);

            pq.add(p);
        }

        int[][] ans = new int[k][2];

        int idx = 0;

        while (k > 0) {

            Pair p = pq.remove();

            ans[idx][0] = p.x;
            ans[idx][1] = p.y;

            idx++;
            k--;
        }

        return ans;
    }
}