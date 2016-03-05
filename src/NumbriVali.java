public class NumbriVali {
    private int kõrgus;
    private int laius;
    private int[][] numbrid;
    private boolean[][] pommideList;

    public NumbriVali(int kõrgus, int laius, boolean[][] pommideList) {
        this.kõrgus = kõrgus;
        this.laius = laius;
        this.pommideList = pommideList;
        this.numbrid = new int[kõrgus][laius];
        genereeriNumbrid();
    }

    public int[][] getNumbrid() {
        return numbrid;
    }

    public void genereeriNumbrid() {
        for (int i = 0; i < kõrgus; i++)
            for (int j = 0; j < laius; j++)
                for (int i2 = i - 1; i2 <= i + 1; i2++) // 1,-1 1,0 1,1 0,-1 0,0 0,1 jne,
                    for (int j2 = j - 1; j2 <= j + 1; j2++)
                        if (i2 >= 0 && j2 >= 0 && i2 < kõrgus && j2 < laius)
                            if (pommideList[i2][j2]) numbrid[i][j]++;
    }
}