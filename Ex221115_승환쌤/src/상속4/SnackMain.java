package 상속4;

public class SnackMain {

	public static void main(String[] args) {

		SunChip sun = new SunChip();
		Honey ho = new Honey();
		YacheTime yt = new YacheTime();
		SwingChip sw = new SwingChip();
		
		eatSnack(sun);
		eatSnack(ho);
		eatSnack(yt);
		eatSnack(sw);
		
	}
	
	// 업캐스팅
	public static void eatSnack(Snack snack) {
		snack.Eat();
		
		// 만약 먹는과자가 야채타임이라면 케찹을 찍어먹고싶어요잉~!
		// 야채타임으로부터 업캐스팅 된 객체라면? -> instanceof
		if(snack instanceof YacheTime) {
			// 다운캐스팅을해서 케찹찍기
			// ㄴ> 야채타임만 가지고있는 고유기능이기 때문에 위에있는 Snack snack이란 객체는 모름
			// 하위클래스명 객체명 = (하위클래스명) 업캐스팅된객체명
			YacheTime ya = (YacheTime) snack;
			ya.ketchup();
		}
	}

}
