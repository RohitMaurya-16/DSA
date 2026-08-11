class Solution {
    public int maxPoints(int[][] points) {
        int n=points.length;
        if(n==1)return 1;
        int gc=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            int x1=points[i][0];
            int y1=points[i][1];

            Map<String, Integer> slope=new HashMap<>();
            int rep=1;
            int maxPoint=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++)
            {
                int x2=points[j][0];
                int y2=points[j][1];

                if(x1==x2 && y1==y2) 
                {
                rep++;
                continue;
                }

                int x=x2-x1;
                int y=y2-y1;

                int gcd=gcd(x,y);
                x=x/gcd;
                y=y/gcd;

                 if((x < 0 && y < 0) || (x > 0 && y < 0)){
                    x *= -1;
                    y *= -1;
                 }
                 String key=x+"-"+y;
                 slope.put(key, slope.getOrDefault(key,0)+1);
                 maxPoint=Math.max(maxPoint,slope.get(key));
            }
            gc=Math.max(gc,(maxPoint+rep));
        }
        return gc;
    }
    private int gcd(int large,int small)
    {
        if(small==0) return large;
        return gcd(small,large%small);
    }
}