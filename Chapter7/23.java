    public static void main(String[] args)
    {
        boolean[] ass = new boolean[101];
        for(boolean dick:ass)dick=false;
        for(int i=1;i<=100;i++)
        {
            int base=i;
            while(base<=100)
            {
                ass[base]=!ass[base];
                base+=i;
            }
        }
        for(int i=1;i<=100;i++)
        {
            if(ass[i])
                System.out.print(i+" ");
        }
    }

}
