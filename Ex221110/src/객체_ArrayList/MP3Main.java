package 객체_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MP3Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();

		MP3 music1 = new MP3("Let It Go", "Idina Menzel", ".\\music\\Idina Menzel - Let It Go.mp3");
		MP3 music2 = new MP3("bad guy", "Billie Eilish", ".\\music\\Billie Eilish - bad guy.mp3");
		MP3 music3 = new MP3("깡", "Rain", ".\\music\\Rain - 깡.mp3");

		ArrayList<MP3> ml = new ArrayList<MP3>();

		ml.add(music1);
		ml.add(music2);
		ml.add(music3);

		// 틀 만들기
		// 1번 - 재생
		// 2번 - 정지
		// 3번 - 이전곡
		// 4번 - 다음곡
		// 5번 - 종료

		int index = 0;

		while (true) {

			System.out.print("[1]재생  [2]정지  [3]이전곡  [4]다음곡  [5]종료 >>");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 제목 - 가수
				String title = ml.get(index).getTitle();
				String singer = ml.get(index).getSinger();
				String path = ml.get(index).getPath();

				System.out.printf("%s - %s%n", title, singer);
				
				mp3.play(path);

			} else if (menu == 2) {
				if(mp3.isPlaying() == true) {
					mp3.stop();
				}

			} else if (menu == 3) {
				if(mp3.isPlaying() == true) {
					mp3.stop();
				}
				
				index--;
				if(index < 0) {
					index = ml.size() - 1;
				}
				
				String title = ml.get(index).getTitle();
				String singer = ml.get(index).getSinger();
				String path = ml.get(index).getPath();
				
				System.out.printf("%s - %s%n", title, singer);
				
				mp3.play(path);

			} else if (menu == 4) {
				if(mp3.isPlaying() == true) {
					mp3.stop();
				}
				
				index++;
				if(index >= ml.size()) {
					index = 0;
				}
				
				String title = ml.get(index).getTitle();
				String singer = ml.get(index).getSinger();
				String path = ml.get(index).getPath();
				
				System.out.printf("%s - %s%n", title, singer);
				
				mp3.play(path);

			} else if (menu == 5) {
				System.out.println("프로그램 종료!");
				break;

			} else {
				System.out.println("잘못입력하셨습니당");
			}

		}
	}

}
