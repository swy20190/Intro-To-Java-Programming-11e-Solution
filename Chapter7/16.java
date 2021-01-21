public class book {
    public static void main(String[] args)
    {
        int[] million = createRandomArray();
        int kk = (int)(Math.random()*100000);
        long startTime = System.nanoTime();
        linearSearch(kk,million);
        long endTime = System.nanoTime();
        long timel = endTime-startTime;
        sort(million);
        startTime = System.nanoTime();
        binarySearch(kk,million);
        endTime = System.nanoTime();
        long timeb = endTime-startTime;
        System.out.println("The time of linear search is "+timel+", and the time of binary search is "+timeb);

    }
    public static int[] createRandomArray()
    {
        int[] ass = new int[100000];
        for(int i=0;i<100000;i++)
            ass[i]=(int)(100000*Math.random());
        return ass;
    }
    public static int linearSearch(int key,int[] ass)
    {
        int jb=-1;
        for(int i=0;i<ass.length;i++)
        {
            if(ass[i]==key)
            {
                jb=i;
                break;
            }
        }
        return jb;
    }
    public static void sort(int[] ass)
    {
        for(int i=ass.length-1;i>=2;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(ass[j]>ass[j+1])
                {
                    int tmp = ass[j];
                    ass[j] = ass[j+1];
                    ass[j+1]=tmp;
                }
            }
        }
    }
    public static int binarySearch(int key,int[] ass)
    {
        int jb=-1;
        int high=ass.length-1;
        int low=0;
        while(high>=low)
        {
            int mid=(high+low)/2;
            if(ass[mid]==key)
                jb=mid;
            else if(ass[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return jb;
    }
}