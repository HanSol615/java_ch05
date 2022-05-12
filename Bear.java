package Open;
import java.util.Scanner;

public class Bear extends GameObject {
	private Scanner scanner = null;
	
	public Bear(int x, int y, int distance) {
		super(x, y, distance);
		scanner = new Scanner(System.in);
	}
	public void move() {
		System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
		char c;
		c = scanner.next().charAt(0);
		switch(c) {
		case 'a' :
			x--;
			if(x < 0) x = 0;
			break;
		case 'd' :
			x++;
			if(x >= Game.MAX_X) x = Game.MAX_X - 1;
			break;
		case 'w' :
			y--;
			if(y < 0) y = 0;
			break;
		case 's' :
			y++;
			if(y >= Game.MAX_Y) y = Game.MAX_Y - 1;
			break;
		}
	}
	public char getShape() {
		return 'B';
	}
}
