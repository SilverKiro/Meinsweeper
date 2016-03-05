public class PommiVali {
	private int kõrgus;
	private int laius;
	private int pommideArv;
	private boolean[][] pommideList;

	public PommiVali(int kõrgus, int pommideArv, int laius) {
		this.kõrgus = kõrgus;
		this.pommideArv = pommideArv;
		this.laius = laius;
		this.pommideList = new boolean[kõrgus][laius];
		genereeriPommid();
	}

    public int getKõrgus() {
        return kõrgus;
    }

    public int getLaius() {
        return laius;
    }

    public int getPommideArv() {
        return pommideArv;
    }

    public boolean[][] getPommideList() {
        return pommideList;
    }

    public void genereeriPommid() {
		int kontroll = 0;
		while (kontroll < pommideArv) {
			for (int i = 0; i < kõrgus; i++) {
				if (kontroll < pommideArv) {
					for (int j = 0; j < laius; j++) {
						if (Math.random() < pommideArv / (kõrgus * 1.0 * laius) &&
								pommideList[i][j] != true && kontroll < pommideArv) {
							kontroll++;
							pommideList[i][j] = true;
						}
						else if (pommideList[i][j] != true) pommideList[i][j] = false;
					}
				}
				else break;
			}
		}
	}
}