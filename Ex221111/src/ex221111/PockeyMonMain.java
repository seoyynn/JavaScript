package ex221111;

import java.util.ArrayList;

public class PockeyMonMain {

	public static void main(String[] args) {
		
		ArrayList<PocketMon> pkm = new ArrayList<PocketMon>();

		pkm.add(new PocketMon("피카츄", "전기", "전기쥐"));
		pkm.add(new PocketMon("라이츄", "전기", "피카츄진화"));
		pkm.add(new PocketMon("파이리", "불", "용"));
		pkm.add(new PocketMon("꼬부기", "물", "거북이"));
		pkm.add(new PocketMon("버터풀", "염동력", "벌레"));
		
		System.out.println(pkm.get(0));
		
		
		for(int i = 0; i < pkm.size(); i++) {
			String monName = pkm.get(i).getMonName();
			String att = pkm.get(i).getAtt();
			String type = pkm.get(i).getType();
			
			
			System.out.printf("%s(%s) - %s%n", monName, att, type);
		}
		
	}

}
