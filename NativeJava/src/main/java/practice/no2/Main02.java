package practice.no2;

import java.util.ArrayList;
import java.util.List;

public class Main02 {

	public static void main(String[] args) {
		///////////////////////////
		// 変数やクラスについて
		///////////////////////////
		
		// 変数にfinalを付けると上書き不可(イミュータブル)になる
		final int num = 1;

		// 変数にstaticを付けるとインスタンス化しなくても参照できる
		System.out.println(Utils.TEST);
		// メソッドも一緒
		Utils.print("staticメソッドのテスト");
		
		
		// interfaceと実装について
		
		// interfaceは規約のようなもの
		// 実装クラスに対して、interfaceが持つメソッドを実装することを強制する
		// 実装クラスのインスタンスはinterfaceの型で受けることができる
		Book jump = new Jump();
		Book magazine = new Magagine();
		jump.read();
		magazine.read();
		
		// インターフェースの型で扱うことでインスタンスが何のクラスなのかを意識しなくて良い
		List<Book> list = new ArrayList<>();
		list.add(jump);
		list.add(magazine);
		for(Book book : list) {
			book.read();
		}
		
		// 継承について
		// クラスはサブクラスを作ることが出来る
		
		
		// 抽象化について
		// クラスの共通的な処理を抽象クラスに持たせる
	}

}
