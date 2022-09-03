package practice.no1;

import lombok.Data;

@Data
public class Book {
	private String category;
	private int totalPageSize;
	private int price;

	// �R���X�g���N�^�̓N���X���̃��\�b�h
	public Book() {
	}

	// �R���X�g���N�^�͈������قȂ�Ή��ł�����
	public Book(String category, int totalPageSize, int price) {
		this.category = category;
		this.totalPageSize = totalPageSize;
		this.price = price;
	}
}
