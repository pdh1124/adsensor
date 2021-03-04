package prac02;

public class Main {
	public static void main(String[] args) {
		Cup cupFill = new Cup();
		Book bookPage = new Book();
		Toothpaste toothColor = new Toothpaste();
		Woodenboard boardSize = new Woodenboard();
		Pen penLength = new Pen();

		cupFill.setHeight(13.5f);
		bookPage.setPagenum(3);
		toothColor.setToothcolor("blue");
		boardSize.setHeight(200);
		boardSize.setWidth(100);
		penLength.setLength(10.5);

		System.out.println(cupFill.getHeight());
		System.out.println(bookPage.getPagenum());
		System.out.println(toothColor.getToothcolor());
		System.out.println(boardSize.getHeight());
		System.out.println(boardSize.getWidth());
		System.out.println(penLength.getLength());
	}

}
