package practice.no1;

import lombok.Data;

@Data
public class Book {
	private String category;
	private int totalPageSize;
	private int price;

	// コンストラクタはクラス名のメソッド
	public Book() {
	}

	// コンストラクタは引数が異なれば何個でも作れる
	public Book(String category, int totalPageSize, int price) {
		this.category = category;
		this.totalPageSize = totalPageSize;
		this.price = price;
	}
}
