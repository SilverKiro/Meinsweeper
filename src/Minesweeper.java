public class Minesweeper {
	public static void main(String[] args){
		
		// Testimiseks esialgu
		int kõrgus = Integer.parseInt(args[0]);
		int laius = Integer.parseInt(args[1]);
		int pommideArv = Integer.parseInt(args[2]);
		
		PommiVali pommiObj = new PommiVali(kõrgus, laius, pommideArv);
		boolean[][] pommideList = pommiObj.getPommideList();
		NumbriVali numbriObj = new NumbriVali(kõrgus, laius, pommideList);
		int[][] numbrid = numbriObj.getNumbrid();

		
		for (int i = 0; i < kõrgus; i++){
			for (int j = 0; j < laius; j++){
				if (pommideList[i][j])
					System.out.print("* ");
				else 
					System.out.print(numbrid[i][j]+" ");
			}
			System.out.println();
		}
	}
}