public class book {
    public static void main(String[] args)
    {
        int[] queens = {0,1,2,3,4,5,6,7};
        while(conflict(queens))
            shake(queens);
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<queens[i];j++)
                System.out.print("| ");
            System.out.print("|Q");
            for(int j=queens[i]+1;j<8;j++)
                System.out.print("| ");
            System.out.println("|");
        }
    }
    public static void shake(int[] dick)
    {
        int len = dick.length;
        for(int i=0;i<len;i++)
        {
            int dst = (int)(Math.random()*len);
            int tmp = dick[i];
            dick[i]=dick[dst];
            dick[dst]=tmp;
        }
    }
    public static boolean conflict(int[] queens)
    {
        int[] plus = new int[8];
        int[] minus = new int[8];
        for(int i=0;i<8;i++)
        {
            plus[i]=i+queens[i];
            minus[i]=i-queens[i];
        }
        for(int i=0;i<8;i++)
        {
            if(occurTime(plus[i],plus)>1)
                return true;
        }
        for(int i=0;i<8;i++)
        {
            if(occurTime(minus[i],minus)>1)
                return true;
        }
        return false;
    }
    public static int occurTime(int key, int[] set)
    {
        int count=0;
        for (int value : set) {
            if (key == value)
                count++;
        }
        return count;
    }
}
