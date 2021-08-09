public class book {
    public static void main(String[] args)
            throws Exception
    {
        RandomAccessFile eagle = new RandomAccessFile("Exercise17_08.dat","rw");
        eagle.writeInt(1);
        eagle.close();
        RandomAccessFile victory = new RandomAccessFile("Exercise17_08.dat","rw");
        int swordfish = victory.readInt();
        swordfish++;
        victory.setLength(0);
        victory.writeInt(swordfish);
    }
}
